package br.com.DAO;

import br.com.DTO.PecasDTO;
import br.com.VIEW.InternalFrameManutencao;
import br.com.VIEW.InternalFramePeca;
import static br.com.VIEW.InternalFramePeca.txtPesquisa;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import static br.com.VIEW.InternalFramePeca.bg;

public class PecasDAO {
    
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public void inserirPecas(PecasDTO objPecasDTO) {
        String sql = "insert into Peca(nome_peca, status_peca, descricao_peca, quantidade_peca) values(?, ?, ?, ?)";
        conexao = new ConexaoDAO().conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, objPecasDTO.getNome_peca());
            pst.setString(2, objPecasDTO.getStatus_peca());
            pst.setString(3, objPecasDTO.getDesc_peca());
            pst.setInt(4, objPecasDTO.getQuant_peca());
            

            int res = pst.executeUpdate();
            if (res == 1) {
                JOptionPane.showMessageDialog(null, "SUCESSO!\nCadastro feito com êxito.");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar.");
            }
            pst.close();

        } catch (Exception e) {
            if (e.getMessage().contains("Peca.PRIMARY")) {
                JOptionPane.showMessageDialog(null, "ERRO: ID já está em uso.");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao inserir peça: " + e);
            }
        }

    }
    
    public void apagar(PecasDTO objPecasDTO) {
        String sql = "delete from Peca where id_peca = ?";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, objPecasDTO.getId_peca());
            int add = pst.executeUpdate();
            if (add > 0) {
                conexao.close();
                JOptionPane.showMessageDialog(null, "SUCESSO!\nPeça excluída com êxito.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Método Apagar: " + e);
        }
    }
    
    public void pesquisaAuto(){
        String sql = "select * from Peca";
        conexao = ConexaoDAO.conector();
        
        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) InternalFramePeca.bg.getModel();
            model.setNumRows(0);
            
            while (rs.next()){
                int id = rs.getInt("id_peca");
                String nome = rs.getString("nome_peca");
                String status = rs.getString("status_peca");
                String desc = rs.getString("descricao_peca");
                int quant = rs.getInt("quantidade_peca");
                model.addRow(new Object[]{id, nome, status, desc, quant});
            }
            conexao.close();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Método Pesquisa Automática: "+e);
        }
        
    }
    
    public void pesquisa(){
        String sql = "select * from Peca where nome_peca like ?";
        conexao = ConexaoDAO.conector();
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtPesquisa.getText() + "%");
            rs = pst.executeQuery();
            
            bg.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Método Pesquisa: "+e);
        }
    }
    
    public void pesquisaAutoManutencao(){
        String sql = "select * from Peca";
        conexao = ConexaoDAO.conector();
        
        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) InternalFrameManutencao.tblPeca.getModel();
            model.setNumRows(0);
            
            while (rs.next()){
                int id = rs.getInt("id_peca");
                String nome = rs.getString("nome_peca");
                String status = rs.getString("status_peca");
                String desc = rs.getString("descricao_peca");
                int quant = rs.getInt("quantidade_peca");
                model.addRow(new Object[]{id, nome, status, desc, quant});
            }
            conexao.close();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Método Pesquisa Automática: "+e);
        }
        
    }
    
    public void editar(PecasDTO objPecasDTO) {
        String sql = "update Peca set nome_peca = ?, status_peca = ?, descricao_peca = ?, quantidade_peca = ? where id_peca = ?";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, objPecasDTO.getNome_peca());
            pst.setString(2, objPecasDTO.getStatus_peca());
            pst.setString(3, objPecasDTO.getDesc_peca());
            pst.setInt(4, objPecasDTO.getQuant_peca());
            pst.setInt(5, objPecasDTO.getId_peca());

            int add = pst.executeUpdate();
            if (add > 0) {
                conexao.close();
                JOptionPane.showMessageDialog(null, "SUCESSO!\nPeça editada com êxito.");
            } else {
                JOptionPane.showMessageDialog(null, "ERRO: Peça não existe.");
                conexao.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Método Editar: " + e);
        }
    }
    public void limpar(){
        InternalFramePeca.txtIDPeca.setText("...");
        InternalFramePeca.txtNomePeca.setText(null);
        InternalFramePeca.txtQuant.setText(null);
        InternalFramePeca.txtDesc.setText(null);
    }
}
