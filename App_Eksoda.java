/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class App_Eksoda extends javax.swing.JFrame {

    /**
     * Creates new form App_Eksoda
     */
    public App_Eksoda() {
        initComponents();
    }

    public App_Eksoda(String num, String sum11, String sum22, String sum33, String sum44, String sum55) {
        initComponents();

        serial_num.setText(num);

        sum1.setText(sum11);
        sum2.setText(sum22);
        sum3.setText(sum33);
        sum4.setText(sum44);
        sum5.setText(sum55);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    Connection conn1;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        serial_num = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sum1 = new javax.swing.JTextField();
        sum2 = new javax.swing.JTextField();
        sum3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        sum4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        sum5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        app_num = new javax.swing.JTextField();
        upologismos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        apotelesma = new javax.swing.JTextArea();
        ektipwsh = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu_addApparment = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        jLabel3.setText("Συνολικά Έξοδα Κοινοχρήστων");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(551, 450));

        serial_num.setEnabled(false);

        jLabel2.setText("Κωδικός Πολ.");

        jLabel1.setText("Συνολικά Έξοδα Κοινοχρήστων");

        jLabel4.setText("Συνολικά Έξοδα Ανελκυστήρα");

        jLabel5.setText("Συνολικά Έξοδα Θέρμανσης");

        sum1.setEnabled(false);

        sum2.setEnabled(false);

        sum3.setEnabled(false);

        jLabel6.setText("Έξοδα Συνιδιοκτησίας");

        sum4.setEnabled(false);

        jLabel7.setText("Συνολικά Έξοδα");

        sum5.setEnabled(false);

        jLabel8.setText("Δώσε κωδικό διαμερίσματος");

        app_num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                app_numActionPerformed(evt);
            }
        });

        upologismos.setText("Υπολογισμός");
        upologismos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upologismosActionPerformed(evt);
            }
        });

        apotelesma.setColumns(20);
        apotelesma.setRows(5);
        apotelesma.setEnabled(false);
        jScrollPane1.setViewportView(apotelesma);

        ektipwsh.setText("Εκτύπωση");
        ektipwsh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ektipwshActionPerformed(evt);
            }
        });

        Menu_addApparment.setText("Επιλογές");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Αρχική");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        Menu_addApparment.add(jMenuItem2);

        jMenuBar1.add(Menu_addApparment);

        jMenu1.setText("Προσθήκη");

        jMenuItem1.setText("Πολυκατοικίας");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Αναζήτηση");

        jMenuItem3.setText("Πολυκατοικιας");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Διαχειριστή");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ektipwsh))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(90, 90, 90)
                                .addComponent(sum5, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(sum1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sum3, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                                    .addComponent(sum2)
                                    .addComponent(sum4))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(serial_num, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(app_num, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(upologismos, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serial_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(sum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(sum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8)
                    .addComponent(app_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(upologismos)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(sum3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(sum4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(sum5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                        .addComponent(ektipwsh))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void app_numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_app_numActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_app_numActionPerformed

    private void upologismosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upologismosActionPerformed
        String SN = serial_num.getText();
        String AN = app_num.getText();
        //int IAN = Integer.parseInt(app_num.getText());
        //int ISN = Integer.parseInt(app_num.getText());
        String QR1 = "SELECT * FROM Eksoda WHERE serial_num like '" + SN + "'";
        String QR2 = "SELECT * FROM AppSpecifications WHERE Serial_NUM like '" + SN + "' AND Appartment_Number like '" + AN + "'";
        String QR3 = "SELECT Sum_square_meters FROM Apparments WHERE Appartment_Code like '" + SN + "'";

        PreparedStatement p1, p2, p3;

        try {
            String iso;
            String ele;
            String Ionoma, Iepitheto;
            double TET;

            double upologismos1;
            double upologismos2;
            double upologismos3;
            double upologismos4;
            double xiliosta;
            double xiliosta_x_1;
            double s;

            String N = "NAI";
            String O = "OXI";

            double sumk = Double.parseDouble(sum1.getText());
            double suma = Double.parseDouble(sum2.getText());
            double sum8 = Double.parseDouble(sum3.getText());
            double sums = Double.parseDouble(sum4.getText());
            double sum = Double.parseDouble(sum5.getText());

            String url = "jdbc:sqlite:C:/Users/public.user/Desktop/loukas ergasia/Προγραμμα Διαχειρησης Κοινοχρηστων/Database1.db";
            conn1 = (Connection) DriverManager.getConnection(url);
            //p1 = conn1.prepareStatement(QR1);
            //ResultSet res1 = p1.executeQuery();

            p2 = conn1.prepareStatement(QR2);

            ResultSet res2 = p2.executeQuery();

            if (res2.next()) {
                double STET = 0.00;
                double tet_x_1;

                String tet = res2.getString("Tetragwnika");
                TET = Integer.parseInt(tet);
                ele = res2.getString("elevator");
                iso = res2.getString("isogeio");
                Ionoma = res2.getString("IOnoma");
                Iepitheto = res2.getString("IEpitheto");

                p3 = conn1.prepareStatement(QR3);
                ResultSet res3 = p3.executeQuery();
                if (res3.next()) {
                    String stet = res3.getString(1);
                    STET = Double.parseDouble(stet);
                }

                xiliosta = TET / STET;

                if (Objects.equals("NAI", iso)) {

                    upologismos1 = xiliosta * sumk;
                    upologismos1 = Math.round(upologismos1 * 100.0) / 100.0;

                    upologismos2 = 0;
                    upologismos2 = Math.round(upologismos2 * 100.0) / 100.0;

                    upologismos3 = xiliosta * sum8;
                    upologismos3 = Math.round(upologismos3 * 100.0) / 100.0;

                    upologismos4 = sums * xiliosta;
                    upologismos4 = Math.round(upologismos4 * 100.0) / 100.0;

                    s = upologismos1 + upologismos2 + upologismos3 + upologismos4;
                    s = Math.round(s * 100.0) / 100.0;

                    String s_upologismos1 = String.valueOf(upologismos1);
                    String s_upologismos2 = String.valueOf(upologismos2);
                    String s_upologismos3 = String.valueOf(upologismos3);
                    String s_upologismos4 = String.valueOf(upologismos4);
                    String s_s = String.valueOf(s);
                    String aptlsm = "Ο κύριος/κυρία, " + Ionoma + " " + Iepitheto + " ιδιοκτήτης/ενοικιαστής του " + AN + "ου διαμερίσματος\nπληρώνει: \n\nTα εξοδα για τα κοινοχρηστα ειναι: " + s_upologismos1 + "€\nΤα εξοδα για τον ανελκυστηρα ειναι: " + s_upologismos2 + "€\nΤα εξοδα για την θερμανση ειναι: " + s_upologismos3 + "€\nΕξοδα συνιδιοκτησίας: " + s_upologismos4 + "€\nΣύνολο: " + s_s + "€";
                    apotelesma.setText(aptlsm);

                }
                if (Objects.equals("OXI", iso)) {

                    tet_x_1 = STET - TET;
                    xiliosta_x_1 = TET / tet_x_1;
                    upologismos1 = xiliosta * sumk;
                    upologismos1 = Math.round(upologismos1 * 100.0) / 100.0;

                    upologismos2 = xiliosta_x_1 * suma;
                    upologismos2 = Math.round(upologismos2 * 100.0) / 100.0;

                    upologismos3 = xiliosta * sum8;
                    upologismos3 = Math.round(upologismos3 * 100.0) / 100.0;

                    upologismos4 = sums * xiliosta;
                    upologismos4 = Math.round(upologismos4 * 100.0) / 100.0;

                    s = upologismos1 + upologismos2 + upologismos3 + upologismos4;
                    s = Math.round(s * 100.0) / 100.0;

                    String s_upologismos1 = String.valueOf(upologismos1);
                    String s_upologismos2 = String.valueOf(upologismos2);
                    String s_upologismos3 = String.valueOf(upologismos3);
                    String s_upologismos4 = String.valueOf(upologismos4);
                    String s_s = String.valueOf(s);
                    String aptlsm = "Ο κύριος/κυρία " + Ionoma + " " + Iepitheto + " ιδιοκτήτης/ενοικιαστής του " + AN + "ου διαμερίσματος\nπληρώνει: \n\nTα εξοδα για τα κοινοχρηστα ειναι: " + s_upologismos1 + "€\nΤα εξοδα για τον ανελκυστηρα ειναι: " + s_upologismos2 + "€\nΤα εξοδα για την θερμανση ειναι: " + s_upologismos3 + "€\nΕξοδα συνιδιοκτησίας: " + s_upologismos4 + "€\nΣύνολο: " + s_s + "€";
                    apotelesma.setText(aptlsm);

                }

            }
            conn1.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }


    }//GEN-LAST:event_upologismosActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        MainScreen frame2 = new MainScreen();
        frame2.setVisible(true);
        App_Eksoda.this.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Add_Apparment frame2 = new Add_Apparment();
        frame2.setVisible(true);
        App_Eksoda.this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        SearchScreen frame3 = new SearchScreen();
        frame3.setVisible(true);
        App_Eksoda.this.setVisible(false);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void ektipwshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ektipwshActionPerformed
        String ektupwsh = apotelesma.getText();
        String o_arxeiou = JOptionPane.showInputDialog("Όνομα αρχείου: ");

        try {
            File File = new File("C:/Users/public.user/Desktop" + o_arxeiou);

            if (!File.exists()) {
                File.createNewFile();
            }
            FileWriter F = new FileWriter(File.getAbsoluteFile());
            BufferedWriter B = new BufferedWriter(F);

            B.write(ektupwsh);
            B.close();

            JOptionPane.showInputDialog(null, "Αποθηκεύτηκε στην Επιφάνεια Εργασίας");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_ektipwshActionPerformed

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
            java.util.logging.Logger.getLogger(App_Eksoda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App_Eksoda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App_Eksoda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App_Eksoda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App_Eksoda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Menu_addApparment;
    private javax.swing.JTextArea apotelesma;
    private javax.swing.JTextField app_num;
    private javax.swing.JButton ektipwsh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField serial_num;
    private javax.swing.JTextField sum1;
    private javax.swing.JTextField sum2;
    private javax.swing.JTextField sum3;
    private javax.swing.JTextField sum4;
    private javax.swing.JTextField sum5;
    private javax.swing.JButton upologismos;
    // End of variables declaration//GEN-END:variables
}
