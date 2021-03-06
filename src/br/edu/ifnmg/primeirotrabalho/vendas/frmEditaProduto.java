/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.primeirotrabalho.vendas;

import br.edu.ifnmg.DadosClasses.Produto;
import br.edu.ifnmg.Teste.DataAcess.ProdutoDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author Rosy
 */
public class frmEditaProduto extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmEditaProduto
     */
    
    Produto produto;
    ProdutoDAO dao = new ProdutoDAO();
    
    public frmEditaProduto() {
        initComponents();
        
        carregaCampos();
    }
    
     public frmEditaProduto(Produto p, ProdutoDAO d){
        this.produto = p;
        this.dao = d;
        
       carregaCampos();
    }

     private void carregaCampos() {
        lblID.setText(Integer.toString(produto.getIdProduto()));
        txtnomeProduto.setText(produto.getNomeProduto());
        txtdescricaoProduto.setText(produto.getDescricao());
        txtValorProduto.setText(Double.toString(produto.getValorUnitario()));
        txtValorVenda.setText(Double.toString(produto.getValorVenda()));
        txtEstoque.setText(Double.toString(produto.getEstoque()));
    }
    
    private void carregaObjeto() {
        lblID.setText(Integer.toString(produto.getIdProduto()));
        produto.setNomeProduto(txtnomeProduto.getText());
        produto.setDescricao(txtdescricaoProduto.getText());
        produto.setValorUnitario(Double.parseDouble(txtValorProduto.getText()));
        produto.setValorVenda(Double.parseDouble(txtValorVenda.getText()));
        produto.setEstoque(Double.parseDouble(txtEstoque.getText()));
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
        lblCadastroProduto = new javax.swing.JLabel();
        lblDescicaoProduto = new javax.swing.JLabel();
        lblValorProduto = new javax.swing.JLabel();
        lblValorVenda = new javax.swing.JLabel();
        lblEstoque = new javax.swing.JLabel();
        txtValorProduto = new javax.swing.JTextField();
        txtValorVenda = new javax.swing.JTextField();
        txtEstoque = new javax.swing.JTextField();
        btnSalvarProduto = new javax.swing.JButton();
        txtnomeProduto = new javax.swing.JTextField();
        btnSairProduto = new javax.swing.JButton();
        lblNomeProduto = new javax.swing.JLabel();
        txtdescricaoProduto = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();

        lblCadastroProduto.setText("CADASTRO DE PRODUTOS:");

        lblDescicaoProduto.setText("Descrição:");

        lblValorProduto.setText("Valor do Produto:");

        lblValorVenda.setText("Valor da Venda:");

        lblEstoque.setText("Estoque:");

        txtValorProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorProdutoActionPerformed(evt);
            }
        });

        btnSalvarProduto.setText("Salvar");
        btnSalvarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarProdutoActionPerformed(evt);
            }
        });

        txtnomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeProdutoActionPerformed(evt);
            }
        });

        btnSairProduto.setText("Sair");
        btnSairProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairProdutoActionPerformed(evt);
            }
        });

        lblNomeProduto.setText("Nome:");

        lblId.setText("ID:");

        lblID.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCadastroProduto)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(btnSalvarProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSairProduto))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblId)
                            .addComponent(lblNomeProduto)
                            .addComponent(lblDescicaoProduto))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblID)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblEstoque)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(lblValorVenda)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(lblValorProduto)
                            .addGap(18, 18, 18)
                            .addComponent(txtValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(txtdescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCadastroProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(lblID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeProduto)
                    .addComponent(txtnomeProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescicaoProduto)
                    .addComponent(txtdescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorProduto)
                    .addComponent(txtValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorVenda)
                    .addComponent(txtValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstoque)
                    .addComponent(txtEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarProduto)
                    .addComponent(btnSairProduto))
                .addGap(73, 73, 73))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtValorProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorProdutoActionPerformed

    }//GEN-LAST:event_txtValorProdutoActionPerformed

    private void btnSalvarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarProdutoActionPerformed
        produto = new Produto();
         try{
            boolean validar = true;

            // Teste para caracteres do nome
            if ((txtdescricaoProduto.getText().trim().length()<3) || (txtdescricaoProduto.getText().length() > 250 )){
                JOptionPane.showConfirmDialog(rootPane, "Caracteres só acima de 3 digitos!","Titulo",JOptionPane.ERROR_MESSAGE);
                txtdescricaoProduto.requestFocus();
                validar=false;
            }

            // validar o valor do produto
            int valorp;
            valorp = Integer.parseInt(txtValorProduto.getText());
            if(valorp <= 0){
                JOptionPane.showConfirmDialog(rootPane,"O Valor do Produto não pode ser inferior a zero!","Titulo",JOptionPane.ERROR_MESSAGE);
                txtValorProduto.requestFocus();
                validar = false;
            }

            // Teste para validar a quantidade do estoque
            int estoque;
            estoque = Integer.parseInt(txtEstoque.getText());
            if(estoque <= 0){
                JOptionPane.showConfirmDialog(rootPane,"Quantidade de Estoque inferior a zero não pode ser aceito!","Titulo",JOptionPane.ERROR_MESSAGE);
                txtEstoque.requestFocus();
                validar = false;
            }

            if(validar){
                if(JOptionPane.showConfirmDialog(rootPane, "Deseja Salvar o Produto")== 0){

                    carregaObjeto();
                    //btnRealizarVenda.setText("Salvo");
                    if (dao.Salvar(produto)){
                        JOptionPane.showMessageDialog(rootPane, "Produto cadastrado com Sucesso!");
                    }else{
                        // btnRealizarVenda.setText("Não Salvo");
                        JOptionPane.showMessageDialog(rootPane, "Falha ao Salvar o produto ","Titulo",JOptionPane.INFORMATION_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(rootPane,"Operacao Cancelada!");
                }
            }
        } catch (Exception ex){
            JOptionPane.showMessageDialog(rootPane, "Erro ao salvar!");   
        }
    }//GEN-LAST:event_btnSalvarProdutoActionPerformed

    private void txtnomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomeProdutoActionPerformed

    private void btnSairProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairProdutoActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnSairProdutoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSairProduto;
    private javax.swing.JButton btnSalvarProduto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCadastroProduto;
    private javax.swing.JLabel lblDescicaoProduto;
    private javax.swing.JLabel lblEstoque;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNomeProduto;
    private javax.swing.JLabel lblValorProduto;
    private javax.swing.JLabel lblValorVenda;
    private javax.swing.JTextField txtEstoque;
    private javax.swing.JTextField txtValorProduto;
    private javax.swing.JTextField txtValorVenda;
    private javax.swing.JTextField txtdescricaoProduto;
    private javax.swing.JTextField txtnomeProduto;
    // End of variables declaration//GEN-END:variables

  
}
