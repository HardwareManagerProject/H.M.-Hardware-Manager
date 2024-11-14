package br.com.DAO;

import br.com.DTO.UsuarioDTO;
import br.com.VIEW.InternalFrameUsuario;
import static br.com.VIEW.InternalFrameUsuario.tblUsuarios;
import static br.com.VIEW.InternalFrameUsuario.txtPesquisa;
import br.com.VIEW.TelaPrincipal;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class UsuarioDAO {
    
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public void inserirUsuario(UsuarioDTO objUsuarioDTO) {
        String sql = "insert into Usuario(nome_usuario, senha_usuario, tipo_usuario, email) values(?, ?, ?, ?)";
        conexao = new ConexaoDAO().conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, objUsuarioDTO.getNome_user());
            pst.setString(2, objUsuarioDTO.getSenha_user());
            pst.setString(3, objUsuarioDTO.getTipo_user());
            pst.setString(4, objUsuarioDTO.getEmail());
            

            int res = pst.executeUpdate();
            if (res == 1) {
                JOptionPane.showMessageDialog(null, "SUCESSO!\nCadastro feito com êxito.");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar.");
            }
            pst.close();

        } catch (Exception e) {
            if (e.getMessage().contains("Usuario.PRIMARY")) {
                JOptionPane.showMessageDialog(null, "ERRO: ID já está em uso.");
            } else if (e.getMessage().contains("Usuario.nome_usuario_UNIQUE")) {
                JOptionPane.showMessageDialog(null, "ERRO: Nome de usuário já está em uso.");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao inserir usuário: " + e);
            }
        }

    }
    
    public void apagar(UsuarioDTO objUsuarioDTO) {
        String sql = "delete from Usuario where id_usuario = ?";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, objUsuarioDTO.getId_user());
            int add = pst.executeUpdate();
            if (add > 0) {
                conexao.close();
                JOptionPane.showMessageDialog(null, "SUCESSO!\nUsuário excluído com êxito.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Método Apagar: " + e);
        }
    }
    
    public void pesquisaAuto(){
        String sql = "select * from Usuario";
        conexao = ConexaoDAO.conector();
        
        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) InternalFrameUsuario.tblUsuarios.getModel();
            model.setNumRows(0);
            
            while (rs.next()){
                int id = rs.getInt("id_usuario");
                String nome = rs.getString("nome_usuario");
                String senha = rs.getString("senha_usuario");
                String email = rs.getString("email");
                String tipo = rs.getString("tipo_usuario");
                model.addRow(new Object[]{id, nome, senha, email, tipo});
            }
            conexao.close();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Método Pesquisa Automática: "+e);
        }
        
    }
    
    public void pesquisa(){
        String sql = "select * from Usuario where nome_usuario like ?";
        conexao = ConexaoDAO.conector();
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtPesquisa.getText() + "%");
            rs = pst.executeQuery();
            
            tblUsuarios.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Método Pesquisa: "+e);
        }
    }
    
    public void editar(UsuarioDTO objUsuarioDTO) {
        String sql = "update Usuario set nome_usuario = ?, senha_usuario = ?, tipo_usuario = ?, email = ? where id_usuario = ?";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(5, objUsuarioDTO.getId_user());
            pst.setString(1, objUsuarioDTO.getNome_user());
            pst.setString(2, objUsuarioDTO.getSenha_user());
            pst.setString(3, objUsuarioDTO.getTipo_user());
            pst.setString(4, objUsuarioDTO.getEmail());

            int add = pst.executeUpdate();
            if (add > 0) {
                conexao.close();
                JOptionPane.showMessageDialog(null, "SUCESSO!\nUsuário editado com êxito.");
            } else {
                JOptionPane.showMessageDialog(null, "ERRO: Usuário não existe.");
                conexao.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Método Editar: " + e);
        }
    }
    
     public void logar(UsuarioDTO objUsuarioDTO) {
        String sql = "select * from Usuario where nome_usuario = ? and senha_usuario = ?";
        conexao = new ConexaoDAO().conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, objUsuarioDTO.getNome_user());
            pst.setString(2, objUsuarioDTO.getSenha_user());

            rs = pst.executeQuery();

            if (rs.next()) {
                TelaPrincipal principal = new TelaPrincipal();
                principal.setVisible(true);
                conexao.close();
            } else {
                JOptionPane.showMessageDialog(null, "ERRO: Usuário e/ou senha inválidos");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Método Login: " + e);
        }
    }
     public void limpar(){
         InternalFrameUsuario.txtID.setText("...");
         InternalFrameUsuario.txtNomeUsu.setText(null);
         InternalFrameUsuario.txtSenha.setText(null);
         InternalFrameUsuario.txtEmail.setText(null);
     }
}
