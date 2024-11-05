package br.com.DAO;

import br.com.DTO.ManutencaoDTO;
import br.com.VIEW.InternalFrameManutencao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class ManutencaoDAO {

    Connection conexao = null;
    PreparedStatement pst = null;

    public void cadastrarManutencao(ManutencaoDTO objManutencaoDTO) {
        String sql = "insert into manutencao(descricao_manutencao, data_entrada, status_manutencao, data_saida, id_maquina, responsavel, solucao) values(?, ?, ?, ?, ?, ?, ?)";
        conexao = new ConexaoDAO().conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, objManutencaoDTO.getDesc_manutencao());
            pst.setString(2, objManutencaoDTO.getStatus_manutencao());
            pst.setString(3, objManutencaoDTO.getData_entrada());
            pst.setString(4, objManutencaoDTO.getData_saida());
            pst.setInt(5, objManutencaoDTO.getId_maquina());
            pst.setString(6, objManutencaoDTO.getResponsavel());
            pst.setString(7, objManutencaoDTO.getSolucao());

            int res = pst.executeUpdate();
            if (res == 1) {
                JOptionPane.showMessageDialog(null, "SUCESSO!\nCadastro feito com êxito.");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar.");
            }
            pst.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao criar Manutenção: " + e);
            limpar();
        }
    }

    public void editar(ManutencaoDTO objManutencaoDTO) {
        String sql = "update maquina set descricao_manutencao = ?, data_entrada = ?, status_manutencao = ?, data_saida = ?, id_maquina = ?, responsavel = ?, solucao = ? where id_manutencao = ?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(8, objManutencaoDTO.getId_manutencao());
            pst.setString(1, objManutencaoDTO.getDesc_manutencao());
            pst.setString(2, objManutencaoDTO.getStatus_manutencao());
            pst.setString(3, objManutencaoDTO.getData_entrada());
            pst.setString(4, objManutencaoDTO.getData_saida());
            pst.setInt(5, objManutencaoDTO.getId_maquina());
            pst.setString(6, objManutencaoDTO.getResponsavel());
            pst.setString(7, objManutencaoDTO.getSolucao());

            int res = pst.executeUpdate();
            if (res > 0) {
                conexao.close();
                JOptionPane.showMessageDialog(null, "SUCESSO\nManutenção editada com êxito.");
            } else {
                JOptionPane.showMessageDialog(null, "ERRO: Manutenção não existe.");
                conexao.close();
                limpar();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Método Editar: " + e);
        }
    }

    public void deletar(ManutencaoDTO objManutencaoDTO) {
        String sql = "delete from manutencao where id_manutencao = ?";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, objManutencaoDTO.getId_manutencao());
            int res = pst.executeUpdate();
            if (res > 0) {
                conexao.close();
                JOptionPane.showMessageDialog(null, "SUCESSO\nManutenção editada com êxito.");
                limpar();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Método Deletar: " + e);
        }
    }

    public void limpar() {
        InternalFrameManutencao.txtID.setText(null);
        InternalFrameManutencao.txtDescricao.setText(null);
        InternalFrameManutencao.txtStatus.setText(null);
        InternalFrameManutencao.txtDataEntrada.setText(null);
        InternalFrameManutencao.txtDataSaida.setText(null);
        InternalFrameManutencao.txtIDMaquina.setText(null);
        InternalFrameManutencao.txtResponsavel.setText(null);
        InternalFrameManutencao.txtSolucao.setText(null);
    }

}
