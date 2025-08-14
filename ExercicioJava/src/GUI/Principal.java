package GUI;

import javax.swing.JFrame;

public class Principal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Principal.class.getName());

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuBiblioteca = new javax.swing.JMenu();
        ListarEstoque = new javax.swing.JMenuItem();
        InserirEstoque = new javax.swing.JMenuItem();
        AlterarEstoque = new javax.swing.JMenuItem();
        ExcluirEstoque = new javax.swing.JMenuItem();
        menuClientes = new javax.swing.JMenu();
        ListarCliente = new javax.swing.JMenuItem();
        InserirCliente = new javax.swing.JMenuItem();
        AlterarCliente = new javax.swing.JMenuItem();
        ExcluirCliente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        AbrirConfiguracao = new javax.swing.JMenuItem();
        menuClientes1 = new javax.swing.JMenu();
        ListarEmprestimo = new javax.swing.JMenuItem();
        InserirEmprestimo = new javax.swing.JMenuItem();
        AlterarExcluirEmprestimo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToggleButton1.setText("Sair");
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }
        });
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jToggleButton1)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        menuBiblioteca.setText("Estoque");

        ListarEstoque.setText("Listar");
        ListarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarEstoqueActionPerformed(evt);
            }
        });
        menuBiblioteca.add(ListarEstoque);

        InserirEstoque.setText("Inserir");
        InserirEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InserirEstoqueActionPerformed(evt);
            }
        });
        menuBiblioteca.add(InserirEstoque);

        AlterarEstoque.setText("Alterar");
        AlterarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarEstoqueActionPerformed(evt);
            }
        });
        menuBiblioteca.add(AlterarEstoque);

        ExcluirEstoque.setText("Excluir");
        ExcluirEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirEstoqueActionPerformed(evt);
            }
        });
        menuBiblioteca.add(ExcluirEstoque);

        jMenuBar1.add(menuBiblioteca);

        menuClientes.setText("Clientes");

        ListarCliente.setText("Listar");
        ListarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarClienteActionPerformed(evt);
            }
        });
        menuClientes.add(ListarCliente);

        InserirCliente.setText("Inserir");
        InserirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InserirClienteActionPerformed(evt);
            }
        });
        menuClientes.add(InserirCliente);

        AlterarCliente.setText("Alterar");
        AlterarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarClienteActionPerformed(evt);
            }
        });
        menuClientes.add(AlterarCliente);

        ExcluirCliente.setText("Excluir");
        ExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirClienteActionPerformed(evt);
            }
        });
        menuClientes.add(ExcluirCliente);

        jMenuBar1.add(menuClientes);

        jMenu2.setText("Ferramentas");

        AbrirConfiguracao.setText("Configurações");
        AbrirConfiguracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirConfiguracaoActionPerformed(evt);
            }
        });
        jMenu2.add(AbrirConfiguracao);

        jMenuBar1.add(jMenu2);

        menuClientes1.setText("Entregador");

        ListarEmprestimo.setText("Listar");
        ListarEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarEmprestimoActionPerformed(evt);
            }
        });
        menuClientes1.add(ListarEmprestimo);

        InserirEmprestimo.setText("Inserir");
        InserirEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InserirEmprestimoActionPerformed(evt);
            }
        });
        menuClientes1.add(InserirEmprestimo);

        AlterarExcluirEmprestimo.setText("Alterar/Excluir");
        AlterarExcluirEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarExcluirEmprestimoActionPerformed(evt);
            }
        });
        menuClientes1.add(AlterarExcluirEmprestimo);

        jMenuBar1.add(menuClientes1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarEstoqueActionPerformed
       JFrame Lista = new ListarLivros();
       Lista.setLocationRelativeTo(rootPane); 
       Lista.setVisible(true);
    }//GEN-LAST:event_ListarEstoqueActionPerformed

    private void AbrirConfiguracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirConfiguracaoActionPerformed
        JFrame Conf = new Configuracoes();
        Conf.setLocationRelativeTo(rootPane);
        Conf.setVisible(true);
    }//GEN-LAST:event_AbrirConfiguracaoActionPerformed

    private void InserirEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InserirEstoqueActionPerformed
        JFrame Ins = new insereLivro();
        Ins.setLocationRelativeTo(rootPane);
        Ins.setVisible(true);
    }//GEN-LAST:event_InserirEstoqueActionPerformed

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked
        dispose();
    }//GEN-LAST:event_jToggleButton1MouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void ExcluirEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirEstoqueActionPerformed
      JFrame Exc = new ExcluirLivro();
        Exc.setLocationRelativeTo(rootPane);
        Exc.setVisible(true);
    }//GEN-LAST:event_ExcluirEstoqueActionPerformed

    private void AlterarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarEstoqueActionPerformed
        JFrame Alt = new AlterarLivro();
        Alt.setLocationRelativeTo(rootPane);
        Alt.setVisible(true);
    }//GEN-LAST:event_AlterarEstoqueActionPerformed

    private void ListarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarClienteActionPerformed
            JFrame ListCli = new ListarClientes();
        ListCli.setLocationRelativeTo(rootPane);
        ListCli.setVisible(true);
    }//GEN-LAST:event_ListarClienteActionPerformed

    private void InserirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InserirClienteActionPerformed
        JFrame InsC = new InsereCliente();
        InsC.setLocationRelativeTo(rootPane);
        InsC.setVisible(true);   
    }//GEN-LAST:event_InserirClienteActionPerformed

    private void AlterarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarClienteActionPerformed
        JFrame AltC = new AlterarCliente();
        AltC.setLocationRelativeTo(rootPane);
        AltC.setVisible(true);
    }//GEN-LAST:event_AlterarClienteActionPerformed

    private void ExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirClienteActionPerformed
        JFrame ExcC = new ExcluirCliente();
        ExcC.setLocationRelativeTo(rootPane);
        ExcC.setVisible(true); 
    }//GEN-LAST:event_ExcluirClienteActionPerformed

    private void ListarEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarEmprestimoActionPerformed
        JFrame LLE = new ListaClientesEmprestimos();
        LLE.setLocationRelativeTo(rootPane);
        LLE.setVisible(true);
    }//GEN-LAST:event_ListarEmprestimoActionPerformed

    private void InserirEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InserirEmprestimoActionPerformed
        JFrame IE = new InsereEmprestimo();
        IE.setLocationRelativeTo(rootPane);
        IE.setVisible(true);
    }//GEN-LAST:event_InserirEmprestimoActionPerformed

    private void AlterarExcluirEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarExcluirEmprestimoActionPerformed
        JFrame EXCA = new ExcluirEmprestimo();
        EXCA.setLocationRelativeTo(rootPane);
        EXCA.setVisible(true);
    }//GEN-LAST:event_AlterarExcluirEmprestimoActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Principal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AbrirConfiguracao;
    private javax.swing.JMenuItem AlterarCliente;
    private javax.swing.JMenuItem AlterarEstoque;
    private javax.swing.JMenuItem AlterarExcluirEmprestimo;
    private javax.swing.JMenuItem ExcluirCliente;
    private javax.swing.JMenuItem ExcluirEstoque;
    private javax.swing.JMenuItem InserirCliente;
    private javax.swing.JMenuItem InserirEmprestimo;
    private javax.swing.JMenuItem InserirEstoque;
    private javax.swing.JMenuItem ListarCliente;
    private javax.swing.JMenuItem ListarEmprestimo;
    private javax.swing.JMenuItem ListarEstoque;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JMenu menuBiblioteca;
    private javax.swing.JMenu menuClientes;
    private javax.swing.JMenu menuClientes1;
    // End of variables declaration//GEN-END:variables
}
