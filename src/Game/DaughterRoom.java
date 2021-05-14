package Game;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;
public class DaughterRoom extends javax.swing.JFrame {
    public DaughterRoom() {
        initComponents();
        
        Knife.setOpaque(false);
        Knife.setContentAreaFilled(false);
        Knife.setBorderPainted(false);
        
        Note_daugther_dr.setOpaque(false);
        Note_daugther_dr.setContentAreaFilled(false);
        Note_daugther_dr.setBorderPainted(false);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        Text = new javax.swing.JLabel();
        Knife = new javax.swing.JButton();
        Note_daugther_dr = new javax.swing.JButton();
        BackBG = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mission Part 713");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        jPanel.setLayout(null);

        Text.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        Text.setForeground(new java.awt.Color(255, 255, 255));
        Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Text.setText("ห้องลูกสาว");
        jPanel.add(Text);
        Text.setBounds(0, 0, 180, 60);

        Knife.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/Knife.png"))); // NOI18N
        Knife.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Knife.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KnifeActionPerformed(evt);
            }
        });
        jPanel.add(Knife);
        Knife.setBounds(720, 440, 110, 50);

        Note_daugther_dr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/Note1.png"))); // NOI18N
        Note_daugther_dr.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Note_daugther_dr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Note_daugther_drActionPerformed(evt);
            }
        });
        jPanel.add(Note_daugther_dr);
        Note_daugther_dr.setBounds(870, 600, 133, 60);

        BackBG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BackBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Back.png"))); // NOI18N
        BackBG.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel.add(BackBG);
        BackBG.setBounds(70, 590, 70, 70);

        BG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/DaugtherRoom.png"))); // NOI18N
        BG.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel.add(BG);
        BG.setBounds(0, 0, 1280, 720);

        Back.setText("Back");
        Back.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Back.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Back.setPreferredSize(new java.awt.Dimension(70, 70));
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel.add(Back);
        Back.setBounds(70, 590, 70, 70);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    static void Playsound(File Sound){
        try {
         // Open an audio input stream.
         Clip clip = AudioSystem.getClip();
         clip.open(AudioSystem.getAudioInputStream(Sound));
         clip.start();
         
         Thread.sleep(clip.getMicrosecondLength()/1000);
         
        }catch(Exception e){
        }
    }
    
    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        File backk = new File("back.wav");
        Playsound(backk);
        UpstairsLeftHallways back = new UpstairsLeftHallways();
        back.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

    private void KnifeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KnifeActionPerformed
        File backk = new File("item.wav");
        Playsound(backk);
        JOptionPane.showInternalMessageDialog(null, "Bloody knife");      
    }//GEN-LAST:event_KnifeActionPerformed

    private void Note_daugther_drActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Note_daugther_drActionPerformed
        File backk = new File("page-flip.wav");
        Playsound(backk);
        Note_daugther_dr next = new Note_daugther_dr();
        next.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_Note_daugther_drActionPerformed

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
            java.util.logging.Logger.getLogger(FrontYard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrontYard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrontYard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrontYard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DaughterRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton Back;
    private javax.swing.JLabel BackBG;
    private javax.swing.JButton Knife;
    private javax.swing.JButton Note_daugther_dr;
    private javax.swing.JLabel Text;
    private javax.swing.JPanel jPanel;
    // End of variables declaration//GEN-END:variables
}
