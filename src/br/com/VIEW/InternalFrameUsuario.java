package br.com.VIEW;

import br.com.DAO.UsuarioDAO;
import br.com.DTO.UsuarioDTO;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno.saolucas
 */
public class InternalFrameUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form InternalFrameUsuario
     */
    public InternalFrameUsuario() {
        initComponents();

        UsuarioDAO uDAO = new UsuarioDAO();
        uDAO.pesquisaAuto();
    }

    public void setFields() {
        int setar = tblUsuarios.getSelectedRow();
        txtID.setText(tblUsuarios.getModel().getValueAt(setar, 0).toString());
        txtNomeUsu.setText(tblUsuarios.getModel().getValueAt(setar, 1).toString());
        txtSenha.setText(tblUsuarios.getModel().getValueAt(setar, 2).toString());
        txtEmail.setText(tblUsuarios.getModel().getValueAt(setar, 3).toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        txtNomeUsu = new javax.swing.JTextField();
        comboBoxTipo = new javax.swing.JComboBox<>();
        btnEditar = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        txtPesquisa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtID = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        txtEmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 19, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 69, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Senha:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tipo Usuário:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        txtSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 107, 250, -1));

        txtNomeUsu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtNomeUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 66, 250, -1));

        comboBoxTipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admnistrador", "Técnico", "Estagiário", "Professor" }));
        getContentPane().add(comboBoxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 210, -1));

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar_icone.png"))); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 83, -1, -1));

        btnApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/deletar_icone.png"))); // NOI18N
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });
        getContentPane().add(btnApagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 130, -1, -1));

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpar_icone.png"))); // NOI18N
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 95)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuarios_title.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 66, -1, -1));

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Senha", "Email", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsuarios);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 328, 900, 210));

        txtPesquisa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyReleased(evt);
            }
        });
        getContentPane().add(txtPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 274, 32));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisar_icone.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, -1, -1));

        txtID.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtID.setForeground(new java.awt.Color(255, 255, 255));
        txtID.setText("...");
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 19, -1, -1));

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cadastrar_icone.png"))); // NOI18N
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 83, -1, -1));

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 250, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("E-mail:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg_usu.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (txtID.getText().equals("...")) {
            JOptionPane.showMessageDialog(null, "ERRO: Opa! Selecione um Usuário na Tabela de Pesquisa para poder editá-lo.");
        } else {

            String id = txtID.getText();
            String nome = txtNomeUsu.getText();
            String senha = txtSenha.getText();
            String email = txtEmail.getText();
            String tipo;
            String perfil;
            tipo = (String) comboBoxTipo.getSelectedItem();
            switch (tipo) {
                case "Admnistrador":
                    perfil = "admin";
                    break;
                case "Técnico":
                    perfil = "tecnico";
                    break;
                case "Estagiário":
                    perfil = "estagiario";
                    break;
                case "Professor":
                    perfil = "professor";
                    break;
                default:
                    perfil = "Não definido";
                    break;
            }

            UsuarioDTO uDTO = new UsuarioDTO();
            uDTO.setId_user(Integer.parseInt(id));
            uDTO.setNome_user(nome);
            uDTO.setSenha_user(senha);
            uDTO.setEmail(email);
            uDTO.setTipo_user(perfil);

            UsuarioDAO uDAO = new UsuarioDAO();
            uDAO.editar(uDTO);
            uDAO.pesquisaAuto();
            uDAO.limpar();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        if (txtNomeUsu.getText().isEmpty() && txtSenha.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Erro: Opa! Não há nada a ser limpado.");
        } else {
            UsuarioDAO uDAO = new UsuarioDAO();
            uDAO.limpar();
        }
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        if (txtID.getText().equals("...")) {
            JOptionPane.showMessageDialog(null, "ERRO: Opa! Selecione um Usuário na Tabela de Pesquisa para poder deletá-lo.");
        } else if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja deletar este usuário?",
                "Deletar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            String id = txtID.getText();

            UsuarioDTO uDTO = new UsuarioDTO();
            uDTO.setId_user(Integer.parseInt(id));

            UsuarioDAO uDAO = new UsuarioDAO();
            uDAO.apagar(uDTO);
            uDAO.pesquisaAuto();
            uDAO.limpar();
        }
    }//GEN-LAST:event_btnApagarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if (txtNomeUsu.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERRO: Preencha o campo Nome");
        } else if (txtSenha.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERRO: Preencha o campo Senha");
        } else if (txtEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERRO: Preencha o campo Email");
        } else {
            String nome = txtNomeUsu.getText();
            String senha = txtSenha.getText();
            String email = txtEmail.getText();
            String tipo;
            String perfil;
            tipo = (String) comboBoxTipo.getSelectedItem();
            switch (tipo) {
                case "Admnistrador":
                    perfil = "admin";
                    break;
                case "Técnico":
                    perfil = "tecnico";
                    break;
                case "Estagiário":
                    perfil = "estagiario";
                    break;
                case "Professor":
                    perfil = "professor";
                    break;
                default:
                    perfil = "Não definido";
                    break;
            }

            UsuarioDTO uDTO = new UsuarioDTO();
            uDTO.setNome_user(nome);
            uDTO.setSenha_user(senha);
            uDTO.setTipo_user(perfil);
            uDTO.setEmail(email);

            UsuarioDAO uDAO = new UsuarioDAO();
            uDAO.inserirUsuario(uDTO);
            uDAO.pesquisaAuto();
            uDAO.limpar();
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void tblUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuariosMouseClicked
        setFields();
    }//GEN-LAST:event_tblUsuariosMouseClicked

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        UsuarioDAO uDAO = new UsuarioDAO();
        uDAO.pesquisa();
    }//GEN-LAST:event_txtPesquisaKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnLimpar;
    public static javax.swing.JComboBox<String> comboBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tblUsuarios;
    public static javax.swing.JTextField txtEmail;
    public static javax.swing.JLabel txtID;
    public static javax.swing.JTextField txtNomeUsu;
    public static javax.swing.JTextField txtPesquisa;
    public static javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables
}
