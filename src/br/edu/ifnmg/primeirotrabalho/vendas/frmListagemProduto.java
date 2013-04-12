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
public class frmListagemProduto extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmListagemProduto
     */
    public frmListagemProduto() {
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
        lblListaProduto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaProduto = new javax.swing.JTable();
        btnAlterarListaProduto = new javax.swing.JButton();
        btnExcluirListaProduto = new javax.swing.JButton();
        btnSairListaProduto = new javax.swing.JButton();

        lblListaProduto.setText("LISTA DE PRODUTOS:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblListaProduto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblListaProduto)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        tblListaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Descrição", "Valor do Produto", "Valor da Venda", "Estoque"
            }
        ));
        jScrollPane1.setViewportView(tblListaProduto);

        btnAlterarListaProduto.setText("Alterar");
        btnAlterarListaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarListaProdutoActionPerformed(evt);
            }
        });

        btnExcluirListaProduto.setText("Excluir");
        btnExcluirListaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirListaProdutoActionPerformed(evt);
            }
        });

        btnSairListaProduto.setText("Sair");
        btnSairListaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairListaProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 11, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(btnAlterarListaProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluirListaProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSairListaProduto)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterarListaProduto)
                    .addComponent(btnExcluirListaProduto)
                    .addComponent(btnSairListaProduto))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirListaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirListaProdutoActionPerformed
        if(JOptionPane.showConfirmDialog(rootPane, "Deseja excluir a opção")== 0){
          //btnRealizarVenda.setText("Salvo");
          JOptionPane.showMessageDialog(rootPane, "Exclusão Realizada com sucesso!");
       }else{
         // btnRealizarVenda.setText("Não Salvo");
          JOptionPane.showMessageDialog(rootPane, "Operação Cancelada pelo Usuario! ","Titulo",JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_btnExcluirListaProdutoActionPerformed

    private void btnAlterarListaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarListaProdutoActionPerformed
      if(JOptionPane.showConfirmDialog(rootPane, "Deseja alterar a opção")== 0){
          //btnRealizarVenda.setText("Salvo");
          JOptionPane.showMessageDialog(rootPane, "Alteração Realizada com sucesso!");
       }else{
         // btnRealizarVenda.setText("Não Salvo");
          JOptionPane.showMessageDialog(rootPane, "Operação Cancelada pelo Usuario! ","Titulo",JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_btnAlterarListaProdutoActionPerformed

    private void btnSairListaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairListaProdutoActionPerformed
       if(JOptionPane.showConfirmDialog(rootPane, "Deseja Sair da opção")== 0){
          //btnRealizarVenda.setText("Salvo");
          JOptionPane.showMessageDialog(rootPane, "Opção Realizada com sucesso!");
       }else{
         // btnRealizarVenda.setText("Não Salvo");
          JOptionPane.showMessageDialog(rootPane, "Operação Cancelada pelo Usuario! ","Titulo",JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_btnSairListaProdutoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarListaProduto;
    private javax.swing.JButton btnExcluirListaProduto;
    private javax.swing.JButton btnSairListaProduto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblListaProduto;
    private javax.swing.JTable tblListaProduto;
    // End of variables declaration//GEN-END:variables
}
