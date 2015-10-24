/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.winardiaris.uangku;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author arst
 */
public class FormData extends javax.swing.JFrame {

    /**
     * Creates new form formDatas
     */
    public FormData() {
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

        Lrealname = new javax.swing.JLabel();
        Lusername = new javax.swing.JLabel();
        Luid = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Bsignout = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Ttype = new javax.swing.JComboBox();
        Ttoken = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tdesc = new javax.swing.JTextArea();
        Tdate = new org.jdesktop.swingx.JXDatePicker();
        Bsave = new javax.swing.JButton();
        Ljumlah = new javax.swing.JLabel();
        Tvalue = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        Brefresh = new javax.swing.JButton();
        Buserpreference = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Lrealname.setText("realname");

        Lusername.setText("username");

        Luid.setText("UID");

        Bsignout.setText("Keluar");
        Bsignout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BsignoutMouseClicked(evt);
            }
        });

        jLabel1.setText("Jenis Keuangan");

        jLabel3.setText("Tanggal");

        Ttype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Debet", "Kredit" }));
        Ttype.setName("Ftype"); // NOI18N
        Ttype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TtypeActionPerformed(evt);
            }
        });

        Ttoken.setName("Ftoken"); // NOI18N
        Ttoken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TtokenActionPerformed(evt);
            }
        });

        jLabel4.setText("Keterangan");

        jLabel2.setText("No. Bukti");

        Tdesc.setColumns(20);
        Tdesc.setRows(5);
        jScrollPane1.setViewportView(Tdesc);

        Bsave.setText("Simpan");
        Bsave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BsaveMouseClicked(evt);
            }
        });

        Ljumlah.setText("Jumlah");

        Tvalue.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(Ttype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(Tdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(386, 386, 386))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(Ttoken, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(182, 182, 182))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Bsave))
                    .addComponent(Ljumlah)
                    .addComponent(Tvalue, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ttype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Ljumlah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tvalue, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ttoken, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Bsave)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Tambah", jPanel1);

        Brefresh.setText("Segarkan");
        Brefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BrefreshMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(563, Short.MAX_VALUE)
                .addComponent(Brefresh)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(322, Short.MAX_VALUE)
                .addComponent(Brefresh)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Data", jPanel2);

        Buserpreference.setText("Pengaturan");
        Buserpreference.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuserpreferenceMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Luid)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lusername)
                        .addGap(18, 18, 18)
                        .addComponent(Lrealname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Buserpreference)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bsignout)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Luid)
                    .addComponent(Lusername)
                    .addComponent(Lrealname)
                    .addComponent(Bsignout)
                    .addComponent(Buserpreference))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try {
            getDataURL dataurl = new getDataURL();
            
            String user = this.getTitle();
            String url = "http://localhost/uangku/?op=get&from_data=username&value_data="+user+"&select_field=uid&from_table=user";
            String data = dataurl.getData(url);
            
            String url2 = "http://localhost/uangku/?op=get&from_data=username&value_data="+user+"&select_field=realname&from_table=user";
            String realname = dataurl.getData(url2);
            
            
            System.out.println("----------------------------------------");
            System.out.println("UID: "+data);
            System.out.println("username: "+user);
            System.out.println("realname: "+realname);
            System.out.println("----------------------------------------");
           
            Luid.setText(data);
            Lusername.setText(user);
            Lrealname.setText(realname);
            
            this.setTitle("Uangku - "+realname);
        } catch (IOException ex) {
            Logger.getLogger(FormData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowActivated

    private void BrefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BrefreshMouseClicked
       try {
            getDataURL dataurl = new getDataURL();
            
            String UID = Luid.getText();
            String url = "http://localhost/uangku/?op=viewdata&uid="+UID;
            String data = dataurl.getData(url);
            //JsonObject jsonObject = new JsonParser().parse(data).getAsJsonObject();
            //System.out.println(jsonObject.get("date").getAsString());
            System.out.println(data);
            
            
            //System.out.println(data);
        } catch (IOException ex) {
            Logger.getLogger(FormData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BrefreshMouseClicked

    private void BsignoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BsignoutMouseClicked
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult;
        dialogResult = JOptionPane.showConfirmDialog(this, "Yakin mau keluar? ", "Konfirmasi", dialogButton);
        if(dialogResult == 0) {
            System.out.println("Quit");
            this.dispose();
        } else {
            System.out.println("cancel");
        } 
    }//GEN-LAST:event_BsignoutMouseClicked

    private void TtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TtypeActionPerformed

    private void TtokenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TtokenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TtokenActionPerformed

    private void BsaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BsaveMouseClicked
        SimpleDateFormat formatter;
        formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = Tdate.getDate();
        
        String UID = Luid.getText();
        String type = Ttype.getSelectedItem().toString();
        String converted_type;
        String converted_date = formatter.format(date);
        String token = Ttoken.getText();
        String value = Tvalue.getText();
        String desc =  Tdesc.getText();
        
        if("Debet".equals(type)){
            converted_type = "in";
        }
        else{
            converted_type = "out";
        }
        
        System.out.println("type : "+converted_type);
        System.out.println("date : "+converted_date);
        System.out.println("value : "+value);
        System.out.println("token : "+token);
        System.out.println("desc : "+desc);
        
        String url = "http://localhost/uangku/?op=newdata&uid="+UID+"&date="+converted_date+"&token="+token+"&type="+converted_type+"&value="+value+"&desc="+desc;
        String url_encoded = URLEncoder(url,"UTF-8");
        
        System.out.println(url_encoded);
        getDataURL dataurl = new getDataURL();
        String data;
        try {
            data = dataurl.getData(url_encoded);
            System.out.println(data);
        } catch (IOException ex) {
            Logger.getLogger(FormData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_BsaveMouseClicked

    private void BuserpreferenceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuserpreferenceMouseClicked
       this.dispose();
       FormUserPreference fpref = new FormUserPreference();
       fpref.setTitle(this.Luid.getText());
       fpref.setLocationRelativeTo(null);
       fpref.setVisible(true);
    }//GEN-LAST:event_BuserpreferenceMouseClicked

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
            java.util.logging.Logger.getLogger(FormData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Brefresh;
    private javax.swing.JButton Bsave;
    private javax.swing.JButton Bsignout;
    private javax.swing.JButton Buserpreference;
    private javax.swing.JLabel Ljumlah;
    private javax.swing.JLabel Lrealname;
    private javax.swing.JLabel Luid;
    private javax.swing.JLabel Lusername;
    private org.jdesktop.swingx.JXDatePicker Tdate;
    private javax.swing.JTextArea Tdesc;
    private javax.swing.JTextField Ttoken;
    private javax.swing.JComboBox Ttype;
    private javax.swing.JTextField Tvalue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

    private String URLEncoder(String url, String utF8) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
