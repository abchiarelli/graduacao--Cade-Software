/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package tela;

import DAO.ObjetoDAO;
import DAO.PessoaDAO;
import DAO.TipoObjetoDAO;
import entidade.Objeto;
import entidade.Pessoa;
import entidade.TipoObjeto;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author artur
 */
public class IfrEmprestimo extends javax.swing.JInternalFrame {

    ArrayList<Objeto> objetos = new ArrayList<>();
    ArrayList<Pessoa> pessoas = new ArrayList<>();
    ArrayList<TipoObjeto> tiposObjeto = new ArrayList<>();

    /**
     * Creates new form IfrEmprestimo
     */
    public IfrEmprestimo() {
        initComponents();

        popularTabelaObjetos();
        popularComboBoxTipoObjeto();
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
        jPanel2 = new javax.swing.JPanel();
        TbpCadastroEmprestimo = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblObjetos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CbbTipoObjeto = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        TxtFiltroDescricao = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TxtFiltroAutor = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TxtFiltroPublisher = new javax.swing.JTextField();
        BtnObjLimparFiltro = new javax.swing.JButton();
        BtnObjFiltrar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TblPessoas = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        TxtFiltroNome = new javax.swing.JTextField();
        TxtFiltroApelido = new javax.swing.JTextField();
        BtnPessoaLimparFiltro = new javax.swing.JButton();
        BtnPessoaFiltrar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        BtnSelcionar = new javax.swing.JButton();
        BtnVoltar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        BtnBuscar = new javax.swing.JButton();
        BtnEditar = new javax.swing.JButton();
        BtnCadastrar = new javax.swing.JButton();
        BtnFechar = new javax.swing.JButton();

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 695, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Listagem", jPanel1);

        TbpCadastroEmprestimo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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
        if (TblObjetos.getColumnModel().getColumnCount() > 0) {
            TblObjetos.getColumnModel().getColumn(0).setResizable(false);
            TblObjetos.getColumnModel().getColumn(1).setResizable(false);
            TblObjetos.getColumnModel().getColumn(1).setPreferredWidth(350);
        }

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel6.setText("Filtros:");

        jLabel7.setText("Tipo:");

        jLabel9.setText("Título/Descrição:");

        jLabel10.setText("Autor:");

        jLabel11.setText("Editora/Produtora:");

        BtnObjLimparFiltro.setText("Limpar");

        BtnObjFiltrar.setText("Buscar");
        BtnObjFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnObjFiltrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtFiltroDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(TxtFiltroAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtFiltroPublisher)
                            .addComponent(CbbTipoObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(BtnObjLimparFiltro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnObjFiltrar)))
                .addContainerGap(98, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(CbbTipoObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TxtFiltroDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TxtFiltroAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TxtFiltroPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnObjLimparFiltro)
                    .addComponent(BtnObjFiltrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TbpCadastroEmprestimo.addTab("Objeto", jPanel4);

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
        jScrollPane2.setViewportView(TblPessoas);

        jLabel12.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel12.setText("Filtros:");

        jLabel13.setText("Nome:");

        jLabel14.setText("Apelido:");

        BtnPessoaLimparFiltro.setText("Limpar");

        BtnPessoaFiltrar.setText("Buscar");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(TxtFiltroApelido, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnPessoaLimparFiltro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnPessoaFiltrar))
                            .addComponent(TxtFiltroNome, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(190, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(TxtFiltroNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtFiltroApelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnPessoaLimparFiltro)
                            .addComponent(BtnPessoaFiltrar)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)))
                .addContainerGap())
        );

        TbpCadastroEmprestimo.addTab("Pessoa", jPanel5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 679, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 352, Short.MAX_VALUE)
        );

        TbpCadastroEmprestimo.addTab("Empréstimo", jPanel6);

        TbpCadastroEmprestimo.setEnabledAt(0, false);
        TbpCadastroEmprestimo.setEnabledAt(1, false);
        TbpCadastroEmprestimo.setEnabledAt(2, false);

        BtnSelcionar.setText("Selecionar >");
        BtnSelcionar.setEnabled(false);
        BtnSelcionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSelcionarActionPerformed(evt);
            }
        });

        BtnVoltar.setText("< Voltar");
        BtnVoltar.setEnabled(false);
        BtnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TbpCadastroEmprestimo)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(BtnVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnSelcionar)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TbpCadastroEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSelcionar)
                    .addComponent(BtnVoltar))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastro", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 695, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Edição/Atualização", jPanel3);

        BtnBuscar.setText("Buscar");

        BtnEditar.setText("Editar");

        BtnCadastrar.setText("Cadastrar");

        BtnFechar.setText("Fechar");
        BtnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnFechar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnBuscar)
                    .addComponent(BtnEditar)
                    .addComponent(BtnCadastrar)
                    .addComponent(BtnFechar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSelcionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSelcionarActionPerformed
        int index = TbpCadastroEmprestimo.getSelectedIndex();

        if (index < 2) {
            TbpCadastroEmprestimo.setSelectedIndex(index + 1);
        }

        cadastroAlternarBotoes(index + 1);
    }//GEN-LAST:event_BtnSelcionarActionPerformed

    private void BtnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnFecharActionPerformed

    private void BtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVoltarActionPerformed
        int index = TbpCadastroEmprestimo.getSelectedIndex();

        if (index > 0) {
            TbpCadastroEmprestimo.setSelectedIndex(index - 1);
        }

        cadastroAlternarBotoes(index - 1);
    }//GEN-LAST:event_BtnVoltarActionPerformed

    private void BtnObjFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnObjFiltrarActionPerformed
        popularTabelaObjetos();
    }//GEN-LAST:event_BtnObjFiltrarActionPerformed

    private void TblObjetosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblObjetosMouseClicked
        if (TblObjetos.getSelectedRow() >= 0) {
            BtnSelcionar.setEnabled(true);
        }
    }//GEN-LAST:event_TblObjetosMouseClicked

    private void cadastroAlternarBotoes(int index) {
        BtnSelcionar.setEnabled(false);
        BtnVoltar.setEnabled(index != 0);
    }

    private void popularArrayObjetos() {
        ObjetoDAO objetoDAO = new ObjetoDAO();

        String dml = criarFiltroObjeto();

        objetos = objetoDAO.consultar(dml);
    }

    private void popularTabelaObjetos() {
        popularArrayObjetos();

        limparTabelaObjetos();

        TipoObjetoDAO tipoObjetoDAO = new TipoObjetoDAO();

        DefaultTableModel model = (DefaultTableModel) TblObjetos.getModel();

        for (Objeto objeto : objetos) {
            TipoObjeto tipo = tipoObjetoDAO.consultarId(objeto.getTipo());

            String tipoDesc = tipo.getDescricao();
            String titulo = objeto.getTitulo();

            String[] row = {tipoDesc, titulo};

            model.addRow(row);
        }

        TblObjetos.setModel(model);
    }

    private void limparTabelaObjetos() {
        DefaultTableModel model = (DefaultTableModel) TblObjetos.getModel();
        model.setRowCount(0);
    }

    private void popularArrayPessoas() {
        PessoaDAO pessoaDAO = new PessoaDAO();
        pessoas = pessoaDAO.consultarTodos();
    }

    private String criarFiltroObjeto() {
        String dml = "SELECT * FROM objeto WHERE status_id = 1 ";

        if (CbbTipoObjeto.getSelectedIndex() > 0) {
            String add = "AND tipo_objeto_id = " + tiposObjeto.get(CbbTipoObjeto.getSelectedIndex() - 1).getId() + " ";
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

        System.out.println("DML: " + dml);

        return dml;
    }

    private void popularComboBoxTipoObjeto() {
        TipoObjetoDAO tipoObjetoDAO = new TipoObjetoDAO();
        tiposObjeto = tipoObjetoDAO.consultarTodos();
        CbbTipoObjeto.removeAllItems();

        CbbTipoObjeto.addItem("-- Selecione --");

        for (TipoObjeto tipo : tiposObjeto) {
            CbbTipoObjeto.addItem(tipo.getDescricao());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnCadastrar;
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnFechar;
    private javax.swing.JButton BtnObjFiltrar;
    private javax.swing.JButton BtnObjLimparFiltro;
    private javax.swing.JButton BtnPessoaFiltrar;
    private javax.swing.JButton BtnPessoaLimparFiltro;
    private javax.swing.JButton BtnSelcionar;
    private javax.swing.JButton BtnVoltar;
    private javax.swing.JComboBox<String> CbbTipoObjeto;
    private javax.swing.JTable TblObjetos;
    private javax.swing.JTable TblPessoas;
    private javax.swing.JTabbedPane TbpCadastroEmprestimo;
    private javax.swing.JTextField TxtFiltroApelido;
    private javax.swing.JTextField TxtFiltroAutor;
    private javax.swing.JTextField TxtFiltroDescricao;
    private javax.swing.JTextField TxtFiltroNome;
    private javax.swing.JTextField TxtFiltroPublisher;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
