
package com.mycompanydanica.simplepos;

import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Danica ang group
 */
public class SimplePOSView extends javax.swing.JFrame {

    public SimplePOSView() {
        initComponents();
        
        jTable2.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTable2.getColumnModel().getColumn(1).setPreferredWidth(200);
    }
    
   public void addtable(int id, String Name, int Qty, double Price){
        DefaultTableModel dt = (DefaultTableModel) jTable2.getModel();
        
        
         DecimalFormat df = new DecimalFormat("00.00");
         double totPrice = Price * Double.valueOf(Qty);
         
         String TotalPrice = df.format(totPrice);
        
         for (int row = 0; row < jTable2.getRowCount(); row++){
              if (Name == jTable2.getValueAt(row, 1)){
                  dt.removeRow(jTable2.convertRowIndexToModel(row));
              }
         }
         
        
        Vector v = new Vector();
        
        v.add(id);
        v.add(Name);
        v.add(Qty);
        v.add(Price);
        
        dt.addRow(v);    
    }
   
   public void cal(){
       int numOfRow = jTable2.getRowCount();
       double tot = 0.0;
       
           for (int i = 0; i < numOfRow; i++){
               double value = Double.valueOf(jTable2.getValueAt(i, 3).toString());
               double qty = Double.valueOf(jTable2.getValueAt(i, 2).toString());
               tot = qty * value;
           }
     DecimalFormat df = new DecimalFormat("00.00");
     total.setText(String.valueOf(df.format(tot)));
   }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        q1 = new javax.swing.JLabel();
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
        jButton7 = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        q1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        q1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q1.setText("0");

        jButton2.setText("jButton1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        q2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        q2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q2.setText("0");

        jButton3.setText("jButton1");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        q3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        q3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q3.setText("0");

        jButton4.setText("jButton1");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        q6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        q6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q6.setText("0");

        jButton5.setText("jButton1");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        q5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        q5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q5.setText("0");

        jButton6.setText("jButton1");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        q4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        q4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q4.setText("0");

        jButton7.setText("jButton1");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        q7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        q7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q7.setText("0");

        q8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        q8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q8.setText("0");

        jButton8.setText("jButton1");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        q9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        q9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q9.setText("0");

        jButton9.setText("jButton1");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Qty", "Price"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        p.setColumns(20);
        p.setRows(5);
        jScrollPane1.setViewportView(p);

        jButton13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton13.setText("Delete");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton13)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Total:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Cash:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Balance:");

        bal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bal.setText("00");

        total.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        total.setText("00");

        pay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                payKeyReleased(evt);
            }
        });

        bayad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bayad.setText("Pay");
        bayad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bayadActionPerformed(evt);
            }
        });

        print.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(pay))
                .addGap(95, 95, 95)
                .addComponent(bayad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(pay)
                                .addGap(2, 2, 2)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(print, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bayad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(q1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(q4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(q7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(q5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(q6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(q3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(q8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(q9, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(q3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(q6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(q9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(q4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(127, 127, 127)
                                    .addComponent(q7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(121, 121, 121)
                            .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(127, 127, 127)
                            .addComponent(q5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(q8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
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

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(q7.getText());
        ++i;
        q7.setText(String.valueOf(i));
        addtable(7,  "fishball ni nonix",i, 8.99);
        cal();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(q8.getText());
        ++i;
        q8.setText(String.valueOf(i));
        addtable(8,  "fishball alalaon",i, 2.99);
        cal();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
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
                break;
                
                case"2":
                q2.setText("0");
                break;
                
                case"3":
                q3.setText("0");
                break;
                
                case"4":
                q4.setText("0");
                break;
                
                case"5":
                q5.setText("0");
                break;
                
                case"6":
                q6.setText("0");
                break;
                
                case"7":
                q7.setText("0");
                break;
                
                case"8":
                q8.setText("0");
                break;
                
                case"9":
                q9.setText("0");
                break;
                
                default:
                    System.out.println("Over");
            
        
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void bayadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bayadActionPerformed
        // pay btn
        
        double tot = Double.valueOf(total.getText());
        double cash = Double.valueOf(pay.getText());
        double balance = cash - tot;
        
        DecimalFormat df = new DecimalFormat("00:00");
        bal.setText(String.valueOf(df.format(balance)));
    }//GEN-LAST:event_bayadActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // Para sa print btn
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
           
        }catch (Exception e){
            System.out.println("Error : " + e.getMessage());
        }
    }//GEN-LAST:event_printActionPerformed

    private void payKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_payKeyReleased
        double tot = Double.parseDouble(total.getText());
        double cash = Double.parseDouble(pay.getText());
        
        double balance = cash - tot;
        
        DecimalFormat df = new DecimalFormat("00.00");
        bal.setText(String.valueOf(df.format(balance)));
    }//GEN-LAST:event_payKeyReleased

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
            java.util.logging.Logger.getLogger(SimplePOSView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SimplePOSView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SimplePOSView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SimplePOSView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimplePOSView().setVisible(true);
            }
        });
    }

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
