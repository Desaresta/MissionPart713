package Game;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class UpstairsLeftHallways extends javax.swing.JFrame implements MyUtil{
    public UpstairsLeftHallways() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        BackBG = new javax.swing.JLabel();
        Text = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        SonRoomDoor = new javax.swing.JButton();
        DaughterRoomDoor = new javax.swing.JButton();

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

        Text.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        Text.setForeground(new java.awt.Color(255, 255, 255));
        Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Text.setText("ทางเดินด้านซ้าย ชั้นบน");
        jPanel.add(Text);
        Text.setBounds(0, 0, 280, 60);

        BG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/UpstairsLeftHallways.png"))); // NOI18N
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

        SonRoomDoor.setText("SonRoomDoor");
        SonRoomDoor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SonRoomDoor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SonRoomDoorActionPerformed(evt);
            }
        });
        jPanel.add(SonRoomDoor);
        SonRoomDoor.setBounds(213, 220, 170, 410);

        DaughterRoomDoor.setText("DaughterRoomDoor");
        DaughterRoomDoor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        DaughterRoomDoor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DaughterRoomDoorActionPerformed(evt);
            }
        });
        jPanel.add(DaughterRoomDoor);
        DaughterRoomDoor.setBounds(619, 140, 130, 320);

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
        File back = new File("back.wav");
        Playsound(back);
        setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

    private void SonRoomDoorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SonRoomDoorActionPerformed
//        SonRoom next = new SonRoom();
//        next.setVisible(true);
//        setVisible(false);
         String p_prop;
        try (InputStream input = new FileInputStream(PATH)) {

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            // get the property value and print it out
               p_prop = prop.getProperty(KEY_Room2);
               System.out.println(p_prop);
               if(p_prop.equals("Open") || p_prop.equals("Open_B")||p_prop.equals("Open_Q") ){
                   File door = new File("closedoor.wav");
                   Playsound(door);
                   SonRoom next = new SonRoom();
                  next.setVisible(true);
                  setVisible(false);

               }else{
                   File door = new File("Trying-to-Open-Door.wav");
                   Playsound(door);
                   JOptionPane.showInternalMessageDialog(null, "lock");
               }

        } catch (IOException ex) {
            
        }

    }//GEN-LAST:event_SonRoomDoorActionPerformed

    private void DaughterRoomDoorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DaughterRoomDoorActionPerformed
//           DaughtMini ss = new DaughtMini();
//           ss.setVisible(true);
            String p_prop;
        try (InputStream input = new FileInputStream(PATH)) {

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            // get the property value and print it out
               p_prop = prop.getProperty(KEY_Room2);
               System.out.println(p_prop);
               if(p_prop.equals("win") || p_prop.equals("Open")||p_prop.equals("Open_B")||p_prop.equals("Open_Q") ){
                   File door = new File("closedoor.wav");
                   Playsound(door);
                   DaughterRoom nextt = new DaughterRoom();
                   nextt.setVisible(true);
                   setVisible(false);

               }else if(p_prop.equals("true")){
                   File back = new File("Transceiver.wav");
                   Playsound(back);
                   DaughtMini nextt = new DaughtMini();
                   nextt.setVisible(true);
                   setVisible(false);
               }
               else{
                   File back = new File("Trying-to-Open-Door.wav");
                   Playsound(back);
                   JOptionPane.showInternalMessageDialog(null, "lock");
                   
               }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
           
    }//GEN-LAST:event_DaughterRoomDoorActionPerformed

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
                new UpstairsLeftHallways().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton Back;
    private javax.swing.JLabel BackBG;
    private javax.swing.JButton DaughterRoomDoor;
    private javax.swing.JButton SonRoomDoor;
    private javax.swing.JLabel Text;
    private javax.swing.JPanel jPanel;
    // End of variables declaration//GEN-END:variables
}
