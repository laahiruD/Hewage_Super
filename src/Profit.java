
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.CMYKColor;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lahiru
 */
public class Profit extends javax.swing.JFrame {

    /**
     * Creates new form Profit
     */
    public Profit() {
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

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1226, 568));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Profit and loses"));
        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Categorey :");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(60, 60, 110, 31);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Income :");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(60, 210, 110, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Cost :");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(60, 260, 80, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Profit/loss:");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(60, 310, 60, 20);
        jPanel3.add(jLabel9);
        jLabel9.setBounds(30, 30, 100, 30);
        jPanel3.add(jLabel10);
        jLabel10.setBounds(120, 30, 70, 30);

        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField2);
        jTextField2.setBounds(150, 210, 170, 30);

        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });
        jPanel3.add(jTextField3);
        jTextField3.setBounds(150, 260, 170, 30);

        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });
        jPanel3.add(jTextField4);
        jTextField4.setBounds(150, 310, 170, 30);

        jButton2.setText(">>");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(370, 180, 49, 50);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category", "From", "To", "Income", "Cost", "Profit/Loss"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(460, 50, 550, 270);

        jButton3.setText("PRINT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(760, 360, 90, 40);

        jPanel3.add(jComboBox1);
        jComboBox1.setBounds(150, 60, 170, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("From :");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(60, 110, 60, 40);
        jPanel3.add(jDateChooser1);
        jDateChooser1.setBounds(150, 110, 170, 30);
        jPanel3.add(jDateChooser2);
        jDateChooser2.setBounds(150, 160, 170, 30);

        jLabel8.setText("To :");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(60, 160, 60, 30);

        jButton4.setText("CLEAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);
        jButton4.setBounds(650, 360, 90, 40);

        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField1);
        jTextField1.setBounds(150, 370, 170, 30);

        jLabel12.setText("Total :");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(60, 370, 80, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(170, 90, 1040, 440);

        jPanel1.setBackground(new java.awt.Color(33, 97, 97));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("HEWAGE SUPER");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 20, 320, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1120, 20, 80, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1230, 80);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(null);

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));
        jPanel7.setLayout(null);

        jButton12.setText("Income");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton12);
        jButton12.setBounds(10, 13, 130, 30);

        jPanel2.add(jPanel7);
        jPanel7.setBounds(0, 70, 160, 60);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Accountant");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(20, 20, 150, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 70, 160, 850);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        try {

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String dteto = sdf.format(jDateChooser2.getDate());
            String dtefrom = sdf.format(jDateChooser1.getDate());

            String a=String.valueOf(jComboBox1.getSelectedItem());
            PreparedStatement ps= null;
            ResultSet rs= null;
            String sql="SELECT SUM(Quantity) FROM bills WHERE Item=? AND bills.Date BETWEEN '" + dtefrom + "' AND '" + dteto + "'";
            ps=DBConnection.con().prepareStatement(sql);
            ps.setString(1,a);
            rs=ps.executeQuery();
            int qnt=0;
            if(rs.next()){
                qnt=Integer.valueOf(rs.getString("SUM(Quantity)"));
            }
            
            
            String sql2="SELECT SUM(Subtotal) FROM bills WHERE Item=? AND bills.Date BETWEEN '" + dtefrom + "' AND '" + dteto + "'";
            ps=DBConnection.con().prepareStatement(sql2);
            ps.setString(1,a);
            rs=ps.executeQuery();
            double rev=0.00;
            if(rs.next()){
               rev=Double.valueOf(rs.getString("SUM(Subtotal)"));
            }
            
            Double income=rev;
            
            
              jTextField2.setText(String.valueOf(income));
            
        } catch (SQLException ex) {
            Logger.getLogger(Accountant.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
            
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String dteto = sdf.format(jDateChooser2.getDate());
            String dtefrom = sdf.format(jDateChooser1.getDate());

            String a=String.valueOf(jComboBox1.getSelectedItem());
            PreparedStatement ps= null;
            ResultSet rs= null;
            
            String sql="SELECT SUM(Price) FROM stock WHERE ItemName=? AND stock.Date BETWEEN '" + dtefrom + "' AND '" + dteto + "'";
            ps=DBConnection.con().prepareStatement(sql);
            ps.setString(1,a);
            rs=ps.executeQuery();
            while(rs.next()){
                jTextField3.setText(rs.getString("SUM(Price)"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Profit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
        double a=Double.valueOf(jTextField2.getText());
        double b=Double.valueOf(jTextField3.getText());
        double profit=a-b;
        jTextField4.setText(String.valueOf(profit));
    }//GEN-LAST:event_jTextField4MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel vw = (DefaultTableModel) jTable1.getModel();
        SimpleDateFormat sdf1= new SimpleDateFormat("yyyy-MM-dd");
        String dteto1=sdf1.format(jDateChooser2.getDate());
        String dtefrom1=sdf1.format(jDateChooser1.getDate());
        vw.addRow(new Object[]{String.valueOf(jComboBox1.getSelectedItem()),dtefrom1,dteto1,jTextField2.getText(),jTextField3.getText(),jTextField4.getText()});
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String path = "C:\\Users\\lahiru\\Desktop\\Reports\\";
        DefaultTableModel vw3 = (DefaultTableModel) jTable1.getModel();

        if (vw3.getRowCount() > 0) {

            try {

                String adf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
                SimpleDateFormat sdf1= new SimpleDateFormat("yyyy-MM-dd");
                String dteto1=sdf1.format(jDateChooser2.getDate());
                String dtefrom1=sdf1.format(jDateChooser1.getDate());
                Document document = new Document(PageSize.A4, 50, 50, 50, 50);
                String dte = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());

                PdfWriter write = null;
                try {
                    PdfWriter write1 = PdfWriter.getInstance(document, new FileOutputStream(path + "Profitorloss Report"+dte+".pdf"));
                    write1.setPageEvent(new MyPdfPageEventHelper("WhatsApp Image 2020-02-21 at 23.23.12.jpeg"));
                } catch (DocumentException ex) {
                    Logger.getLogger(Reports.class.getName()).log(Level.SEVERE, null, ex);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Accountant.class.getName()).log(Level.SEVERE, null, ex);
                }

                document.open();
                document.add(new Paragraph("\n"));
                document.add(new Paragraph("\n"));
                document.add(new Paragraph("\n"));
                document.add(new Paragraph("\n"));
                document.add(new Paragraph("\n"));
                document.add(new Paragraph("\n"));

                document.add(new Paragraph("Date :"+dte ,
                    FontFactory.getFont(FontFactory.TIMES_ROMAN,
                        15, Font.BOLD, new CMYKColor(75, 68, 67, 90))));
                document.add(new Paragraph("Profit/Loss Report  ",
                    FontFactory.getFont(FontFactory.TIMES_ROMAN,
                        15, Font.BOLD, new CMYKColor(75, 68, 67, 90))));
                document.add(new Paragraph("From : " + dtefrom1,
                    FontFactory.getFont(FontFactory.TIMES_ROMAN,
                        13, Font.NORMAL, new CMYKColor(75, 68, 67, 90))));
                document.add(new Paragraph("TO : " + dteto1,
                    FontFactory.getFont(FontFactory.TIMES_ROMAN,
                        13, Font.NORMAL, new CMYKColor(75, 68, 67, 90))));

                document.add(new Paragraph("\n"));
                document.add(new Paragraph("\n"));
                document.add(new Paragraph("\n"));
                document.add(new Paragraph("\n"));

                    Paragraph ph1 = new Paragraph("Category",
                        FontFactory.getFont(FontFactory.TIMES_ROMAN,
                            14, Font.NORMAL, new CMYKColor(75, 68, 67, 90)));
                    Paragraph ph2 = new Paragraph("From",
                       FontFactory.getFont(FontFactory.TIMES_ROMAN,
                            14, Font.NORMAL, new CMYKColor(75, 68, 67, 90)));
                    Paragraph ph3 = new Paragraph("To",
                        FontFactory.getFont(FontFactory.TIMES_ROMAN,
                            14, Font.NORMAL, new CMYKColor(75, 68, 67, 90)));
                    Paragraph ph4 = new Paragraph("Income",
                        FontFactory.getFont(FontFactory.TIMES_ROMAN,
                            14, Font.NORMAL, new CMYKColor(75, 68, 67, 90)));
                    Paragraph ph5 = new Paragraph("Cost",
                        FontFactory.getFont(FontFactory.TIMES_ROMAN,
                            14, Font.NORMAL, new CMYKColor(75, 68, 67, 90)));
                    Paragraph ph6 = new Paragraph("Profit/Loss",
                        FontFactory.getFont(FontFactory.TIMES_ROMAN,
                            13, Font.NORMAL, new CMYKColor(75, 68, 67, 90)));

        PdfPTable tb1 = new PdfPTable(6);

        tb1.addCell(ph1);
        tb1.addCell(ph2);
        tb1.addCell(ph3);
        tb1.addCell(ph4);
        tb1.addCell(ph5);
        tb1.addCell(ph6);

        for (int i = 0; i < vw3.getRowCount(); i++) {

            String tCategory = vw3.getValueAt(i, 0).toString();
            String tFrom = vw3.getValueAt(i, 1).toString();
            String tTo= vw3.getValueAt(i, 2).toString();
            String tIncome= vw3.getValueAt(i, 3).toString();
            String tCost = vw3.getValueAt(i, 4).toString();
            String tProfit_Loss = vw3.getValueAt(i, 5).toString();

            tb1.addCell(tCategory);
            tb1.addCell(tFrom);
            tb1.addCell(tTo);
            tb1.addCell(tIncome);
            tb1.addCell(tCost);
            tb1.addCell(tProfit_Loss);
        }

        document.add(new Paragraph("\n"));
        document.add(tb1);
        document.add(new Paragraph("\n"));

        document.add(new Paragraph("              Total Profit/Loss : " + jTextField1.getText(),
            FontFactory.getFont(FontFactory.TIMES_ROMAN,
                14, Font.BOLD, new CMYKColor(75, 68, 67, 90))));

    document.add(new Paragraph("\n"));
    document.add(new Paragraph("\n"));
    document.add(new Paragraph("\n"));
    document.add(new Paragraph("\n"));
    document.add(new Paragraph("\n"));
    document.add(new Paragraph("\n"));
    document.add(new Paragraph("\n"));
    document.add(new Paragraph("\n"));
    document.add(new Paragraph("\n"));
    document.add(new Paragraph("                 ----------------------                                                                     --------------------\n"));
    document.add(new Paragraph("                      Signature                                                                                   Date\n"));
    JOptionPane.showMessageDialog(this, "printed ");
    document.close();
    } catch (DocumentException ex) {
        Logger.getLogger(Accountant.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTextField4.setText("");
        jTextField3.setText("");
        jTextField2.setText("");
        jComboBox1.setSelectedItem("");
        jTextField1.setText("");

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int result = JOptionPane.showConfirmDialog(this, "Are You Sure?");
        if (result == 0) {
            this.setVisible(false);
            Login l = new Login();
            l.setVisible(true);

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        
            Accountant c= new Accountant();
            c.setVisible(true);
            this.setVisible(false);
        
    }//GEN-LAST:event_jButton12ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
         try {
            String dte = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
            jLabel9.setText(dte);
            String tm = new SimpleDateFormat("hh:mm").format(Calendar.getInstance().getTime());
            jLabel10.setText(tm);
            
            PreparedStatement ps= null;
            ResultSet rs= null;
            String query="SELECT DISTINCT(Item) FROM bills ";
            ps=DBConnection.con().prepareStatement(query);
            rs=ps.executeQuery();
            while(rs.next()){
                jComboBox1.addItem(rs.getString("Item"));
            }    
        } catch (SQLException ex) {
            Logger.getLogger(Accountant.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        double total = 0.0;
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            total = total + Double.valueOf(jTable1.getModel().getValueAt(i,5).toString());
        }
        jTextField1.setText(String.valueOf(total));
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(Profit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}