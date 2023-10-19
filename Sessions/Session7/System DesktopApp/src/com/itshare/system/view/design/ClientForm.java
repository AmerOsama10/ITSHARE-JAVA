package com.itshare.system.view.design;

import com.itshare.banksystem.bll.ClientBusinessLogicLayer;
import com.itshare.banksystem.model.entities.Client;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author administratorlab
 */
public class ClientForm extends javax.swing.JFrame {

    //private BusinessLogicLayer business = new BusinessLogicLayer();
    private ClientBusinessLogicLayer business = new ClientBusinessLogicLayer();

    /**
     * Creates new form ClientForm
     */
    public ClientForm() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Client Design");

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
        firstField = new javax.swing.JTextField();
        lastField = new javax.swing.JTextField();
        ageField = new javax.swing.JTextField();
        idField = new javax.swing.JTextField();
        deleteBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        insertBtn = new javax.swing.JButton();
        selectBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        ClientBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        firstField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(firstField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 490, 70));

        lastField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lastField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastFieldActionPerformed(evt);
            }
        });
        jPanel1.add(lastField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 490, 70));

        ageField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(ageField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 610, 490, 70));

        idField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });
        jPanel1.add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 490, 70));

        deleteBtn.setBackground(new java.awt.Color(0, 0, 51));
        deleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 153, 0));
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 470, 140, 50));

        updateBtn.setBackground(new java.awt.Color(0, 0, 51));
        updateBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(255, 153, 0));
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 360, 140, 50));

        insertBtn.setBackground(new java.awt.Color(0, 0, 51));
        insertBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        insertBtn.setForeground(new java.awt.Color(255, 153, 0));
        insertBtn.setText("Insert");
        insertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBtnActionPerformed(evt);
            }
        });
        jPanel1.add(insertBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 260, 140, 50));

        selectBtn.setBackground(new java.awt.Color(0, 0, 51));
        selectBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        selectBtn.setForeground(new java.awt.Color(255, 153, 0));
        selectBtn.setText("Select");
        selectBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectBtnMouseClicked(evt);
            }
        });
        selectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBtnActionPerformed(evt);
            }
        });
        jPanel1.add(selectBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 150, 140, 50));

        clearBtn.setBackground(new java.awt.Color(0, 0, 51));
        clearBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        clearBtn.setForeground(new java.awt.Color(255, 153, 0));
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        jPanel1.add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 580, 140, 50));

        ClientBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/itshare/system/view/resources/clientForm.png"))); // NOI18N
        jPanel1.add(ClientBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 1210, 830));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lastFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastFieldActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:

        //get form values
        try {
            int id = Integer.parseInt(idField.getText());
            String firstname = firstField.getText();
            String lastname = lastField.getText();
            int age = Integer.parseInt(ageField.getText());
            //store in client object
            Client client = new Client(id, firstname, lastname, age);

            //use dao to insert
            int rowsDeleted = business.deleteClient(client);
            
            String msg = rowsDeleted + " record Deleted";
            JOptionPane.showMessageDialog(null, msg, "Deleted", JOptionPane.PLAIN_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "You must Enter a Number", "Error Exception", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        //get form values
        try {
            int id = Integer.parseInt(idField.getText());
            String firstname = firstField.getText();
            String lastname = lastField.getText();
            int age = Integer.parseInt(ageField.getText());

            //store in client object
            Client client = new Client(id, firstname, lastname, age);

            //use dao to insert
            int rowsUpdated = business.updateClient(client);

            String msg = rowsUpdated + " record Updated";
            JOptionPane.showMessageDialog(null, msg, "Updated", JOptionPane.PLAIN_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "You must Enter a Number", "Error Exception", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_updateBtnActionPerformed

    private void insertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBtnActionPerformed
        // TODO add your handling code here:
        try {
            //get form values
            int id = Integer.parseInt(idField.getText());
            String firstname = firstField.getText();
            String lastname = lastField.getText();
            int age = Integer.parseInt(ageField.getText());

            //store in client object
            Client client = new Client(id, firstname, lastname, age);

            System.out.println(client.toString());
            //use dao to insert
            int rowsInserted = business.insertClient(client);
            System.out.println("rows inserted");

            String msg = rowsInserted + " record inserted";
            JOptionPane.showMessageDialog(null, msg, "Inserted", JOptionPane.PLAIN_MESSAGE);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "You must Enter a Number", "Error Exception", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_insertBtnActionPerformed

    private void selectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBtnActionPerformed

        try {

           int id = Integer.parseInt(idField.getText());

            Client client = new Client();
            client.setId(id);

            System.out.println(client.toString());

            Client clientData = business.selectClient(client);
            System.out.println(clientData.toString());
            
            if(clientData !=null){
            firstField.setText(clientData.getFirstname());
            lastField.setText(clientData.getLastname());
            ageField.setText("" + clientData.getAge());
            }
        } catch (NumberFormatException ex) {

            JOptionPane.showMessageDialog(null, "You must Enter an Id", "Error Exception", JOptionPane.ERROR_MESSAGE);
            firstField.setText("");
            lastField.setText("");
            ageField.setText("");

        } 
    }//GEN-LAST:event_selectBtnActionPerformed

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFieldActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:

        idField.setText("");
        firstField.setText("");
        lastField.setText("");
        ageField.setText("");


    }//GEN-LAST:event_clearBtnActionPerformed

    private void selectBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectBtnMouseClicked

    }//GEN-LAST:event_selectBtnMouseClicked


        public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(ClientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ClientForm client = new ClientForm();
                client.setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ClientBackground;
    private javax.swing.JTextField ageField;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField firstField;
    private javax.swing.JTextField idField;
    private javax.swing.JButton insertBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastField;
    private javax.swing.JButton selectBtn;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}