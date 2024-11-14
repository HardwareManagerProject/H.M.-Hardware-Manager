package br.com.DAO;

import br.com.DTO.ManutencaoDTO;
import br.com.VIEW.InternalFrameManutencao;
import static br.com.VIEW.InternalFrameManutencao.tblManutencao;
import static br.com.VIEW.InternalFrameManutencao.tblMaquina;
import static br.com.VIEW.InternalFrameManutencao.tblPeca;
import static br.com.VIEW.InternalFrameManutencao.txtPesquisaManutencao;
import static br.com.VIEW.InternalFrameManutencao.txtPesquisaMaq;
import static br.com.VIEW.InternalFrameManutencao.txtPesquisarPeca;
import br.com.VIEW.TelaPrincipal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class ManutencaoDAO {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void cadastrarManutencao(ManutencaoDTO objManutencaoDTO) {
        String sql = "insert into manutencao(responsavel, descricao_manutencao, id_maquina, id_peca, data_entrada) values(?, ?, ?, ?, ?)";
        conexao = new ConexaoDAO().conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, objManutencaoDTO.getResponsavel());
            pst.setString(2, objManutencaoDTO.getDesc_manutencao());
            pst.setInt(3, objManutencaoDTO.getId_maquina());
            pst.setInt(4, objManutencaoDTO.getId_peca());
            pst.setString(5, objManutencaoDTO.getData_entrada());

            int res = pst.executeUpdate();
            if (res == 1) {
                JOptionPane.showMessageDialog(null, "SUCESSO!\nCadastro feito com êxito.");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar.");
            }
            pst.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao criar Manutenção: " + e);
            limpar1();

        }
    }
    
    public void pesquisaMaquina(){
        String sql = "select * from Maquina where nome_maquina like ?";
        conexao = ConexaoDAO.conector();
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtPesquisaMaq.getText() + "%");
            rs = pst.executeQuery();
            
            tblMaquina.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Método Pesquisa: "+e);
        }
    }
    
    public void pesquisaPeca(){
        String sql = "select * from Peca where nome_peca like ?";
        conexao = ConexaoDAO.conector();
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtPesquisarPeca.getText() + "%");
            rs = pst.executeQuery();
            
            tblPeca.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Método Pesquisa: "+e);
        }
    }

    public void pesquisaAuto() {
        String sql = "select * from Manutencao";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) InternalFrameManutencao.tblManutencao.getModel();
            model.setNumRows(0);
            System.out.println(pst);

            while (rs.next()) {
                int id = rs.getInt("id_manutencao");
                String desc = rs.getString("descricao_manutencao");
                String respon = rs.getString("responsavel");
                String status = rs.getString("status_manutencao");
                String dtent = rs.getString("data_entrada");
                String dtsai = rs.getString("data_saida");
                String idmaq = rs.getString("id_maquina");
                String idpec = rs.getString("id_peca");
                String solu = rs.getString("solucao");
                model.addRow(new Object[]{id, desc, respon, status, dtent, dtsai, idmaq, idpec, solu});
            }
            conexao.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Método Pesquisa Automática: " + e);
        }
    }
    
    public void pesquisaAutoRelatorio() {
        String sql = "select * from Manutencao";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) TelaPrincipal.tblRelatorio.getModel();
            model.setNumRows(0);
            System.out.println(pst);

            while (rs.next()) {
                int id = rs.getInt("id_manutencao");
                String desc = rs.getString("descricao_manutencao");
                String respon = rs.getString("responsavel");
                String status = rs.getString("status_manutencao");
                String dtent = rs.getString("data_entrada");
                String dtsai = rs.getString("data_saida");
                String idmaq = rs.getString("id_maquina");
                String idpec = rs.getString("id_peca");
                String solu = rs.getString("solucao");
                model.addRow(new Object[]{id, desc, respon, status, dtent, dtsai, idmaq, idpec, solu});
            }
            conexao.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Método Pesquisa Automática: " + e);
        }
    }

    public void pesquisarManutencao() {
        String sql = "select * from Manutencao where descricao_manutencao like ?";
        conexao = ConexaoDAO.conector();
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtPesquisaManutencao.getText() + "%");
            rs = pst.executeQuery();

            tblManutencao.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Método Pesquisa: " + e);
        }
    }

    public void editar(ManutencaoDTO objManutencaoDTO) {
    String sql = "update manutencao set descricao_manutencao = ?, status_manutencao = ?, data_saida = ?, id_maquina = ?, id_peca = ?, responsavel = ?, solucao = ? where id_manutencao = ?";
    
    try {
        if (conexao == null) {
            conexao = ConexaoDAO.conector();
        }
        
        if (conexao == null) {
            JOptionPane.showMessageDialog(null, "Erro: Não foi possível conectar ao banco de dados.");
            return;
        }
        
        pst = conexao.prepareStatement(sql);
        pst.setString(1, objManutencaoDTO.getDesc_manutencao());
        pst.setString(2, objManutencaoDTO.getStatus_manutencao());
        pst.setString(3, objManutencaoDTO.getData_saida());
        pst.setInt(4, objManutencaoDTO.getId_maquina());
        pst.setInt(5, objManutencaoDTO.getId_peca());
        pst.setString(6, objManutencaoDTO.getResponsavel());
        pst.setString(7, objManutencaoDTO.getSolucao());
        pst.setInt(8, objManutencaoDTO.getId_manutencao());

        int res = pst.executeUpdate();
        if (res > 0) {
            JOptionPane.showMessageDialog(null, "SUCESSO\nManutenção editada com êxito.");
        } else {
            JOptionPane.showMessageDialog(null, "ERRO: Manutenção não existe.");
        }
        
    } catch (Exception e) {
        e.printStackTrace(); // Exibe detalhes do erro no console
        JOptionPane.showMessageDialog(null, "Método Editar: " + e);
    } finally {
        // Feche a conexão e a declaração após o uso para liberar recursos
        try {
            if (pst != null) pst.close();
            if (conexao != null) conexao.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
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
                JOptionPane.showMessageDialog(null, "SUCESSO\nManutenção deletada com êxito.");
                limpar3();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Método Deletar: " + e);
        }
    }

    public void limpar1() {

        InternalFrameManutencao.txtResponsavel.setText(null);
        InternalFrameManutencao.txtDesc.setText(null);
        InternalFrameManutencao.IDMaquina.setText(null);
        InternalFrameManutencao.IDPeca.setText(null);
    }

    public void limpar2() {

        InternalFrameManutencao.txtID.setText(null);
        InternalFrameManutencao.txtSolucao.setText(null);
        InternalFrameManutencao.saiDia.setText(null);
        InternalFrameManutencao.saiMes.setText(null);
        InternalFrameManutencao.saiAno.setText(null);
    }

    public void limpar3() {

        InternalFrameManutencao.txtID.setText(null);
        InternalFrameManutencao.txtResponsavel.setText(null);
        InternalFrameManutencao.txtDesc.setText(null);
        InternalFrameManutencao.IDMaquina.setText(null);
        InternalFrameManutencao.IDPeca.setText(null);
        InternalFrameManutencao.txtSolucao.setText(null);
        InternalFrameManutencao.saiDia.setText(null);
        InternalFrameManutencao.saiMes.setText(null);
        InternalFrameManutencao.saiAno.setText(null);
        InternalFrameManutencao.txtDataAtual.setText("Indefinido");

    }

}
