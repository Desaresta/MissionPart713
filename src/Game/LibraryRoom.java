package Game;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class LibraryRoom extends javax.swing.JFrame  implements MyUtil {
    public LibraryRoom() {
        initComponents();
        
        Note_ans.setOpaque(false);
        Note_ans.setContentAreaFilled(false);
        Note_ans.setBorderPainted(false);
        
        Newspaper.setOpaque(false);
        Newspaper.setContentAreaFilled(false);
        Newspaper.setBorderPainted(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        Note_ans = new javax.swing.JButton();
        Newspaper = new javax.swing.JButton();
        Text = new javax.swing.JLabel();
        BackBG = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mission Part 713");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        jPanel.setLayout(null);

        Note_ans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/Note1.png"))); // NOI18N
        Note_ans.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Note_ans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Note_ansActionPerformed(evt);
            }
        });
        jPanel.add(Note_ans);
        Note_ans.setBounds(430, 490, 100, 40);

        Newspaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/Newspaper.png"))); // NOI18N
        Newspaper.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Newspaper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewspaperActionPerformed(evt);
            }
        });
        jPanel.add(Newspaper);
        Newspaper.setBounds(880, 450, 100, 50);

        Text.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        Text.setForeground(new java.awt.Color(255, 255, 255));
        Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Text.setText("ห้องหนังสือ");
        jPanel.add(Text);
        Text.setBounds(0, 0, 200, 60);

        BackBG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BackBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Back.png"))); // NOI18N
        BackBG.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel.add(BackBG);
        BackBG.setBounds(70, 590, 70, 70);

        BG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/LibraryRoom.png"))); // NOI18N
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
        File back = new File("back.wav");
        Playsound(back);
        setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

    private void Note_ansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Note_ansActionPerformed
         File note = new File("page-flip.wav");
         Playsound(note);
         try (OutputStream output = new FileOutputStream(PATH)){
            Properties prop = new Properties();
            prop.setProperty(KEY_Room2, "Open_Q");
            prop.store(output, null);
            System.out.println(prop);
            Note_ans next = new Note_ans();
            next.setVisible(true);
            setVisible(false);
            //JOptionPane.showInternalMessageDialog(null, "Unlock Q&A");
        }
        catch(IOException io){
            io.printStackTrace();
        }
    }//GEN-LAST:event_Note_ansActionPerformed

    private void NewspaperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewspaperActionPerformed
            File back = new File("news.wav");
            Playsound(back);
            Newspaper next = new Newspaper();
            next.setVisible(true);
            setVisible(false);
            
       
    }//GEN-LAST:event_NewspaperActionPerformed

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
                new LibraryRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton Back;
    private javax.swing.JLabel BackBG;
    private javax.swing.JButton Newspaper;
    private javax.swing.JButton Note_ans;
    private javax.swing.JLabel Text;
    private javax.swing.JPanel jPanel;
    // End of variables declaration//GEN-END:variables
}
