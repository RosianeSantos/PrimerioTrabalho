/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.primeirotrabalho.vendas;

/**
 *
 * @author Rosy
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
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

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastroCliente = new javax.swing.JMenu();
        menitemCliente = new javax.swing.JMenuItem();
        menProduto = new javax.swing.JMenuItem();
        menFormaPagamento = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menListarCliente = new javax.swing.JMenuItem();
        menListarFormaPagamento = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        menListarVenda = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menItemRealizarVenda = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        menuCadastroCliente.setText("Cadastro");

        menitemCliente.setText("Cliente");
        menitemCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menitemClienteMouseClicked(evt);
            }
        });
        menitemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menitemClienteActionPerformed(evt);
            }
        });
        menuCadastroCliente.add(menitemCliente);

        menProduto.setText("Produto");
        menProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menProdutoActionPerformed(evt);
            }
        });
        menuCadastroCliente.add(menProduto);

        menFormaPagamento.setText("Forma Pagamento");
        menFormaPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menFormaPagamentoActionPerformed(evt);
            }
        });
        menuCadastroCliente.add(menFormaPagamento);

        jMenuBar1.add(menuCadastroCliente);

        jMenu2.setText("Listar");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        menListarCliente.setText("Cliente");
        jMenu2.add(menListarCliente);

        menListarFormaPagamento.setText("Produto");
        menListarFormaPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menListarFormaPagamentoActionPerformed(evt);
            }
        });
        jMenu2.add(menListarFormaPagamento);

        jMenuItem3.setText("Forma Pagamento");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        menListarVenda.setText("Venda");
        menListarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menListarVendaActionPerformed(evt);
            }
        });
        jMenu2.add(menListarVenda);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Venda");

        menItemRealizarVenda.setText("Realizar Venda");
        menItemRealizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menItemRealizarVendaActionPerformed(evt);
            }
        });
        jMenu4.add(menItemRealizarVenda);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menitemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menitemClienteActionPerformed
        frmCadastro janela = new frmCadastro();
        add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_menitemClienteActionPerformed

    private void menProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menProdutoActionPerformed
        frmProduto janela = new frmProduto();
        add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_menProdutoActionPerformed

    private void menFormaPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menFormaPagamentoActionPerformed
        frmFormadePagamento janela = new frmFormadePagamento();
        add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_menFormaPagamentoActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
       frmListagemCliente janela = new frmListagemCliente();
       add(janela);
       janela.setVisible(true);
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void menListarFormaPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menListarFormaPagamentoActionPerformed
       frmListagemProduto janela = new frmListagemProduto();
       add(janela);
       janela.setVisible(true);
    }//GEN-LAST:event_menListarFormaPagamentoActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        frmListagemFormaPagamento janela = new frmListagemFormaPagamento();
        add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void menListarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menListarVendaActionPerformed
       frmListagemVenda janela = new frmListagemVenda();
       add(janela);
       janela.setVisible(true);
    }//GEN-LAST:event_menListarVendaActionPerformed

    private void menitemClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menitemClienteMouseClicked
        frmCadastro janela = new frmCadastro();
        add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_menitemClienteMouseClicked

    private void menItemRealizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menItemRealizarVendaActionPerformed
        frmVenda janela = new frmVenda();
        add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_menItemRealizarVendaActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem menFormaPagamento;
    private javax.swing.JMenuItem menItemRealizarVenda;
    private javax.swing.JMenuItem menListarCliente;
    private javax.swing.JMenuItem menListarFormaPagamento;
    private javax.swing.JMenuItem menListarVenda;
    private javax.swing.JMenuItem menProduto;
    private javax.swing.JMenuItem menitemCliente;
    private javax.swing.JMenu menuCadastroCliente;
    // End of variables declaration//GEN-END:variables
}
