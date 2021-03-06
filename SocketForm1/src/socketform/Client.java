/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketform;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author duchi
 */
public class Client extends javax.swing.JFrame {

    /**
     * Creates new form Client
     */
    public Client() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        txaStatus = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        txtSoA = new javax.swing.JTextField();
        btnCong = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtSoB = new javax.swing.JTextField();
        btnTru = new javax.swing.JButton();
        Chia = new javax.swing.JButton();
        Nhan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txaStatus.setColumns(20);
        txaStatus.setRows(5);
        jScrollPane1.setViewportView(txaStatus);

        jLabel1.setText("Số a");

        btnCong.setBackground(new java.awt.Color(204, 255, 204));
        btnCong.setText("+");
        btnCong.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCongActionPerformed(evt);
            }
        });

        jLabel2.setText("Số b");

        btnTru.setBackground(new java.awt.Color(204, 255, 204));
        btnTru.setText("-");
        btnTru.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTruActionPerformed(evt);
            }
        });

        Chia.setBackground(new java.awt.Color(204, 255, 204));
        Chia.setText("/");
        Chia.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Chia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChiaActionPerformed(evt);
            }
        });

        Nhan.setBackground(new java.awt.Color(204, 255, 204));
        Nhan.setText("x");
        Nhan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Nhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NhanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtSoA, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtSoB)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCong, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nhan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTru, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Chia, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtSoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtSoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Chia)
                            .addComponent(Nhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(4, 4, 4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCongActionPerformed
        // TODO add your handling code here:
        txaStatus.append("Đang gửi dữ liệu lên Server...\n");
        try
        {
            Socket ClientSocket = new Socket("Localhost", 1234);
            //tao luong nhan du lieu tu Server
            DataInputStream inFromServer = new DataInputStream(ClientSocket.getInputStream());
            //tao luong gui du lieu len Server
            DataOutputStream outToServer = new DataOutputStream(ClientSocket.getOutputStream());
            // nhap du lieu tu ban phim gui len Server
            String a="Cong";
            outToServer.writeBytes(a+'\n');
            outToServer.writeBytes(txtSoA.getText()+'\n');
            outToServer.writeBytes(txtSoB.getText()+'\n');
            txaStatus.append("Kết quả Tong từ Server:"+inFromServer.readLine() + "\n\n");
            //dong luong gui du lieu len Server
            outToServer.close();
            //dong luong nhan du lieu tu Server
            inFromServer.close();
            //dong socket Client
            ClientSocket.close();
        }catch(IOException e)
        {
            txaStatus.append("Không Thể Kết nối tới Sever\n\n");
        } 
    }//GEN-LAST:event_btnCongActionPerformed

    private void btnTruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTruActionPerformed
        // TODO add your handling code here:
        txaStatus.append("Đang gửi dữ liệu lên Server...\n");
        try
        {
            Socket ClientSocket = new Socket("Localhost", 1234);
            //tao luong nhan du lieu tu Server
            DataInputStream inFromServer = new DataInputStream(ClientSocket.getInputStream());
            //tao luong gui du lieu len Server
            DataOutputStream outToServer = new DataOutputStream(ClientSocket.getOutputStream());
            // nhap du lieu tu ban phim gui len Server
            String a="Tru";
            outToServer.writeBytes(a+'\n');
            outToServer.writeBytes(txtSoA.getText()+'\n');
            outToServer.writeBytes(txtSoB.getText()+'\n');
            txaStatus.append("Kết quả Hieu từ Server:"+inFromServer.readLine() + "\n\n");
            //dong luong gui du lieu len Server
            outToServer.close();
            //dong luong nhan du lieu tu Server
            inFromServer.close();
            //dong socket Client
            ClientSocket.close();
        }catch(IOException e)
        {
            txaStatus.append("Không Thể Kết nối tới Sever\n\n");
        }
    }//GEN-LAST:event_btnTruActionPerformed

    private void ChiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChiaActionPerformed
        // TODO add your handling code here:
        txaStatus.append("Đang gửi dữ liệu lên Server...\n");
        try
        {
            Socket ClientSocket = new Socket("Localhost", 1234);
            //tao luong nhan du lieu tu Server
            DataInputStream inFromServer = new DataInputStream(ClientSocket.getInputStream());
            //tao luong gui du lieu len Server
            DataOutputStream outToServer = new DataOutputStream(ClientSocket.getOutputStream());
            // nhap du lieu tu ban phim gui len Server
            String a="Chia";
            outToServer.writeBytes(a+'\n');
            outToServer.writeBytes(txtSoA.getText()+'\n');
            outToServer.writeBytes(txtSoB.getText()+'\n');
            txaStatus.append("Kết quả Thuong từ Server:"+inFromServer.readLine() + "\n\n");
            //dong luong gui du lieu len Server
            outToServer.close();
            //dong luong nhan du lieu tu Server
            inFromServer.close();
            //dong socket Client
            ClientSocket.close();
        }catch(IOException e)
        {
            txaStatus.append("Không Thể Kết nối tới Sever\n\n");
        }
    }//GEN-LAST:event_ChiaActionPerformed

    private void NhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NhanActionPerformed
        // TODO add your handling code here:
        txaStatus.append("Đang gửi dữ liệu lên Server...\n");
        try
        {
            Socket ClientSocket = new Socket("Localhost", 1234);
            //tao luong nhan du lieu tu Server
            DataInputStream inFromServer = new DataInputStream(ClientSocket.getInputStream());
            //tao luong gui du lieu len Server
            DataOutputStream outToServer = new DataOutputStream(ClientSocket.getOutputStream());
            // nhap du lieu tu ban phim gui len Server
            String a="Nhan";
            outToServer.writeBytes(a+'\n');
            outToServer.writeBytes(txtSoA.getText()+'\n');
            outToServer.writeBytes(txtSoB.getText()+'\n');
            txaStatus.append("Kết quả Tich từ Server:"+inFromServer.readLine() + "\n\n");
            //dong luong gui du lieu len Server
            outToServer.close();
            //dong luong nhan du lieu tu Server
            inFromServer.close();
            //dong socket Client
            ClientSocket.close();
        }catch(IOException e)
        {
            txaStatus.append("Không Thể Kết nối tới Sever\n\n");
        }
    }//GEN-LAST:event_NhanActionPerformed

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
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Chia;
    private javax.swing.JButton Nhan;
    private javax.swing.JButton btnCong;
    private javax.swing.JButton btnTru;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txaStatus;
    private javax.swing.JTextField txtSoA;
    private javax.swing.JTextField txtSoB;
    // End of variables declaration//GEN-END:variables
}
