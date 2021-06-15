/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.view.admin;

import br.com.dao.*;
import br.com.dao.HibernateUtil;
import br.com.model.*;
import br.com.util.UtilGerador;
import java.awt.Color;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author TitioneAmorim
 */
public class PnUsuario extends javax.swing.JPanel {

    private List<Aluno> alunos;
    private List<Funcionario> funcionarios;
    private List<Perfil> perfils;
    private List<Curso> cursos;
    private List<Turma> turmas;
    private List<Turma> turmasCurso;
    private Aluno aluno;
    private Funcionario funcionario;
    private Session sessao;

    /**
     * Creates new form PnAluno
     */
    public PnUsuario() {
        initComponents();
        pnUsuarioAtual.setVisible(false);
        pnAlunoAtributo.setVisible(true);
        cbCurso.setVisible(true);
        cbTurma.setVisible(true);
//        listarAlunos();
//        listarFuncionarios();
        listarPerfil();
        listarCurso();
        listarTurma();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lsFuncionario = new javax.swing.JList<>();
        btAddAluno = new javax.swing.JButton();
        pnUsuarioAtual = new javax.swing.JPanel();
        txNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txSenha = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txMatricula = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btSalvar = new javax.swing.JButton();
        cbPerfil = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        pnAlunoAtributo = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cbCurso = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cbTurma = new javax.swing.JComboBox<>();
        btAlterar = new javax.swing.JButton();
        lbAluno = new javax.swing.JLabel();
        txCPF = new javax.swing.JFormattedTextField();
        btCancelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lsAluno = new javax.swing.JList<>();
        btBuscarFuncionarios = new javax.swing.JButton();
        btBuscarAlunos = new javax.swing.JButton();
        tfBuscarNomeFuncionario = new javax.swing.JTextField();
        tfBuscarNomeAluno = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel1.setText("Usuários");

        lsFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lsFuncionarioMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(lsFuncionario);

        btAddAluno.setText("Adicionar Novo Usuário");
        btAddAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddAlunoActionPerformed(evt);
            }
        });

        pnUsuarioAtual.setBackground(new java.awt.Color(248, 247, 247));

        txNome.setEditable(false);

        jLabel3.setText("* Nome");

        jLabel4.setText("* Email");

        txEmail.setEditable(false);

        jLabel5.setText("* Senha");

        txSenha.setEditable(false);

        jLabel6.setText("* CPF");

        txMatricula.setEditable(false);

        jLabel7.setText("Matrícula");

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        cbPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cbPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbPerfil.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbPerfilItemStateChanged(evt);
            }
        });

        jLabel10.setText("* Perfil");

        pnAlunoAtributo.setBackground(new java.awt.Color(246, 246, 246));

        jLabel8.setText("Curso");

        cbCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cbCurso.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCursoItemStateChanged(evt);
            }
        });

        jLabel9.setText("Turma");

        cbTurma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        javax.swing.GroupLayout pnAlunoAtributoLayout = new javax.swing.GroupLayout(pnAlunoAtributo);
        pnAlunoAtributo.setLayout(pnAlunoAtributoLayout);
        pnAlunoAtributoLayout.setHorizontalGroup(
            pnAlunoAtributoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAlunoAtributoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnAlunoAtributoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(cbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnAlunoAtributoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnAlunoAtributoLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(162, 162, 162))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnAlunoAtributoLayout.createSequentialGroup()
                        .addComponent(cbTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        pnAlunoAtributoLayout.setVerticalGroup(
            pnAlunoAtributoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnAlunoAtributoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnAlunoAtributoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnAlunoAtributoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        lbAluno.setText(" ");

        txCPF.setBackground(new java.awt.Color(240, 240, 240));
        try {
            txCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnUsuarioAtualLayout = new javax.swing.GroupLayout(pnUsuarioAtual);
        pnUsuarioAtual.setLayout(pnUsuarioAtualLayout);
        pnUsuarioAtualLayout.setHorizontalGroup(
            pnUsuarioAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnUsuarioAtualLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnUsuarioAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnUsuarioAtualLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbAluno)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnUsuarioAtualLayout.createSequentialGroup()
                        .addGroup(pnUsuarioAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbPerfil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txNome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txSenha, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnUsuarioAtualLayout.createSequentialGroup()
                                .addGroup(pnUsuarioAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnUsuarioAtualLayout.createSequentialGroup()
                                .addGroup(pnUsuarioAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(txCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnUsuarioAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))
                            .addGroup(pnUsuarioAtualLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btCancelar)
                                .addGap(18, 18, 18)
                                .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))))
            .addGroup(pnUsuarioAtualLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnAlunoAtributo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        pnUsuarioAtualLayout.setVerticalGroup(
            pnUsuarioAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnUsuarioAtualLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnUsuarioAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(pnUsuarioAtualLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnUsuarioAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txCPF)
                            .addComponent(txMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnUsuarioAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lbAluno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(pnAlunoAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(pnUsuarioAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btAlterar)
                    .addComponent(btCancelar))
                .addContainerGap())
        );

        lsAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lsAlunoMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(lsAluno);

        btBuscarFuncionarios.setText("Buscar Funcionários");
        btBuscarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarFuncionariosActionPerformed(evt);
            }
        });

        btBuscarAlunos.setText("Buscar Alunos");
        btBuscarAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarAlunosActionPerformed(evt);
            }
        });

        tfBuscarNomeFuncionario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfBuscarNomeFuncionarioKeyPressed(evt);
            }
        });

        tfBuscarNomeAluno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfBuscarNomeAlunoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btBuscarAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfBuscarNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btBuscarFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfBuscarNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnUsuarioAtual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btAddAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btAddAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnUsuarioAtual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btBuscarFuncionarios)
                            .addComponent(tfBuscarNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btBuscarAlunos)
                            .addComponent(tfBuscarNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lsFuncionarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lsFuncionarioMousePressed
        btAlterar.setEnabled(true);
        aluno = null;
        lsAluno.clearSelection();
        lsFuncionario.setBackground(Color.WHITE);
        funcionario = funcionarios.get(lsFuncionario.getSelectedIndex());
        if (!pnUsuarioAtual.isVisible()) {
            pnUsuarioAtual.setVisible(true);
        }
        preencherCampos(funcionario);

    }//GEN-LAST:event_lsFuncionarioMousePressed

    private void btAddAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddAlunoActionPerformed
        btAlterar.setEnabled(true);
        funcionario = null;
        aluno = null;
        limparCampos();
        pnUsuarioAtual.setVisible(true);
        preencherPerfil();
        preencherCurso();
        liberarCamposAlterar();
    }//GEN-LAST:event_btAddAlunoActionPerformed

    private void cbPerfilItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbPerfilItemStateChanged
        validarAtributoAluno();
    }//GEN-LAST:event_cbPerfilItemStateChanged

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

        if (validaCampos()) {

            if (cbPerfil.getSelectedItem().toString().equalsIgnoreCase("Aluno")) {
                if (aluno == null) {
                    aluno = new Aluno();
                }
                cadastraAluno();

            } else if (cbPerfil.getSelectedItem().toString().equalsIgnoreCase("Bibliotecário") || cbPerfil.getSelectedItem().toString().equalsIgnoreCase("Coordenador")) {
                if (funcionario == null) {
                    funcionario = new Funcionario();
                }
                cadastrarFuncionario();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Os campos que contém * são obrigatórios e o cpf deve conter 11 dígitos.");
        }
        preencherCurso();
        preencherTurma();
        btAlterar.setVisible(true);
    }//GEN-LAST:event_btSalvarActionPerformed


    private void lsAlunoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lsAlunoMousePressed
        btAlterar.setEnabled(true);
        funcionario = null;
        lsFuncionario.clearSelection();
        aluno = alunos.get(lsAluno.getSelectedIndex());
        if (!pnUsuarioAtual.isVisible()) {
            pnUsuarioAtual.setVisible(true);
        }
        cbPerfil.setEditable(false);
        preencherCampos(aluno);
        preencherCurso();
        cbPerfil.setSelectedIndex(4);
        cbCurso.setSelectedItem(aluno.getTurma().getCurso().getNome());
        cbTurma.setSelectedItem(aluno.getTurma().getNome());
    }//GEN-LAST:event_lsAlunoMousePressed

    private void cbCursoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCursoItemStateChanged
        if (cbCurso.getSelectedItem() != null) {
            preencherTurma();
        }
    }//GEN-LAST:event_cbCursoItemStateChanged

    private void btBuscarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarFuncionariosActionPerformed
            listarFuncionarios();
    }//GEN-LAST:event_btBuscarFuncionariosActionPerformed

    private void btBuscarAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarAlunosActionPerformed
        listarAlunos();
    }//GEN-LAST:event_btBuscarAlunosActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        btAlterar.setEnabled(false);
        liberarCamposAlterar();

        if (funcionario != null) {
            cbPerfil.removeItemAt(perfils.size());
        } else {
            cbPerfil.setEnabled(false);
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        txNome.setBackground(Color.LIGHT_GRAY);
        txNome.setEditable(false);
        txCPF.setBackground(Color.LIGHT_GRAY);
        txCPF.setEditable(false);
        txEmail.setBackground(Color.LIGHT_GRAY);
        txEmail.setEditable(false);
        txMatricula.setBackground(Color.LIGHT_GRAY);
        txMatricula.setEditable(false);
        txSenha.setBackground(Color.LIGHT_GRAY);
        txSenha.setEditable(false);
        cbCurso.setEnabled(false);
        cbPerfil.setEnabled(false);
        cbTurma.setEnabled(false);
        btAlterar.setEnabled(true);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void tfBuscarNomeFuncionarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBuscarNomeFuncionarioKeyPressed
        listarFuncionarios();
    }//GEN-LAST:event_tfBuscarNomeFuncionarioKeyPressed

    private void tfBuscarNomeAlunoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBuscarNomeAlunoKeyPressed
        listarAlunos();
    }//GEN-LAST:event_tfBuscarNomeAlunoKeyPressed

    private void cadastrarFuncionario() throws HibernateException, HeadlessException {
        sessao = HibernateUtil.abrirConexao();
        funcionario.setNome(txNome.getText());
        funcionario.setCpf(txCPF.getText());
        funcionario.setEmail(txEmail.getText());
        funcionario.setMatricula(UtilGerador.gerarNumero(8));
        funcionario.setSenha(txSenha.getText());
        funcionario.setPerfil(perfils.get(cbPerfil.getSelectedIndex() - 1));
        try {
            FuncionarioDao implFunc = new FuncionarioDaoImpl();
            implFunc.salvarOuAlterar(funcionario, sessao);
            JOptionPane.showMessageDialog(null, "Salvo com sucesso.");
            limparCampos();
            funcionario = null;
        } catch (HibernateException e) {
            System.out.println(e.getCause());
            String erro = e.getCause().toString();
            if (erro.contains("Duplicate")) {
                JOptionPane.showMessageDialog(null, "E-mail ou Cpf já cadastrado");
            }
        } finally {
            sessao.close();
            funcionarios = null;
            listarFuncionarios();
        }
    }

    private void cadastraAluno() throws HeadlessException, HibernateException {
        sessao = HibernateUtil.abrirConexao();
        aluno.setNome(txNome.getText());
        aluno.setCpf(txCPF.getText());
        aluno.setEmail(txEmail.getText());
        aluno.setMatricula(UtilGerador.gerarNumero(8));
        aluno.setSenha(txSenha.getText());
        aluno.setPerfil(perfils.get(cbPerfil.getSelectedIndex() - 1));
        if (cbCurso.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Aluno deve possuir curso e turma.");
        } else {
            aluno.setTurma(turmasCurso.get(cbTurma.getSelectedIndex() - 1));
        }
        try {
            AlunoDao implAluno = new AlunoDaoImpl();
            implAluno.salvarOuAlterar(aluno, sessao);
            JOptionPane.showMessageDialog(null, "Salvo com sucesso.");
            aluno = null;
            limparCampos();
        } catch (HibernateException e) {
            String erro = e.getCause().toString();
            if (erro.contains("Duplicate")) {
                JOptionPane.showMessageDialog(null, "E-mail ou Cpf já cadastrado");
            }
        } finally {
            sessao.close();
            alunos = null;
            listarAlunos();
        }
    }

    private void validarAtributoAluno() {
        if (cbPerfil.getSelectedItem() != null && cbPerfil.getSelectedItem().toString().equals("Aluno")) {
            pnAlunoAtributo.setVisible(true);
        } else {
            pnAlunoAtributo.setVisible(false);
        }
    }

    private void listarPerfil() {
        sessao = HibernateUtil.abrirConexao();
        PerfilDao impl = new PerfilDaoImpl();
        perfils = impl.pesquisarPerfil(sessao);
        sessao.close();
    }

    private void listarCurso() {
        sessao = HibernateUtil.abrirConexao();
        CursoDao impl = new CursoDaoImpl();
        cursos = impl.listarTodos(sessao);
        sessao.close();
    }

    private void listarTurma() {
        sessao = HibernateUtil.abrirConexao();
        TurmaDao impl = new TurmaDaoImpl();
        turmas = impl.listarTodos(sessao);
        sessao.close();

    }

    private void listarAlunos() {
        lsAluno.removeAll();
        lsAluno.setBackground(Color.WHITE);
        sessao = HibernateUtil.abrirConexao();
        AlunoDao implAluno = new AlunoDaoImpl();
        alunos = implAluno.pesquisarPorNome(tfBuscarNomeAluno.getText(),sessao);
        sessao.close();
        DefaultListModel listaAluno = new DefaultListModel();
        alunos.forEach(al -> {
            listaAluno.addElement(al);
        });
        lsAluno.setModel(listaAluno);
    }

    private void listarFuncionarios() {
        lsFuncionario.removeAll();
        lsFuncionario.setBackground(Color.WHITE);
        sessao = HibernateUtil.abrirConexao();
        FuncionarioDao implFuncionario = new FuncionarioDaoImpl();
        funcionarios = implFuncionario.pesquisarPorNome(tfBuscarNomeFuncionario.getText(), sessao);
        sessao.close();
        DefaultListModel listaFuncionario = new DefaultListModel();
        for (Funcionario funcionario1 : funcionarios) {
            listaFuncionario.addElement(funcionario1);
        }
        lsFuncionario.setModel(listaFuncionario);
    }

    private void preencherCampos(Pessoa pessoa) {
        if (!pnUsuarioAtual.isVisible()) {
            pnUsuarioAtual.setVisible(true);
        }
        txNome.setBackground(Color.LIGHT_GRAY);
        txCPF.setBackground(Color.LIGHT_GRAY);
        txEmail.setBackground(Color.LIGHT_GRAY);
        txMatricula.setBackground(Color.LIGHT_GRAY);
        txSenha.setBackground(Color.LIGHT_GRAY);
        cbCurso.setEnabled(false);
        cbPerfil.setEnabled(false);
        cbTurma.setEnabled(false);
        preencherPerfil();

        txNome.setText(pessoa.getNome());
        txCPF.setText(pessoa.getCpf());
        txEmail.setText(pessoa.getEmail());
        txSenha.setText(pessoa.getSenha());
        txMatricula.setText(pessoa.getMatricula());
//        if (pessoa.getPerfil() != null && !pessoa.getPerfil().getFuncao().isEmpty()) {
        cbPerfil.setSelectedItem(pessoa.getPerfil().getFuncao());
//        }
        if (pessoa instanceof Aluno) {
            cbCurso.setSelectedItem(((Aluno) pessoa).getTurma().getCurso());
            cbTurma.setSelectedItem(((Aluno) pessoa).getTurma());
        }

        validarAtributoAluno();
    }

    private void liberarCamposAlterar() {
        txNome.setEditable(true);
        txCPF.setEditable(true);
        txEmail.setEditable(true);
        txSenha.setEditable(true);
        cbCurso.setEditable(true);
        cbTurma.setEditable(true);
        cbCurso.setEnabled(true);
        cbPerfil.setEnabled(true);
        cbTurma.setEnabled(true);
        txNome.setBackground(Color.WHITE);
        txCPF.setBackground(Color.WHITE);
        txEmail.setBackground(Color.WHITE);
        txMatricula.setBackground(Color.WHITE);
        txSenha.setBackground(Color.WHITE);
    }

    private void preencherPerfil() {
        cbPerfil.removeAllItems();
        cbPerfil.addItem("Selecione");
        perfils.forEach(pe -> {
            cbPerfil.addItem(pe.getFuncao());
        });
    }

    private void preencherCurso() {
        if (cbCurso.getItemCount() == 1) {
            cursos.forEach(pe -> {
                cbCurso.addItem(pe.getNome());
            });
        }
    }

    private void preencherTurma() {
        listarTurma();
        turmasCurso = new ArrayList<>();
        cbTurma.removeAllItems();
        cbTurma.addItem("Selecione");

        for (Turma turma1 : turmas) {
            if (turma1.getCurso().getId() == cbCurso.getSelectedIndex()) {
                cbTurma.addItem(turma1.getNome());
                turmasCurso.add(turma1);
            }
        }
    }

    private void limparCampos() {
        txNome.setText("");
        txCPF.setText("");
        txEmail.setText("");
        txSenha.setText("");
        txMatricula.setText("");
        preencherPerfil();
    }

    private boolean validaCampos() {
        if (!txEmail.getText().contains("@")
                || txNome.getText().isEmpty()
                || txSenha.getText().isEmpty()
                || txCPF.getText().length() != 14
                || cbPerfil.getSelectedIndex() == 0) {
            return false;
        } else {
            return true;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddAluno;
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btBuscarAlunos;
    private javax.swing.JButton btBuscarFuncionarios;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox<String> cbCurso;
    private javax.swing.JComboBox<String> cbPerfil;
    private javax.swing.JComboBox<String> cbTurma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbAluno;
    private javax.swing.JList<String> lsAluno;
    private javax.swing.JList<String> lsFuncionario;
    private javax.swing.JPanel pnAlunoAtributo;
    private javax.swing.JPanel pnUsuarioAtual;
    private javax.swing.JTextField tfBuscarNomeAluno;
    private javax.swing.JTextField tfBuscarNomeFuncionario;
    private javax.swing.JFormattedTextField txCPF;
    private javax.swing.JTextField txEmail;
    private javax.swing.JTextField txMatricula;
    private javax.swing.JTextField txNome;
    private javax.swing.JTextField txSenha;
    // End of variables declaration//GEN-END:variables
}
