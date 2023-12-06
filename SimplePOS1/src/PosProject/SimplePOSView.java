package PosProject;

import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SimplePOSView extends javax.swing.JFrame {
    static DBConnection db;
    public SimplePOSView() {
        initComponents();
        db = new DBConnection();
        
        jTable2.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTable2.getColumnModel().getColumn(1).setPreferredWidth(200);
    }
    
    public void buyedProducts() {
        int numOfRow = jTable2.getRowCount();
        try {
            for(int i = 0; i < numOfRow; i++) {
                String product_name = jTable2.getValueAt(i, 1).toString();
                int product_qty = Integer.parseInt(jTable2.getValueAt(i, 2).toString());
                double product_price = Double.parseDouble(jTable2.getValueAt(i, 3).toString());
                
                db.ps = db.con.prepareStatement("INSERT INTO buyed_products (Product_Name, Quantity, price) VALUES (?, ?, ?)");
                db.ps.setString(1, product_name);
                db.ps.setString(2, Integer.toString(product_qty));
                db.ps.setString(3, Double.toString(product_price));
                
                int check = db.ps.executeUpdate();
                if(check == 1) {
                    System.out.println("OK");
                }else {
                    System.out.println("Failed");
                }
            }
        }catch(Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
    
    void delete() {
        try {
            db.ps = db.con.prepareStatement("DELETE FROM buyed_products");
            int check = db.ps.executeUpdate();
            
            if(check ==1) {
                System.out.println("OK");
            }
            else {
                System.out.println("Fail");
            }
        }catch(Exception e) {
            System.out.println("ERROR : " + e.getMessage());
        }
    }
    public void addtable(int id, String name, int qty, double price){
        DefaultTableModel dt = (DefaultTableModel) jTable2.getModel();
        
        
         DecimalFormat df = new DecimalFormat("00.00");
         double totPrice = price * Double.valueOf(qty);
         
         String TotalPrice = df.format(totPrice);
        
         for (int row = 0; row < jTable2.getRowCount(); row++){
              if (name == jTable2.getValueAt(row, 1)){
                  dt.removeRow(jTable2.convertRowIndexToModel(row));
              }
         }
         
        
        Vector v = new Vector();
        
        v.add(id);
        v.add(name);
        v.add(qty);
        v.add(TotalPrice);
        
        dt.addRow(v);    
    }
   
   public void cal(){
       int numOfRow = jTable2.getRowCount();
       double tot = 0.0;
              
           for (int i = 0; i < numOfRow; i++){
               double value = Double.valueOf(jTable2.getValueAt(i, 3).toString());
//               double qty = Double.valueOf(jTable2.getValueAt(i, 2).toString());
               tot = tot + value;
              
           }
           
        DecimalFormat df = new DecimalFormat("00.00");
        total.setText(String.valueOf(df.format(tot)));
           
   }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        q2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        q3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        q6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        q5 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        q4 = new javax.swing.JLabel();
        q7 = new javax.swing.JLabel();
        q8 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        q9 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        p = new javax.swing.JTextArea();
        jButton13 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bal = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        pay = new javax.swing.JTextField();
        bayad = new javax.swing.JButton();
        print = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        q1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 127, 115));

        jButton2.setText("jButton1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 127, 115));

        q2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        q2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q2.setText("0");
        getContentPane().add(q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 127, 32));

        jButton3.setText("jButton1");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 127, 115));

        q3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        q3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q3.setText("0");
        getContentPane().add(q3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 127, 32));

        jButton4.setText("jButton1");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 127, 115));

        q6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        q6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q6.setText("0");
        getContentPane().add(q6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 127, 32));

        jButton5.setText("jButton1");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 127, 115));

        q5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        q5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q5.setText("0");
        getContentPane().add(q5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 127, 32));

        jButton6.setText("jButton1");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 127, 115));

        q4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        q4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q4.setText("0");
        getContentPane().add(q4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 127, 32));

        q7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        q7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q7.setText("0");
        getContentPane().add(q7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 127, 32));

        q8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        q8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q8.setText("0");
        getContentPane().add(q8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 127, 32));

        jButton8.setText("jButton1");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 127, 115));

        q9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        q9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q9.setText("0");
        getContentPane().add(q9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 127, 32));

        jButton9.setText("jButton1");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 127, 115));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Qty", "Price"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 307, 317));

        p.setEditable(false);
        p.setColumns(20);
        p.setRows(5);
        jScrollPane1.setViewportView(p);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 6, 285, 317));

        jButton13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton13.setText("Delete");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 335, 100, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 16, 610, 380));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Total:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 8, 61, 32));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Cash:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 46, 51, 32));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Balance:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 78, -1, 32));

        bal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bal.setText("00");
        jPanel2.add(bal, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 78, 128, 32));

        total.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        total.setText("00");
        jPanel2.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 8, 128, 32));
        jPanel2.add(pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 46, 128, 30));

        bayad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bayad.setText("Pay");
        bayad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bayadActionPerformed(evt);
            }
        });
        jPanel2.add(bayad, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 100, 94));

        print.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel2.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 100, 94));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, 610, 120));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setText("jButton1");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 127, 115));

        q1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        q1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q1.setText("0");
        jPanel3.add(q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 127, 32));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 450, 510));

        setSize(new java.awt.Dimension(1197, 614));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(q1.getText());
        ++i;
        q1.setText(String.valueOf(i));
        addtable(1,  "fishball ",i, 2.99);
        cal();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(q2.getText());
        ++i;
        q2.setText(String.valueOf(i));
        addtable(2,  "fishball ni eric",i, 3.99);
        cal();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(q3.getText());
        ++i;
        q3.setText(String.valueOf(i));
        addtable(3,  "fishball Spicy",i, 4.99);
        cal();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(q4.getText());
        ++i;
        q4.setText(String.valueOf(i));
        addtable(4,  "fishball Sweet",i, 5.99);
        cal();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(q5.getText());
        ++i;
        q5.setText(String.valueOf(i));
        addtable(5,  "fishball crunchy",i, 6.99);
        cal();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(q6.getText());
        ++i;
        q6.setText(String.valueOf(i));
        addtable(6,  "fishball mixed",i, 7.99);
        cal();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(q8.getText());
        ++i;
        q8.setText(String.valueOf(i));
        addtable(8,  "fishball alalaon",i, 2.99);
        cal();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        
        int i = Integer.valueOf(q9.getText());
        ++i;
        q9.setText(String.valueOf(i));
        addtable(9,  "fishball Suka",i, 9.99);
        cal();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        //delete item from the table
        DefaultTableModel dt = (DefaultTableModel) jTable2.getModel();
        String r = dt.getValueAt(jTable2.getSelectedRow(),0).toString();
        
        

        //to remove product
        int rw = jTable2.getSelectedRow();
        dt.removeRow(rw); 
        
        //to remove qty
        
        switch(r){
            case"1":
                q1.setText("0");
                cal();
                break;
                
                case"2":
                q2.setText("0");
                cal();
                break;
                
                case"3":
                q3.setText("0");
                cal();
                break;
                
                case"4":
                q4.setText("0");
                cal();
                break;
                
                case"5":
                q5.setText("0");
                cal();
                break;
                
                case"6":
                q6.setText("0");
                cal();
                break;
                
                case"7":
                q7.setText("0");
                cal();
                break;
                
                case"8":
                q8.setText("0");
                cal();
                break;
                
                case"9":
                q9.setText("0");
                cal();
                break;
                default:
                    System.out.println("Over");
                 break;
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void bayadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bayadActionPerformed
        // pay btn
        try {
            double tot = Double.valueOf(total.getText());
            double cash = Double.valueOf(pay.getText());
            double balance = cash - tot;
            if(tot>cash){
                JOptionPane.showMessageDialog(null,"Gamay ang imu kwarta nd pwedi!!","Message",JOptionPane.ERROR_MESSAGE);
                return;
            }
            DecimalFormat df = new DecimalFormat("00.00");
            bal.setText(String.valueOf(df.format(balance)));
        }catch(NumberFormatException i) {
            JOptionPane.showMessageDialog(null, "Please enter a cash", "Error", JOptionPane.ERROR_MESSAGE);
        }catch(Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }//GEN-LAST:event_bayadActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        double bal_value = Double.parseDouble(bal.getText());
        if(pay.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"noy/ne way kapa kabayad ay ah!!","Message",JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if(bal_value == 00) {
            JOptionPane.showMessageDialog(null,"nd pwede, bayad anay!","Message",JOptionPane.ERROR_MESSAGE);
            return;
        }
        try{
            p.setText(" \t   GroupHackduken\n");
            p.setText(p.getText()+ "\t   Fishballan ni Jade\n");
            p.setText(p.getText()+ " \t   Sagwa Isufst Main Pobalcion\n");
            p.setText(p.getText()+ "  \t   Barotac Nuevo\n");
            p.setText(p.getText()+ "-----------------------------------------------------------------------------\n");
            p.setText(p.getText()+" Item \t\t Qty \t Price" + "\n");
            p.setText(p.getText()+ "-----------------------------------------------------------------------------\n");
             
            //to get the product from the table
            DefaultTableModel df = (DefaultTableModel)jTable2.getModel();
            for (int i = 0; i < jTable2.getRowCount(); i++){
                String Name = df.getValueAt(i, 1).toString();
                String Qty = df.getValueAt(i, 2).toString();
                String Price = df.getValueAt(i, 3).toString();
                
                p.setText(p.getText()+"" +Name +"\t\t"+ Qty +"\t"+ Price + "\n");
                
                
            }
             p.setText(p.getText()+ "-----------------------------------------------------------------------------\n");
             p.setText(p.getText()+ "Sub Total :"+ total.getText()+"\n");
             p.setText(p.getText()+ "Cash      :"+ pay.getText()+"\n");
             p.setText(p.getText()+ "Balance   :"+ bal.getText()+"\n");
             p.setText(p.getText()+ "-----------------------------------------------------------------------------\n");
             p.setText(p.getText()+ "Thank you for buying...!\n");
             p.setText(p.getText()+ "-----------------------------------------------------------------------------\n");
           
            buyedProducts();
        }catch (Exception e){
            System.out.println("Error : " + e.getMessage());
        }
    }//GEN-LAST:event_printActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(q7.getText());
        ++i;
        q7.setText(String.valueOf(i));
        addtable(7,  "fishball ni nonix",i, 8.99);
        cal();
    }//GEN-LAST:event_jButton7ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bal;
    private javax.swing.JButton bayad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea p;
    private javax.swing.JTextField pay;
    private javax.swing.JButton print;
    private javax.swing.JLabel q1;
    private javax.swing.JLabel q2;
    private javax.swing.JLabel q3;
    private javax.swing.JLabel q4;
    private javax.swing.JLabel q5;
    private javax.swing.JLabel q6;
    private javax.swing.JLabel q7;
    private javax.swing.JLabel q8;
    private javax.swing.JLabel q9;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
