package Game;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;
public class MaidRoom extends javax.swing.JFrame {
    public MaidRoom() {
        initComponents();
        
        Note_maid.setOpaque(false);
        Note_maid.setContentAreaFilled(false);
        Note_maid.setBorderPainted(false);
        
        Rope.setOpaque(false);
        Rope.setContentAreaFilled(false);
        Rope.setBorderPainted(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        BackBG = new javax.swing.JLabel();
        Note_maid = new javax.swing.JButton();
        Rope = new javax.swing.JButton();
        Text = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mission Part 713");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        jPanel.setLayout(null);

        BackBG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BackBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Back.png"))); // NOI18N
        BackBG.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel.add(BackBG);
        BackBG.setBounds(70, 590, 70, 70);

        Note_maid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/Note1.png"))); // NOI18N
        Note_maid.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Note_maid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Note_maidActionPerformed(evt);
            }
        });
        jPanel.add(Note_maid);
        Note_maid.setBounds(930, 360, 90, 50);

        Rope.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/Rope.png"))); // NOI18N
        Rope.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Rope.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RopeActionPerformed(evt);
            }
        });
        jPanel.add(Rope);
        Rope.setBounds(170, 490, 190, 90);

        Text.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        Text.setForeground(new java.awt.Color(255, 255, 255));
        Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Text.setText("ห้องสาวใช้");
        jPanel.add(Text);
        Text.setBounds(0, 0, 200, 60);

        BG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/MaidRoom.png"))); // NOI18N
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
        LeftHallways back = new LeftHallways();
        back.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

    private void Note_maidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Note_maidActionPerformed
        File note = new File("page-flip.wav");
        Playsound(note);
        Note_maid next = new Note_maid();
        next.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_Note_maidActionPerformed

    private void RopeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RopeActionPerformed
        File back = new File("item.wav");
        Playsound(back);
        JOptionPane.showInternalMessageDialog(null, "Rope");
    }//GEN-LAST:event_RopeActionPerformed

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
                new MaidRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton Back;
    private javax.swing.JLabel BackBG;
    private javax.swing.JButton Note_maid;
    private javax.swing.JButton Rope;
    private javax.swing.JLabel Text;
    private javax.swing.JPanel jPanel;
    // End of variables declaration//GEN-END:variables
}
