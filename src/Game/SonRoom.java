package Game;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import javax.swing.JOptionPane;

public class SonRoom extends javax.swing.JFrame  implements MyUtil  {
    public SonRoom() {
        initComponents();
        Key_Bathroom.setOpaque(false);
        Key_Bathroom.setContentAreaFilled(false);
        Key_Bathroom.setBorderPainted(false);
        
        Note_son.setOpaque(false);
        Note_son.setContentAreaFilled(false);
        Note_son.setBorderPainted(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        Key_Bathroom = new javax.swing.JButton();
        BackBG = new javax.swing.JLabel();
        Note_son = new javax.swing.JButton();
        Text = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mission Part 713");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        jPanel.setLayout(null);

        Key_Bathroom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/Key.png"))); // NOI18N
        Key_Bathroom.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Key_Bathroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Key_BathroomActionPerformed(evt);
            }
        });
        jPanel.add(Key_Bathroom);
        Key_Bathroom.setBounds(200, 560, 110, 50);

        BackBG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BackBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Back.png"))); // NOI18N
        BackBG.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel.add(BackBG);
        BackBG.setBounds(70, 590, 70, 70);

        Note_son.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/Note1.png"))); // NOI18N
        Note_son.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Note_son.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Note_sonActionPerformed(evt);
            }
        });
        jPanel.add(Note_son);
        Note_son.setBounds(620, 570, 100, 50);

        Text.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        Text.setForeground(new java.awt.Color(255, 255, 255));
        Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Text.setText("ห้องลูกชาย");
        jPanel.add(Text);
        Text.setBounds(0, 0, 190, 60);

        BG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/SonRoom.png"))); // NOI18N
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

    private void Key_BathroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Key_BathroomActionPerformed
            File back = new File("item.wav");
            Playsound(back);
            try (OutputStream output = new FileOutputStream(PATH)){
            Properties prop = new Properties();
            prop.setProperty(KEY_Room2, "Open_B");
            prop.store(output, null);
            System.out.println(prop);
            JOptionPane.showInternalMessageDialog(null, "Unlock Bathroom");
        }
        catch(IOException io){
            io.printStackTrace();
        }
                                      
    }//GEN-LAST:event_Key_BathroomActionPerformed

    private void Note_sonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Note_sonActionPerformed
        File back = new File("page-flip.wav");
        Playsound(back);
        Note_son next = new Note_son();
        next.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_Note_sonActionPerformed

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
                new SonRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton Back;
    private javax.swing.JLabel BackBG;
    private javax.swing.JButton Key_Bathroom;
    private javax.swing.JButton Note_son;
    private javax.swing.JLabel Text;
    private javax.swing.JPanel jPanel;
    // End of variables declaration//GEN-END:variables
}
