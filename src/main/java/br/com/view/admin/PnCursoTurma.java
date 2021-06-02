/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.view.admin;

import br.com.dao.*;
import br.com.model.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;

/**
 *
 * @author Felip
 */
public class PnCursoTurma extends javax.swing.JPanel {

    private Session sessao;
    private List<Curso> cursos;
    private List<Turma> turmas;
    private DefaultTableModel tabelaModelo;
    private Curso curso;
    private Turma turma;
    private List<Curso> cursosCombo = new ArrayList<>();
    private Curso cursoAlterar;
    private Turma turmaAlterar;

    /**
     * Creates new form PnCurso
     */
    public PnCursoTurma() {
        initComponents();
//        listarCurso();
        pnCursoTurma.setVisible(true);

        sessao = HibernateUtil.abrirConexao();
        CursoDao impl = new CursoDaoImpl();
        cursosCombo = impl.listarTodos(sessao);
        sessao.close();

        for (Curso curso1 : cursosCombo) {
            cbCurso.addItem(curso1.getNome());
        }

    }

    private void listarCurso() {
        sessao = HibernateUtil.abrirConexao();
        CursoDao impl = new CursoDaoImpl();
        cursos = impl.listarTodos(sessao);
        sessao.close();
        populaTabela();

    }

    private void listarTurma() {
        sessao = HibernateUtil.abrirConexao();
        TurmaDao impl = new TurmaDaoImpl();
        turmas = impl.listarTodos(sessao);
        sessao.close();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        lsCurso = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        txCurso = new javax.swing.JTextField();
        btAddCurso = new javax.swing.JButton();
        pnCursoTurma = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbTurma = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        pnTurma = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txNomeTurma = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txFaseTurma = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ckAbertoTurma = new javax.swing.JCheckBox();
        btSalvarTurma = new javax.swing.JButton();
        cbPeriodo = new javax.swing.JComboBox<>();
        cbCurso = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cbAno = new javax.swing.JComboBox<>();
        btListarTurmas = new javax.swing.JButton();
        btALterar = new javax.swing.JButton();
        btDeletarTurma = new javax.swing.JButton();
        txCursoSelecionado = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btDeletarCurso = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btPesquisarCurso = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel1.setText("Cursos / Turmas");

        lsCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lsCursoMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(lsCurso);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Cursos");

        btAddCurso.setText("Adicionar");
        btAddCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddCursoActionPerformed(evt);
            }
        });

        pnCursoTurma.setBackground(new java.awt.Color(255, 255, 255));

        tbTurma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Turma", "Fase", "Período", "Ano", "Ativo", "Curso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbTurma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTurmaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbTurma);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Turmas");

        pnTurma.setBackground(new java.awt.Color(247, 247, 247));

        jLabel4.setText("Turma:");

        jLabel7.setText("Período:");

        jLabel6.setText("Ano:");

        jLabel5.setText("Fase:");

        ckAbertoTurma.setBackground(new java.awt.Color(204, 204, 204));
        ckAbertoTurma.setText("Ativo");

        btSalvarTurma.setText("Salvar");
        btSalvarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarTurmaActionPerformed(evt);
            }
        });

        cbPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Matutino", "Vespertino", "Noturno" }));

        cbCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        jLabel9.setText("Curso:");

        cbAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selcione", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021" }));

        javax.swing.GroupLayout pnTurmaLayout = new javax.swing.GroupLayout(pnTurma);
        pnTurma.setLayout(pnTurmaLayout);
        pnTurmaLayout.setHorizontalGroup(
            pnTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTurmaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnTurmaLayout.createSequentialGroup()
                        .addGroup(pnTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnTurmaLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cbPeriodo, 0, 170, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnTurmaLayout.createSequentialGroup()
                                .addComponent(cbAno, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(174, 174, 174)
                                .addComponent(btSalvarTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6)))
                    .addGroup(pnTurmaLayout.createSequentialGroup()
                        .addGroup(pnTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txNomeTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txFaseTurma)
                            .addGroup(pnTurmaLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(pnTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnTurmaLayout.createSequentialGroup()
                                .addComponent(cbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ckAbertoTurma))
                            .addComponent(jLabel9))))
                .addContainerGap())
        );
        pnTurmaLayout.setVerticalGroup(
            pnTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTurmaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnTurmaLayout.createSequentialGroup()
                        .addGroup(pnTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txNomeTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txFaseTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(ckAbertoTurma))
                .addGroup(pnTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTurmaLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btSalvarTurma))
                    .addGroup(pnTurmaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnTurmaLayout.createSequentialGroup()
                                .addGroup(pnTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        btListarTurmas.setText("Listar turmas");
        btListarTurmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarTurmasActionPerformed(evt);
            }
        });

        btALterar.setText("Alterar Selecionado");
        btALterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btALterarActionPerformed(evt);
            }
        });

        btDeletarTurma.setText("Deletar Selecionado");
        btDeletarTurma.setMaximumSize(new java.awt.Dimension(125, 23));
        btDeletarTurma.setMinimumSize(new java.awt.Dimension(125, 23));
        btDeletarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarTurmaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnCursoTurmaLayout = new javax.swing.GroupLayout(pnCursoTurma);
        pnCursoTurma.setLayout(pnCursoTurmaLayout);
        pnCursoTurmaLayout.setHorizontalGroup(
            pnCursoTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCursoTurmaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnCursoTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCursoTurmaLayout.createSequentialGroup()
                        .addComponent(btListarTurmas)
                        .addGap(18, 18, 18)
                        .addComponent(btALterar)
                        .addGap(18, 18, 18)
                        .addComponent(btDeletarTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnCursoTurmaLayout.createSequentialGroup()
                        .addGroup(pnCursoTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pnTurma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnCursoTurmaLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(21, 21, 21))))
        );
        pnCursoTurmaLayout.setVerticalGroup(
            pnCursoTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCursoTurmaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(8, 8, 8)
                .addGroup(pnCursoTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btListarTurmas)
                    .addComponent(btALterar)
                    .addComponent(btDeletarTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        txCursoSelecionado.setEditable(false);

        jLabel8.setText("Curso Selecionado:");

        btDeletarCurso.setText("Deletar");
        btDeletarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarCursoActionPerformed(evt);
            }
        });

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btPesquisarCurso.setText("Pesquisar");
        btPesquisarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarCursoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel8)
                                                    .addComponent(jLabel2)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btAddCurso))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btPesquisarCurso)
                                                .addGap(12, 12, 12)
                                                .addComponent(btDeletarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jScrollPane1)
                                    .addComponent(txCursoSelecionado))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pnCursoTurma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel1))
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnCursoTurma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btAddCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txCurso, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btAlterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btDeletarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btPesquisarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(3, 3, 3)
                        .addComponent(txCursoSelecionado, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btAddCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddCursoActionPerformed
        if (txCurso.getText().trim().isEmpty()) {
            return;
        }
        sessao = HibernateUtil.abrirConexao();
        CursoDao impl = new CursoDaoImpl();
        Curso newCurso = new Curso(null, txCurso.getText());
        impl.salvarOuAlterar(newCurso, sessao);
        sessao.close();
        listarCurso();
        txCurso.setText("");
    }//GEN-LAST:event_btAddCursoActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        if (btAlterar.getText() == "Alterar") {
            txCursoSelecionado.setEditable(true);
            btAlterar.setText("Salvar");

        } else {
            sessao = HibernateUtil.abrirConexao();
            CursoDao impl = new CursoDaoImpl();
            curso.setNome(txCursoSelecionado.getText());
            impl.salvarOuAlterar(curso, sessao);
            sessao.close();
            listarCurso();
            btAlterar.setText("Alterar");
            txCursoSelecionado.setEditable(false);
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void tbTurmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTurmaMouseClicked

    }//GEN-LAST:event_tbTurmaMouseClicked

    private void btDeletarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarCursoActionPerformed
        int deletar = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o curso " + curso.getNome() + " ?", "Cancelar", JOptionPane.YES_OPTION);
        if (deletar == JOptionPane.YES_OPTION) {
            sessao = HibernateUtil.abrirConexao();
            CursoDao impl = new CursoDaoImpl();
            impl.excluir(curso, sessao);
            sessao.close();
            lsCurso.setVisibleRowCount(0);
            listarCurso();
        }
    }//GEN-LAST:event_btDeletarCursoActionPerformed

    private void btSalvarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarTurmaActionPerformed
        turma = new Turma();

        sessao = HibernateUtil.abrirConexao();
        TurmaDao impl = new TurmaDaoImpl();

        int cursoSelecionado = cbCurso.getSelectedIndex() - 1;

        if (btSalvarTurma.getText() == "Salvar") {

            turma.setNome(txNomeTurma.getText());
            turma.setFase(txFaseTurma.getText());
            turma.setAno(cbAno.getSelectedItem().toString());
            turma.setPeriodo(cbPeriodo.getSelectedItem().toString());
            turma.setAberto(ckAbertoTurma.isSelected());
            turma.setCurso(cursosCombo.get(cursoSelecionado));
            impl.salvarOuAlterar(turma, sessao);
            sessao.close();

            if (turma.getId() != null) {
                JOptionPane.showMessageDialog(null, "Turma registrada com sucesso.");
                btListarTurmasActionPerformed(evt);
                limparCamposTurma();
            }
        } else {

            turmaAlterar.setNome(txNomeTurma.getText());
            turmaAlterar.setFase(txFaseTurma.getText());
            turmaAlterar.setAno(cbAno.getSelectedItem().toString());
            turmaAlterar.setPeriodo(cbPeriodo.getSelectedItem().toString());
            turmaAlterar.setAberto(ckAbertoTurma.isSelected());
            turmaAlterar.setCurso(cursosCombo.get(cursoSelecionado));
            impl.salvarOuAlterar(turmaAlterar, sessao);
            sessao.close();
            JOptionPane.showMessageDialog(null, "Turma alterada com sucesso.");
            btListarTurmasActionPerformed(evt);
            limparCamposTurma();
            btSalvarTurma.setText("Salvar");
        }

    }//GEN-LAST:event_btSalvarTurmaActionPerformed

    private void limparCamposTurma() {
        txNomeTurma.setText("");
        txFaseTurma.setText("");
        cbCurso.setSelectedIndex(0);
        cbPeriodo.setSelectedIndex(0);
        cbAno.setSelectedIndex(0);
        ckAbertoTurma.setSelected(false);
    }

    private void btDeletarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarTurmaActionPerformed
        int indiceTurma = tbTurma.getSelectedRow();
        turmaAlterar = turmas.get(indiceTurma);
        int deletar = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o curso " + turmaAlterar.getNome() + " ?", "Cancelar", JOptionPane.YES_OPTION);
        if (deletar == JOptionPane.YES_OPTION) {
            sessao = HibernateUtil.abrirConexao();
            TurmaDao impl = new TurmaDaoImpl();
            impl.excluir(turmaAlterar, sessao);
            sessao.close();
            JOptionPane.showMessageDialog(null, "Turma excluída com sucesso!");
            btListarTurmasActionPerformed(evt);
        }
    }//GEN-LAST:event_btDeletarTurmaActionPerformed

    private void lsCursoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lsCursoMousePressed
        pnTurma.setVisible(true);
        DefaultListModel aa = (DefaultListModel) this.lsCurso.getModel();
        curso = (Curso) aa.get(lsCurso.getSelectedIndex());
        txCursoSelecionado.setText(curso.getNome());
        listarTurma();
        if (!pnCursoTurma.isVisible())
            pnCursoTurma.setVisible(true);
    }//GEN-LAST:event_lsCursoMousePressed

    private void btPesquisarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarCursoActionPerformed
        lsCurso.setVisibleRowCount(0);
        if (txCurso.getText().isEmpty()) {
            sessao = HibernateUtil.abrirConexao();
            CursoDao impl = new CursoDaoImpl();
            cursos = impl.listarTodos(sessao);
            sessao.close();
            listarCurso();
        } else {
            sessao = HibernateUtil.abrirConexao();
            CursoDao impl = new CursoDaoImpl();
            cursos = impl.pesquisarPorNome(txCurso.getText(), sessao);
            sessao.close();
            populaTabela();
        }
    }//GEN-LAST:event_btPesquisarCursoActionPerformed

    private void btListarTurmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarTurmasActionPerformed

        listarTurma();
        tabelaModelo = (DefaultTableModel) tbTurma.getModel();
        tabelaModelo.setNumRows(0);
        String ativo;

//        turmas = turmasAux.stream().filter(c -> Objects.equals(c.getCurso().getId(), curso.getId())).collect(Collectors.toList());
        for (Turma tu : turmas) {
            ativo = tu.isAberto() ? "Ativo" : "Inativo";

            tabelaModelo.addRow(new Object[]{tu.getNome(), tu.getFase(), tu.getPeriodo(),
                tu.getAno(), ativo, tu.getCurso().getNome()});
        }
    }//GEN-LAST:event_btListarTurmasActionPerformed

    private void btALterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btALterarActionPerformed
        int indiceTurma = tbTurma.getSelectedRow();
        cursoAlterar = turmas.get(indiceTurma).getCurso();
        turmaAlterar = turmas.get(indiceTurma);

        txNomeTurma.setText(turmas.get(indiceTurma).getNome());
        txFaseTurma.setText(turmas.get(indiceTurma).getFase());
        cbAno.setToolTipText(turmas.get(indiceTurma).getAno());
        btSalvarTurma.setText("Alterar");
    }//GEN-LAST:event_btALterarActionPerformed

    private void populaTabela() {
        DefaultListModel lista = new DefaultListModel();

        cursos.forEach(cu -> {
            lista.addElement(cu);
        });

        lsCurso.setModel(lista);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btALterar;
    private javax.swing.JButton btAddCurso;
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btDeletarCurso;
    private javax.swing.JButton btDeletarTurma;
    private javax.swing.JButton btListarTurmas;
    private javax.swing.JButton btPesquisarCurso;
    private javax.swing.JButton btSalvarTurma;
    private javax.swing.JComboBox<String> cbAno;
    private javax.swing.JComboBox<String> cbCurso;
    private javax.swing.JComboBox<String> cbPeriodo;
    private javax.swing.JCheckBox ckAbertoTurma;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList<String> lsCurso;
    private javax.swing.JPanel pnCursoTurma;
    private javax.swing.JPanel pnTurma;
    private javax.swing.JTable tbTurma;
    private javax.swing.JTextField txCurso;
    private javax.swing.JTextField txCursoSelecionado;
    private javax.swing.JTextField txFaseTurma;
    private javax.swing.JTextField txNomeTurma;
    // End of variables declaration//GEN-END:variables

    private void preencherTurma() {
        if (!pnTurma.isVisible()) {
            pnTurma.setVisible(true);
        }

        txNomeTurma.setText(turma.getNome());
        txFaseTurma.setText(turma.getFase());
//        txAnoTurma.setText(turma.getAno());
        ckAbertoTurma.setSelected(turma.isAberto());

        if (turma.getPeriodo().equals("Matutino")) {
            cbPeriodo.setSelectedIndex(1);
        }
        if (turma.getPeriodo().equals("Vespertino")) {
            cbPeriodo.setSelectedIndex(2);
        }
        if (turma.getPeriodo().equals("NOturno")) {
            cbPeriodo.setSelectedIndex(3);
        }
    }
}
