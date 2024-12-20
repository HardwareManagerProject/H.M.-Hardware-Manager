package br.com.VIEW;

import br.com.DAO.ConexaoDAO;
import java.sql.*;
import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public TelaLogin() {
        initComponents();
        conexao = ConexaoDAO.conector();

        if (conexao != null) {
            System.out.println("Conectado com sucesso. " + conexao);
        } else {
            System.out.println("Falha na conexão. " + conexao);
        }

    }

    public void logar() {
        String sql = "select * from usuario where nome_usuario = ? and senha_usuario = ?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtNome.getText());
            pst.setString(2, txtSenha.getText());

            rs = pst.executeQuery();

            if (rs.next()) {
                String perfil = rs.getString(4);

                switch (perfil) {
                    case "admin": {
                        TelaPrincipal principal = new TelaPrincipal();
                        principal.setVisible(true);
                        TelaPrincipal.menuCadastro.setEnabled(true);
                        TelaPrincipal.sUsuario.setEnabled(true);
                        TelaPrincipal.lblUsuarioPrincipal.setText(rs.getString(2));
                        conexao.close();
                        break;
                    }
                    case "professor": {
                        TelaPrincipal principal = new TelaPrincipal();
                        principal.setVisible(true);
                        TelaPrincipal.menuCadastro.setEnabled(true);
                        TelaPrincipal.sUsuario.setEnabled(true);
                        TelaPrincipal.lblUsuarioPrincipal.setText(rs.getString(2));
                        conexao.close();
                        break;
                    }
                    case "tecnico": {
                        TelaPrincipal principal = new TelaPrincipal();
                        principal.setVisible(true);
                        TelaPrincipal.menuCadastro.setEnabled(true);
                        TelaPrincipal.sUsuario.setEnabled(false);
                        TelaPrincipal.lblUsuarioPrincipal.setText(rs.getString(2));
                        conexao.close();
                        break;
                    }
                    default: {
                        TelaPrincipal principal = new TelaPrincipal();
                        principal.setVisible(true);
                        TelaPrincipal.menuCadastro.setEnabled(false);
                        TelaPrincipal.sUsuario.setEnabled(false);
                        TelaPrincipal.lblUsuarioPrincipal.setText(rs.getString(2));
                        conexao.close();
                        break;
                    }
                }
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "ERRO: Usuário e/ou senha inválidos");
                txtNome.setText(null);
                txtSenha.setText(null);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Método Login: " + e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Login_title.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 35)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));

        txtSenha.setFont(new java.awt.Font("Tahoma", 0, 35)); // NOI18N
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 500, 50));

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 35)); // NOI18N
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 500, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 35)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Senha");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/HM_Icon_161x161.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        btnLogin.setBackground(new java.awt.Color(153, 204, 255));
        btnLogin.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login_btn.png"))); // NOI18N
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 330, 140));

        Background.setFont(new java.awt.Font("Tahoma", 0, 35)); // NOI18N
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg_login.png"))); // NOI18N
        Background.setText("bACKGROUND");
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 1000, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        logar();
    }//GEN-LAST:event_btnLoginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JTextField txtNome;
    public static javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
