/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoCurso;
import fatec.poo.model.Curso;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class GuiCurso extends javax.swing.JFrame {

    /**
     * Creates new form GuiCurso
     */
    public GuiCurso() {
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

        lblSiglaCurso = new javax.swing.JLabel();
        lblNomeCurso = new javax.swing.JLabel();
        lblCargaHoraria = new javax.swing.JLabel();
        lblValorCurso = new javax.swing.JLabel();
        lblProgramaCurso = new javax.swing.JLabel();
        lblDtVigencia = new javax.swing.JLabel();
        lblValHorInst = new javax.swing.JLabel();
        txtSiglaCurso = new javax.swing.JTextField();
        txtNomeCurso = new javax.swing.JTextField();
        txtCargaHoraria = new javax.swing.JTextField();
        txtValCurso = new javax.swing.JTextField();
        txtProgCurso = new javax.swing.JTextField();
        txtValHorInst = new javax.swing.JTextField();
        ftxtDtVigencia = new javax.swing.JFormattedTextField();
        btnConsultar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Curso");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblSiglaCurso.setText("Sigla curso");

        lblNomeCurso.setText("Nome curso");

        lblCargaHoraria.setText("Carga horária ");

        lblValorCurso.setText("Valor curso");

        lblProgramaCurso.setText("Programa do curso");

        lblDtVigencia.setText("Data vigência");

        lblValHorInst.setText("Valor hora instrutor");

        txtNomeCurso.setEnabled(false);

        txtCargaHoraria.setEnabled(false);

        txtValCurso.setEnabled(false);

        txtProgCurso.setEnabled(false);

        txtValHorInst.setEnabled(false);

        try {
            ftxtDtVigencia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtDtVigencia.setEnabled(false);

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.setEnabled(false);
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Eraser.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(lblSiglaCurso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSiglaCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(lblNomeCurso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lblCargaHoraria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblValorCurso)
                            .addComponent(lblProgramaCurso))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtProgCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblValHorInst))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtValCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblDtVigencia)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtValHorInst, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(ftxtDtVigencia, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterar, btnConsultar, btnExcluir, btnInserir, btnSair});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSiglaCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSiglaCurso))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomeCurso))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCargaHoraria))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValorCurso)
                    .addComponent(ftxtDtVigencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDtVigencia))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProgCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProgramaCurso)
                    .addComponent(lblValHorInst)
                    .addComponent(txtValHorInst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsultar)
                    .addComponent(btnInserir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao = new Conexao("poo","trabalhopoo");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@localhost:1521:xe");
        daoCurso = new DaoCurso(conexao.conectar());
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        conexao.fecharConexao();
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        curso = new Curso(txtSiglaCurso.getText(), txtNomeCurso.getText());
        curso.setPrograma(txtProgCurso.getText());
        curso.setCargaHoraria(Integer.valueOf(txtCargaHoraria.getText()));
        curso.setValor(Double.valueOf(txtValCurso.getText()));
        curso.setValorHoraInstrutor(Double.valueOf(txtValHorInst.getText()));
        curso.setDataVigencia(ftxtDtVigencia.getText());

        daoCurso.inserir(curso);

        txtSiglaCurso.setText("");
        txtNomeCurso.setText("");
        txtProgCurso.setText("");
        txtCargaHoraria.setText("");
        txtValCurso.setText("");
        txtValHorInst.setText("");
        ftxtDtVigencia.setText("");

        btnInserir.setEnabled(false);
        txtSiglaCurso.setEnabled(true);
        txtNomeCurso.setEnabled(false);
        txtProgCurso.setEnabled(false);
        txtCargaHoraria.setEnabled(false);
        txtValCurso.setEnabled(false);
        txtValHorInst.setEnabled(false);
        ftxtDtVigencia.setEnabled(false);
        txtNomeCurso.requestFocus();

        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
       curso = null;
        curso = daoCurso.consultar(txtSiglaCurso.getText());

        if (curso == null) {
            txtSiglaCurso.setEnabled(false);
            txtNomeCurso.setEnabled(true);
            txtProgCurso.setEnabled(true);
            txtCargaHoraria.setEnabled(true);
            txtValCurso.setEnabled(true);
            txtValHorInst.setEnabled(true);
            ftxtDtVigencia.setEnabled(true);
            txtNomeCurso.requestFocus();

            btnConsultar.setEnabled(false);
            btnInserir.setEnabled(true);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
        } else {
            txtNomeCurso.setText(curso.getNome());
            txtNomeCurso.setText(curso.getNome());
            txtCargaHoraria.setText(Integer.toString(curso.getCargaHoraria()));
            txtValCurso.setText(Double.toString(curso.getValor()));
            ftxtDtVigencia.setText(curso.getDataVigencia());
            txtValHorInst.setText(Double.toString(curso.getValorHoraInstrutor()));
            txtProgCurso.setText(curso.getPrograma());
            
            txtSiglaCurso.setEnabled(false);
            txtNomeCurso.setEnabled(true);
            txtProgCurso.setEnabled(true);
            txtCargaHoraria.setEnabled(true);
            txtValCurso.setEnabled(true);
            txtValHorInst.setEnabled(true);
            ftxtDtVigencia.setEnabled(true);
            txtNomeCurso.requestFocus();

            btnConsultar.setEnabled(false);
            btnInserir.setEnabled(false);
            btnAlterar.setEnabled(true);
            btnExcluir.setEnabled(true);

        }                  

    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Alteração") == 0) {
            curso = new Curso(txtSiglaCurso.getText(), txtNomeCurso.getText());
            curso.setNome(txtNomeCurso.getText());
            curso.setCargaHoraria(Integer.parseInt(txtCargaHoraria.getText()));
            curso.setValor(Double.parseDouble(txtValCurso.getText()));
            curso.setDataVigencia(ftxtDtVigencia.getText());
            curso.setValorHoraInstrutor(Double.parseDouble(txtValHorInst.getText()));
            curso.setPrograma(txtProgCurso.getText());

            daoCurso.alterar(curso);
        }

        txtSiglaCurso.setText("");
        txtNomeCurso.setText("");
        txtProgCurso.setText("");
        txtCargaHoraria.setText("");
        txtValCurso.setText("");
        txtValHorInst.setText("");
        ftxtDtVigencia.setText("");
        txtSiglaCurso.requestFocus();

        txtSiglaCurso.setEnabled(true);
        txtNomeCurso.setEnabled(false);
        txtProgCurso.setEnabled(false);
        txtCargaHoraria.setEnabled(false);
        txtValCurso.setEnabled(false);
        txtValHorInst.setEnabled(false);
        ftxtDtVigencia.setEnabled(false);

        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
       if (JOptionPane.showConfirmDialog(null, "Confirma Exclusão?") == 0) {
            daoCurso.excluir(curso);

            txtSiglaCurso.setText("");
            txtNomeCurso.setText("");
            txtProgCurso.setText("");
            txtCargaHoraria.setText("");
            txtValCurso.setText("");
            txtValHorInst.setText("");
            ftxtDtVigencia.setText("");
            txtSiglaCurso.setEnabled(true);
            txtNomeCurso.setEnabled(false);
            txtProgCurso.setEnabled(false);
            txtCargaHoraria.setEnabled(false);
            txtValCurso.setEnabled(false);
            txtValHorInst.setEnabled(false);
            ftxtDtVigencia.setEnabled(false);
            txtSiglaCurso.requestFocus();

            btnConsultar.setEnabled(true);
            btnInserir.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(GuiCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiCurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.JFormattedTextField ftxtDtVigencia;
    private javax.swing.JLabel lblCargaHoraria;
    private javax.swing.JLabel lblDtVigencia;
    private javax.swing.JLabel lblNomeCurso;
    private javax.swing.JLabel lblProgramaCurso;
    private javax.swing.JLabel lblSiglaCurso;
    private javax.swing.JLabel lblValHorInst;
    private javax.swing.JLabel lblValorCurso;
    private javax.swing.JTextField txtCargaHoraria;
    private javax.swing.JTextField txtNomeCurso;
    private javax.swing.JTextField txtProgCurso;
    private javax.swing.JTextField txtSiglaCurso;
    private javax.swing.JTextField txtValCurso;
    private javax.swing.JTextField txtValHorInst;
    // End of variables declaration//GEN-END:variables
    private DaoCurso daoCurso = null;
    private Curso curso = null;
    private Conexao conexao = null;
}
