package Game;

import java.io.File;
import javax.swing.JOptionPane;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class MotherRoom extends javax.swing.JFrame implements MyUtil {
    public MotherRoom() {
        initComponents();
        Key_SonRoom.setOpaque(false);
        Key_SonRoom.setContentAreaFilled(false);
        Key_SonRoom.setBorderPainted(false);
        
        Note_mother.setOpaque(false);
        Note_mother.setContentAreaFilled(false);
        Note_mother.setBorderPainted(false);
        
        Gun.setOpaque(false);
        Gun.setContentAreaFilled(false);
        Gun.setBorderPainted(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        Gun = new javax.swing.JButton();
        Note_mother = new javax.swing.JButton();
        Key_SonRoom = new javax.swing.JButton();
        BackBG = new javax.swing.JLabel();
        Text = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mission Part 713");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        jPanel.setLayout(null);

        Gun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/Gun.png"))); // NOI18N
        Gun.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Gun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GunActionPerformed(evt);
            }
        });
        jPanel.add(Gun);
        Gun.setBounds(470, 400, 140, 50);

        Note_mother.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/Note2.png"))); // NOI18N
        Note_mother.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Note_mother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Note_motherActionPerformed(evt);
            }
        });
        jPanel.add(Note_mother);
        Note_mother.setBounds(850, 540, 100, 70);

        Key_SonRoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/Key.png"))); // NOI18N
        Key_SonRoom.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Key_SonRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Key_SonRoomActionPerformed(evt);
            }
        });
        jPanel.add(Key_SonRoom);
        Key_SonRoom.setBounds(330, 580, 110, 50);

        BackBG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BackBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Back.png"))); // NOI18N
        BackBG.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel.add(BackBG);
        BackBG.setBounds(70, 590, 70, 70);

        Text.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        Text.setForeground(new java.awt.Color(255, 255, 255));
        Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Text.setText("ห้องแม่");
        jPanel.add(Text);
        Text.setBounds(0, 0, 170, 60);

        BG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/MotherRoom.png"))); // NOI18N
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
        UpstairsRightHallways back = new UpstairsRightHallways();
        back.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

    private void Key_SonRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Key_SonRoomActionPerformed
         File key = new File("item.wav");
         Playsound(key);
        try (OutputStream output = new FileOutputStream(PATH)){
            Properties prop = new Properties();
            prop.setProperty(KEY_Room2, "Open");
            prop.store(output, null);
            System.out.println(prop);
            JOptionPane.showInternalMessageDialog(null, "Unlock Son's room");
        }
        catch(IOException io){
            io.printStackTrace();
        }
    }//GEN-LAST:event_Key_SonRoomActionPerformed

    private void GunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GunActionPerformed
        File item = new File("item.wav");
        Playsound(item);
        JOptionPane.showInternalMessageDialog(null, "Gun"); 
        
    }//GEN-LAST:event_GunActionPerformed

    private void Note_motherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Note_motherActionPerformed
        File note = new File("page-flip.wav");
        Playsound(note);
        Note_mother next = new Note_mother();
        next.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_Note_motherActionPerformed

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
                new MotherRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton Back;
    private javax.swing.JLabel BackBG;
    private javax.swing.JButton Gun;
    private javax.swing.JButton Key_SonRoom;
    private javax.swing.JButton Note_mother;
    private javax.swing.JLabel Text;
    private javax.swing.JPanel jPanel;
    // End of variables declaration//GEN-END:variables
}
