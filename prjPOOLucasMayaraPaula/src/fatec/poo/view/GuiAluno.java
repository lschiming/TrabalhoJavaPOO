package fatec.poo.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoAluno;
import fatec.poo.control.Helper;
import javax.swing.JOptionPane;
import fatec.poo.model.Aluno;

/**
 *
 * @author sartori
 */
public class GuiAluno extends javax.swing.JFrame {

    private Helper helper = new Helper();
    private Conexao conexao = null;
    private Aluno aluno = null;
    private DaoAluno daoAluno = null;

    public GuiAluno() {
        initComponents();
        addWindowListener(new java.awt.event.WindowAdapter() {
            /*public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }*/
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCPF = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblEnd = new javax.swing.JLabel();
        lblBairro = new javax.swing.JLabel();
        lblMun = new javax.swing.JLabel();
        lblRG = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        ftxtCPF = new javax.swing.JFormattedTextField();
        txtNome = new javax.swing.JTextField();
        cbxSexo = new javax.swing.JComboBox<>();
        txtEnd = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtMun = new javax.swing.JTextField();
        ftxtRG = new javax.swing.JFormattedTextField();
        txtEmail = new javax.swing.JTextField();
        lblEstCiv = new javax.swing.JLabel();
        cbxEstCivil = new javax.swing.JComboBox<>();
        lblEstado = new javax.swing.JLabel();
        cbxEstado = new javax.swing.JComboBox<>();
        lblDtNasc = new javax.swing.JLabel();
        lblEscolaridade = new javax.swing.JLabel();
        lblNum = new javax.swing.JLabel();
        lblCEP = new javax.swing.JLabel();
        lblTelRes = new javax.swing.JLabel();
        lblCelular = new javax.swing.JLabel();
        ftxtDtNasc = new javax.swing.JFormattedTextField();
        cbxEscolaridade = new javax.swing.JComboBox<>();
        txtNum = new javax.swing.JTextField();
        ftxtCEP = new javax.swing.JFormattedTextField();
        ftxtTelefone = new javax.swing.JFormattedTextField();
        ftxtCelular = new javax.swing.JFormattedTextField();
        btnConsultar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Aluno");

        lblCPF.setText("CPF");

        lblNome.setText("Nome");

        lblSexo.setText("Sexo");

        lblEnd.setText("Endereço");

        lblBairro.setText("Bairro");

        lblMun.setText("Municipio");

        lblRG.setText("RG");

        lblEmail.setText("Email");

        try {
            ftxtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtNome.setEnabled(false);

        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F", "M" }));
        cbxSexo.setEnabled(false);
        cbxSexo.setFocusable(false);

        txtEnd.setEnabled(false);

        txtBairro.setEnabled(false);

        txtMun.setEnabled(false);

        try {
            ftxtRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtRG.setEnabled(false);

        txtEmail.setEnabled(false);

        lblEstCiv.setText("Estado Civil");

        cbxEstCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Casado", "Viuvo" }));
        cbxEstCivil.setEnabled(false);

        lblEstado.setText("Estado");

        cbxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cbxEstado.setEnabled(false);

        lblDtNasc.setText("Data de Nascimento");

        lblEscolaridade.setText("Escolaridade");

        lblNum.setText("N°");

        lblCEP.setText("CEP");

        lblTelRes.setText("Tel.Residencial");

        lblCelular.setText("Celular");

        try {
            ftxtDtNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtDtNasc.setEnabled(false);

        cbxEscolaridade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Basico", "Superior" }));
        cbxEscolaridade.setEnabled(false);

        txtNum.setEnabled(false);

        try {
            ftxtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtCEP.setEnabled(false);

        try {
            ftxtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtTelefone.setEnabled(false);

        try {
            ftxtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtCelular.setEnabled(false);

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

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/rem.png"))); // NOI18N
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
                            .addComponent(lblBairro)
                            .addComponent(lblEnd)
                            .addComponent(lblMun)
                            .addComponent(lblRG)
                            .addComponent(lblEmail)
                            .addComponent(lblSexo)
                            .addComponent(lblNome)
                            .addComponent(lblCPF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtMun, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblEstado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblEstCiv)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxEstCivil, 0, 1, Short.MAX_VALUE))
                            .addComponent(txtEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ftxtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ftxtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDtNasc)
                            .addComponent(lblEscolaridade)
                            .addComponent(lblNum)
                            .addComponent(lblCEP)
                            .addComponent(lblTelRes)
                            .addComponent(lblCelular))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ftxtDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxEscolaridade, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ftxtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ftxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ftxtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftxtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDtNasc)
                    .addComponent(ftxtDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSexo)
                    .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstCiv)
                    .addComponent(cbxEstCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEscolaridade)
                    .addComponent(cbxEscolaridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnd)
                    .addComponent(txtEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNum)
                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBairro)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCEP)
                    .addComponent(ftxtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMun)
                    .addComponent(txtMun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstado)
                    .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelRes)
                    .addComponent(ftxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRG)
                    .addComponent(ftxtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCelular)
                    .addComponent(ftxtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {
        conexao = new Conexao("poo", "trabalhopoo");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@localhost:1521:xe");
        daoAluno = new DaoAluno(conexao.conectar());
    }

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        conexao.fecharConexao();
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        String cpf = ftxtCPF.getText().replaceAll("[.-]", "");
        System.out.println(helper.isCpfValid(cpf));
        if (helper.isCpfValid(cpf)) {
            txtNome.setEnabled(true);
            ftxtDtNasc.setEnabled(true);
            ftxtRG.setEnabled(true);
            cbxSexo.setEnabled(true);
            cbxEstCivil.setEnabled(true);
            ftxtTelefone.setEnabled(true);
            ftxtCelular.setEnabled(true);
            txtEnd.setEnabled(true);
            txtNum.setEnabled(true);
            txtBairro.setEnabled(true);
            txtMun.setEnabled(true);
            cbxEstado.setEnabled(true);
            ftxtCEP.setEnabled(true);
            txtEmail.setEnabled(true);
            cbxEscolaridade.setEnabled(true);

            Aluno aluno = daoAluno.consultar(cpf);

            if (aluno != null) {
                txtNome.setText(aluno.getNome());
                ftxtDtNasc.setText(aluno.getDataNasc());
                ftxtRG.setText(aluno.getRg());
                cbxSexo.setSelectedItem(aluno.getSexo());
                cbxEstCivil.setSelectedItem(aluno.getEstadoCivil());
                ftxtTelefone.setText(aluno.getTelefone());
                ftxtCelular.setText(aluno.getCelular());
                txtEnd.setText(aluno.getEndereco());
                txtNum.setText(Integer.toString(aluno.getNumero()));
                txtBairro.setText(aluno.getBairro());
                txtMun.setText(aluno.getCidade());
                cbxEstado.setSelectedItem(aluno.getEstado());
                ftxtCEP.setText(aluno.getCep());
                txtEmail.setText(aluno.getEmail());
                cbxEscolaridade.setSelectedItem(aluno.getEscolaridade());
               
                btnAlterar.setEnabled(true);
                btnExcluir.setEnabled(true);
            } else {
                btnInserir.setEnabled(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "CPF Invalido");
            ftxtCPF.requestFocus();

        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        aluno = new Aluno(ftxtCPF.getText().replaceAll("[.-]", ""), txtNome.getText());

        aluno.setDataNasc(ftxtDtNasc.getText());
        aluno.setRg(ftxtRG.getText().replaceAll("[.-]", ""));
        aluno.setSexo(cbxSexo.getSelectedItem().toString());
        aluno.setEstadoCivil(cbxEstCivil.getSelectedItem().toString());
        aluno.setTelefone(ftxtTelefone.getText().replaceAll("[()-]", ""));;
        aluno.setCelular(ftxtCelular.getText().replaceAll("[()-]", ""));
        aluno.setEndereco(txtEnd.getText());
        aluno.setNumero(Integer.parseInt(txtNum.getText()));
        aluno.setBairro(txtBairro.getText());;
        aluno.setCidade(txtMun.getText());
        aluno.setEstado(cbxEstado.getSelectedItem().toString());
        aluno.setCep(ftxtCEP.getText().replaceAll("[-]", ""));
        aluno.setEmail(txtEmail.getText());
        aluno.setEscolaridade(cbxEscolaridade.getSelectedItem().toString());
        

        daoAluno.inserir(aluno);

        txtNome.setText("");
        ftxtDtNasc.setText("");
        ftxtRG.setText("");
        ftxtTelefone.setText("");
        ftxtCelular.setText("");
        txtEnd.setText("");
        txtNum.setText("");
        txtBairro.setText("");
        txtMun.setText("");
        ftxtCEP.setText("");
        txtEmail.setText("");
        
        
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        ftxtCPF.requestFocus();
        ftxtCPF.setEnabled(true);
        txtNome.setEnabled(false);
        ftxtDtNasc.setEnabled(false);
        ftxtRG.setEnabled(false);
        cbxSexo.setEnabled(false);
        cbxEstCivil.setEnabled(false);
        ftxtTelefone.setEnabled(false);
        ftxtCelular.setEnabled(false);
        txtEnd.setEnabled(false);
        txtNum.setEnabled(false);
        txtBairro.setEnabled(false);
        txtMun.setEnabled(false);
        ftxtCEP.setEnabled(false);
        txtEmail.setEnabled(false);
        cbxEscolaridade.setEnabled(false);
        

        JOptionPane.showMessageDialog(null, "Aluno Inserido");

    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Alteração") == 0) {
            aluno = new Aluno(ftxtCPF.getText().replaceAll("[.-]", ""), txtNome.getText());
            aluno.setDataNasc(ftxtDtNasc.getText());
            aluno.setRg(ftxtRG.getText().replaceAll("[.-]", ""));
            aluno.setSexo(cbxSexo.getSelectedItem().toString());
            aluno.setEstadoCivil(cbxEstCivil.getSelectedItem().toString());
            aluno.setTelefone(ftxtTelefone.getText().replaceAll("[()-]", ""));;
            aluno.setCelular(ftxtCelular.getText().replaceAll("[()-]", ""));
            aluno.setEndereco(txtEnd.getText());
            aluno.setNumero(Integer.parseInt(txtNum.getText()));
            aluno.setBairro(txtBairro.getText());;
            aluno.setCidade(txtMun.getText());
            aluno.setEstado(cbxEstado.getSelectedItem().toString());
            aluno.setCep(ftxtCEP.getText().replaceAll("[-]", ""));
            aluno.setEmail(txtEmail.getText());
            aluno.setEscolaridade(cbxEscolaridade.getSelectedItem().toString());
            

            daoAluno.alterar(aluno);

            txtNome.setText("");
            ftxtDtNasc.setText("");
            ftxtRG.setText("");
            ftxtTelefone.setText("");
            ftxtCelular.setText("");
            txtEnd.setText("");
            txtNum.setText("");
            txtBairro.setText("");
            txtMun.setText("");
            ftxtCEP.setText("");
            txtEmail.setText("");
            btnConsultar.setEnabled(true);
            btnInserir.setEnabled(false);
            btnAlterar.setEnabled(false);
            ftxtCPF.requestFocus();
            ftxtCPF.setEnabled(true);
            txtNome.setEnabled(false);
            ftxtDtNasc.setEnabled(false);
            ftxtRG.setEnabled(false);
            cbxSexo.setEnabled(false);
            cbxEstCivil.setEnabled(false);
            ftxtTelefone.setEnabled(false);
            ftxtCelular.setEnabled(false);
            txtEnd.setEnabled(false);
            txtNum.setEnabled(false);
            txtBairro.setEnabled(false);
            txtMun.setEnabled(false);
            ftxtCEP.setEnabled(false);
            txtEmail.setEnabled(false);
            cbxEscolaridade.setEnabled(false);
            

            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso");
        }
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Exclusão?") == 0) {
            aluno = new Aluno(ftxtCPF.getText().replaceAll("[.-]", ""), txtNome.getText());
            daoAluno.excluir(aluno);

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
            java.util.logging.Logger.getLogger(GuiAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cbxEscolaridade;
    private javax.swing.JComboBox<String> cbxEstCivil;
    private javax.swing.JComboBox<String> cbxEstado;
    private javax.swing.JComboBox<String> cbxSexo;
    private javax.swing.JFormattedTextField ftxtCEP;
    private javax.swing.JFormattedTextField ftxtCPF;
    private javax.swing.JFormattedTextField ftxtCelular;
    private javax.swing.JFormattedTextField ftxtDtNasc;
    private javax.swing.JFormattedTextField ftxtRG;
    private javax.swing.JFormattedTextField ftxtTelefone;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblDtNasc;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEnd;
    private javax.swing.JLabel lblEscolaridade;
    private javax.swing.JLabel lblEstCiv;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblMun;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNum;
    private javax.swing.JLabel lblRG;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelRes;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEnd;
    private javax.swing.JTextField txtMun;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNum;
    // End of variables declaration//GEN-END:variables
}
