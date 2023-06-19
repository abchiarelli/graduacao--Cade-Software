/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package tela;

import DAO.EmprestimoDAO;
import DAO.ObjetoDAO;
import apoio.Automatizar;
import apoio.Formatacao;
import entidade.Emprestimo;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author artur
 */
public class DlgDataDevolucao extends javax.swing.JDialog {

    Emprestimo emprestimo = null;
    IfrEmprestimo frameMae = null;

    /**
     * Creates new form DlgDataDevolucao
     */
    public DlgDataDevolucao(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        Formatacao.formatarData(tffDataDevolucao);
    }

    public DlgDataDevolucao(java.awt.Frame parent, boolean modal, Emprestimo emprestimo, IfrEmprestimo frameMae) {
        super(parent, modal);
        initComponents();

        Formatacao.formatarData(tffDataDevolucao);

        this.emprestimo = emprestimo;
        this.frameMae = frameMae;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tffDataDevolucao = new javax.swing.JFormattedTextField();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inserir Data de Devolução");

        jLabel1.setText("Data de devolução:");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tffDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tffDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (Automatizar.data(tffDataDevolucao, false)) {
            JOptionPane.showMessageDialog(this, Formatacao.mensagemErroPreenchimento());
        } else {
            if (JOptionPane.showConfirmDialog(this, Formatacao.mensagemConfirmacaoAtualizar("Empréstimo"), "Confirmação", JOptionPane.YES_NO_OPTION) == 0) {
                if (verificarDataInserida()) {
                    emprestimo.setDataDevolucao(tffDataDevolucao.getText());
                    if (new EmprestimoDAO().atualizar(emprestimo) == null && new ObjetoDAO().devolver(emprestimo.getIdObjeto()) == null) {
                        frameMae.popularTabelaEmprestimos();
                        this.dispose();
                        JOptionPane.showMessageDialog(this, Formatacao.mensagemAtualizarSucess("Empréstimo"));
                    } else {
                        JOptionPane.showMessageDialog(this, Formatacao.mensagemAtualizarError("Empréstimo"));
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Data inserida não pode ser anterior à data de empréstimo.");
                }
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private boolean verificarDataInserida() {
        LocalDate dataInserida = Formatacao.stringToLocalDate(tffDataDevolucao.getText());
        LocalDate dataEmprestimo = Formatacao.stringToLocalDate(emprestimo.getDataEmprestimo());

        return (dataInserida.isAfter(dataEmprestimo) || dataInserida.isEqual(dataEmprestimo));
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
            java.util.logging.Logger.getLogger(DlgDataDevolucao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgDataDevolucao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgDataDevolucao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgDataDevolucao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgDataDevolucao dialog = new DlgDataDevolucao(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JFormattedTextField tffDataDevolucao;
    // End of variables declaration//GEN-END:variables
}