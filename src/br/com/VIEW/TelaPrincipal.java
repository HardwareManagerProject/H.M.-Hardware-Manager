/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.VIEW;

import java.awt.Graphics;
import java.awt.Image;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.ImageIcon;


/**
 *
 * @author aluno.saolucas
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/img/HM_Background.gif"));
        Image img = icon.getImage();
        TheDesktopPane = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g)
            {
                g.drawImage(img, 0,0, getWidth(),
                    getHeight(),this);
            }
        }
        ;
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblUsuarioPrincipal = new javax.swing.JLabel();
        barraDeMenu = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        sUsuario = new javax.swing.JMenuItem();
        sLaboratorio = new javax.swing.JMenuItem();
        sEquipamento = new javax.swing.JMenuItem();
        sPeca = new javax.swing.JMenuItem();
        menuManutencao = new javax.swing.JMenu();
        sRegistrarManutencao = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tabela_relatorios_title.png"))); // NOI18N

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Placeholder (Ícone Banco)");

        lblData.setForeground(new java.awt.Color(255, 255, 255));
        lblData.setText("Placeholder (Data)");

        lblUsuarioPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuarioPrincipal.setText("Placeholder (Nome Usuário)");

        TheDesktopPane.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        TheDesktopPane.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        TheDesktopPane.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        TheDesktopPane.setLayer(lblData, javax.swing.JLayeredPane.DEFAULT_LAYER);
        TheDesktopPane.setLayer(lblUsuarioPrincipal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout TheDesktopPaneLayout = new javax.swing.GroupLayout(TheDesktopPane);
        TheDesktopPane.setLayout(TheDesktopPaneLayout);
        TheDesktopPaneLayout.setHorizontalGroup(
            TheDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TheDesktopPaneLayout.createSequentialGroup()
                .addGroup(TheDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TheDesktopPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblUsuarioPrincipal))
                    .addGroup(TheDesktopPaneLayout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addGroup(TheDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );
        TheDesktopPaneLayout.setVerticalGroup(
            TheDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TheDesktopPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TheDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblData)
                    .addComponent(lblUsuarioPrincipal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        menuCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cadastro_icon.png"))); // NOI18N
        menuCadastro.setText("Cadastro");

        sUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario_icon.png"))); // NOI18N
        sUsuario.setText("Usuário");
        sUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sUsuarioActionPerformed(evt);
            }
        });
        menuCadastro.add(sUsuario);

        sLaboratorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/laboratorio_icon.png"))); // NOI18N
        sLaboratorio.setText("Laboratório");
        sLaboratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sLaboratorioActionPerformed(evt);
            }
        });
        menuCadastro.add(sLaboratorio);

        sEquipamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/equipamento_icon.png"))); // NOI18N
        sEquipamento.setText("Máquina");
        sEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sEquipamentoActionPerformed(evt);
            }
        });
        menuCadastro.add(sEquipamento);

        sPeca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/peca _icon.png"))); // NOI18N
        sPeca.setText("Peça");
        sPeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sPecaActionPerformed(evt);
            }
        });
        menuCadastro.add(sPeca);

        barraDeMenu.add(menuCadastro);

        menuManutencao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/manutencao.png"))); // NOI18N
        menuManutencao.setText("Manutenção");

        sRegistrarManutencao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fazer_manutencao_icon.png"))); // NOI18N
        sRegistrarManutencao.setText("Registrar/Fazer Manutenção");
        sRegistrarManutencao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sRegistrarManutencaoActionPerformed(evt);
            }
        });
        menuManutencao.add(sRegistrarManutencao);

        barraDeMenu.add(menuManutencao);

        setJMenuBar(barraDeMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TheDesktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TheDesktopPane)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sUsuarioActionPerformed
        InternalFrameUsuario tusuario = new InternalFrameUsuario();
        TheDesktopPane.add(tusuario);
        tusuario.setVisible(true);
    }//GEN-LAST:event_sUsuarioActionPerformed

    private void sLaboratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sLaboratorioActionPerformed
        InternalFrameLaboratorio tlaboratorio = new InternalFrameLaboratorio();
        TheDesktopPane.add(tlaboratorio);
        tlaboratorio.setVisible(true);
    }//GEN-LAST:event_sLaboratorioActionPerformed

    private void sEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sEquipamentoActionPerformed
        InternalFrameMaquina tmaquina = new InternalFrameMaquina();
        TheDesktopPane.add(tmaquina);
        tmaquina.setVisible(true);
    }//GEN-LAST:event_sEquipamentoActionPerformed

    private void sPecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sPecaActionPerformed
        InternalFramePeca tpeca = new InternalFramePeca();
        TheDesktopPane.add(tpeca);
        tpeca.setVisible(true);
    }//GEN-LAST:event_sPecaActionPerformed

    private void sRegistrarManutencaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sRegistrarManutencaoActionPerformed
        InternalFrameManutencao tmanutencao = new InternalFrameManutencao();
        TheDesktopPane.add(tmanutencao);
        tmanutencao.setVisible(true);
    }//GEN-LAST:event_sRegistrarManutencaoActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Date data = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
        lblData.setText(formatador.format(data));
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane TheDesktopPane;
    private javax.swing.JMenuBar barraDeMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public static javax.swing.JLabel lblData;
    public static javax.swing.JLabel lblUsuarioPrincipal;
    public static javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuManutencao;
    private javax.swing.JMenuItem sEquipamento;
    private javax.swing.JMenuItem sLaboratorio;
    private javax.swing.JMenuItem sPeca;
    private javax.swing.JMenuItem sRegistrarManutencao;
    public static javax.swing.JMenuItem sUsuario;
    // End of variables declaration//GEN-END:variables
}
