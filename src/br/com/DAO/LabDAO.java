package br.com.DAO;

import br.com.DTO.LabDTO;
import br.com.VIEW.InternalFrameLaboratorio;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class LabDAO {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void registrarLaboratorio(LabDTO objLabDTO) {
        String sql = "insert into Laboratorio(nome_laboratorio, quantidade_maquinas) values(?, ?)";
        conexao = new ConexaoDAO().conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, objLabDTO.getNome_lab());
            pst.setInt(2, objLabDTO.getQuant_maquinas());

            int res = pst.executeUpdate();
            if (res == 1) {
                JOptionPane.showMessageDialog(null, "SUCESSO!\nCadastro feito com êxito.");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar.");
            }
            pst.close();

        } catch (Exception e) {
            if (e.getMessage().contains("Laboratorio.PRIMARY")) {
                JOptionPane.showMessageDialog(null, "ERRO: ID já está em uso.");
            } else if (e.getMessage().contains("Laboratorio.nome_laboratorio_UNIQUE")) {
                JOptionPane.showMessageDialog(null, "ERRO: Nome de laboratório já está em uso.");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao inserir laboratório: " + e);
            }
        }

    }

    public void apagar(LabDTO objLabDTO) {
        String sql = "delete from Laboratorio where id_laboratorio = ?";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, objLabDTO.getId_lab());
            int add = pst.executeUpdate();
            if (add > 0) {
                conexao.close();
                JOptionPane.showMessageDialog(null, "SUCESSO!\nLaboratorio excluído com êxito.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Método Apagar: " + e);
        }
    }

    public void pesquisaAuto() {
        String sql = "select * from Laboratorio";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) InternalFrameLaboratorio.tblLaboratorio.getModel();
            model.setNumRows(0);

            while (rs.next()) {
                int id = rs.getInt("id_laboratorio");
                String nome = rs.getString("nome_laboratorio");
                String qtd = rs.getString("quantidade_maquinas");
                model.addRow(new Object[]{id, nome, qtd});
            }
            conexao.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Método Pesquisa Automática: " + e);
        }

    }

    public void editar(LabDTO objLabDTO) {
        String sql = "update Laboratorio set nome_laboratorio = ?, quantidade_maquinas = ? where id_laboratorio = ?";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(3, objLabDTO.getId_lab());
            pst.setString(1, objLabDTO.getNome_lab());
            pst.setInt(2, objLabDTO.getQuant_maquinas());
            
            System.out.println(pst);

            int add = pst.executeUpdate();
            if (add > 0) {
                conexao.close();
                JOptionPane.showMessageDialog(null, "SUCESSO!\nLaboratório editado com êxito.");
            } else {
                JOptionPane.showMessageDialog(null, "ERRO: Usuário não existe.");
                conexao.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Método Editar: " + e);
        }
    }

    public void limpar() {
        InternalFrameLaboratorio.txtNomeLab.setText(null);
        InternalFrameLaboratorio.txtQuantMaquinas.setText(null);
    }
}
