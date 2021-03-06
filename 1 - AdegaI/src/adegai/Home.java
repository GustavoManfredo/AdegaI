package adegai;

import dao.ClienteDAO;
import dao.VendaDAO;

import java.awt.Cursor;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
        
        try {
            buscarQntClientes(totalClientes);
            buscarQntVendas(totalVendas);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        botaoContatos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botaoProdutos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botaoVendas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botaoRelatorios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
    }
    
    public Home(String funcionario, String funcao, String id){
        initComponents();
        
        try {
            buscarQntClientes(totalClientes);
            buscarQntVendas(totalVendas);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        funcionarioNome.setText(funcionario);
        funcionarioFunction.setText(funcao);
        funcionarioId.setText(id);
        
        if (funcionarioFunction.getText().equals("Padrão")){
            botaoRelatorios.show(false);
            botaoProdutos.show(false);         
        }
        
        botaoContatos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botaoProdutos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botaoVendas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botaoRelatorios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logoIcon = new javax.swing.JLabel();
        userIcon = new javax.swing.JLabel();
        funcionarioId = new javax.swing.JLabel();
        funcionarioNome = new javax.swing.JLabel();
        funcionarioFunction = new javax.swing.JLabel();
        logoHome = new javax.swing.JLabel();
        totalClientes = new javax.swing.JLabel();
        totalVendas = new javax.swing.JLabel();
        totalVendasCaixa = new javax.swing.JLabel();
        totalClientesCaixa = new javax.swing.JLabel();
        botaoHome = new javax.swing.JButton();
        botaoVendas = new javax.swing.JButton();
        botaoContatos = new javax.swing.JButton();
        botaoProdutos = new javax.swing.JButton();
        botaoRelatorios = new javax.swing.JButton();
        menuLateral = new javax.swing.JLabel();
        menuCima = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/logo.png"))); // NOI18N
        jPanel1.add(logoIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        userIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/userIcon.png"))); // NOI18N
        jPanel1.add(userIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 26, -1, -1));

        funcionarioId.setFont(new java.awt.Font("Jost", 1, 30)); // NOI18N
        funcionarioId.setForeground(new java.awt.Color(255, 255, 255));
        funcionarioId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        funcionarioId.setText("0");
        jPanel1.add(funcionarioId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 35, 65, -1));

        funcionarioNome.setFont(new java.awt.Font("Jost", 1, 24)); // NOI18N
        funcionarioNome.setForeground(new java.awt.Color(255, 255, 255));
        funcionarioNome.setText("User");
        jPanel1.add(funcionarioNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        funcionarioFunction.setFont(new java.awt.Font("Jost", 2, 12)); // NOI18N
        funcionarioFunction.setForeground(new java.awt.Color(255, 255, 255));
        funcionarioFunction.setText("administrador");
        jPanel1.add(funcionarioFunction, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        logoHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/logoHome.png"))); // NOI18N
        jPanel1.add(logoHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, -1, -1));

        totalClientes.setFont(new java.awt.Font("Jost", 1, 70)); // NOI18N
        totalClientes.setForeground(new java.awt.Color(255, 209, 0));
        totalClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalClientes.setText("0");
        jPanel1.add(totalClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 530, 370, -1));

        totalVendas.setFont(new java.awt.Font("Jost", 1, 70)); // NOI18N
        totalVendas.setForeground(new java.awt.Color(255, 209, 0));
        totalVendas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalVendas.setText("0");
        jPanel1.add(totalVendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 530, 370, -1));

        totalVendasCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/totalVendasCaixa.png"))); // NOI18N
        jPanel1.add(totalVendasCaixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 435, -1, -1));

        totalClientesCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/totalClientesCaixa.png"))); // NOI18N
        jPanel1.add(totalClientesCaixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 435, -1, -1));

        botaoHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/homeIconPressed.png"))); // NOI18N
        botaoHome.setBorder(null);
        botaoHome.setBorderPainted(false);
        botaoHome.setContentAreaFilled(false);
        jPanel1.add(botaoHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        botaoVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/vendaIcon.png"))); // NOI18N
        botaoVendas.setBorder(null);
        botaoVendas.setBorderPainted(false);
        botaoVendas.setContentAreaFilled(false);
        botaoVendas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/vendaIconPressed.png"))); // NOI18N
        botaoVendas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/vendaIconPressed.png"))); // NOI18N
        botaoVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVendasActionPerformed(evt);
            }
        });
        jPanel1.add(botaoVendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        botaoContatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/contatosIcon.png"))); // NOI18N
        botaoContatos.setBorder(null);
        botaoContatos.setBorderPainted(false);
        botaoContatos.setContentAreaFilled(false);
        botaoContatos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/contatosIconPressed.png"))); // NOI18N
        botaoContatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoContatosActionPerformed(evt);
            }
        });
        jPanel1.add(botaoContatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        botaoProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/productIcon.png"))); // NOI18N
        botaoProdutos.setBorder(null);
        botaoProdutos.setBorderPainted(false);
        botaoProdutos.setContentAreaFilled(false);
        botaoProdutos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/productIconPressed.png"))); // NOI18N
        botaoProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProdutosActionPerformed(evt);
            }
        });
        jPanel1.add(botaoProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        botaoRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/relatorioIcon.png"))); // NOI18N
        botaoRelatorios.setBorder(null);
        botaoRelatorios.setBorderPainted(false);
        botaoRelatorios.setContentAreaFilled(false);
        botaoRelatorios.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/relatorioIconPressed.png"))); // NOI18N
        botaoRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRelatoriosActionPerformed(evt);
            }
        });
        jPanel1.add(botaoRelatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, -1, -1));

        menuLateral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/menuLateral.png"))); // NOI18N
        jPanel1.add(menuLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        menuCima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/menuCima.png"))); // NOI18N
        jPanel1.add(menuCima, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/bg.png"))); // NOI18N
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void botaoVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVendasActionPerformed
        new Vendas(this.funcionarioNome.getText(), this.funcionarioFunction.getText(), this.funcionarioId.getText()).setVisible(true);
        this.dispose();         
    }//GEN-LAST:event_botaoVendasActionPerformed

    //DIRECIONA PARA A TELA PRODUTOS
    private void botaoProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProdutosActionPerformed
        new ProdutosADM(this.funcionarioNome.getText(), this.funcionarioFunction.getText(), this.funcionarioId.getText()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoProdutosActionPerformed

    //DIRECIONA PARA A TELA CONTATOS
    private void botaoContatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoContatosActionPerformed
        if (funcionarioFunction.getText().equals("Padrão")) {
            new Contatos(this.funcionarioNome.getText(), this.funcionarioFunction.getText(), this.funcionarioId.getText()).setVisible(true);
            this.dispose();
        } else {
            new ContatosADM(this.funcionarioNome.getText(), this.funcionarioFunction.getText(), this.funcionarioId.getText()).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_botaoContatosActionPerformed

    //DIRECIONA PARA A TELA RELATORIOS
    private void botaoRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRelatoriosActionPerformed
        new RelatoriosADM(this.funcionarioNome.getText(), this.funcionarioFunction.getText(), this.funcionarioId.getText()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoRelatoriosActionPerformed
    
    //BUSCA QUANTIDADE DE CLIENTES
    public void buscarQntClientes(JLabel label) throws SQLException{
        ClienteDAO cdao = new ClienteDAO();
        
        label.setText(Integer.toString(cdao.quantidadeCliente()));
    }
    
    public void buscarQntVendas (JLabel label) throws SQLException {
        VendaDAO vdao = new VendaDAO();
                
        label.setText(Integer.toString(vdao.quantidadeVendas()));
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton botaoContatos;
    private javax.swing.JButton botaoHome;
    private javax.swing.JButton botaoProdutos;
    private javax.swing.JButton botaoRelatorios;
    private javax.swing.JButton botaoVendas;
    private javax.swing.JLabel funcionarioFunction;
    private javax.swing.JLabel funcionarioId;
    private javax.swing.JLabel funcionarioNome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoHome;
    private javax.swing.JLabel logoIcon;
    private javax.swing.JLabel menuCima;
    private javax.swing.JLabel menuLateral;
    private javax.swing.JLabel totalClientes;
    private javax.swing.JLabel totalClientesCaixa;
    private javax.swing.JLabel totalVendas;
    private javax.swing.JLabel totalVendasCaixa;
    private javax.swing.JLabel userIcon;
    // End of variables declaration//GEN-END:variables
}
