/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

/**
 *
 * @author Lucas.A
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

        areaTrabalho = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        cadUsuario = new javax.swing.JMenu();
        menCadastroCliente = new javax.swing.JMenuItem();
        menCadFuncionario = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");

        javax.swing.GroupLayout areaTrabalhoLayout = new javax.swing.GroupLayout(areaTrabalho);
        areaTrabalho.setLayout(areaTrabalhoLayout);
        areaTrabalhoLayout.setHorizontalGroup(
            areaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 788, Short.MAX_VALUE)
        );
        areaTrabalhoLayout.setVerticalGroup(
            areaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 571, Short.MAX_VALUE)
        );

        cadUsuario.setText("Cadastrar");

        menCadastroCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        menCadastroCliente.setText("Cliente");
        menCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCadastroClienteActionPerformed(evt);
            }
        });
        cadUsuario.add(menCadastroCliente);

        menCadFuncionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        menCadFuncionario.setText("Funcionario");
        menCadFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCadFuncionarioActionPerformed(evt);
            }
        });
        cadUsuario.add(menCadFuncionario);

        jMenuBar1.add(cadUsuario);

        jMenu3.setText("Sair");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(areaTrabalho)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(areaTrabalho)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCadastroClienteActionPerformed
        // TODO add your handling code here:
        TelaCadastroCliente cd = new TelaCadastroCliente();
        cd.setVisible(true);
        areaTrabalho.add(cd);
    }//GEN-LAST:event_menCadastroClienteActionPerformed

    private void menCadFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCadFuncionarioActionPerformed
        // TODO add your handling code here:
        TelaCadastroFuncionario cf = new TelaCadastroFuncionario();
        cf.setVisible(true);
        areaTrabalho.add(cf);
    }//GEN-LAST:event_menCadFuncionarioActionPerformed

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
    private javax.swing.JDesktopPane areaTrabalho;
    private javax.swing.JMenu cadUsuario;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menCadFuncionario;
    private javax.swing.JMenuItem menCadastroCliente;
    // End of variables declaration//GEN-END:variables
}
