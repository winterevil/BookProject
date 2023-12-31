package InfoPanel;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author RAVEN
 */
public class Info extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Info() {
        initComponents();
        Image icon = new ImageIcon(this.getClass().getResource("/library/assistant/ui/icons/cat2.jpg")).getImage();
        this.setIconImage(icon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clipPathHoverEffect1 = new InfoPanel.ClipPathHoverEffect();
        clipPathHoverEffect2 = new InfoPanel.ClipPathHoverEffect();
        clipPathHoverEffect3 = new InfoPanel.ClipPathHoverEffect();
        clipPathHoverEffect4 = new InfoPanel.ClipPathHoverEffect();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("STUDENTS");

        clipPathHoverEffect1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        clipPathHoverEffect1.setImage(new javax.swing.ImageIcon(getClass().getResource("/InfoPanel/photo (2).jpg"))); // NOI18N
        clipPathHoverEffect1.setText("BUI ANH TUAN");

        clipPathHoverEffect2.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        clipPathHoverEffect2.setImage(new javax.swing.ImageIcon(getClass().getResource("/InfoPanel/photo (3).jpg"))); // NOI18N
        clipPathHoverEffect2.setText("LE THANH LONG");

        clipPathHoverEffect3.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        clipPathHoverEffect3.setImage(new javax.swing.ImageIcon(getClass().getResource("/InfoPanel/photo (4).jpg"))); // NOI18N
        clipPathHoverEffect3.setText("TRAN THI HOANG YEN");

        clipPathHoverEffect4.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        clipPathHoverEffect4.setImage(new javax.swing.ImageIcon(getClass().getResource("/InfoPanel/photo (1).jpg"))); // NOI18N
        clipPathHoverEffect4.setText("PHAM THU HUONG");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clipPathHoverEffect1, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clipPathHoverEffect2, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clipPathHoverEffect4, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clipPathHoverEffect3, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clipPathHoverEffect2, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addComponent(clipPathHoverEffect1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clipPathHoverEffect3, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addComponent(clipPathHoverEffect4, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
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
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private InfoPanel.ClipPathHoverEffect clipPathHoverEffect1;
    private InfoPanel.ClipPathHoverEffect clipPathHoverEffect2;
    private InfoPanel.ClipPathHoverEffect clipPathHoverEffect3;
    private InfoPanel.ClipPathHoverEffect clipPathHoverEffect4;
    // End of variables declaration//GEN-END:variables
}
