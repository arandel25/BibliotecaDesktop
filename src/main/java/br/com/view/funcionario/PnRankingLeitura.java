/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.view.funcionario;

import br.com.dao.AlunoDaoImpl;
import br.com.dao.HibernateUtil;
import br.com.dao.TurmaDao;
import br.com.dao.TurmaDaoImpl;
import br.com.model.Aluno;
import br.com.model.Emprestimo;
import br.com.model.Turma;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;

/**
 *
 * @author Felip
 */
public class PnRankingLeitura extends javax.swing.JPanel {

    private DefaultTableModel tabelaModelo;
    private DefaultTableModel listaModelo;
    private Session sessao;
    private List<Turma> turmas;

    /**
     * Creates new form PnRankingLeitura
     */
    public PnRankingLeitura() {
        Date data = new Date();
        initComponents();
        cbMes.setSelectedIndex(data.getMonth() -1);
        txAno.setText("2021");
        popularListaTurma();
        popularTabela(data, 1);
    }

    private void popularListaTurma() {
        List<String> strList = new ArrayList<String>();

        listarTurma();
        for (Turma tu : turmas) {
            strList.add(tu.getCurso().getNome() + " - " + tu.getNome());
        }
        DefaultComboBoxModel defaultComboBox = new DefaultComboBoxModel(strList.toArray());
        cbTurma.setModel(defaultComboBox);
//        listaModelo = (DefaultTableModel) cbTurma.getModel();
//        listaModelo.setNumRows(0);

//        turmas = turmasAux.stream().filter(c -> Objects.equals(c.getCurso().getId(), curso.getId())).collect(Collectors.toList());
    }

    private void listarTurma() {
        sessao = HibernateUtil.abrirConexao();
        TurmaDao impl = new TurmaDaoImpl();
        turmas = impl.listarTodos(sessao);
        sessao.close();
    }

    private void popularTabela(Date data, long idTurma) {
        AlunoDaoImpl alunoDao = new AlunoDaoImpl();

        sessao = HibernateUtil.abrirConexao();
        List<Object[]> objetoAlunos = alunoDao.listarRankingMes(data, idTurma, sessao);
        sessao.close();
        tabelaModelo = (DefaultTableModel) tbRanking.getModel();
        tabelaModelo.setNumRows(0);

        for (Object[] obj : objetoAlunos) {
            Aluno aluno = (Aluno) obj[0];
            Emprestimo emprestimo = (Emprestimo) obj[1];
            tabelaModelo.addRow(new Object[]{aluno.getNome(), aluno.getTurma().getNome(), aluno.getTurma().getCurso().getNome(), aluno.getEmprestimos().size()});
        }

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
        cbTurma = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbMes = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btFiltrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbRanking = new javax.swing.JTable();
        txAno = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel1.setText("Ranking Leitura");

        jLabel2.setText("Turma:");

        cbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));

        jLabel3.setText("Mês:");

        jLabel4.setText("Ano:");

        btFiltrar.setText("Filtrar");
        btFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFiltrarActionPerformed(evt);
            }
        });

        tbRanking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Aluno", "Turma", "Curso", "Qtd. Emprestimos"
            }
        ));
        jScrollPane1.setViewportView(tbRanking);

        txAno.setText("2020");
        txAno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txAnoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)))
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cbTurma, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(cbMes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txAno))
                        .addGap(20, 20, 20)
                        .addComponent(btFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(4, 4, 4)
                            .addComponent(cbTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(4, 4, 4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btFiltrar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFiltrarActionPerformed
        try {
            Integer ano = Integer.parseInt(txAno.getText());
            Date data =  new GregorianCalendar(ano, cbMes.getSelectedIndex() + 1, 1).getTime();
            popularTabela(data, turmas.get(cbTurma.getSelectedIndex()).getId());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ano inválido!");
        }
        
        
    }//GEN-LAST:event_btFiltrarActionPerformed

    private void txAnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txAnoKeyPressed
        JTextField jtf = (JTextField) evt.getComponent();
        int i = jtf.getText().length();
        if(i > 3)
                jtf.setText(jtf.getText().substring(0, --i));
    }//GEN-LAST:event_txAnoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btFiltrar;
    private javax.swing.JComboBox<String> cbMes;
    private javax.swing.JComboBox<String> cbTurma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbRanking;
    private javax.swing.JTextField txAno;
    // End of variables declaration//GEN-END:variables
}