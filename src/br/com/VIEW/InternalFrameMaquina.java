/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.VIEW;

import br.com.DAO.MaquinaDAO;
import br.com.DTO.MaquinaDTO;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno.saolucas
 */
public class InternalFrameMaquina extends javax.swing.JInternalFrame {

    /**
     * Creates new form InternalFrameMaquina
     */
    public InternalFrameMaquina() {
        initComponents();
        
        MaquinaDAO mDAO = new MaquinaDAO();
        mDAO.pesquisaAuto();
    }

    public void setFields() {
        int setar = tblMaquina.getSelectedRow();
        txtIDMaq.setText(tblMaquina.getModel().getValueAt(setar, 0).toString());
        txtNomeMaquina.setText(tblMaquina.getModel().getValueAt(setar, 1).toString());
        txtNumSerie.setText(tblMaquina.getModel().getValueAt(setar, 2).toString());
        txtTipo.setText(tblMaquina.getModel().getValueAt(setar, 3).toString());
        txtDesc.setText(tblMaquina.getModel().getValueAt(setar, 4).toString());
        txtMemRam.setText(tblMaquina.getModel().getValueAt(setar, 6).toString());
        txtProcessador.setText(tblMaquina.getModel().getValueAt(setar, 7).toString());
        txtIDLab.setText(tblMaquina.getModel().getValueAt(setar, 9).toString());

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnApagar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        txtNomeMaquina = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMaquina = new javax.swing.JTable();
        txtPesquisa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        txtIDMaq = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMemRam = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtProcessador = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboBoxStatus = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JTextArea();
        btnCadastrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtIDLab = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNumSerie = new javax.swing.JTextField();
        bg = new javax.swing.JLabel();

        setClosable(true);
        setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/deletar_icone.png"))); // NOI18N
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });
        getContentPane().add(btnApagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 168, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpar_icone.png"))); // NOI18N
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 168, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 85)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/maq_title.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 11, -1, -1));

        txtTipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 250, -1));

        txtNomeMaquina.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtNomeMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 47, 250, -1));

        tblMaquina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Numéro de Série", "Tipo", "Descrição", "Status", "Memória RAM", "Processador", "Laboratório associado", "ID Laboratório"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMaquina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMaquinaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMaquina);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 960, 130));

        txtPesquisa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });
        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyReleased(evt);
            }
        });
        getContentPane().add(txtPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 261, 32));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisar_icone.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, -1, -1));

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar_icone.png"))); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 121, -1, -1));

        txtIDMaq.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtIDMaq.setForeground(new java.awt.Color(255, 255, 255));
        txtIDMaq.setText("...");
        getContentPane().add(txtIDMaq, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 0, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Memória RAM:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        txtMemRam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtMemRam, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 210, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Processador:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        txtProcessador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtProcessador, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 211, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Descrição:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Status:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        comboBoxStatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Funcionando", "Com defeito" }));
        comboBoxStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxStatusActionPerformed(evt);
            }
        });
        getContentPane().add(comboBoxStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 253, -1));

        txtDesc.setColumns(20);
        txtDesc.setRows(5);
        jScrollPane2.setViewportView(txtDesc);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 227, -1));

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cadastrar_icone.png"))); // NOI18N
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 121, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ID Laboratório:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 50, -1, -1));

        txtIDLab.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtIDLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 47, 39, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Número de Série:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        txtNumSerie.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtNumSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 40, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg_maq.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1000, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxStatusActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String id = txtIDMaq.getText();
        String id_lab = txtIDLab.getText();
        String nome = txtNomeMaquina.getText();
        String num = txtNumSerie.getText();
        String tipo = txtTipo.getText();
        String mem = txtMemRam.getText();
        String proc = txtProcessador.getText();
        String desc = txtDesc.getText();

        String statusConf;
        String status;

        statusConf = (String) comboBoxStatus.getSelectedItem();

        if (statusConf.equals("Funcionando")) {
            status = "Funcionando";
        } else {
            status = "Com defeito";
        }

        MaquinaDTO mDTO = new MaquinaDTO();
        mDTO.setId_maquina(Integer.parseInt(id));
        mDTO.setId_lab(Integer.parseInt(id_lab));
        mDTO.setNome_maquina(nome);
        mDTO.setNum_serie(Integer.parseInt(num));
        mDTO.setTipo_maquina(tipo);
        mDTO.setMem_ram(mem);
        mDTO.setProcessador(proc);
        mDTO.setDesc_maquina(desc);
        mDTO.setStatus_maquina(status);

        MaquinaDAO mDAO = new MaquinaDAO();
        mDAO.editar(mDTO);
        mDAO.pesquisaAuto();
        mDAO.limpar();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        MaquinaDAO mDAO = new MaquinaDAO();
        mDAO.limpar();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        String id = txtIDMaq.getText();

        MaquinaDTO mDTO = new MaquinaDTO();
        mDTO.setId_maquina(Integer.parseInt(id));

        MaquinaDAO mDAO = new MaquinaDAO();
        mDAO.deletar(mDTO);
        mDAO.pesquisaAuto();
        mDAO.limpar();
    }//GEN-LAST:event_btnApagarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if (txtNomeMaquina.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERRO: Preencha o campo Nome");
        } else if (txtTipo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERRO: Preencha o campo Tipo");
        } else if (txtMemRam.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERRO: Preencha o campo Memória Ram");
        } else if (txtProcessador.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERRO: Preencha o campo Processador");
        } else if (txtDesc.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERRO: Preencha o campo Descrição");
        } else if (txtIDLab.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERRO: Preencha o campo ID Laboratório");
        } else if (txtNumSerie.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERRO: Preencha o campo Número de Série");
        } else {
            String nome = txtNomeMaquina.getText();
            String num = txtNumSerie.getText();
            String id_lab = txtIDLab.getText();
            String tipo = txtTipo.getText();
            String mem = txtMemRam.getText();
            String proc = txtProcessador.getText();
            String desc = txtDesc.getText();

            String statusConf;
            String status;

            statusConf = (String) comboBoxStatus.getSelectedItem();

            if (statusConf.equals("Funcionando")) {
                status = "Funcionando";
            } else {
                status = "Com defeito";
            }

            MaquinaDTO mDTO = new MaquinaDTO();
            mDTO.setNome_maquina(nome);
            mDTO.setNum_serie(Integer.parseInt(num));
            mDTO.setId_lab(Integer.parseInt(id_lab));
            mDTO.setTipo_maquina(tipo);
            mDTO.setMem_ram(mem);
            mDTO.setProcessador(proc);
            mDTO.setDesc_maquina(desc);
            mDTO.setStatus_maquina(status);

            MaquinaDAO mDAO = new MaquinaDAO();
            mDAO.cadastrarMaquina(mDTO);
            mDAO.pesquisaAuto();
            mDAO.limpar();
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void tblMaquinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMaquinaMouseClicked
        setFields();
    }//GEN-LAST:event_tblMaquinaMouseClicked

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        MaquinaDAO mDAO = new MaquinaDAO();
        mDAO.pesquisa();
    }//GEN-LAST:event_txtPesquisaKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnLimpar;
    public static javax.swing.JComboBox<String> comboBoxStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable tblMaquina;
    public static javax.swing.JTextArea txtDesc;
    private javax.swing.JTextField txtIDLab;
    public static javax.swing.JLabel txtIDMaq;
    public static javax.swing.JTextField txtMemRam;
    public static javax.swing.JTextField txtNomeMaquina;
    public static javax.swing.JTextField txtNumSerie;
    public static javax.swing.JTextField txtPesquisa;
    public static javax.swing.JTextField txtProcessador;
    public static javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
