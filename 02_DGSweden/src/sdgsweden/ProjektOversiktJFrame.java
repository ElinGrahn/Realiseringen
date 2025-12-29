//hämta pid + all tillhörande data via sql

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sdgsweden;


import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/** 
 *
 * @author winte
 */
public class ProjektOversiktJFrame extends javax.swing.JFrame {
    
     private InfDB idb;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ProjektOversiktJFrame.class.getName());
  
    public ProjektOversiktJFrame(InfDB idb) {
        this.idb = idb;
        initComponents();

    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAngePid = new javax.swing.JLabel();
        txtAngePid = new javax.swing.JTextField();
        btnOk = new javax.swing.JButton();
        lblprojektnamn = new javax.swing.JLabel();
        lblSvarProjektnamn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAngePid.setText("Ange pid");

        txtAngePid.addActionListener(this::txtAngePidActionPerformed);

        btnOk.setText("Ok");
        btnOk.addActionListener(this::btnOkActionPerformed);

        lblprojektnamn.setText("Projektnamn");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAngePid)
                    .addComponent(lblprojektnamn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtAngePid, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnOk))
                    .addComponent(lblSvarProjektnamn))
                .addContainerGap(562, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAngePid)
                    .addComponent(txtAngePid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOk))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblprojektnamn)
                    .addComponent(lblSvarProjektnamn))
                .addContainerGap(281, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAngePidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAngePidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAngePidActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed

try{
    String pid = txtAngePid.getText();
    String fraga = "SELECT projektnamn FROM projekt WHERE pid = " + pid;
    String databasSvar = idb.fetchSingle(fraga);
    String utskrift = databasSvar;
    lblSvarProjektnamn.setText(utskrift);
} catch(InfException e){
    JOptionPane.showMessageDialog(null, "Något blev fel");
    System.out.println(e.getMessage());
}
    }//GEN-LAST:event_btnOkActionPerformed

 
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(() -> new ProjektOversiktJFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel lblAngePid;
    private javax.swing.JLabel lblSvarProjektnamn;
    private javax.swing.JLabel lblprojektnamn;
    private javax.swing.JTextField txtAngePid;
    // End of variables declaration//GEN-END:variables
}
