package Game;


import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class Answer extends javax.swing.JFrame implements MyUtil {
    public Answer() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        BackBG = new javax.swing.JLabel();
        who = new javax.swing.JLabel();
        mother = new javax.swing.JButton();
        son = new javax.swing.JButton();
        Sister = new javax.swing.JButton();
        Butler = new javax.swing.JButton();
        Maid = new javax.swing.JButton();
        BG = new javax.swing.JLabel();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mission Part 713");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setResizable(false);

        jPanel.setLayout(null);

        BackBG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BackBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Back.png"))); // NOI18N
        BackBG.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel.add(BackBG);
        BackBG.setBounds(70, 590, 70, 70);

        who.setFont(new java.awt.Font("Angsana New", 1, 48)); // NOI18N
        who.setForeground(new java.awt.Color(255, 255, 255));
        who.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        who.setText("ใครคือฆาตกร?");
        jPanel.add(who);
        who.setBounds(470, 90, 340, 80);

        mother.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        mother.setText("แม่");
        mother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motherActionPerformed(evt);
            }
        });
        jPanel.add(mother);
        mother.setBounds(470, 230, 350, 50);

        son.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        son.setText("ลูกชาย");
        son.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sonActionPerformed(evt);
            }
        });
        jPanel.add(son);
        son.setBounds(470, 320, 350, 50);

        Sister.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        Sister.setText("ลูกสาว");
        Sister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SisterActionPerformed(evt);
            }
        });
        jPanel.add(Sister);
        Sister.setBounds(470, 410, 350, 50);

        Butler.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        Butler.setText("พ่อบ้าน");
        Butler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButlerActionPerformed(evt);
            }
        });
        jPanel.add(Butler);
        Butler.setBounds(470, 500, 350, 50);

        Maid.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        Maid.setText("แม่บ้าน");
        Maid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaidActionPerformed(evt);
            }
        });
        jPanel.add(Maid);
        Maid.setBounds(470, 590, 350, 50);

        BG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/AnsBG.png"))); // NOI18N
        BG.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel.add(BG);
        BG.setBounds(0, 0, 1280, 720);

        Back.setText("Back");
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
        File backk = new File("buttonMenu.wav");
        Playsound(backk);
        MainHall back = new MainHall();
        back.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

    private void motherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motherActionPerformed
        File backk = new File("buttonMenu.wav");
        Playsound(backk);
        Text2[0] = mother.getText();
        Answer_which nextt = new Answer_which();
        nextt.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_motherActionPerformed

    
    
    private void sonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sonActionPerformed
        File backk = new File("buttonMenu.wav");
        Playsound(backk);
        Text2[0] = son.getText();
        Answer_which nextt = new Answer_which();
        nextt.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_sonActionPerformed

    private void SisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SisterActionPerformed
        File backk = new File("buttonMenu.wav");
        Playsound(backk);
        Text2[0] = Sister.getText();
        Answer_which nextt = new Answer_which();
        nextt.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_SisterActionPerformed

    private void ButlerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButlerActionPerformed
        File backk = new File("buttonMenu.wav");
        Playsound(backk);
        Text2[0] = Butler.getText();
        Answer_which nextt = new Answer_which();
        nextt.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_ButlerActionPerformed

    private void MaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaidActionPerformed
        File backk = new File("buttonMenu.wav");
        Playsound(backk);
        Text2[0] = Maid.getText();
        Answer_which nextt = new Answer_which();
        nextt.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_MaidActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Answer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton Back;
    private javax.swing.JLabel BackBG;
    private javax.swing.JButton Butler;
    private javax.swing.JButton Maid;
    private javax.swing.JButton Sister;
    private javax.swing.JPanel jPanel;
    private javax.swing.JButton mother;
    private javax.swing.JButton son;
    private javax.swing.JLabel who;
    // End of variables declaration//GEN-END:variables
}
