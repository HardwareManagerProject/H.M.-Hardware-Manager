package br.com.VIEW;

import br.com.DAO.ManutencaoDAO;
import br.com.DAO.MaquinaDAO;
import br.com.DAO.PecasDAO;
import br.com.DTO.ManutencaoDTO;
import javax.swing.JOptionPane;

public class InternalFrameManutencao extends javax.swing.JInternalFrame {

    public InternalFrameManutencao() {
        initComponents();

        ManutencaoDAO manDAO = new ManutencaoDAO();
        manDAO.pesquisaAuto();

        PecasDAO pDAO = new PecasDAO();
        pDAO.pesquisaAutoManutencao();

        MaquinaDAO maqDAO = new MaquinaDAO();
        maqDAO.pesquisaAutoManutencao();

    }

    public void setFieldsMan() {
        int setar = tblManutencao.getSelectedRow();
        txtID.setText(tblManutencao.getModel().getValueAt(setar, 0).toString());
        txtDesc.setText(tblManutencao.getModel().getValueAt(setar, 1).toString());
        txtResponsavel.setText(tblManutencao.getModel().getValueAt(setar, 2).toString());
        IDMaquina.setText(tblManutencao.getModel().getValueAt(setar, 6).toString());
        IDPeca.setText(tblManutencao.getModel().getValueAt(setar, 7).toString());
        String solucao = tblManutencao.getModel().getValueAt(setar, 8).toString();
        txtSolucao.setText(solucao);
        if (tblManutencao.getModel().getValueAt(setar, 5).toString().equals("Indefinido")) {
            txtDataAtual.setText(tblManutencao.getModel().getValueAt(setar, 5).toString());
        } else {
            saiDia.setText(tblManutencao.getModel().getValueAt(setar, 5).toString().substring(0, 2));
            saiMes.setText(tblManutencao.getModel().getValueAt(setar, 5).toString().substring(3, 5));
            saiAno.setText(tblManutencao.getModel().getValueAt(setar, 5).toString().substring(6, 10));
            txtDataAtual.setText(tblManutencao.getModel().getValueAt(setar, 5).toString());
        }

    }

    public void setFieldPec() {

        int setar = tblPeca.getSelectedRow();
        IDPeca.setText(tblPeca.getModel().getValueAt(setar, 0).toString());

    }

    public void setFieldMaq() {
        int setar = tblMaquina.getSelectedRow();
        IDMaquina.setText(tblMaquina.getModel().getValueAt(setar, 0).toString());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblMaquina = new javax.swing.JTable();
        txtPesquisaMaq = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblPeca = new javax.swing.JTable();
        txtPesquisarPeca = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnDeletar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtResponsavel = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblManutencao = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        saiDia = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnLimpar2 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        btnLimpar3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtPesquisaManutencao = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnLimpar1 = new javax.swing.JButton();
        txtID = new javax.swing.JLabel();
        saiMes = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JTextArea();
        comboBoxStatus = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        saiAno = new javax.swing.JTextField();
        IDMaquina = new javax.swing.JTextField();
        IDPeca = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtDataAtual = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtSolucao = new javax.swing.JTextArea();
        bg = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/man_title.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisar_icone.png"))); // NOI18N
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 160, -1, -1));

        tblMaquina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Numéro de Série", "Tipo", "Descrição", "Status", "Memória RAM", "Processador", "Laboratório Associado", "ID Laboratório"
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
        jScrollPane4.setViewportView(tblMaquina);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, 285, 125));

        txtPesquisaMaq.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPesquisaMaq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaMaqKeyReleased(evt);
            }
        });
        getContentPane().add(txtPesquisaMaq, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 243, 32));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Máquina");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisar_icone.png"))); // NOI18N
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 360, -1, -1));

        tblPeca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Status", "Descrição", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPeca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPecaMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblPeca);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 400, 285, 125));

        txtPesquisarPeca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPesquisarPeca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarPecaKeyReleased(evt);
            }
        });
        getContentPane().add(txtPesquisarPeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 360, 243, 32));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Peça");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 330, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Pesquise pelo equipamento que deseja associar a");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("uma Manutenção:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, -1, -1));

        btnDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/deletar_icone.png"))); // NOI18N
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 520, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Responsável:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Solução:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        txtResponsavel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtResponsavel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 225, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Descrição:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        tblManutencao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Manutenção", "Descrição", "Responsável", "Status", "Data Entrada", "Data Saída", "ID Máquina", "ID Peça", "Solução"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblManutencao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblManutencaoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblManutencao);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 285, 125));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Saída:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, -1, -1));
        getContentPane().add(saiDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 30, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("/");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Data");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, -1));

        btnLimpar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpar_icone.png"))); // NOI18N
        btnLimpar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpar2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Faça sua Manutenção:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Registre sua Manutenção:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar_icone.png"))); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 520, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Pesquise por uma Manutenção:");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, -1, -1));

        btnLimpar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpar_icone.png"))); // NOI18N
        btnLimpar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpar3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 520, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Status:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, -1, -1));

        txtPesquisaManutencao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPesquisaManutencao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaManutencaoKeyReleased(evt);
            }
        });
        getContentPane().add(txtPesquisaManutencao, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 243, 32));

        btnRegistrar.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cadastrar_icon.png"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 322, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisar_icone.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 350, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));

        btnLimpar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpar_icone.png"))); // NOI18N
        btnLimpar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, -1, -1));

        txtID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtID.setForeground(new java.awt.Color(255, 255, 255));
        txtID.setText("...");
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, -1, -1));
        getContentPane().add(saiMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 30, -1));

        txtDesc.setColumns(20);
        txtDesc.setRows(5);
        jScrollPane3.setViewportView(txtDesc);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 254, -1));

        comboBoxStatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manutenção em espera", "Manutenção em andamento", "Problema solucionado", "Sem solução" }));
        getContentPane().add(comboBoxStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 190, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Equipamento a ser concertado");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ID (Máquina):");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("/");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("ID (Peça):");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));
        getContentPane().add(saiAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 30, -1));

        IDMaquina.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(IDMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 40, -1));

        IDPeca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(IDPeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 40, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Saída (atual):");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, -1, -1));

        txtDataAtual.setForeground(new java.awt.Color(255, 255, 255));
        txtDataAtual.setText("DATA");
        getContentPane().add(txtDataAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, -1, -1));

        txtSolucao.setColumns(20);
        txtSolucao.setRows(5);
        jScrollPane6.setViewportView(txtSolucao);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 190, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg_man.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1010, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisaMaqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaMaqKeyReleased
        ManutencaoDAO manDAO = new ManutencaoDAO();
        manDAO.pesquisaMaquina();
    }//GEN-LAST:event_txtPesquisaMaqKeyReleased

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        if (txtID.getText().equals("...")) {
            JOptionPane.showMessageDialog(null, "ERRO: Opa! Selecione uma Manutenção em sua respectiva Tabela de Pesquisa para poder deletá-lo.");
        } else if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja deletar esta Manutenção?",
                "Deletar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            String id_manutencao = txtID.getText();

            ManutencaoDTO mDTO = new ManutencaoDTO();
            mDTO.setId_manutencao(Integer.parseInt(id_manutencao));

            ManutencaoDAO mDAO = new ManutencaoDAO();
            mDAO.deletar(mDTO);
            mDAO.pesquisaAuto();
            mDAO.pesquisaAutoRelatorio();
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnLimpar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpar2ActionPerformed
        if (txtSolucao.getText().isEmpty() && saiDia.getText().isEmpty() && saiMes.getText().isEmpty() && saiAno.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERRO: Opa! Não há nada a ser limpado.");
        } else {
            ManutencaoDAO mDAO = new ManutencaoDAO();
            mDAO.limpar2();
        }
    }//GEN-LAST:event_btnLimpar2ActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (txtID.getText().equals("...")) {
            JOptionPane.showMessageDialog(null, "ERRO: Opa! Selecione uma Manutenção da Tabela de Pesquisa para poder editá-lo!");
        } else {
            String id_man = txtID.getText();
            String respon = txtResponsavel.getText();
            String desc = txtDesc.getText();
            String idmaq = IDMaquina.getText();
            String idpec = IDPeca.getText();

            String statusConf, status;

            statusConf = (String) comboBoxStatus.getSelectedItem();

            if (statusConf.equals("Manutenção em espera")) {
                status = "Manutenção em espera";
            } else if (statusConf.equals("Manutenção em andamento")) {
                status = "Manutenção em andamento";
            } else if (statusConf.equals("Problema solucionado")) {
                status = "Problema solucionado";
            } else {
                status = "Sem solução";
            }

            String solu = txtSolucao.getText();
            String sD = saiDia.getText();
            String sM = saiMes.getText();
            String sA = saiAno.getText();
            String dasai = sD + "/" + sM + "/" + sA;
            ManutencaoDTO mDTO = new ManutencaoDTO();
            mDTO.setId_manutencao(Integer.parseInt(id_man));
            mDTO.setResponsavel(respon);
            mDTO.setDesc_manutencao(desc);
            mDTO.setId_maquina(Integer.parseInt(idmaq));
            mDTO.setId_peca(Integer.parseInt(idpec));
            mDTO.setStatus_manutencao(status);
            mDTO.setSolucao(solu);
            mDTO.setData_saida(dasai);

            ManutencaoDAO mDAO = new ManutencaoDAO();
            mDAO.editar(mDTO);
            mDAO.pesquisaAuto();
            mDAO.limpar3();
            mDAO.pesquisaAutoRelatorio();

        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnLimpar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpar3ActionPerformed
        if (txtResponsavel.getText().isEmpty() && txtDesc.getText().isEmpty() && IDMaquina.getText().isEmpty() && IDPeca.getText().isEmpty() && txtSolucao.getText().isEmpty() && saiDia.getText().isEmpty() && saiMes.getText().isEmpty() && saiAno.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERRO: Opa! Não há nada a ser limpado.");
        } else {
            ManutencaoDAO mDAO = new ManutencaoDAO();
            mDAO.limpar3();
        }
    }//GEN-LAST:event_btnLimpar3ActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if (txtResponsavel.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERRO: Preencha o campo Responsável");
        } else if (txtDesc.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERRO: Preencha o campo Descrição");
        } else if (IDMaquina.getText().isEmpty() && IDPeca.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERRO: Preencha o campo de ID Máquina e Peça");
        } else {

            String respon = txtResponsavel.getText();
            String desc = txtDesc.getText();
            String daent = TelaPrincipal.lblData.getText();
            String idmaq = IDMaquina.getText();
            String idpec = IDPeca.getText();

            ManutencaoDTO mDTO = new ManutencaoDTO();
            mDTO.setResponsavel(respon);
            mDTO.setDesc_manutencao(desc);
            mDTO.setId_maquina(Integer.parseInt(idmaq));
            mDTO.setId_peca(Integer.parseInt(idpec));
            mDTO.setData_entrada(daent);

            ManutencaoDAO mDAO = new ManutencaoDAO();
            mDAO.cadastrarManutencao(mDTO);
            mDAO.pesquisaAuto();
            mDAO.limpar1();
            mDAO.pesquisaAutoRelatorio();
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnLimpar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpar1ActionPerformed
        if (txtResponsavel.getText().isEmpty() && txtDesc.getText().isEmpty() && IDMaquina.getText().isEmpty() && IDPeca.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERRO: Opa! Não há nada a ser limpado.");
        } else {
            ManutencaoDAO mDAO = new ManutencaoDAO();
            mDAO.limpar1();
        }
    }//GEN-LAST:event_btnLimpar1ActionPerformed

    private void txtPesquisaManutencaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaManutencaoKeyReleased
        ManutencaoDAO manDAO = new ManutencaoDAO();
        manDAO.pesquisarManutencao();
    }//GEN-LAST:event_txtPesquisaManutencaoKeyReleased

    private void txtPesquisarPecaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarPecaKeyReleased
        ManutencaoDAO manDAO = new ManutencaoDAO();
        manDAO.pesquisaPeca();
    }//GEN-LAST:event_txtPesquisarPecaKeyReleased

    private void tblManutencaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblManutencaoMouseClicked
        setFieldsMan();
    }//GEN-LAST:event_tblManutencaoMouseClicked

    private void tblMaquinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMaquinaMouseClicked
        setFieldMaq();
    }//GEN-LAST:event_tblMaquinaMouseClicked

    private void tblPecaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPecaMouseClicked
        setFieldPec();
    }//GEN-LAST:event_tblPecaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField IDMaquina;
    public static javax.swing.JTextField IDPeca;
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnLimpar1;
    private javax.swing.JButton btnLimpar2;
    private javax.swing.JButton btnLimpar3;
    private javax.swing.JButton btnRegistrar;
    public static javax.swing.JComboBox<String> comboBoxStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    public static javax.swing.JTextField saiAno;
    public static javax.swing.JTextField saiDia;
    public static javax.swing.JTextField saiMes;
    public static javax.swing.JTable tblManutencao;
    public static javax.swing.JTable tblMaquina;
    public static javax.swing.JTable tblPeca;
    public static javax.swing.JLabel txtDataAtual;
    public static javax.swing.JTextArea txtDesc;
    public static javax.swing.JLabel txtID;
    public static javax.swing.JTextField txtPesquisaManutencao;
    public static javax.swing.JTextField txtPesquisaMaq;
    public static javax.swing.JTextField txtPesquisarPeca;
    public static javax.swing.JTextField txtResponsavel;
    public static javax.swing.JTextArea txtSolucao;
    // End of variables declaration//GEN-END:variables
}
