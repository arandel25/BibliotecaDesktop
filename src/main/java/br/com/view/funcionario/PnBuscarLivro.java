/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.view.funcionario;

import br.com.dao.ExemplarDao;
import br.com.dao.ExemplarDaoImpl;
import br.com.dao.HibernateUtil;
import br.com.model.Exemplar;
import java.awt.Window;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;

/**
 * @author Felipe
 */
public class PnBuscarLivro extends javax.swing.JPanel {

    private Exemplar exemplar;
    private List<Exemplar> exemplares;
    private ExemplarDao exemplarDao;
    private Session sessao;
    private DefaultTableModel tabelaModelo;

    public PnBuscarLivro() {
        initComponents();
        exemplarDao = new ExemplarDaoImpl();
        listarExemplar();
    }

    public Exemplar getExemplar() {
        return exemplar;
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
        tfTituloAutor = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbLivro = new javax.swing.JTable();
        btSelecionar = new javax.swing.JButton();

        jLabel1.setText("Titulo/Autor");

        tfTituloAutor.setToolTipText("Digite o titulo do liro ou o autor que deseja pesquisar");

        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        tbLivro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título", "Autor", "Edição", "Código"
            }
        ));
        jScrollPane1.setViewportView(tbLivro);

        btSelecionar.setText("Selecionar");
        btSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelecionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfTituloAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btBuscar)
                        .addGap(4, 4, 4))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(btSelecionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 808, Short.MAX_VALUE)))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(tfTituloAutor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btSelecionar)
                .addContainerGap(38, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        listarExemplar();
    }//GEN-LAST:event_btBuscarActionPerformed

    private void listarExemplar() {
        sessao = HibernateUtil.abrirConexao();
        exemplares = exemplarDao.pesquisarPorTituloAutor(tfTituloAutor.getText(), tfTituloAutor.getText(), sessao);
        sessao.close();
        tabelaModelo = (DefaultTableModel) tbLivro.getModel();
        tabelaModelo.setNumRows(0);

        exemplares.removeIf(exemplar -> exemplar.getStatus() == false);
        for (Exemplar exemplar : exemplares) {
            tabelaModelo.addRow(new Object[]{exemplar.getLivro().getTitulo(),
                exemplar.getLivro().getAutor(),
                exemplar.getLivro().getEdicao(),
                exemplar.getCodigoLivro()});
        }
    }
    private void btSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelecionarActionPerformed
        int linha = tbLivro.getSelectedRow();
        if (linha >= 0) {
            exemplar = exemplares.get(linha);
            Window w = SwingUtilities.getWindowAncestor(this);
            w.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um exemplar!");
        }
    }//GEN-LAST:event_btSelecionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btSelecionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbLivro;
    private javax.swing.JTextField tfTituloAutor;
    // End of variables declaration//GEN-END:variables
}
