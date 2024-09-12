/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author GOI
 */
public class Level300_Semester2 extends javax.swing.JFrame {

    /**
     * Creates new form StudentRegistration
     */
    public Level300_Semester2() {
        initComponents();

//        gradeLetters.setToolTipText("GRADE CALCULATES AUTOMATICALLY FROM TOTAL SCORE!!");
//    
//        //TOOTIP FOR GP
//        gpInLevel.setToolTipText("GP CALCULATES AUTOMATICALLY FROM TOTAL SCORE AND UNIT!!");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Session = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Semester = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        lvl = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        StudentRegNum = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        studentName = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        feesStatus = new javax.swing.JComboBox<>();
        uploadAll1 = new javax.swing.JButton();
        passport = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        I_T = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        uploadPhoto = new javax.swing.JButton();
        cal_score1 = new javax.swing.JButton();
        gradeLetter = new javax.swing.JComboBox<>();
        gpInLevel = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        TotalUnits = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        TOTAL = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 1000));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 876, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1333, Short.MAX_VALUE)
        );

        jPanel3.setPreferredSize(new java.awt.Dimension(867, 500));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("400 LEVEL 2ND SEMESTER RESULT POSTING SYSTEM");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel14.setText("SESSION");

        Session.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SessionActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel15.setText("SEMESTER");

        Semester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2ND" }));
        Semester.setEnabled(false);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel16.setText("LEVEL");

        lvl.setText("400");
        lvl.setEnabled(false);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel17.setText("REG NUMBER");

        StudentRegNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentRegNumActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel18.setText("NAME OF STUDENT");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel19.setText("FEES");

        feesStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PAID", "UNPAID" }));
        feesStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feesStatusActionPerformed(evt);
            }
        });

        uploadAll1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        uploadAll1.setText("POST RESULT");
        uploadAll1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadAll1ActionPerformed(evt);
            }
        });

        passport.setBackground(new java.awt.Color(255, 0, 51));
        passport.setForeground(new java.awt.Color(255, 0, 51));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setText("COURSES");

        I_T.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        I_T.setText("I.T");

        jLabel23.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel23.setText("IMO STATE UNIVERSITY, OWERRI");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setText("GRADE");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setText("UNIT");

        uploadPhoto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        uploadPhoto.setText("UPLOAD PASSPORT");
        uploadPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadPhotoActionPerformed(evt);
            }
        });

        cal_score1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cal_score1.setText("CALCULATE SCORES");
        cal_score1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cal_score1ActionPerformed(evt);
            }
        });

        gradeLetter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT GRADE", "A", "B", "C", "D", "E", "F" }));
        gradeLetter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeLetterActionPerformed(evt);
            }
        });

        gpInLevel.setEnabled(false);
        gpInLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpInLevelActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel26.setText("GPA");

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/imsulogo.png"))); // NOI18N

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel28.setText("TOTAL");

        TOTAL.setToolTipText("This Field Calculates Automatically");
        TOTAL.setEnabled(false);
        TOTAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TOTALActionPerformed(evt);
            }
        });

        jLabel1.setText("eg:202110848885eg");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(studentName, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gpInLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(feesStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(I_T, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(Session, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(58, 58, 58)
                                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(Semester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(TotalUnits, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addGap(57, 57, 57)
                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(TOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel28)))
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addGap(30, 30, 30)
                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                                    .addComponent(uploadAll1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addGap(191, 191, 191))
                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(uploadPhoto))
                                                                .addComponent(passport, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(lvl, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                                        .addGap(6, 6, 6)
                                                                        .addComponent(jLabel1))
                                                                    .addComponent(StudentRegNum, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                                .addGap(62, 62, 62)
                                                .addComponent(gradeLetter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(152, 152, 152))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cal_score1)
                        .addGap(52, 52, 52)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel26))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel11))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Session, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Semester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lvl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(StudentRegNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(studentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(feesStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(passport, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(uploadPhoto)
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gradeLetter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TotalUnits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I_T, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uploadAll1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gpInLevel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel26)
                        .addComponent(cal_score1)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(904, 522));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TOTALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TOTALActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TOTALActionPerformed

    private void gpInLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpInLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gpInLevelActionPerformed

    private void gradeLetterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeLetterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gradeLetterActionPerformed

    private void cal_score1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cal_score1ActionPerformed
        CalScore();

        // TODO add your handling code here:
    }//GEN-LAST:event_cal_score1ActionPerformed

    private void uploadPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadPhotoActionPerformed
        UploadPicture();
        // TODO add your handling code here:
    }//GEN-LAST:event_uploadPhotoActionPerformed

    private void uploadAll1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadAll1ActionPerformed
        uploadData();
        // TODO add your handling code here:
    }//GEN-LAST:event_uploadAll1ActionPerformed

    private void feesStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feesStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_feesStatusActionPerformed

    private void SessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SessionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SessionActionPerformed

    private void StudentRegNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentRegNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentRegNumActionPerformed
    public void CalScore() {
         if("SELECT GRADE".equals(gradeLetter.getSelectedItem().toString())){
         JOptionPane.showMessageDialog(this, "Pls Select Student Grade!!", "Complete Calculation!", JOptionPane.WARNING_MESSAGE);
            return;
         }
         try{
          if (TotalUnits.getText().trim().isEmpty()) {
          JOptionPane.showMessageDialog(this, "Provide Units!", "Invalid Unit Count", JOptionPane.ERROR_MESSAGE);
            return;
        }
          
          if (Integer.parseInt(TotalUnits.getText()) > 15) {
          JOptionPane.showMessageDialog(this, "Unit cannot be greater than 15", "Invalid Unit Count", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        
        int gradeValue = getPointValue(gradeLetter.getSelectedItem().toString());

        
        int totalUnits = Integer.parseInt(TotalUnits.getText());
        int totalPoints = totalUnits * gradeValue;
        TOTAL.setText(String.valueOf(totalPoints));
        double gpa = (double) totalPoints / totalUnits;
        double roundedGpa = Math.round(gpa * 1000.0) / 1000.0;
        gpInLevel.setText(String.valueOf(roundedGpa));
         }catch(NumberFormatException e){
             JOptionPane.showMessageDialog(this,e.getMessage()+"Please Enter a Valid Number", "Error", JOptionPane.ERROR_MESSAGE);
         }

    }

    public int getPointValue(String grade) {
        switch (grade) {
            case "A":
                return 5;
            case "B":
                return 4;
            case "C":
                return 3;
            case "D":
                return 2;
            case "E":
                return 1;
            case "F":
                return 0;
            default:
                return 0;

        }
    }

    void uploadData() {
        if ("".equals(Session.getText()) || "".equals(lvl.getText()) || "".equals(StudentRegNum.getText()) || "".equals(studentName.getText()) || "".equals(gpInLevel.getText()) || filename == null) {
            JOptionPane.showMessageDialog(this, "FIELD CANNOT BE EMPTY OR PHOTO NOT UPLOADED!!", "Please Fill Empty Field", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (StudentRegNum.getText().length() != 14) {
            JOptionPane.showMessageDialog(this, "REG NUMBER MUST BE 14 CHARACTERS", "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
//   
//        String url = "jdbc:MySql://sql8.freesqldatabase.com:3306/sql8730305";
//        String username = "sql8730305";
//        String password = "VGxAU93HkA";
        
        String url = "jdbc:MySql://sql8.freesqldatabase.com:3306/sql8730305";
        String username = "sql8730305";
        String password = "VGxAU93HkA";
        String checkStatement = "SELECT * FROM level3_semester2 WHERE reg_number = ?";
        String statement = "INSERT INTO level3_semester2(session, semester, level, reg_number, name_of_student, "
                + "fee, passport, course, grade, total, gpa) "
                + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        String regNumValue = StudentRegNum.getText().toUpperCase();
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            // Check for existing registration number
            try (PreparedStatement checkPstm = conn.prepareStatement(checkStatement)) {
                checkPstm.setString(1, regNumValue);
                try (ResultSet rs = checkPstm.executeQuery()) {
                    if (rs.next() && rs.getInt(1) > 0) {
                        JOptionPane.showMessageDialog(this, "Registration number already exists!", "Duplicate Posting!!", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }
            }

            // Insert the data along with the image
            try (PreparedStatement psmt = conn.prepareStatement(statement); FileInputStream fis = new FileInputStream(filename)) {

                int session = Integer.parseInt(Session.getText());
                psmt.setInt(1, session);
                psmt.setString(2, Semester.getSelectedItem().toString());
                int level = Integer.parseInt(lvl.getText());
                psmt.setInt(3, level);
                psmt.setString(4, StudentRegNum.getText().toUpperCase());
                psmt.setString(5, studentName.getText().toUpperCase());
                psmt.setString(6, feesStatus.getSelectedItem().toString());
                psmt.setBinaryStream(7, fis, (int) new File(filename).length());
                psmt.setString(8, I_T.getText());
                psmt.setString(9, gradeLetter.getSelectedItem().toString());
                psmt.setInt(10, Integer.parseInt(TOTAL.getText()));
                
                psmt.setDouble(11, Double.parseDouble(gpInLevel.getText()));

                int updateToDB = psmt.executeUpdate();
                if (updateToDB != 0) {
                    JOptionPane.showMessageDialog(this, "Successfully Inserted", "Success Message", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        } catch (SQLException | IOException exceptionMessage) {
            if (exceptionMessage instanceof SQLException && ((SQLException) exceptionMessage).getSQLState().equals("08S01")) {
                JOptionPane.showMessageDialog(this, "Failed to connect to the database. Please check your internet connection and try again.", "Connection Error", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, exceptionMessage.getMessage(), "Error Message", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public void UploadPicture() {
        JFileChooser choosePicture = new JFileChooser();
        int returnVal = choosePicture.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File f = choosePicture.getSelectedFile();
            passport.setIcon(new ImageIcon(f.toString()));
            filename = f.getAbsolutePath();

            // Debugging: Print the filename to ensure it's correct
            JOptionPane.showMessageDialog(this, "Selected file path: " + filename, "File Select Info", JOptionPane.INFORMATION_MESSAGE);

            try (FileInputStream fis = new FileInputStream(f)) {
                photo = fis.readAllBytes();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(this, "File selection canceled.", "File Select Info", JOptionPane.INFORMATION_MESSAGE);

        }
    }

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
            java.util.logging.Logger.getLogger(Level300_Semester2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Level300_Semester2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Level300_Semester2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Level300_Semester2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Level300_Semester2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel I_T;
    private javax.swing.JComboBox<String> Semester;
    private javax.swing.JTextField Session;
    private javax.swing.JTextField StudentRegNum;
    private javax.swing.JTextField TOTAL;
    private javax.swing.JTextField TotalUnits;
    private javax.swing.JButton cal_score1;
    private javax.swing.JComboBox<String> feesStatus;
    private javax.swing.JTextField gpInLevel;
    private javax.swing.JComboBox<String> gradeLetter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField lvl;
    private javax.swing.JLabel passport;
    private javax.swing.JTextField studentName;
    private javax.swing.JButton uploadAll1;
    private javax.swing.JButton uploadPhoto;
    // End of variables declaration//GEN-END:variables
byte[] photo = null;
    String filename = null;
}
