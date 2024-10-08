
import java.awt.Image;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import javax.imageio.ImageIO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author GOI
 */
public class CheckResult extends javax.swing.JFrame {

    /**
     * Creates new form CheckResult
     */
    public CheckResult() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        regNumber = new javax.swing.JTextField();
        checkResultSlip = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        sessions = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/imsulogo.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("IMO STATE UNIVERSITY, OWERRI");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("LEVEL & SEMESTER RESULT CHECK");

        regNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regNumberActionPerformed(evt);
            }
        });

        checkResultSlip.setText("CHECK RESULT SLIP");
        checkResultSlip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkResultSlipActionPerformed(evt);
            }
        });

        jLabel5.setText("ENTER REG NUMBER");

        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("eg: 202110848885eg");

        jLabel7.setText("SELECT YEAR AND SEMESTER");

        sessions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT SESSION", "YEAR 1 1ST SEMESTER", "YEAR 1 2ND SEMESTER", "YEAR 2 1ST SEMESTER", "YEAR 2 2ND SEMESTER", "YEAR 3 1ST SEMESTER", "YEAR 3 2ND SEMESTER", "YEAR 4 1ST SEMESTER", "YEAR 4 2ND SEMESTER" }));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/backnewicon.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(regNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(sessions, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(checkResultSlip, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8)))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jLabel3)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(regNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(sessions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(checkResultSlip)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void regNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regNumberActionPerformed

    public void CheckResultSlip() {
        if ("".equals(regNumber.getText())) {
            JOptionPane.showMessageDialog(this, "Field cannot be empty!", "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (regNumber.getText().trim().length() != 14) {
            JOptionPane.showMessageDialog(this, "REG NUMBER MUST BE 14 CHARACTERS", "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if ("SELECT SESSION".equals(sessions.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(this, "PLEASE SELECT SESSION", "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        String selectedSemester = sessions.getSelectedItem().toString();
        String tableName = "";

        switch (selectedSemester) {
            case "YEAR 1 1ST SEMESTER":
                tableName = "level1_semester1";
                break;
            case "YEAR 1 2ND SEMESTER":
                tableName = "level1_semester2";
                break;
            case "YEAR 2 1ST SEMESTER":
                tableName = "level2_semester1";
                break;
            case "YEAR 2 2ND SEMESTER":
                tableName = "level2_semester2";
                break;
            case "YEAR 3 1ST SEMESTER":
                tableName = "level3_semester1";
                break;
            case "YEAR 3 2ND SEMESTER":
                tableName = "level3_semester2";
                break;
            case "YEAR 4 1ST SEMESTER":
                tableName = "level4_semester1";
                break;
            case "YEAR 4 2ND SEMESTER":
                tableName = "level4_semester2";
                break;
        }

        String registrationNumber = regNumber.getText().toUpperCase();
        String url = "jdbc:MySql://db4free.net:3306/imsu_db";
        String username = "imsustaff";
        String password = "imsuadmin";

        // Updated to use tableName instead of selectedSemester
        if ("YEAR 3 2ND SEMESTER".equals(selectedSemester)) {

            try (Connection conn = DriverManager.getConnection(url, username, password);) {
                String fetchByRegNumber = "SELECT * FROM " + tableName + " WHERE reg_number = ?";
                PreparedStatement pstm = conn.prepareStatement(fetchByRegNumber);

                pstm.setString(1, registrationNumber);
                ResultSet rs = pstm.executeQuery();

                if (rs.next()) {
                    String feeStatus = rs.getString("fee");
                    String semester = rs.getString("semester");
                    String level = String.valueOf(rs.getInt("level"));
                    String regNum = rs.getString("reg_number");
                    String name = rs.getString("name_of_student");
                    String course1 = rs.getString("course");
                    String gpa = String.valueOf(rs.getDouble("gpa"));
                    String total = String.valueOf(rs.getInt("total"));
                    String grade = rs.getString("grade");
                    String studentSession = "YEAR 3 2ND SEMESTER";
                    ResultProcess_level3 rp3 = new ResultProcess_level3();
                    Blob blob = rs.getBlob("passport");
                    ImageIcon passportIcon = null;

                    if (blob != null) {
                        try (InputStream inputStream = blob.getBinaryStream()) {
                            BufferedImage fetchedImage = ImageIO.read(inputStream);

                            if (fetchedImage != null) {
                                // Resize the fetched image to fit the label dimensions
                                int labelWidth = rp3.passportLabel.getWidth();
                                int labelHeight = rp3.passportLabel.getHeight();

                                // Resizing the fetched image
                                Image resizedFetchedImage = fetchedImage.getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH);

                                // Set the resized image as the icon for the label
                                passportIcon = new ImageIcon(resizedFetchedImage);
                            } else {
                                JOptionPane.showMessageDialog(this, "Image could not be read", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        } catch (IOException e) {
                            JOptionPane.showMessageDialog(this, "Error reading image: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    // Now you can use each string independently or process them further
                    if ("UNPAID".equals(feeStatus)) {
                        JOptionPane.showMessageDialog(this, "You can't check result until you Pay Your fees", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    rp3.student_fname.setText(name + ".");
                    rp3.reg.setText(regNum);
                    rp3.lvl.setText(level);
                    rp3.Student_Session.setText(studentSession);
                    rp3.course.setText(course1);
                    rp3.studentScore.setText(total);
                    rp3.studentGrade.setText(grade);
                    rp3.gpa.setText(gpa);

                    // Set passport image if available
                    if (passportIcon != null) {
                        rp3.passportLabel.setIcon(passportIcon);
                        rp3.passportLabel.setText("");
                    } else {
                        rp3.passportLabel.setIcon(null); // Optionally set a default image or placeholder
                    }

                    rp3.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Record Not found!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException exceptionMessage) {
                if (exceptionMessage.getSQLState().equals("08S01") || exceptionMessage.getErrorCode() == 0) { // SQLState 08S01 refers to a communication link failure
                    JOptionPane.showMessageDialog(this, "Failed to connect to the server. Please check your internet connection and try again.", "Connection Error", JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, exceptionMessage.getMessage(), "Error Message", JOptionPane.ERROR_MESSAGE);
                }
            }
            return;
        } else {
            String fetchByRegNumber = "SELECT * FROM " + tableName + " WHERE reg_number = ?";
            try (Connection conn = DriverManager.getConnection(url, username, password);) {

                PreparedStatement pstm = conn.prepareStatement(fetchByRegNumber);

                pstm.setString(1, registrationNumber);
                ResultSet rs = pstm.executeQuery();

                if (rs.next()) {
                    String feeStatus = rs.getString("fee");
                    String semester = rs.getString("semester");
                    String level = String.valueOf(rs.getInt("level"));
                    String regNum = rs.getString("reg_number");
                    String name = rs.getString("name_of_student");
                    String course1 = rs.getString("course1");
                    String course2 = rs.getString("course2");
                    String course3 = rs.getString("course3");
                    String course4 = rs.getString("course4");
                    String course5 = rs.getString("course5");
                    String course6 = rs.getString("course6");
                    String course7 = rs.getString("course7");
                    String course8 = rs.getString("course8");
                    String score1 = "";
                    String grade1 = "";
                    String score2 = "";
                    String grade2 = "";
                    String score3 = "";
                    String grade3 = "";
                    String score4 = "";
                    String grade4 = "";
                    String score5 = "";
                    String grade5 = "";
                    String score6 = "";
                    String grade6 = "";
                    String score7 = "";
                    String grade7 = "";
                    String score8 = "";
                    String grade8 = "";
                    String gpa = "";
                    String studentSession = "";
                    switch (selectedSemester) {
                        case "YEAR 1 1ST SEMESTER":
                            score1 = String.valueOf(rs.getInt("csc101_score"));
                            grade1 = rs.getString("csc101_grade");
                            score2 = String.valueOf(rs.getInt("mat101_score"));
                            grade2 = rs.getString("mat101_grade");
                            score3 = String.valueOf(rs.getInt("phy101_score"));
                            grade3 = rs.getString("phy101_grade");
                            score4 = String.valueOf(rs.getInt("sta111_score"));
                            grade4 = rs.getString("sta111_grade");
                            score5 = String.valueOf(rs.getInt("phy105_score"));
                            grade5 = rs.getString("phy105_grade");
                            score6 = String.valueOf(rs.getInt("bio101_score"));
                            grade6 = rs.getString("bio101_grade");
                            score7 = String.valueOf(rs.getInt("gst105_score"));
                            grade7 = rs.getString("gst105_grade");
                            score8 = String.valueOf(rs.getInt("mgt101_score"));
                            grade8 = rs.getString("mgt101_grade");
                            gpa = String.valueOf(rs.getDouble("gpa"));
                            studentSession = "YEAR 1 1ST SEMESTER RESULT SLIP";
                            break;
                        case "YEAR 1 2ND SEMESTER":
                            score1 = String.valueOf(rs.getInt("csc102_score"));
                            grade1 = rs.getString("csc102_grade");
                            score2 = String.valueOf(rs.getInt("mat102_score"));
                            grade2 = rs.getString("mat102_grade");
                            score3 = String.valueOf(rs.getInt("phy102_score"));
                            grade3 = rs.getString("phy102_grade");
                            score4 = String.valueOf(rs.getInt("sta112_score"));
                            grade4 = rs.getString("sta112_grade");
                            score5 = String.valueOf(rs.getInt("phy152_score"));
                            grade5 = rs.getString("phy152_grade");
                            score6 = String.valueOf(rs.getInt("gst108_score"));
                            grade6 = rs.getString("gst108_grade");
                            score7 = String.valueOf(rs.getInt("che102_score"));
                            grade7 = rs.getString("che102_grade");
                            score8 = String.valueOf(rs.getInt("gst104_score"));
                            grade8 = rs.getString("gst104_grade");
                            gpa = String.valueOf(rs.getDouble("gpa"));
                            studentSession = "YEAR 1 2ND SEMESTER RESULT SLIP";
                            break;
                        case "YEAR 2 1ST SEMESTER":
                            score1 = String.valueOf(rs.getInt("csc231_score"));
                            grade1 = rs.getString("csc231_grade");

                            score2 = String.valueOf(rs.getInt("mat211_score"));
                            grade2 = rs.getString("mat211_grade");

                            score3 = String.valueOf(rs.getInt("csc241_score"));
                            grade3 = rs.getString("csc241_grade");

                            score4 = String.valueOf(rs.getInt("acc203_score"));
                            grade4 = rs.getString("acc203_grade");

                            score5 = String.valueOf(rs.getInt("gst223_score"));
                            grade5 = rs.getString("gst223_grade");

                            score6 = String.valueOf(rs.getInt("csc205_score"));
                            grade6 = rs.getString("csc205_grade");

                            score7 = String.valueOf(rs.getInt("sta201_score"));
                            grade7 = rs.getString("sta201_grade");

                            score8 = String.valueOf(rs.getInt("csc207_score"));
                            grade8 = rs.getString("csc207_grade");

                            gpa = String.valueOf(rs.getDouble("gpa"));
                            studentSession = "YEAR 2 1ST SEMESTER RESULT SLIP";

                            break;
                        case "YEAR 2 2ND SEMESTER":
                            score1 = String.valueOf(rs.getInt("csc206_score"));
                            grade1 = rs.getString("csc206_grade");

                            score2 = String.valueOf(rs.getInt("csc202_score"));
                            grade2 = rs.getString("csc202_grade");

                            score3 = String.valueOf(rs.getInt("csc242_score"));
                            grade3 = rs.getString("csc242_grade");

                            score4 = String.valueOf(rs.getInt("csc262_score"));
                            grade4 = rs.getString("csc262_grade");

                            score5 = String.valueOf(rs.getInt("csc232_score"));
                            grade5 = rs.getString("csc232_grade");

                            score6 = String.valueOf(rs.getInt("mat232_score"));
                            grade6 = rs.getString("mat232_grade");

                            score7 = String.valueOf(rs.getInt("eco202_score"));
                            grade7 = rs.getString("eco202_grade");

                            score8 = String.valueOf(rs.getInt("csc204_score"));
                            grade8 = rs.getString("csc204_grade");

                            gpa = String.valueOf(rs.getDouble("gpa"));
                            studentSession = "YEAR 2 2ND SEMESTER RESULT SLIP";

                            break;
                        case "YEAR 3 1ST SEMESTER":
                            score1 = String.valueOf(rs.getInt("csc361_score"));
                            grade1 = rs.getString("csc361_grade");

                            score2 = String.valueOf(rs.getInt("csc341_score"));
                            grade2 = rs.getString("csc341_grade");

                            score3 = String.valueOf(rs.getInt("csc351_score"));
                            grade3 = rs.getString("csc351_grade");

                            score4 = String.valueOf(rs.getInt("csc367_score"));
                            grade4 = rs.getString("csc367_grade");

                            score5 = String.valueOf(rs.getInt("csc371_score"));
                            grade5 = rs.getString("csc371_grade");

                            score6 = String.valueOf(rs.getInt("csc381_score"));
                            grade6 = rs.getString("csc381_grade");

                            score7 = String.valueOf(rs.getInt("csc315_score"));
                            grade7 = rs.getString("csc315_grade");

                            score8 = String.valueOf(rs.getInt("csc323_score"));
                            grade8 = rs.getString("csc323_grade");

                            gpa = String.valueOf(rs.getDouble("gpa"));
                            studentSession = "YEAR 3 1ST SEMESTER RESULT SLIP";
                            break;
                        case "YEAR 4 1ST SEMESTER":
                            score1 = String.valueOf(rs.getInt("csc401_score"));
                            grade1 = rs.getString("csc401_grade");

                            score2 = String.valueOf(rs.getInt("csc421_score"));
                            grade2 = rs.getString("csc421_grade");

                            score3 = String.valueOf(rs.getInt("csc429_score"));
                            grade3 = rs.getString("csc429_grade");

                            score4 = String.valueOf(rs.getInt("csc461_score"));
                            grade4 = rs.getString("csc461_grade");

                            score5 = String.valueOf(rs.getInt("csc467_score"));
                            grade5 = rs.getString("csc467_grade");

                            score6 = String.valueOf(rs.getInt("csc415_score"));
                            grade6 = rs.getString("csc415_grade");

                            score7 = String.valueOf(rs.getInt("csc473_score"));
                            grade7 = rs.getString("csc473_grade");

                            score8 = String.valueOf(rs.getInt("csc411_score"));
                            grade8 = rs.getString("csc411_grade");

                            gpa = String.valueOf(rs.getDouble("gpa"));
                            studentSession = "YEAR 4 1ST SEMESTER RESULT SLIP";

                            break;
                        case "YEAR 4 2ND SEMESTER":
                            score1 = String.valueOf(rs.getInt("csc412_score"));
                            grade1 = rs.getString("csc412_grade");

                            score2 = String.valueOf(rs.getInt("csc424_score"));
                            grade2 = rs.getString("csc424_grade");

                            score3 = String.valueOf(rs.getInt("csc442_score"));
                            grade3 = rs.getString("csc442_grade");

                            score4 = String.valueOf(rs.getInt("csc426_score"));
                            grade4 = rs.getString("csc426_grade");

                            score5 = String.valueOf(rs.getInt("csc446_score"));
                            grade5 = rs.getString("csc446_grade");

                            score6 = String.valueOf(rs.getInt("csc482_score"));
                            grade6 = rs.getString("csc482_grade");

                            score7 = String.valueOf(rs.getInt("csc428_score"));
                            grade7 = rs.getString("csc428_grade");

                            score8 = String.valueOf(rs.getInt("csc464_score"));
                            grade8 = rs.getString("csc464_grade");

                            gpa = String.valueOf(rs.getDouble("gpa"));
                            studentSession = "YEAR 4 2ND SEMESTER RESULT SLIP";
                            break;
                    }
                    ResultProcessScript rp = new ResultProcessScript();
                    // Retrieve passport image
                    Blob blob = rs.getBlob("passport");
                    ImageIcon passportIcon = null;

                    if (blob != null) {
                        try (InputStream inputStream = blob.getBinaryStream()) {
                            BufferedImage fetchedImage = ImageIO.read(inputStream);

                            if (fetchedImage != null) {
                                // Resize the fetched image to fit the label dimensions
                                int labelWidth = rp.passportLabel.getWidth();
                                int labelHeight = rp.passportLabel.getHeight();

                                // Resizing the fetched image
                                Image resizedFetchedImage = fetchedImage.getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH);

                                // Set the resized image as the icon for the label
                                passportIcon = new ImageIcon(resizedFetchedImage);
                            } else {
                                JOptionPane.showMessageDialog(this, "Image could not be read", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        } catch (IOException e) {
                            JOptionPane.showMessageDialog(this, "Error reading image: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }

                    // Now you can use each string independently or process them further
                    if ("UNPAID".equals(feeStatus)) {
                        JOptionPane.showMessageDialog(this, "You can't check result until you Pay Your fees", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    //ResultProcessScript rp = new ResultProcessScript();
                    rp.student_fname.setText(name + ".");
                    rp.reg.setText(regNum);
                    rp.lvl.setText(level);
                    rp.Student_Session.setText(studentSession);
                    rp.course1.setText(course1);
                    rp.course2.setText(course2);
                    rp.course3.setText(course3);
                    rp.course4.setText(course4);
                    rp.course5.setText(course5);
                    rp.course6.setText(course6);
                    rp.course7.setText(course7);
                    rp.course8.setText(course8);

                    // Set course scores
                    rp.score1.setText(score1);
                    rp.score2.setText(score2);
                    rp.score3.setText(score3);
                    rp.score4.setText(score4);
                    rp.score5.setText(score5);
                    rp.score6.setText(score6);
                    rp.score7.setText(score7);
                    rp.score8.setText(score8);

                    // Set course grades
                    rp.grade1.setText(grade1);
                    rp.grade2.setText(grade2);
                    rp.grade3.setText(grade3);
                    rp.grade4.setText(grade4);
                    rp.grade5.setText(grade5);
                    rp.grade6.setText(grade6);
                    rp.grade7.setText(grade7);
                    rp.grade8.setText(grade8);

                    // Set GPA
                    rp.gpa.setText(gpa);

                    // Set passport image if available
                    if (passportIcon != null) {
                        rp.passportLabel.setIcon(passportIcon);
                        rp.passportLabel.setText("");
                    } else {
                        rp.passportLabel.setIcon(null); // Optionally set a default image or placeholder
                    }

                    rp.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Record Not found!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException exceptionMessage) {
                if (exceptionMessage.getSQLState().equals("08S01") || exceptionMessage.getErrorCode() == 0) { // SQLState 08S01 refers to a communication link failure
                    JOptionPane.showMessageDialog(this, "Failed to connect to the database. Please check your internet connection and try again.", "Connection Error", JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, exceptionMessage.getMessage(), "Error Message", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
        /**
         Here is a brief explanation of the CheckResultSlip method
         * Input Validation:

Ensures the registration number field is not empty and is exactly 14 characters long.
Checks if a session has been selected from the dropdown.
Semester Mapping:

Maps the selected semester to a corresponding database table.
Database Query:

Connects to the database and queries for the student's results based on the registration number and selected semester.
Result Processing:

Retrieves the student’s scores, grades, and GPA from the result set.
Retrieves and processes the student's passport image if available.
Fee Status Check:

Displays an error if the student's fees are unpaid.
Display Results:

Fills in the result data (scores, grades, GPA) and passport image into the result processing interface.
Shows the result processing window and closes the current one.
Error Handling:

Catches and displays appropriate error messages for issues such as failed database connections or unreadable images.
         
         */
    private void checkResultSlipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkResultSlipActionPerformed
        CheckResultSlip();
        // TODO add your handling code here:
    }//GEN-LAST:event_checkResultSlipActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        AdminAndStudentFrame page = new AdminAndStudentFrame();
        page.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseClicked

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
            java.util.logging.Logger.getLogger(CheckResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckResult().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkResultSlip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField regNumber;
    private javax.swing.JComboBox<String> sessions;
    // End of variables declaration//GEN-END:variables
}
