/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.view.funcionario;

import br.com.dao.EmprestimoDao;
import br.com.dao.EmprestimoDaoImpl;
import br.com.dao.HibernateUtil;
import br.com.model.Aluno;
import br.com.model.Emprestimo;
import br.com.model.Exemplar;
import br.com.view.Principal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.hibernate.Session;

/**
 *
 * @author Felip
 */
public class PnEmprestar extends javax.swing.JPanel {

    private Emprestimo emprestimo;
    private EmprestimoDao emprestimoDao;
    private Aluno aluno;
    private Exemplar exemplar;
    private Session sessao;
    private Date dataRetirada = new Date();
    private Date dataDevolucao;

    public PnEmprestar() {
        initComponents();
        emprestimoDao = new EmprestimoDaoImpl();
        carregarDatas();
    }

    public PnEmprestar(Aluno aluno) {
        initComponents();
        this.aluno = aluno;
        txAluno.setText(aluno.getNome());
        emprestimoDao = new EmprestimoDaoImpl();
        carregarDatas();
    }

    public PnEmprestar(Aluno aluno, Exemplar exemplar) {
        initComponents();
        this.aluno = aluno;
        this.exemplar = exemplar;
        txAluno.setText(aluno.getNome());
        txExemplar.setText(exemplar.getLivro().getTitulo());
        emprestimoDao = new EmprestimoDaoImpl();
        carregarDatas();
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
        txAluno = new javax.swing.JTextField();
        btBuscarAluno = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txExemplar = new javax.swing.JTextField();
        btBuscarExemplar = new javax.swing.JButton();
        txDataEmprestimo = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        txDataDevolucao = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel1.setText("Emprestar");

        btBuscarAluno.setText("Buscar");
        btBuscarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarAlunoActionPerformed(evt);
            }
        });

        jLabel2.setText("Aluno");

        jLabel3.setText("Exemplar");

        btBuscarExemplar.setText("Buscar");
        btBuscarExemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarExemplarActionPerformed(evt);
            }
        });

        txDataEmprestimo.setEditable(false);

        jLabel4.setText("Data Empréstimo");

        txDataDevolucao.setEditable(false);

        jLabel5.setText("Data Devolução");

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txAluno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btBuscarAluno))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txExemplar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btBuscarExemplar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txDataEmprestimo))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(txDataDevolucao)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarAluno))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txExemplar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarExemplar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txDataEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btCancelar))
                .addContainerGap(43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btBuscarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarAlunoActionPerformed
        JDialog frame = new JDialog(new JFrame("Selecionar aluno"), "Selecionar Aluno", true);
        PnBuscarAluno pn = new PnBuscarAluno(aluno);
        frame.getContentPane().add(pn);
        frame.pack();
        frame.setLocationRelativeTo(this);
        frame.setVisible(true);
    }//GEN-LAST:event_btBuscarAlunoActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        sessao = HibernateUtil.abrirConexao();
        if (aluno != null && exemplar != null) {
            emprestimo = new Emprestimo();
            emprestimo.setAluno(aluno);
            emprestimo.setExemplar(exemplar);
            emprestimo.setDataRetirada(dataRetirada);
            emprestimo.setDataPrevista(dataDevolucao);
            emprestimoDao.salvarOuAlterar(emprestimo, sessao);
            Principal.pnPrincipal.AbrirPanel(new PnEmprestimo());
        } else {
            JOptionPane.showMessageDialog(null, "Você precisa selecionar um Aluno e um Exemplar!");
        }
        sessao.close();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        Principal.pnPrincipal.AbrirPanel(new PnLivro());
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btBuscarExemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarExemplarActionPerformed
        if (aluno == null) {
            JOptionPane.showMessageDialog(null, "Selecione um aluno primeiro!");
        } else {
            JDialog frame = new JDialog(new JFrame("Selecionar Exemplar"), "Selecionar Exemplar", true);
            PnBuscarLivro pn = new PnBuscarLivro(aluno);
            frame.getContentPane().add(pn);
            frame.pack();
            frame.setLocationRelativeTo(this);
            frame.setVisible(true);
        }
    }//GEN-LAST:event_btBuscarExemplarActionPerformed

    private void carregarDatas() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
        Calendar cal = Calendar.getInstance();
        cal.setTime(dataRetirada);
        cal.add(Calendar.DATE, 15);
        dataDevolucao = cal.getTime();
        txDataDevolucao.setText(dateFormat.format(dataDevolucao));
        txDataEmprestimo.setText(dateFormat.format(dataRetirada));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarAluno;
    private javax.swing.JButton btBuscarExemplar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txAluno;
    private javax.swing.JFormattedTextField txDataDevolucao;
    private javax.swing.JFormattedTextField txDataEmprestimo;
    private javax.swing.JTextField txExemplar;
    // End of variables declaration//GEN-END:variables
}