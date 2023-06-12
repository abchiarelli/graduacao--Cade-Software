/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package tela;

import DAO.ObjetoDAO;
import DAO.TipoObjetoDAO;
import apoio.ComboItem;
import apoio.CombosDAO;
import entidade.Objeto;
import entidade.TipoObjeto;
import java.util.ArrayList;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author artur
 */
public class DlgBuscarObjeto extends javax.swing.JDialog {

    private ArrayList<Objeto> objetos = new ArrayList<>();
    private IfrEmprestimo frameMae;

    /**
     * Creates new form DlgBuscarObjeto
     */
    public DlgBuscarObjeto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        new CombosDAO().popularComboBox("tipo_objeto", cmbTipoObjeto);
        popularTabelaObjetos();
    }

    public DlgBuscarObjeto(java.awt.Frame parent, boolean modal, IfrEmprestimo frameMae) {
        super(parent, modal);
        initComponents();

        this.frameMae = frameMae;

        new CombosDAO().popularComboBox("tipo_objeto", cmbTipoObjeto);
        popularTabelaObjetos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TblObjetos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbTipoObjeto = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        TxtFiltroDescricao = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TxtFiltroAutor = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TxtFiltroPublisher = new javax.swing.JTextField();
        BtnObjLimparFiltro = new javax.swing.JButton();
        BtnObjFiltrar = new javax.swing.JButton();
        btnCalcela = new javax.swing.JButton();
        btnSelecionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TblObjetos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Título/Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblObjetos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        TblObjetos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblObjetosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TblObjetos);

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel6.setText("Filtros:");

        jLabel7.setText("Tipo:");

        jLabel9.setText("Título/Descrição:");

        jLabel10.setText("Autor:");

        jLabel11.setText("Editora/Produtora:");

        BtnObjLimparFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/broom.png"))); // NOI18N
        BtnObjLimparFiltro.setText("Limpar");
        BtnObjLimparFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnObjLimparFiltroActionPerformed(evt);
            }
        });

        BtnObjFiltrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/loupe.png"))); // NOI18N
        BtnObjFiltrar.setText("Buscar");
        BtnObjFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnObjFiltrarActionPerformed(evt);
            }
        });

        btnCalcela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cross.png"))); // NOI18N
        btnCalcela.setText("Cancelar");
        btnCalcela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcelaActionPerformed(evt);
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
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel11))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TxtFiltroDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                            .addComponent(TxtFiltroAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtFiltroPublisher)
                                            .addComponent(cmbTipoObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BtnObjFiltrar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BtnObjLimparFiltro)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSelecionar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCalcela))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbTipoObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TxtFiltroDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TxtFiltroAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TxtFiltroPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcela)
                    .addComponent(btnSelecionar)
                    .addComponent(BtnObjFiltrar)
                    .addComponent(BtnObjLimparFiltro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TblObjetosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblObjetosMouseClicked
        if (TblObjetos.getSelectedRow() >= 0) {
            btnSelecionar.setEnabled(true);
        }
    }//GEN-LAST:event_TblObjetosMouseClicked

    private void BtnObjLimparFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnObjLimparFiltroActionPerformed
        limparFiltroObjeto();
        popularTabelaObjetos();
    }//GEN-LAST:event_BtnObjLimparFiltroActionPerformed

    private void BtnObjFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnObjFiltrarActionPerformed
        popularTabelaObjetos();
        btnSelecionar.setEnabled(false);
    }//GEN-LAST:event_BtnObjFiltrarActionPerformed

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Confirmar seleção do(a) Objeto?", "Confirmação", JOptionPane.YES_NO_OPTION) == 0) {
            Objeto obj = new ObjetoDAO().consultarId(objetos.get(TblObjetos.getSelectedRow()).getId());
            frameMae.setObjetoSelecionado(obj);
            frameMae.imprimirObjetoSelecionado();
            this.dispose();
        }
    }//GEN-LAST:event_btnSelecionarActionPerformed

    private void btnCalcelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcelaActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCalcelaActionPerformed

    private void limparFiltroObjeto() {
        cmbTipoObjeto.setSelectedIndex(0);
        TxtFiltroDescricao.setText("");
        TxtFiltroAutor.setText("");
        TxtFiltroPublisher.setText("");
    }

    private void popularTabelaObjetos() {
        btnSelecionar.setEnabled(false);

        objetos = new ObjetoDAO().consultar(criarFiltroObjeto());

        TipoObjetoDAO tipoObjetoDAO = new TipoObjetoDAO();

        Object[] cabecalho = {"Tipo", "Descrição"};
        DefaultTableModel model = new DefaultTableModel(cabecalho, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        for (Objeto objeto : objetos) {
            TipoObjeto tipo = tipoObjetoDAO.consultarId(objeto.getTipo());

            String tipoDesc = tipo.getDescricao();
            String titulo = objeto.getTitulo();

            String[] row = {tipoDesc, titulo};

            model.addRow(row);
        }

        TblObjetos.setModel(model);

        TblObjetos.setSelectionMode(0);

        TableColumn coluna = null;
        for (int i = 0; i < TblObjetos.getColumnCount(); i++) {
            coluna = TblObjetos.getColumnModel().getColumn(i);
            coluna.setResizable(false);

            switch (i) {
                case 0:
                    coluna.setMaxWidth(200);
                    break;
                case 1:
                    coluna.setMaxWidth(550);
                    break;
            }
        }
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
            java.util.logging.Logger.getLogger(DlgBuscarObjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgBuscarObjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgBuscarObjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgBuscarObjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgBuscarObjeto dialog = new DlgBuscarObjeto(new javax.swing.JFrame(), true);
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

    private String criarFiltroObjeto() {
        String dml = "SELECT * FROM objeto WHERE status_id = 1 ";

        if (cmbTipoObjeto.getSelectedIndex() > 0) {
            String add = "AND tipo_objeto_id = " + ((ComboItem) cmbTipoObjeto.getSelectedItem()).getId() + " ";
            dml = dml + add;
        }

        if (TxtFiltroDescricao.getText().length() > 0) {
            String add = "AND titulo ILIKE '%" + TxtFiltroDescricao.getText() + "%' ";
            dml = dml + add;
        }

        if (TxtFiltroAutor.getText().length() > 0) {
            String add = "AND autor ILIKE '%" + TxtFiltroAutor.getText() + "%' ";
            dml = dml + add;
        }

        if (TxtFiltroPublisher.getText().length() > 0) {
            String add = "AND publisher ILIKE '%" + TxtFiltroPublisher.getText() + "%' ";
            dml = dml + add;
        }

        dml = dml + "ORDER BY titulo;";

        System.out.println("Filtro Objeto cirado, DML: " + dml);

        return dml;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnObjFiltrar;
    private javax.swing.JButton BtnObjLimparFiltro;
    private javax.swing.JTable TblObjetos;
    private javax.swing.JTextField TxtFiltroAutor;
    private javax.swing.JTextField TxtFiltroDescricao;
    private javax.swing.JTextField TxtFiltroPublisher;
    private javax.swing.JButton btnCalcela;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JComboBox<String> cmbTipoObjeto;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
