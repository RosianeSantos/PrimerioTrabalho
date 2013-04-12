/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.primeirotrabalho.vendas;

import javax.swing.JOptionPane;

/**
 *
 * @author Rosy
 */
public class frmListagemCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmListagemCliente
     */
    public frmListagemCliente() {
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

        jPanel1 = new javax.swing.JPanel();
        lblListagemCliente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaCliente = new javax.swing.JTable();
        btnAlterarListaCliente = new javax.swing.JButton();
        btnCancelarListaCliente = new javax.swing.JButton();
        btnSairListaCliente = new javax.swing.JButton();

        lblListagemCliente.setText("LISTA DE CLIENTES:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblListagemCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblListagemCliente)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        tblListaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome:", "Endereço:", "E-mail:", "Telefone:"
            }
        ));
        jScrollPane1.setViewportView(tblListaCliente);

        btnAlterarListaCliente.setText("Alterar");
        btnAlterarListaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarListaClienteActionPerformed(evt);
            }
        });

        btnCancelarListaCliente.setText("Cancelar");
        btnCancelarListaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarListaClienteActionPerformed(evt);
            }
        });

        btnSairListaCliente.setText("Sair");
        btnSairListaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairListaClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAlterarListaCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelarListaCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSairListaCliente)
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterarListaCliente)
                    .addComponent(btnCancelarListaCliente)
                    .addComponent(btnSairListaCliente))
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarListaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarListaClienteActionPerformed
       if(JOptionPane.showConfirmDialog(rootPane, "Deseja alterar a opção")== 0){
          //btnRealizarVenda.setText("Salvo");
          JOptionPane.showMessageDialog(rootPane, "Alteração Realizada com sucesso!");
       }else{
         // btnRealizarVenda.setText("Não Salvo");
          JOptionPane.showMessageDialog(rootPane, "Operação Cancelada pelo Usuario! ","Titulo",JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_btnAlterarListaClienteActionPerformed

    private void btnCancelarListaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarListaClienteActionPerformed
        if(JOptionPane.showConfirmDialog(rootPane, "Deseja Sair da opção")== 0){
          //btnRealizarVenda.setText("Salvo");
          JOptionPane.showMessageDialog(rootPane, "Opção Realizada com sucesso!");
       }else{
         // btnRealizarVenda.setText("Não Salvo");
          JOptionPane.showMessageDialog(rootPane, "Operação Cancelada pelo Usuario! ","Titulo",JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_btnCancelarListaClienteActionPerformed

    private void btnSairListaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairListaClienteActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnSairListaClienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarListaCliente;
    private javax.swing.JButton btnCancelarListaCliente;
    private javax.swing.JButton btnSairListaCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblListagemCliente;
    private javax.swing.JTable tblListaCliente;
    // End of variables declaration//GEN-END:variables
}
