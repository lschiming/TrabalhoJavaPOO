/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoCurso;
import fatec.poo.control.DaoTurma;
import fatec.poo.model.Curso;
import fatec.poo.model.Turma;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class GuiTurma extends javax.swing.JFrame {

    /**
     * Creates new form GuiTurma
     */
    public GuiTurma() {
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

        lblCurso = new javax.swing.JLabel();
        lblSiglaTurma = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblQtdVagas = new javax.swing.JLabel();
        lblPeriodo = new javax.swing.JLabel();
        lblDtInicio = new javax.swing.JLabel();
        lblDtTermino = new javax.swing.JLabel();
        txtSiglaTurma = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtQtdeVagas = new javax.swing.JTextField();
        cbxCurso = new javax.swing.JComboBox<>();
        cbxPeriodo = new javax.swing.JComboBox<>();
        ftxtDataInicio = new javax.swing.JFormattedTextField();
        ftxtDataTermino = new javax.swing.JFormattedTextField();
        btnConsultar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblCurso.setText("Curso");

        lblSiglaTurma.setText("Sigla da turma");

        lblNome.setText("Nome");

        lblQtdVagas.setText("Qtde vagas");

        lblPeriodo.setText("Período");

        lblDtInicio.setText("Data início");

        lblDtTermino.setText("Data término");

        txtSiglaTurma.setEnabled(false);

        txtNome.setEnabled(false);

        txtQtdeVagas.setEnabled(false);

        cbxPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diurno", "Integral", "Vespertino", "Noturno" }));
        cbxPeriodo.setEnabled(false);

        try {
            ftxtDataInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtDataInicio.setEnabled(false);

        try {
            ftxtDataTermino.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtDataTermino.setEnabled(false);

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
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDtInicio, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblQtdVagas, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSiglaTurma, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCurso, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSiglaTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtQtdeVagas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(36, 36, 36)
                                    .addComponent(lblPeriodo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cbxPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(ftxtDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblDtTermino)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ftxtDataTermino, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtNome)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterar, btnConsultar, btnExcluir, btnInserir, btnSair});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCurso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSiglaTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSiglaTurma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQtdeVagas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQtdVagas)
                    .addComponent(lblPeriodo)
                    .addComponent(cbxPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftxtDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDtInicio)
                    .addComponent(lblDtTermino)
                    .addComponent(ftxtDataTermino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
        daoTurma = new DaoTurma(conexao.conectar());
        daoCurso = new DaoCurso(conexao.conectar());
        
        ArrayList<String> siglas = new ArrayList<>();
        siglas = daoCurso.listarSiglas(siglas);
        for (int i = 0; i < siglas.size(); i++) {
            cbxCurso.addItem(siglas.get(i));
        }
        txtSiglaTurma.setEnabled(true);
        txtSiglaTurma.requestFocus();
    }//GEN-LAST:event_formWindowOpened

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        turma = null;
        curso = daoCurso.consultar(String.valueOf(cbxCurso.getSelectedItem()));
        turma = daoTurma.consultar(txtSiglaTurma.getText(),curso);
//        curso.addTurma(turma);
        
        if (turma == null) {
            txtSiglaTurma.setEnabled(false);
            txtNome.setEnabled(true);
            txtQtdeVagas.setEnabled(true);
            ftxtDataInicio.setEnabled(true);
            ftxtDataTermino.setEnabled(true);
            cbxPeriodo.setEnabled(true);
            txtNome.requestFocus();
            
            btnConsultar.setEnabled(false);
            btnInserir.setEnabled(true);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
            
        } else {
            txtSiglaTurma.setText(turma.getSiglaTurma());
            txtNome.setText(turma.getDescricao());
            txtQtdeVagas.setText(Integer.toString(turma.getQtdVagas()));
            ftxtDataInicio.setText(turma.getDataInicio());
            ftxtDataTermino.setText(turma.getDataTermino());
            cbxPeriodo.setSelectedItem(turma.getPeriodo());
            cbxCurso.setSelectedItem(turma.getCurso().getSigla());
            
            cbxCurso.setEnabled(false);
            txtSiglaTurma.setEnabled(false);
            txtNome.setEnabled(true);
            txtQtdeVagas.setEnabled(true);
            ftxtDataInicio.setEnabled(true);
            ftxtDataTermino.setEnabled(true);
            cbxPeriodo.setEnabled(true);
            txtNome.requestFocus();
            
            btnConsultar.setEnabled(false);
            btnInserir.setEnabled(false);
            btnAlterar.setEnabled(true);
            btnExcluir.setEnabled(true);
            
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        String sc = String.valueOf(cbxCurso.getSelectedItem());
        turma = new Turma(txtSiglaTurma.getText(),txtNome.getText()); //txtNome = Descricao
        turma.setDataInicio(ftxtDataInicio.getText().replace("/", ""));
        turma.setDataTermino(ftxtDataTermino.getText().replace("/", ""));
        turma.setPeriodo(String.valueOf(cbxPeriodo.getSelectedItem()));
        turma.setQtdVagas(Integer.valueOf(txtQtdeVagas.getText()));
        turma.setObservacoes(null);
        daoTurma.inserir(turma, sc);
        
        curso = daoCurso.consultar(sc);
        curso.addTurma(turma);
        
        cbxCurso.setSelectedIndex(0);
        txtSiglaTurma.setText("");
        txtNome.setText("");
        ftxtDataInicio.setText("");
        ftxtDataTermino.setText("");
        cbxPeriodo.setSelectedIndex(0);
        txtQtdeVagas.setText("");

        cbxCurso.setEnabled(true);
        btnInserir.setEnabled(false);
        txtSiglaTurma.setEnabled(true);
        txtNome.setEnabled(false);
        ftxtDataInicio.setEnabled(false);
        ftxtDataTermino.setEnabled(false);
        cbxPeriodo.setEnabled(false);
        txtQtdeVagas.setEnabled(false);
        txtSiglaTurma.requestFocus();

        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Alteração") == 0) {
            turma = new Turma(txtSiglaTurma.getText(),txtNome.getText());
            turma.setDataInicio(ftxtDataInicio.getText().replace("/", ""));
            turma.setDataTermino(ftxtDataTermino.getText().replace("/", ""));
            turma.setPeriodo(String.valueOf(cbxPeriodo.getSelectedItem()));
            turma.setQtdVagas(Integer.valueOf(txtQtdeVagas.getText()));
            turma.setObservacoes(null);

            daoTurma.alterar(turma);
        }
        
        cbxCurso.setSelectedIndex(0);
        txtSiglaTurma.setText("");
        txtNome.setText("");
        ftxtDataInicio.setText("");
        ftxtDataTermino.setText("");
        cbxPeriodo.setSelectedIndex(0);
        txtQtdeVagas.setText("");

        cbxCurso.setEnabled(true);
        btnInserir.setEnabled(false);
        txtSiglaTurma.setEnabled(true);
        txtNome.setEnabled(false);
        ftxtDataInicio.setEnabled(false);
        ftxtDataTermino.setEnabled(false);
        cbxPeriodo.setEnabled(false);
        txtQtdeVagas.setEnabled(false);
        txtSiglaTurma.requestFocus();

        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Alteração?") == 0) {
            daoTurma.excluir(turma);
            
        cbxCurso.setSelectedIndex(0);
        txtSiglaTurma.setText("");
        txtNome.setText("");
        ftxtDataInicio.setText("");
        ftxtDataTermino.setText("");
        cbxPeriodo.setSelectedIndex(0);
        txtQtdeVagas.setText("");

        cbxCurso.setEnabled(true);
        btnInserir.setEnabled(false);
        txtSiglaTurma.setEnabled(true);
        txtNome.setEnabled(false);
        ftxtDataInicio.setEnabled(false);
        ftxtDataTermino.setEnabled(false);
        cbxPeriodo.setEnabled(false);
        txtQtdeVagas.setEnabled(false);
        txtSiglaTurma.requestFocus();

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
            java.util.logging.Logger.getLogger(GuiTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiTurma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cbxCurso;
    private javax.swing.JComboBox<String> cbxPeriodo;
    private javax.swing.JFormattedTextField ftxtDataInicio;
    private javax.swing.JFormattedTextField ftxtDataTermino;
    private javax.swing.JLabel lblCurso;
    private javax.swing.JLabel lblDtInicio;
    private javax.swing.JLabel lblDtTermino;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPeriodo;
    private javax.swing.JLabel lblQtdVagas;
    private javax.swing.JLabel lblSiglaTurma;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQtdeVagas;
    private javax.swing.JTextField txtSiglaTurma;
    // End of variables declaration//GEN-END:variables
    private DaoCurso daoCurso = null;
    private Curso curso = null;
    private DaoTurma daoTurma = null;
    private Turma turma = null;
    private Conexao conexao = null;
    
}
