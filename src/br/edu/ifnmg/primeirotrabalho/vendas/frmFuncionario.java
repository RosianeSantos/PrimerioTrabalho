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
public class frmFuncionario extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmFuncionario
     */
    public frmFuncionario() {
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
        lblNomeFuncionario = new javax.swing.JLabel();
        lblEnderecoFuncionario = new javax.swing.JLabel();
        lblCPFFuncionario = new javax.swing.JLabel();
        lblSetorFuncionario = new javax.swing.JLabel();
        txtNomeFuncionario = new javax.swing.JTextField();
        txtEnderecoFuncionario = new javax.swing.JTextField();
        txtCPFFuncionario = new javax.swing.JTextField();
        txtSetorFuncionario = new javax.swing.JTextField();
        lblNumFuncionario = new javax.swing.JLabel();
        txtNumFuncionario = new javax.swing.JTextField();
        btnSalvaFuncionario = new javax.swing.JButton();
        btnSairFuncionario = new javax.swing.JButton();

        jLabel1.setText("CADASTRO DE FUNCIONARIOS");

        lblNomeFuncionario.setText("Nome:");

        lblEnderecoFuncionario.setText("Endereço:");

        lblCPFFuncionario.setText("CPF:");

        lblSetorFuncionario.setText("Setor");

        lblNumFuncionario.setText("Numero:");

        btnSalvaFuncionario.setText("Salvar");
        btnSalvaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvaFuncionarioActionPerformed(evt);
            }
        });

        btnSairFuncionario.setText("Sair");
        btnSairFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEnderecoFuncionario)
                            .addComponent(lblCPFFuncionario)
                            .addComponent(lblSetorFuncionario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSetorFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCPFFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtEnderecoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblNumFuncionario)))
                        .addGap(18, 18, 18)
                        .addComponent(txtNumFuncionario))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNomeFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(txtNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSalvaFuncionario)
                        .addGap(18, 18, 18)
                        .addComponent(btnSairFuncionario)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNomeFuncionario)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEnderecoFuncionario)
                            .addComponent(txtEnderecoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNumFuncionario)
                            .addComponent(txtNumFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCPFFuncionario)
                            .addComponent(txtCPFFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSetorFuncionario)
                    .addComponent(txtSetorFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvaFuncionario)
                    .addComponent(btnSairFuncionario))
                .addGap(22, 22, 22))
        );

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

    private void btnSalvaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvaFuncionarioActionPerformed
        if(JOptionPane.showConfirmDialog(rootPane, "Deseja confirmar o Cadastro")== 0){
          //btnRealizarVenda.setText("Salvo");
          JOptionPane.showMessageDialog(rootPane, "Cadastro Realizado com sucesso!");
       }else{
         // btnRealizarVenda.setText("Não Salvo");
          JOptionPane.showMessageDialog(rootPane, "Operação Cancelada pelo Usuario ","Funcionario",JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_btnSalvaFuncionarioActionPerformed

    private void btnSairFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairFuncionarioActionPerformed
       this.setVisible(false);
       this.dispose();
    }//GEN-LAST:event_btnSairFuncionarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSairFuncionario;
    private javax.swing.JButton btnSalvaFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCPFFuncionario;
    private javax.swing.JLabel lblEnderecoFuncionario;
    private javax.swing.JLabel lblNomeFuncionario;
    private javax.swing.JLabel lblNumFuncionario;
    private javax.swing.JLabel lblSetorFuncionario;
    private javax.swing.JTextField txtCPFFuncionario;
    private javax.swing.JTextField txtEnderecoFuncionario;
    private javax.swing.JTextField txtNomeFuncionario;
    private javax.swing.JTextField txtNumFuncionario;
    private javax.swing.JTextField txtSetorFuncionario;
    // End of variables declaration//GEN-END:variables
}
