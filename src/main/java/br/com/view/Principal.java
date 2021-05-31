/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.view;

import br.com.dao.HibernateUtil;
import br.com.dao.*;
import br.com.model.*;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;

/**
 *
 * @author Felip
 */
public class Principal extends javax.swing.JFrame {
    
    public static PnPrincipal pnPrincipal;
    public static Principal principal;
    /**
     * Creates new form Principal
     */
    public Principal() {
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 821, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 457, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(837, 496));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
       
        try {
            SplashScreen splash = new SplashScreen();
            splash.setVisible(true);
            validarPerfil();
//            for (int i = 0; i < 100; i++) {
//                Thread.sleep(1);
//            }
            splash.setVisible(false);
            //splash.dispose();
        } catch (Exception e) {
        }
        principal = new Principal();
        principal.setContentPane(new PnLogin());
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                principal.setVisible(true);
            }
        });
          
    }
    
    private static void validarPerfil(){
        try {
            Session sessao = HibernateUtil.abrirConexao();
        PerfilDao impl = new PerfilDaoImpl();
        List<Perfil> perfil = impl.pesquisarPerfil(sessao);
        
        
        if(perfil.isEmpty()){
            Perfil perfAux = new Perfil(null, "aluno", "");
            Perfil perfAux2 = new Perfil(null, "bibliotecario", "");
            Perfil perfAux3 = new Perfil(null, "coordenador", "");
            impl.salvarOuAlterar(perfAux, sessao);
            impl.salvarOuAlterar(perfAux2, sessao);
            impl.salvarOuAlterar(perfAux3, sessao);
        }
        
        sessao.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(principal, "Erro no cadastro dos perfis, verifique a conexão com o seu banco de dados! " + e.getMessage());
        }
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
