/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package tela;

import DAO.PessoaDAO;
import entidade.Pessoa;
import java.util.ArrayList;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author artur
 */
public class DlgBuscarPessoa extends javax.swing.JDialog {

    ArrayList<Pessoa> pessoas = new ArrayList<>();
    IfrEmprestimo frameMae;

    /**
     * Creates new form ClgBuscarPessoa
     */
    public DlgBuscarPessoa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        popularTabelaPessoas();
    }

    public DlgBuscarPessoa(java.awt.Frame parent, boolean modal, IfrEmprestimo frameMae) {
        super(parent, modal);
        initComponents();

        this.frameMae = frameMae;

        popularTabelaPessoas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        TblPessoas = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        TxtFiltroNome = new javax.swing.JTextField();
        TxtFiltroApelido = new javax.swing.JTextField();
        BtnPessoaLimparFiltro = new javax.swing.JButton();
        BtnPessoaFiltrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSelecionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TblPessoas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Apelido", "Telefone", "e-mail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblPessoas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblPessoasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TblPessoas);

        jLabel12.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel12.setText("Filtros:");

        jLabel13.setText("Nome:");

        jLabel14.setText("Apelido:");

        BtnPessoaLimparFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/broom.png"))); // NOI18N
        BtnPessoaLimparFiltro.setText("Limpar");
        BtnPessoaLimparFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPessoaLimparFiltroActionPerformed(evt);
            }
        });

        BtnPessoaFiltrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/loupe.png"))); // NOI18N
        BtnPessoaFiltrar.setText("Buscar");
        BtnPessoaFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPessoaFiltrarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cross.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSelecionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add-file.png"))); // NOI18N
        btnSelecionar.setText("Selecionar");
        btnSelecionar.setEnabled(false);
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BtnPessoaFiltrar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BtnPessoaLimparFiltro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnSelecionar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnCancelar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TxtFiltroApelido, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtFiltroNome, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TxtFiltroNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(TxtFiltroApelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnPessoaFiltrar)
                    .addComponent(BtnPessoaLimparFiltro)
                    .addComponent(btnCancelar)
                    .addComponent(btnSelecionar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TblPessoasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblPessoasMouseClicked
        if (TblPessoas.getSelectedRow() >= 0) {
            btnSelecionar.setEnabled(true);
        }
    }//GEN-LAST:event_TblPessoasMouseClicked

    private void BtnPessoaLimparFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPessoaLimparFiltroActionPerformed
        limparFiltroPessoa();
        popularTabelaPessoas();
        btnSelecionar.setEnabled(false);
    }//GEN-LAST:event_BtnPessoaLimparFiltroActionPerformed

    private void BtnPessoaFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPessoaFiltrarActionPerformed
        popularTabelaPessoas();
    }//GEN-LAST:event_BtnPessoaFiltrarActionPerformed

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Confirmar seleção do(a) Pessoa?", "Confirmação", JOptionPane.YES_NO_OPTION) == 0) {
            Pessoa pessoa = new PessoaDAO().consultarId(pessoas.get(TblPessoas.getSelectedRow()).getId());
            frameMae.setPessoaSelecionada(pessoa);
            frameMae.imprimirPessoaSelecionada();
            this.dispose();
        }
    }//GEN-LAST:event_btnSelecionarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void limparFiltroPessoa() {
        TxtFiltroNome.setText("");
        TxtFiltroApelido.setText("");
    }

    public void popularTabelaPessoas() {
        btnSelecionar.setEnabled(false);

        pessoas = new PessoaDAO().consultar(criarFiltroPessoa());

        Object[] cabecalho = {"Nome", "Apelido", "Telefone", "e-mail"};

        DefaultTableModel model = new DefaultTableModel(cabecalho, 0) {
            @Override
            public boolean isCellEditable(int row, int collumn) {
                return false;
            }
        };

        for (Pessoa pessoa : pessoas) {
            String nome = pessoa.getNome();
            String apelido = pessoa.getApelido();
            String telefone = pessoa.getTelefone();
            String email = pessoa.getEmail();

            Object[] row = {nome, apelido, telefone, email};

            model.addRow(row);
        }

        TblPessoas.setModel(model);

        TblPessoas.setSelectionMode(0);

        TableColumn coluna = null;
        for (int i = 0; i < TblPessoas.getColumnCount(); i++) {
            coluna = TblPessoas.getColumnModel().getColumn(i);
            coluna.setResizable(false);

            switch (i) {
                case 0:
                    coluna.setMaxWidth(350);
                    break;
                case 1:
                    coluna.setMaxWidth(200);
                    break;
                case 2:
                    coluna.setMaxWidth(150);
                    break;
                case 3:
                    coluna.setMaxWidth(350);
                    break;
            }
        }
    }

    private String criarFiltroPessoa() {
        String dml = "SELECT * FROM pessoa WHERE id > 0 ";

        if (TxtFiltroNome.getText().length() != 0) {
            String add = "AND nome ILIKE '%" + TxtFiltroNome.getText() + "%' ";
            dml = dml + add;
        }

        if (TxtFiltroApelido.getText().length() != 0) {
            String add = "AND apelido ILIKE '%" + TxtFiltroApelido.getText() + "%' ";
            dml = dml + add;
        }

        dml = dml + "ORDER BY nome;";

        return dml;
    }

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
            java.util.logging.Logger.getLogger(DlgBuscarPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgBuscarPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgBuscarPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgBuscarPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgBuscarPessoa dialog = new DlgBuscarPessoa(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnPessoaFiltrar;
    private javax.swing.JButton BtnPessoaLimparFiltro;
    private javax.swing.JTable TblPessoas;
    private javax.swing.JTextField TxtFiltroApelido;
    private javax.swing.JTextField TxtFiltroNome;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}