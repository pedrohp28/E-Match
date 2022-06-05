/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import Conexao.DAO;
import Objetos.CadastroCliente;
import Objetos.Usuario;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author phdam
 */
public class User extends javax.swing.JFrame {

    /**
     * Creates new form UserT
     */
    public User() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtNomeUsuario = new javax.swing.JTextField();
        jPanel34 = new javax.swing.JPanel();
        jCadastrar = new javax.swing.JButton();
        jLimparU2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        txtConsultaCpf = new javax.swing.JFormattedTextField();
        jPanel32 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        txtBuscaNome = new javax.swing.JTextField();
        bDeletarU = new javax.swing.JButton();
        bAtualizarU = new javax.swing.JButton();
        jLabel64 = new javax.swing.JLabel();
        txtBuscaSenha = new javax.swing.JTextField();
        bBuscarU = new javax.swing.JButton();
        bLimparU = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/Img/ematch.png")).getImage());
        setUndecorated(true);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));
        jPanel33.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Usuários"));
        jPanel33.setLayout(null);

        jLabel14.setText("Nome");
        jPanel33.add(jLabel14);
        jLabel14.setBounds(40, 30, 50, 16);

        txtNomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeUsuarioActionPerformed(evt);
            }
        });
        jPanel33.add(txtNomeUsuario);
        txtNomeUsuario.setBounds(40, 50, 314, 22);

        jPanel34.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jCadastrar.setBackground(new java.awt.Color(102, 102, 102));
        jCadastrar.setForeground(new java.awt.Color(153, 255, 153));
        jCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/mole.png"))); // NOI18N
        jCadastrar.setText("Cadastrar");
        jCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastrarActionPerformed(evt);
            }
        });

        jLimparU2.setBackground(new java.awt.Color(102, 102, 102));
        jLimparU2.setForeground(new java.awt.Color(153, 255, 153));
        jLimparU2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/limpar-limpo.png"))); // NOI18N
        jLimparU2.setText("  Limpar");
        jLimparU2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLimparU2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLimparU2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLimparU2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel33.add(jPanel34);
        jPanel34.setBounds(40, 190, 314, 68);

        jLabel1.setText("Digite uma senha:");
        jPanel33.add(jLabel1);
        jLabel1.setBounds(40, 80, 104, 16);

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        jPanel33.add(txtSenha);
        txtSenha.setBounds(40, 100, 314, 22);

        jLabel2.setText("CPF");
        jPanel33.add(jLabel2);
        jLabel2.setBounds(40, 130, 30, 16);

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });
        jPanel33.add(txtCpf);
        txtCpf.setBounds(40, 150, 110, 22);

        jPanel1.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 390, 310));

        jTabbedPane1.addTab("CADASTRAR", jPanel1);

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.setBorder(javax.swing.BorderFactory.createTitledBorder("Busca de Usuários"));
        jPanel31.setForeground(new java.awt.Color(153, 255, 153));
        jPanel31.setLayout(null);

        jLabel62.setText("CPF");
        jPanel31.add(jLabel62);
        jLabel62.setBounds(18, 35, 30, 16);

        try {
            txtConsultaCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel31.add(txtConsultaCpf);
        txtConsultaCpf.setBounds(45, 32, 135, 23);

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));
        jPanel32.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel63.setText("Nome");

        txtBuscaNome.setOpaque(false);

        bDeletarU.setBackground(new java.awt.Color(102, 102, 102));
        bDeletarU.setForeground(new java.awt.Color(153, 255, 153));
        bDeletarU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/delete.png"))); // NOI18N
        bDeletarU.setText("Deletar");
        bDeletarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeletarUActionPerformed(evt);
            }
        });

        bAtualizarU.setBackground(new java.awt.Color(102, 102, 102));
        bAtualizarU.setForeground(new java.awt.Color(153, 255, 153));
        bAtualizarU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/updated.png"))); // NOI18N
        bAtualizarU.setText("Atualizar");
        bAtualizarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtualizarUActionPerformed(evt);
            }
        });

        jLabel64.setText("Senha");

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscaNome)
                    .addComponent(txtBuscaSenha)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                        .addComponent(bAtualizarU, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(bDeletarU, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel64)
                            .addComponent(jLabel63))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel63)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel64)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bDeletarU, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(bAtualizarU, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                .addGap(335, 335, 335))
        );

        jPanel31.add(jPanel32);
        jPanel32.setBounds(18, 69, 373, 190);

        bBuscarU.setBackground(new java.awt.Color(102, 102, 102));
        bBuscarU.setForeground(new java.awt.Color(153, 255, 153));
        bBuscarU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/binoculars.png"))); // NOI18N
        bBuscarU.setText("Buscar");
        bBuscarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarUActionPerformed(evt);
            }
        });
        jPanel31.add(bBuscarU);
        bBuscarU.setBounds(187, 31, 90, 25);

        bLimparU.setBackground(new java.awt.Color(102, 102, 102));
        bLimparU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/limpar-limpo.png"))); // NOI18N
        bLimparU.setText("Limpar");
        bLimparU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimparUActionPerformed(evt);
            }
        });
        jPanel31.add(bLimparU);
        bLimparU.setBounds(285, 31, 98, 25);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("CONSULTAR", jPanel2);

        jMenu1.setText("Opção");

        jMenuItem1.setText("Menu");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bDeletarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeletarUActionPerformed
        Usuario u = new Usuario();
        DAO dao = new DAO();
        
        dao.deleteUsuario(u, txtConsultaCpf.getText());
        
        txtConsultaCpf.setText("");
        txtBuscaNome.setText("");
        txtBuscaSenha.setText("");
        
    }//GEN-LAST:event_bDeletarUActionPerformed

    private void bAtualizarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtualizarUActionPerformed
        Usuario u = new Usuario();
        DAO dao = new DAO();
        
        u.setNome(txtBuscaNome.getText()); 
        u.setSenha(txtBuscaSenha.getText());
        dao.updateUsuario(u, txtConsultaCpf.getText());
    }//GEN-LAST:event_bAtualizarUActionPerformed

    private void bBuscarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarUActionPerformed
        DAO dao = new DAO();
        
        for(Usuario u : dao.readBuscaUsuario(txtConsultaCpf.getText())){
            
            txtBuscaNome.setText(u.getNome());
            txtBuscaSenha.setText(u.getSenha());

        }
    }//GEN-LAST:event_bBuscarUActionPerformed

    private void bLimparUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimparUActionPerformed
        txtConsultaCpf.setText("");
        txtBuscaNome.setText("");
        txtBuscaSenha.setText("");
    }//GEN-LAST:event_bLimparUActionPerformed

    private void txtNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeUsuarioActionPerformed

    private void jCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastrarActionPerformed
        Usuario u = new Usuario();
        DAO dao = new DAO();

        if(dao.checkCpfUsuario(txtCpf.getText())){
            JOptionPane.showMessageDialog(null, "Cpf já existente!");
        } else {
            u.setNome(txtNomeUsuario.getText());
            u.setSenha(txtSenha.getText());
            u.setCpf(txtCpf.getText());
            dao.createUsuario(u);
        }
        

        txtNomeUsuario.setText("");
        txtSenha.setText("");
        txtCpf.setText("");
    }//GEN-LAST:event_jCadastrarActionPerformed

    private void jLimparU2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLimparU2ActionPerformed
        txtNomeUsuario.setText("");
        txtSenha.setText("");
        txtCpf.setText("");
    }//GEN-LAST:event_jLimparU2ActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed

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
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAtualizarU;
    private javax.swing.JButton bBuscarU;
    private javax.swing.JButton bDeletarU;
    private javax.swing.JButton bLimparU;
    private javax.swing.JButton jCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JButton jLimparU2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtBuscaNome;
    private javax.swing.JTextField txtBuscaSenha;
    private javax.swing.JFormattedTextField txtConsultaCpf;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtNomeUsuario;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables
}
