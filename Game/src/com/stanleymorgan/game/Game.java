/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stanleymorgan.game;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author test
 */
public class Game extends javax.swing.JFrame {

    /**
     * Creates new form Game
     */
    public Game() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOptions = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnNext = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        radRed = new javax.swing.JRadioButton();
        radYellow = new javax.swing.JRadioButton();
        radGreen = new javax.swing.JRadioButton();
        radBlue = new javax.swing.JRadioButton();
        lblQues = new javax.swing.JLabel();
        lblAns = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnScore = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(93, 195, 202));

        btnNext.setText("Start");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnOptions.add(radRed);
        radRed.setForeground(new java.awt.Color(224, 14, 14));
        radRed.setText("Red");
        radRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radRedActionPerformed(evt);
            }
        });

        btnOptions.add(radYellow);
        radYellow.setForeground(new java.awt.Color(249, 213, 63));
        radYellow.setText("Yellow");
        radYellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radYellowActionPerformed(evt);
            }
        });

        btnOptions.add(radGreen);
        radGreen.setForeground(new java.awt.Color(15, 115, 20));
        radGreen.setText("Green");
        radGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radGreenActionPerformed(evt);
            }
        });

        btnOptions.add(radBlue);
        radBlue.setForeground(new java.awt.Color(24, 22, 219));
        radBlue.setText("Blue");
        radBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radBlueActionPerformed(evt);
            }
        });

        lblQues.setText("Choose the name of the word shown. Press Start! ");

        jLabel1.setForeground(new java.awt.Color(72, 99, 111));
        jLabel1.setText("THE COLOUR GAME !");

        btnScore.setText("View Score");
        btnScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScoreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radRed)
                            .addComponent(radGreen))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radBlue)
                            .addComponent(radYellow)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(btnNext)
                        .addGap(37, 37, 37)
                        .addComponent(btnScore)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit)))
                .addGap(76, 76, 76))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(lblAns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(lblQues, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblQues, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radRed)
                    .addComponent(radYellow))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radGreen)
                    .addComponent(radBlue))
                .addGap(31, 31, 31)
                .addComponent(lblAns, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext)
                    .addComponent(btnExit)
                    .addComponent(btnScore))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed
    int i=-1;
    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        btnNext.setText("Next");
        String[] words={"RED","BLUE","YELLOW","GREEN"};
        i++;
        switch (i)
                { case 0: 
                
        lblQues.setText(words[i]);
        lblQues.setForeground(Color.BLUE);
        break;
        
                case 1: 
                
        lblQues.setText(words[i]);
        lblQues.setForeground(Color.YELLOW);
        break;
        case 2: 
                
        lblQues.setText(words[i]);
        lblQues.setForeground(Color.GREEN);
        break;
        case 3: 
                
        lblQues.setText(words[i]);
        lblQues.setForeground(Color.RED);
        break;
        
        default: i=0;
        
        
                    
        
        
                }
    }//GEN-LAST:event_btnNextActionPerformed
    int score=0;
    private void radRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radRedActionPerformed
        // TODO add your handling code here:
        if (lblQues.getText().equals("RED"))
        {lblAns.setText("Right Answer! Congrats!!");
        score++;
        }
        
        else
        {lblAns.setText("Oops! Wrong answer. Keep trying!");}
                
    }//GEN-LAST:event_radRedActionPerformed

    private void radYellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radYellowActionPerformed
        // TODO add your handling code here:
        if (lblQues.getText().equals("YELLOW"))
        {lblAns.setText("Right Answer! Congrats!!");
        score++;
        }
        
        else
        {lblAns.setText("Oops! Wrong answer. Keep trying!");}
    }//GEN-LAST:event_radYellowActionPerformed

    private void radGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radGreenActionPerformed
        // TODO add your handling code here:
        if (lblQues.getText().equals("GREEN"))
        {lblAns.setText("Right Answer! Congrats!!");
        score++;
        }
        
        else
        {lblAns.setText("Oops! Wrong answer. Keep trying!");}
    }//GEN-LAST:event_radGreenActionPerformed

    private void radBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radBlueActionPerformed
        // TODO add your handling code here:
        if (lblQues.getText().equals("BLUE"))
        {lblAns.setText("Right Answer! Congrats!!");
        score++;
        }
        
        else
        {lblAns.setText("Oops! Wrong answer. Keep trying!");}
    }//GEN-LAST:event_radBlueActionPerformed

    private void btnScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScoreActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Your score is "+score+"!. Congrats! Keep going!!");
    }//GEN-LAST:event_btnScoreActionPerformed

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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNext;
    private javax.swing.ButtonGroup btnOptions;
    private javax.swing.JButton btnScore;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAns;
    private javax.swing.JLabel lblQues;
    private javax.swing.JRadioButton radBlue;
    private javax.swing.JRadioButton radGreen;
    private javax.swing.JRadioButton radRed;
    private javax.swing.JRadioButton radYellow;
    // End of variables declaration//GEN-END:variables
}