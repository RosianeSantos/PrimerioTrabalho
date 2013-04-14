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
public class frmVenda extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmVenda
     */
    public frmVenda() {
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCadastroVenda = new javax.swing.JTable();
        lblValorTotalProduto = new javax.swing.JLabel();
        txtValorTotalProduto = new javax.swing.JTextField();
        btnRealizarVenda = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblUsuarioVenda = new javax.swing.JLabel();
        lblClienteVenda = new javax.swing.JLabel();
        lblDataVenda = new javax.swing.JLabel();
        txtUsuarioVenda = new javax.swing.JTextField();
        txtClienteVenda = new javax.swing.JTextField();
        txtDataVenda = new javax.swing.JFormattedTextField();
        lblFormaPagamento = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cbxFormaPagamento = new javax.swing.JComboBox();
        btnSairVenda = new javax.swing.JButton();

        setBorder(null);

        jLabel1.setText("VENDA");

        tblCadastroVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Produto:", "Quantidade:", "Varlor Unitário:"
            }
        ));
        jScrollPane1.setViewportView(tblCadastroVenda);

        lblValorTotalProduto.setText("Valor Total:");

        txtValorTotalProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorTotalProdutoActionPerformed(evt);
            }
        });

        btnRealizarVenda.setText("Realizar Venda");
        btnRealizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarVendaActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblUsuarioVenda.setText("Usuario:");

        lblClienteVenda.setText("Cliente:");

        lblDataVenda.setText("Data:");

        txtDataVenda.setText("__/__/__");

        lblFormaPagamento.setText("Forma de Pagamento:");

        cbxFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxFormaPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFormaPagamentoActionPerformed(evt);
            }
        });
        jScrollPane2.setViewportView(cbxFormaPagamento);

        btnSairVenda.setText("Sair");
        btnSairVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtClienteVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblUsuarioVenda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtUsuarioVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDataVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(lblClienteVenda)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblValorTotalProduto)
                                    .addGap(32, 32, 32)
                                    .addComponent(txtValorTotalProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnRealizarVenda)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnCancelar)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnSairVenda)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblFormaPagamento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuarioVenda)
                    .addComponent(lblDataVenda)
                    .addComponent(txtUsuarioVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClienteVenda)
                    .addComponent(txtClienteVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtValorTotalProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValorTotalProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFormaPagamento)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSairVenda)
                            .addComponent(btnCancelar)
                            .addComponent(btnRealizarVenda))
                        .addGap(23, 23, 23))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtValorTotalProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorTotalProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorTotalProdutoActionPerformed

    private void cbxFormaPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFormaPagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxFormaPagamentoActionPerformed

    private void btnRealizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarVendaActionPerformed
       if(JOptionPane.showConfirmDialog(rootPane, "Deseja Realizar Venda")== 0){
          //btnRealizarVenda.setText("Salvo");
          JOptionPane.showMessageDialog(rootPane, "Venda Realizada com sucesso!");
       }else{
         // btnRealizarVenda.setText("Não Salvo");
          JOptionPane.showMessageDialog(rootPane, "Venda Cancelada ","Titulo",JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_btnRealizarVendaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
         if(JOptionPane.showConfirmDialog(rootPane, "Deseja Cancelar a venda")== 0){
          //btnRealizarVenda.setText("Salvo");
          JOptionPane.showMessageDialog(rootPane, "Venda cancelada com sucesso!");
       }else{
         // btnRealizarVenda.setText("Não Salvo");
          JOptionPane.showMessageDialog(rootPane, "Operação cancelada pelo Usuario ","Titulo",JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSairVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairVendaActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnSairVendaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRealizarVenda;
    private javax.swing.JButton btnSairVenda;
    private javax.swing.JComboBox cbxFormaPagamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblClienteVenda;
    private javax.swing.JLabel lblDataVenda;
    private javax.swing.JLabel lblFormaPagamento;
    private javax.swing.JLabel lblUsuarioVenda;
    private javax.swing.JLabel lblValorTotalProduto;
    private javax.swing.JTable tblCadastroVenda;
    private javax.swing.JTextField txtClienteVenda;
    private javax.swing.JFormattedTextField txtDataVenda;
    private javax.swing.JTextField txtUsuarioVenda;
    private javax.swing.JTextField txtValorTotalProduto;
    // End of variables declaration//GEN-END:variables
}
