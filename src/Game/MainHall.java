package Game;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import java.io.OutputStream;
import java.util.Properties;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class MainHall extends javax.swing.JFrame  implements MyUtil {
    public MainHall() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        Text = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();
        RightHallwaysDoor = new javax.swing.JButton();
        RightCentralDoor = new javax.swing.JButton();
        LeftHallwaysDoor = new javax.swing.JButton();
        LeftCentralDoor = new javax.swing.JButton();
        UpstairsLeftHallwaysDoor = new javax.swing.JButton();
        UpstairsRightHallwaysDoor = new javax.swing.JButton();
        Answer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mission Part 713");
        setResizable(false);

        jPanel.setLayout(null);

        Text.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        Text.setForeground(new java.awt.Color(255, 255, 255));
        Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Text.setText("ห้องโถง");
        jPanel.add(Text);
        Text.setBounds(0, 0, 170, 60);

        BG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/MainHall.png"))); // NOI18N
        BG.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel.add(BG);
        BG.setBounds(0, 0, 1280, 720);

        RightHallwaysDoor.setText("RightHallwaysDoor");
        RightHallwaysDoor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        RightHallwaysDoor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RightHallwaysDoorActionPerformed(evt);
            }
        });
        jPanel.add(RightHallwaysDoor);
        RightHallwaysDoor.setBounds(1130, 370, 90, 230);

        RightCentralDoor.setText("RightCentralDoor");
        RightCentralDoor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        RightCentralDoor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RightCentralDoorActionPerformed(evt);
            }
        });
        jPanel.add(RightCentralDoor);
        RightCentralDoor.setBounds(820, 20, 100, 120);

        LeftHallwaysDoor.setText("LeftHallwaysDoor");
        LeftHallwaysDoor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LeftHallwaysDoor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LeftHallwaysDoor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeftHallwaysDoorActionPerformed(evt);
            }
        });
        jPanel.add(LeftHallwaysDoor);
        LeftHallwaysDoor.setBounds(70, 380, 80, 200);

        LeftCentralDoor.setText("LeftCentralDoor");
        LeftCentralDoor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LeftCentralDoor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeftCentralDoorActionPerformed(evt);
            }
        });
        jPanel.add(LeftCentralDoor);
        LeftCentralDoor.setBounds(350, 20, 90, 120);

        UpstairsLeftHallwaysDoor.setText("UpsairsRightHallways");
        UpstairsLeftHallwaysDoor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        UpstairsLeftHallwaysDoor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpstairsLeftHallwaysDoorActionPerformed(evt);
            }
        });
        jPanel.add(UpstairsLeftHallwaysDoor);
        UpstairsLeftHallwaysDoor.setBounds(50, 80, 90, 130);

        UpstairsRightHallwaysDoor.setText("UpstairsRightHallways");
        UpstairsRightHallwaysDoor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        UpstairsRightHallwaysDoor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpstairsRightHallwaysDoorActionPerformed(evt);
            }
        });
        jPanel.add(UpstairsRightHallwaysDoor);
        UpstairsRightHallwaysDoor.setBounds(1143, 70, 90, 140);

        Answer.setText("Answer");
        Answer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Answer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnswerActionPerformed(evt);
            }
        });
        jPanel.add(Answer);
        Answer.setBounds(590, 10, 60, 80);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
    
    private void RightHallwaysDoorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RightHallwaysDoorActionPerformed
        File door = new File("closedoor.wav");
        Playsound(door);
        RightHallways next = new RightHallways();
        next.setVisible(true);
      
     
    }//GEN-LAST:event_RightHallwaysDoorActionPerformed

    private void RightCentralDoorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RightCentralDoorActionPerformed
//        Bathroom next = new Bathroom();
//        next.setVisible(true);
        String p_prop;
        try (InputStream input = new FileInputStream(PATH)) {

            Properties prop3 = new Properties();

            // load a properties file
            prop3.load(input);

            // get the property value and print it out
            p_prop = prop3.getProperty(KEY_Room2);
            System.out.println(p_prop);
               if(p_prop.equals("Open_B")||p_prop.equals("Open_Q")){
                   File door = new File("closedoor.wav");
                   Playsound(door);
                   Bathroom nextt = new  Bathroom();
                   nextt.setVisible(true);
                   
               }else{
                   File door = new File("Trying-to-Open-Door.wav");
                   Playsound(door);
                   JOptionPane.showInternalMessageDialog(null, "lock");
               }

        } catch (IOException ex) {
            JOptionPane.showInternalMessageDialog(null, "lock");
            ex.printStackTrace();
        }
        

    }//GEN-LAST:event_RightCentralDoorActionPerformed

    private void LeftHallwaysDoorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeftHallwaysDoorActionPerformed
        File door = new File("closedoor.wav");
        Playsound(door);
        LeftHallways next = new LeftHallways();
        next.setVisible(true);
       
    }//GEN-LAST:event_LeftHallwaysDoorActionPerformed

    private void LeftCentralDoorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeftCentralDoorActionPerformed
        String p_prop;
        try (InputStream input = new FileInputStream(PATH)) {

            Properties prop3 = new Properties();

            // load a properties file
            prop3.load(input);

            // get the property value and print it out
            p_prop = prop3.getProperty(KEY_Room2);
            System.out.println(p_prop);
               if(p_prop.equals("Open_B")||p_prop.equals("Open_Q")){
                   File door = new File("closedoor.wav");
                   Playsound(door);
                   LibraryRoom nextt = new  LibraryRoom();
                   nextt.setVisible(true);
                   
               }else{
                   File door = new File("Trying-to-Open-Door.wav");
                   Playsound(door);
                   JOptionPane.showInternalMessageDialog(null, "lock");
               }

        } catch (IOException ex) {
            JOptionPane.showInternalMessageDialog(null, "lock");
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_LeftCentralDoorActionPerformed

    private void UpstairsLeftHallwaysDoorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpstairsLeftHallwaysDoorActionPerformed
        File door = new File("closedoor.wav");
        Playsound(door);
        UpstairsLeftHallways next = new UpstairsLeftHallways();
        next.setVisible(true);
       
    }//GEN-LAST:event_UpstairsLeftHallwaysDoorActionPerformed

    private void UpstairsRightHallwaysDoorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpstairsRightHallwaysDoorActionPerformed
        File door = new File("closedoor.wav");
        Playsound(door);
        UpstairsRightHallways next = new UpstairsRightHallways();
        next.setVisible(true);
        
    }//GEN-LAST:event_UpstairsRightHallwaysDoorActionPerformed

    private void AnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnswerActionPerformed
       String p_prop;
        try (InputStream input = new FileInputStream(PATH)) {

            Properties prop3 = new Properties();

            // load a properties file
            prop3.load(input);

            // get the property value and print it out
            p_prop = prop3.getProperty(KEY_Room2);
            System.out.println(p_prop);
               if(p_prop.equals("Open_Q")){
                   Answer nextt = new  Answer();
                   nextt.setVisible(true);
                   
                   
               }
                   
        } catch (IOException ex) {
            JOptionPane.showInternalMessageDialog(null, "lock");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_AnswerActionPerformed

    public static void main(String args[]) {
        try (OutputStream output = new FileOutputStream(PATH)){
            Properties prop = new Properties();
            prop.remove(KEY_Room2);
            prop.setProperty(KEY_Room2, "false");
            prop.store(output, null);
            System.out.println(prop);
        }
        catch(IOException io){
            io.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(MainHall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainHall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainHall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainHall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainHall().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Answer;
    private javax.swing.JLabel BG;
    private javax.swing.JButton LeftCentralDoor;
    private javax.swing.JButton LeftHallwaysDoor;
    private javax.swing.JButton RightCentralDoor;
    private javax.swing.JButton RightHallwaysDoor;
    private javax.swing.JLabel Text;
    private javax.swing.JButton UpstairsLeftHallwaysDoor;
    private javax.swing.JButton UpstairsRightHallwaysDoor;
    private javax.swing.JPanel jPanel;
    // End of variables declaration//GEN-END:variables
}
