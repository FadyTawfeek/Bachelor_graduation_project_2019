/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_1;
import javax.swing.JFrame;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Arrays;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import jxl.Sheet;

/**
 *
 * @author HP
 */
public class NewJFrame extends javax.swing.JFrame {


    /**
     * Creates new form NewJFrame
     */
    DefaultTableModel model;
    public NewJFrame() {
        initComponents();
        this.setExtendedState(NewJFrame.MAXIMIZED_BOTH);
        model=(DefaultTableModel) tbl.getModel();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 32)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 255));
        jButton1.setText("Show Schedule");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Sunday", "1", "", null, null},
                {"", "", null, null, null},
                {"", "2", null, null, null},
                {"", "", null, null, null},
                {"", "3", null, null, null},
                {"", null, null, null, null},
                {null, "4", null, null, null},
                {null, null, null, null, null},
                {null, "5", null, null, null},
                {"", null, null, null, null},
                {"Monday", "1", null, null, null},
                {null, null, null, null, null},
                {null, "2", null, null, null},
                {null, null, null, null, null},
                {"", "3", null, null, null},
                {"", null, null, null, ""},
                {null, "4", null, null, null},
                {null, null, null, null, null},
                {null, "5", null, null, null},
                {null, null, null, null, null},
                {"Tuesday", "1", null, null, null},
                {null, null, null, null, null},
                {null, "2", null, null, null},
                {null, null, null, null, null},
                {"", "3", null, null, null},
                {null, null, null, null, null},
                {null, "4", null, null, null},
                {null, null, null, null, null},
                {null, "5", null, null, null},
                {null, null, null, null, null},
                {"Wednesday", "1", null, null, null},
                {null, null, null, null, null},
                {null, "2", null, null, null},
                {null, null, null, null, null},
                {"", "3", null, null, null},
                {null, null, null, null, null},
                {null, "4", null, null, null},
                {null, null, null, null, null},
                {null, "5", null, null, null},
                {null, null, null, null, null},
                {"Thursday", "1", null, null, ""},
                {null, null, null, null, null},
                {null, "2", null, null, null},
                {null, null, null, null, null},
                {"", "3", null, null, null},
                {null, null, null, null, null},
                {null, "4", null, null, null},
                {null, null, null, null, null},
                {null, "5", null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Day/Room", "lec", "room 1", "room 2", "room 3"
            }
        ));
        tbl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbl.setRowHeight(12);
        jScrollPane1.setViewportView(tbl);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Summer");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Database");

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jTextField2.setText("C:\\Table\\table.xls");

        jButton2.setFont(new java.awt.Font("Tahoma", 2, 20)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 2, 20)); // NOI18N
        jButton3.setText("Reload");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(151, 151, 151)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(83, 83, 83))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(63, 63, 63)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(155, 155, 155)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String file_path = jTextField2.getText(); // get database location from user
        File f = new File(file_path);
        Workbook wb = null; // initiate excel sheet and catch exceptions
        try {
            wb = Workbook.getWorkbook(f);
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BiffException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        Sheet a = wb.getSheet(0);
        int row = a.getRows(); // get maximum number of rows
        int col = a.getColumns(); // get maximum number of columns
        String [][] table_old = new String [row][93];
        for (int io=0;io<row;io++)
        {
            for (int il=0;il<93;il++)
            {
                table_old[io][il]="";
            }
        }
        for (int i=0;i<row;i++) // put the database in table_old 2D array
        {
            for (int j=0;j<col;j++)
            {
                Cell d;
                d = a.getCell(j,i);
                table_old[i][j]=d.getContents();
            }
        }
        String [][] table = new String [(2*row)][93];
        for (int io=0;io<(2*row);io++)
        {
            for (int il=0;il<93;il++)
            {
                table[io][il]="";
            }
        }
        int summer_flag=0;
        if ((jTextField1.getText().compareTo("")!=0)) // check if the user wants summer mode
        {
            summer_flag = 1;
        }
        if ( summer_flag==1) // if summer mode is chosen : double all lectures and tutorials
        {
        for (int io=1;io<row;io++) // then copy these double lectures and tutorials into table 2D array
            {
            for (int il=0;il<93;il++)
                {
                table [(2*io-1)][il] = table_old[io][il];
                table [(2*io)][il] = table_old[io][il];
                }
            }
        }
        else // if summer mode is not chosen : copy database in table 2D array
        { 
            for (int io=0;io<row;io++)
            {
            for (int il=0;il<93;il++)
                {
                table [io][il] = table_old[io][il];
                }
            } 
        }
        String [][] temp_res = new String [2][72];
        for (int io=0;io<2;io++)
        {
            for (int il=0;il<72;il++)
            {
                temp_res[io][il]="";
            }
        }
        String [][] temp_res_2 = new String [2][72];
        for (int io=0;io<2;io++)
        {
            for (int il=0;il<72;il++)
            {
                temp_res_2[io][il]="";
            }
        }
        String [][] res_1 = new String [26][72];
        for (int io=0;io<26;io++)
        {
            for (int il=0;il<72;il++)
            {
                res_1[io][il]="";
            }
        }
        String [][] res_2 = new String [26][72];
        for (int io=0;io<26;io++)
        {
            for (int il=0;il<72;il++)
            {
                res_2[io][il]="";
            }
        }
        String [][] res_3 = new String [26][72];
        for (int io=0;io<26;io++)
        {
            for (int il=0;il<72;il++)
            {
                res_3[io][il]="";
            }
        }
        int x=0;
        if ( summer_flag==1) { row = (2*row-1);} // if summer mode is chosen: arrange until last subject
        for (int i=1; i<row; i++) // count until last subject in database
        { // copy table contents for subject i into temp_res array
            int f1=2; int f2=f1; temp_res[1][0]=table[i][0]; temp_res[1][1]=table[i][1];
            for ( int z=23; z<93; z++) { temp_res[1][z-21]=table[i][z];}
            
            outerloop: 
            for ( int j=2; j<12; j++ ) // go through all possible free times for each professor
            {
                int flag = 1; int flagerr1=1; int k; String l=table[i][f2];
                if (l.equals("")){ k = 0;} else {k=Integer.parseInt(l);}
                        if (res_1[k][0].equals("")) // check if room 1 is empty
                        {
                            loop1:
                            for (int m=0; m<72; m++)
                            {
                                for (int n=0; n<72; n++)
                                { // check if no conflicts occurs
                                    if ( res_1[k][m].equals(temp_res[1][n]) & (res_1[k][m].compareTo("")!=0))
                                    {flag=0; break loop1;} // if conflict found: flag=0
                                }
                            } if (flag==1) // that means no conflicts happened
                            { for ( int s=0; s<72 ;s++ )
                                { res_1[k][s]=temp_res[1][s]; }
                                break outerloop;
                            }
                        }
                        else {x=x+1;}
                        if (res_2[k][0].equals("")) // check if room 2 is empty
                        {
                            loop2:
                            for (int m=0; m<72; m++)
                            { 
                                for (int n=0; n<72; n++)
                                { // check if no conflicts occurs
                                    if ( res_1[k][m].equals(temp_res[1][n]) & (res_1[k][m].compareTo("")!=0))
                                    {flag=0; break loop2;} // if conflict found: flag=0
                                    if ( res_2[k][m].equals(temp_res[1][n]) & (res_2[k][m].compareTo("")!=0))
                                    {flag=0; break loop2;} // if conflict found: flag=0
                                }

                            } if (flag==1) // that means no conflicts happened
                            { for ( int s=0; s<72 ;s++ )
                                { res_2[k][s]=temp_res[1][s]; }
                                break outerloop;
                            }
                        }
                        else {x=x+1;}
                        if (res_3[k][0].equals("")) // check if room 2 is empty
                        {
                            loop3:
                            for (int m=0; m<72; m++)
                            {
                                for (int n=0; n<72; n++)
                                { // check if no conflicts occurs
                                    if ( res_1[k][m].equals(temp_res[1][n]) & (res_1[k][m].compareTo("")!=0))
                                    {flag=0; f2=f2+1; flagerr1=0; break loop3;} // if conflict found: flag=0
                                    if ( res_2[k][m].equals(temp_res[1][n]) & (res_2[k][m].compareTo("")!=0))
                                    {flag=0; f2=f2+1; flagerr1=0; break loop3;} // if conflict found: flag=0
                                    if ( res_3[k][m].equals(temp_res[1][n]) & (res_3[k][m].compareTo("")!=0) )
                                    {flag=0; f2=f2+1; flagerr1=0; break loop3;} // if conflict found: flag=0
                                }
                            } if (flag==1) // that means no conflicts happened
                            { for ( int s=0; s<72 ;s++ )
                                { res_3[k][s]=temp_res[1][s]; }
                                break outerloop;
                            }
                        }
                        else {x=x+1;}
                        if ((x==3) & ( flagerr1==1)){f2=f2+1;} // if all 3 rooms are used in that time
                        x=0;                                   // then increment k which means check                        
                    }                                          // next free time for the professors
                    // outerloop
                    for (int y=0; y<2; y++)
                    {
                        for (int u=0; u<72; u++)
                        {
                            temp_res[y][u]="";
                        }
                    }
                } // main i                
                int xx=0;
                for (int i=1; i<row; i++) // count until last subject in database
                { // copy table contents for subject i into temp_res array
                    int f1=13; int f2=f1; temp_res_2[1][0]=table[i][0]; temp_res_2[1][1]=table[i][12];
                    for ( int z=23; z<93; z++) { temp_res_2[1][z-21]=table[i][z];}

                    outerloop:
                    for ( int j=13; j<23; j++ ) // go through all possible free times for each TA
                    {
                        int flag = 1; int flagerr2=1; int k; String l=table[i][f2];
                        if (l.equals("")){ k = 0;} else {k=Integer.parseInt(l);}
                        if (res_1[k][0].equals("")) // check if room 1 is empty
                        {
                            loop1:
                            for (int m=0; m<72; m++)
                            {
                                for (int n=0; n<72; n++)
                                { // check if no conflicts occurs
                                    if ( res_1[k][m].equals(temp_res_2[1][n]) &(res_1[k][m].compareTo("")!=0))
                                    {flag=0; break loop1;} // if conflict found: flag=0
                                }
                            } if (flag==1) // that means no conflicts happened
                            { for ( int s=0; s<72 ;s++ )
                                { res_1[k][s]=temp_res_2[1][s]; }
                                break outerloop;
                            }
                        }
                        else {xx=xx+1;}
                        if (res_2[k][0].equals("")) // check if room 2 is empty
                        {
                            loop2:
                            for (int m=0; m<72; m++)
                            {
                                for (int n=0; n<72; n++)
                                { // check if no conflicts occurs
                                    if ( res_1[k][m].equals(temp_res_2[1][n]) & (res_1[k][m].compareTo("")!=0))
                                    {flag=0; break loop2;} // if conflict found: flag=0
                                    if ( res_2[k][m].equals(temp_res_2[1][n]) & (res_2[k][m].compareTo("")!=0))
                                    {flag=0; break loop2;} // if conflict found: flag=0
                                }
                            } if (flag==1) // that means no conflicts happened
                            { for ( int s=0; s<72 ;s++ )
                                { res_2[k][s]=temp_res_2[1][s]; }
                                break outerloop;
                            }
                        }
                        else {xx=xx+1;}
                        if (res_3[k][0].equals("")) // check if room 3 is empty
                        {
                            loop3:
                            for (int m=0; m<72; m++)
                            {
                                for (int n=0; n<72; n++)
                                { // check if no conflicts occurs
                                    if ( res_1[k][m].equals(temp_res_2[1][n]) & (res_1[k][m].compareTo("")!=0))
                                    {flag=0; f2=f2+1; flagerr2=0; break loop3;} // if conflict found: flag=0
                                    if ( res_2[k][m].equals(temp_res_2[1][n]) & (res_2[k][m].compareTo("")!=0))
                                    {flag=0; f2=f2+1; flagerr2=0; break loop3;} // if conflict found: flag=0
                                    if ( res_3[k][m].equals(temp_res_2[1][n]) & (res_3[k][m].compareTo("")!=0))
                                    {flag=0; f2=f2+1; flagerr2=0; break loop3;} // if conflict found: flag=0
                                }
                            } if (flag==1) // that means no conflicts happened
                            { for ( int s=0; s<72 ;s++ )
                                { res_3[k][s]=temp_res_2[1][s]; }
                                break outerloop;
                            }
                        }
                        else {xx=xx+1;} 
                        if ((xx==3)&(flagerr2==1)){f2=f2+1;} // if all 3 rooms are used in that time
                        xx=0;                                // then increment k which means check
                    }                                        // next free time for the TA
                    // outerloop
                    for (int y=0; y<2; y++)
                    {
                        for (int u=0; u<72; u++)
                        {
                            temp_res_2[y][u]="";
                        }
                    }
                } // main i
                for (int d=1; d<26; d++) // copy all 3 rooms in the schedule table to be shown
                {
                    {
                        if ((res_1[d][0].compareTo("")!=0))
                        {tbl.getModel().setValueAt(res_1[d][0], 2*d-2 ,2);}
                        if ((res_1[d][1].compareTo("")!=0))
                        {tbl.getModel().setValueAt(res_1[d][1], 2*d-1 ,2);}
                        if ((res_2[d][0].compareTo("")!=0))
                        {tbl.getModel().setValueAt(res_2[d][0], 2*d-2 ,3);}
                        if ((res_2[d][1].compareTo("")!=0))
                        {tbl.getModel().setValueAt(res_2[d][1], 2*d-1 ,3);}
                        if ((res_3[d][0].compareTo("")!=0))
                        {tbl.getModel().setValueAt(res_3[d][0], 2*d-2 ,4);}
                        if ((res_3[d][1].compareTo("")!=0))
                        {tbl.getModel().setValueAt(res_3[d][1], 2*d-1 ,4);}
                    }
                }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new NewJFrame1().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new NewJFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tbl;
    // End of variables declaration//GEN-END:variables
}