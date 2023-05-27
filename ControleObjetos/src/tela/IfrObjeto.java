/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package tela;

import DAO.ObjetoDAO;
import DAO.TipoObjetoDAO;
import entidade.Objeto;
import entidade.TipoObjeto;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author artur
 */
public class IfrObjeto extends javax.swing.JInternalFrame {

    private ArrayList<TipoObjeto> tiposObjeto = new ArrayList<>();

    /**
     * Creates new form IfrObjeto
     */
    public IfrObjeto() {
        initComponents();

        preencheComboTiposObjeto();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TbpObjeto = new javax.swing.JTabbedPane();
        PnlListagem = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        TxfFilDescricao = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TxfFiltroAutor = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        PnlCadastrar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CbbTipoObjeto = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        TxfDescricao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxfAutor = new javax.swing.JTextField();
        TxfEditora = new javax.swing.JTextField();
        BtnNovoTipoObjeto = new javax.swing.JButton();
        BtnCadastrar = new javax.swing.JButton();
        BtnFechar = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        BtnEditar = new javax.swing.JButton();
        BtnSalvar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        BtnPerdido = new javax.swing.JButton();

        setTitle("Objeto");

        TbpObjeto.setToolTipText("");
        TbpObjeto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TbpObjetoMouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Título/Descrição", "Situação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel6.setText("Filtros:");

        jLabel7.setText("Tipo:");

        jLabel8.setText("Status:");

        jLabel9.setText("Título/Descrição:");

        jLabel10.setText("Autor:");

        jLabel11.setText("Editora/Produtora:");

        javax.swing.GroupLayout PnlListagemLayout = new javax.swing.GroupLayout(PnlListagem);
        PnlListagem.setLayout(PnlListagemLayout);
        PnlListagemLayout.setHorizontalGroup(
            PnlListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlListagemLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(PnlListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(PnlListagemLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(PnlListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlListagemLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PnlListagemLayout.createSequentialGroup()
                                .addGroup(PnlListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PnlListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TxfFilDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                    .addComponent(TxfFiltroAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3))))))
                .addContainerGap(84, Short.MAX_VALUE))
            .addGroup(PnlListagemLayout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        PnlListagemLayout.setVerticalGroup(
            PnlListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlListagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnlListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TxfFilDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TxfFiltroAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        TbpObjeto.addTab("Listagem", PnlListagem);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setText("Novo Objeto");

        jLabel2.setText("Tipo:");

        jLabel3.setText("Título/Descrição:");

        TxfDescricao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxfDescricaoFocusLost(evt);
            }
        });

        jLabel5.setText("Autor:");

        jLabel4.setText("Editora/Produtora:");

        BtnNovoTipoObjeto.setText("+");
        BtnNovoTipoObjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNovoTipoObjetoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlCadastrarLayout = new javax.swing.GroupLayout(PnlCadastrar);
        PnlCadastrar.setLayout(PnlCadastrarLayout);
        PnlCadastrarLayout.setHorizontalGroup(
            PnlCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(PnlCadastrarLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(PnlCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PnlCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PnlCadastrarLayout.createSequentialGroup()
                                .addComponent(CbbTipoObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnNovoTipoObjeto))
                            .addComponent(TxfAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxfEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        PnlCadastrarLayout.setVerticalGroup(
            PnlCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnlCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CbbTipoObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnNovoTipoObjeto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnlCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnlCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TxfAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnlCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxfEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(175, Short.MAX_VALUE))
        );

        TbpObjeto.addTab("Cadastrar", PnlCadastrar);

        BtnCadastrar.setText("Cadastrar");
        BtnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadastrarActionPerformed(evt);
            }
        });

        BtnFechar.setText("Fechar");
        BtnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFecharActionPerformed(evt);
            }
        });

        BtnBuscar.setText("Buscar");

        BtnEditar.setText("Editar");
        BtnEditar.setEnabled(false);
        BtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarActionPerformed(evt);
            }
        });

        BtnSalvar.setText("Salvar");
        BtnSalvar.setEnabled(false);

        jSeparator1.setToolTipText("");

        BtnPerdido.setText("Perdido");
        BtnPerdido.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TbpObjeto)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnPerdido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnFechar))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TbpObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCadastrar)
                    .addComponent(BtnFechar)
                    .addComponent(BtnBuscar)
                    .addComponent(BtnEditar)
                    .addComponent(BtnSalvar)
                    .addComponent(BtnPerdido))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnFecharActionPerformed

    private void BtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarActionPerformed
        TbpObjeto.setSelectedIndex(2);
    }//GEN-LAST:event_BtnEditarActionPerformed

    private void TbpObjetoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbpObjetoMouseClicked
        alternarBotoes();
    }//GEN-LAST:event_TbpObjetoMouseClicked

    private void BtnNovoTipoObjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNovoTipoObjetoActionPerformed
        String descr = JOptionPane.showInputDialog("Descrição: ");
        if (descr != null) {
            System.out.println("Descriçao: " + descr);
            TipoObjeto tipo = new TipoObjeto(descr);
            if (new TipoObjetoDAO().salvar(tipo) == null) {
                preencheComboTiposObjeto();
                JOptionPane.showMessageDialog(this, "Tipo de Objeto salvo!");
            } else {
                JOptionPane.showMessageDialog(this, "Não foi possível criar.");
            }
        }
    }//GEN-LAST:event_BtnNovoTipoObjetoActionPerformed

    private void BtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadastrarActionPerformed
        // pegar dados inseridos
        if (camposPreenchidos()) {

            Objeto objeto = criarEntidade();

            //confirmar dados
            if (JOptionPane.showConfirmDialog(this, "Confirmar cadastro de Produto?") == 0) {

                //salvar
                if (salvar(objeto)) {
                    limparFormularioCadastro();
                    JOptionPane.showMessageDialog(this, "Objeto cadastrado com sucesso!");
                    limparFormularioCadastro();
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao cadastrar Objeto.");
                }

            }
        } else {
            JOptionPane.showMessageDialog(this, "Alguns campos são obrigatórios.");
        }

    }//GEN-LAST:event_BtnCadastrarActionPerformed

    private void TxfDescricaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxfDescricaoFocusLost
        Border borderRed = BorderFactory.createLineBorder(Color.RED, 2);
        Border borderGreen = BorderFactory.createLineBorder(Color.GREEN, 2);

        if (TxfDescricao.getText().length() == 0) {
            TxfDescricao.setBorder(borderRed);
        } else {
            TxfDescricao.setBorder(borderGreen);
        }
    }//GEN-LAST:event_TxfDescricaoFocusLost

    public void focoCadastro() {
        TbpObjeto.setSelectedIndex(1);
        alternarBotoes();
    }

    public void focoListagem() {
        TbpObjeto.setSelectedIndex(0);
        alternarBotoes();
    }

    private void preencheArrayTiposObjeto() {
        TipoObjetoDAO tiposDAO = new TipoObjetoDAO();
        tiposObjeto = tiposDAO.consultarTodos();
    }

    private void preencheComboTiposObjeto() {
        CbbTipoObjeto.removeAllItems();

        preencheArrayTiposObjeto();

        CbbTipoObjeto.addItem("-- Selecionar --");

        for (TipoObjeto tipo : tiposObjeto) {
            CbbTipoObjeto.addItem(tipo.getDescricao());
        }
    }

    private boolean camposPreenchidos() {
        boolean i = true;

        if (TxfDescricao.getText().length() == 0 || TxfEditora.getText().length() == 0 || CbbTipoObjeto.getSelectedIndex() == 0) {
            i = false;
        }

        return i;
    }

    private void alternarBotoes() {
        BtnBuscar.setEnabled(TbpObjeto.getSelectedIndex() == 0);
        BtnCadastrar.setEnabled(TbpObjeto.getSelectedIndex() == 1);
    }

    private Objeto criarEntidade() {
        String titulo = TxfDescricao.getText();
        String autor = TxfAutor.getText();
        String publisher = TxfEditora.getText();
        int tipo = tiposObjeto.get(CbbTipoObjeto.getSelectedIndex() - 1).getId();
        int status = 1;

        //criar enditade com dados
        return new Objeto(titulo, autor, publisher, status, tipo);
    }

    private boolean salvar(Objeto objeto) {
        ObjetoDAO objetoDAO = new ObjetoDAO();
        return objetoDAO.salvar(objeto) == null;
    }
    
    private void limparFormularioCadastro() {
        TxfDescricao.setText("");
        TxfAutor.setText("");
        TxfEditora.setText("");
        CbbTipoObjeto.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnCadastrar;
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnFechar;
    private javax.swing.JButton BtnNovoTipoObjeto;
    private javax.swing.JButton BtnPerdido;
    private javax.swing.JButton BtnSalvar;
    private javax.swing.JComboBox<String> CbbTipoObjeto;
    private javax.swing.JPanel PnlCadastrar;
    private javax.swing.JPanel PnlListagem;
    private javax.swing.JTabbedPane TbpObjeto;
    private javax.swing.JTextField TxfAutor;
    private javax.swing.JTextField TxfDescricao;
    private javax.swing.JTextField TxfEditora;
    private javax.swing.JTextField TxfFilDescricao;
    private javax.swing.JTextField TxfFiltroAutor;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
