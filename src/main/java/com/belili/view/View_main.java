/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belili.view;

import com.belili.dao.Dao_userList;
import com.belili.model.Model_user;
import java.util.ArrayList;
import javax.swing.JTable;

/**
 *
 * @author belili
 */
public class View_main extends javax.swing.JFrame {

    /**
     * Creates new form View_main
     */
    public View_main() {
        initComponents();
        construirTabla();

    }

    private void construirTabla() {
        String titulos[] = {"ID","Codigo", "Nombre", "Edad", "Profesión", "Telefono"};
        String informacion[][] = obtenerMatriz();

        table_userList = new JTable(informacion, titulos);
        jScrollPane1.setViewportView(table_userList);

    }

    private String[][] obtenerMatriz() {

        Dao_userList miPersonaDao = new Dao_userList();
        ArrayList<Model_user> miLista = miPersonaDao.buscarUsuariosConMatriz();

        String matrizInfo[][] = new String[miLista.size()][7];

        for (int i = 0; i < miLista.size(); i++) {
            matrizInfo[i][0] = miLista.get(i).getId_user() + "";
            matrizInfo[i][1] = miLista.get(i).getCode_user() + "";
            matrizInfo[i][2] = miLista.get(i).getType_user() + "";
            matrizInfo[i][3] = miLista.get(i).getFullname_user() + "";
            matrizInfo[i][4] = miLista.get(i).getCorreo_user() + "";
            matrizInfo[i][5] = miLista.get(i).getUsername_user() + "";
            matrizInfo[i][6] = miLista.get(i).getPassword_user() + "";
        }

        return matrizInfo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_main_recorder_create = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_userList = new javax.swing.JTable();
        btn_actualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_main_recorder_create.setText("Crear Registrador");
        btn_main_recorder_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_main_recorder_createActionPerformed(evt);
            }
        });

        table_userList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Codigo", "Tipo", "Nombres", "Correo", "Usuario", "Clave"
            }
        ));
        jScrollPane1.setViewportView(table_userList);

        btn_actualizar.setText("Actualizar");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_main_recorder_create, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_actualizar, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_main_recorder_create)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btn_actualizar)
                .addContainerGap(241, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_main_recorder_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_main_recorder_createActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_main_recorder_createActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        // TODO add your handling code here:
        
        construirTabla();
        
    }//GEN-LAST:event_btn_actualizarActionPerformed

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
            java.util.logging.Logger.getLogger(View_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_actualizar;
    public javax.swing.JButton btn_main_recorder_create;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable table_userList;
    // End of variables declaration//GEN-END:variables
}
