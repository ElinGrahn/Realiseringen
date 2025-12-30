
package sdgsweden;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;


public class HuvudFonster extends javax.swing.JFrame {
    
//  private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(HuvudFonster.class.getName());
 private InfDB idb;
 
    public HuvudFonster() { 
        initComponents();
        
        try{
            idb = new InfDB("ngo_2024", "3306", "root", "1997");
        } catch(InfException e){
            JOptionPane.showMessageDialog(null, "Något blev fel");
        }
    } 

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblProjektnamn = new javax.swing.JLabel();
        lblPid = new javax.swing.JLabel();
        btnHamta = new javax.swing.JButton();
        txtInput = new javax.swing.JTextField();
        lblOutputNamn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblProjektnamn.setText("Projektnamn");

        lblPid.setText("pid");

        btnHamta.setText("hämta");
        btnHamta.addActionListener(this::btnHamtaActionPerformed);

        lblOutputNamn.setText("lblNamn");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblProjektnamn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnHamta)
                                .addGap(36, 36, 36)
                                .addComponent(lblOutputNamn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPid)
                                .addGap(18, 18, 18)
                                .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(225, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblOutputNamn)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblProjektnamn)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPid)
                            .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnHamta)))
                .addContainerGap(176, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHamtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHamtaActionPerformed
       
        try{
            String pid = txtInput.getText();
            String fraga = "SELECT projektnamn FROM projekt WHERE pid = " + pid;
            String databasSvar = idb.fetchSingle(fraga);
            
            String utskrift = databasSvar;
            lblOutputNamn.setText(utskrift);
        }catch (InfException e){
            JOptionPane.showMessageDialog(null, "heej");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnHamtaActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHamta;
    private javax.swing.JLabel lblOutputNamn;
    private javax.swing.JLabel lblPid;
    private javax.swing.JLabel lblProjektnamn;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables
}
