/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package tela;

import DAO.EmprestimoDAO;
import DAO.ObjetoDAO;
import DAO.PessoaDAO;
import DAO.StatusDAO;
import DAO.TipoObjetoDAO;
import apoio.Automatizar;
import apoio.ComboItem;
import apoio.CombosDAO;
import apoio.Formatacao;
import apoio.Validacao;
import entidade.Emprestimo;
import entidade.Objeto;
import entidade.Pessoa;
import entidade.TipoObjeto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author artur
 */
public class IfrEmprestimo extends javax.swing.JInternalFrame {

    ArrayList<Emprestimo> emprestimos = new ArrayList<>();

    private Objeto objetoSelecionado = null;
    private Pessoa pessoaSelecionada = null;
    Emprestimo emprestimoSelecionado = null;

    /**
     * Creates new form IfrEmprestimo
     */
    public IfrEmprestimo() {
        initComponents();

        Formatacao.formatarData(tffDataEmprestimo);
        Formatacao.formatarData(tffDataDevolucao);
        Formatacao.formatarData(tffFiltroDataEmprestimo);
        Formatacao.formatarData(tffFiltroDataDevolucao);

        popularTabelaEmprestimos();

        new CombosDAO().popularComboBox("status", cmbFiltroStatus, "WHERE id >= 4");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TbpPrincipal = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblEmprestimos = new javax.swing.JTable();
        Status = new javax.swing.JLabel();
        cmbFiltroStatus = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        tffFiltroDataEmprestimo = new javax.swing.JFormattedTextField();
        tffFiltroDataDevolucao = new javax.swing.JFormattedTextField();
        btnLimparFiltros = new javax.swing.JButton();
        chbFiltroDataEmprestimo = new javax.swing.JCheckBox();
        chbFiltroDataDevolucao = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfdDescricao = new javax.swing.JTextField();
        tfdAutor = new javax.swing.JTextField();
        tfdEditora = new javax.swing.JTextField();
        tfdTipoObjeto = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        tfdNomePessoa = new javax.swing.JTextField();
        tfdApelidoPessoa = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        tffDataEmprestimo = new javax.swing.JFormattedTextField();
        DataDevolucao1 = new javax.swing.JLabel();
        tffDataDevolucao = new javax.swing.JFormattedTextField();
        btnObjetoSelecionar = new javax.swing.JButton();
        btnPessoaSelecionar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        BtnCadastrar = new javax.swing.JButton();
        BtnFechar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        TbpPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TbpPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TbpPrincipalMouseClicked(evt);
            }
        });

        tblEmprestimos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblEmprestimos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmprestimosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblEmprestimos);

        Status.setText("Status do Empréstimo:");

        cmbFiltroStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel19.setText("Data de Empréstimo:");

        jLabel20.setText("Data de Devolução:");

        btnLimparFiltros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/broom.png"))); // NOI18N
        btnLimparFiltros.setText("Limpar");
        btnLimparFiltros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparFiltrosActionPerformed(evt);
            }
        });

        chbFiltroDataEmprestimo.setText("A partir de");

        chbFiltroDataDevolucao.setText("A partir de");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19)
                            .addComponent(Status)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbFiltroStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tffFiltroDataEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chbFiltroDataEmprestimo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tffFiltroDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chbFiltroDataDevolucao)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimparFiltros)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Status)
                    .addComponent(cmbFiltroStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(tffFiltroDataEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbFiltroDataEmprestimo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(tffFiltroDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparFiltros)
                    .addComponent(chbFiltroDataDevolucao))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        TbpPrincipal.addTab("Listagem", jPanel1);

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel6.setText("Objeto");

        jLabel7.setText("Tipo:");

        jLabel9.setText("Título/Descrição:");

        jLabel10.setText("Autor:");

        jLabel11.setText("Editora/Produtora:");

        tfdDescricao.setEnabled(false);

        tfdAutor.setEnabled(false);

        tfdEditora.setEnabled(false);

        tfdTipoObjeto.setEnabled(false);

        jLabel18.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel18.setText("Pessoa");

        jLabel21.setText("Nome:");

        jLabel22.setText("Apelido:");

        tfdNomePessoa.setEnabled(false);

        tfdApelidoPessoa.setEnabled(false);

        jLabel23.setText("Data empréstimo:");

        DataDevolucao1.setText("Data devolução:");

        tffDataDevolucao.setToolTipText("");
        tffDataDevolucao.setEnabled(false);

        btnObjetoSelecionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/box.png"))); // NOI18N
        btnObjetoSelecionar.setText("Selecionar");
        btnObjetoSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObjetoSelecionarActionPerformed(evt);
            }
        });

        btnPessoaSelecionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add-user.png"))); // NOI18N
        btnPessoaSelecionar.setText("Selecionar");
        btnPessoaSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPessoaSelecionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(btnPessoaSelecionar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(btnObjetoSelecionar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tffDataEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DataDevolucao1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tffDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfdNomePessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfdApelidoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfdDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfdTipoObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfdAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfdEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(278, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btnObjetoSelecionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfdTipoObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfdDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tfdAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tfdEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(btnPessoaSelecionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(tfdNomePessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(tfdApelidoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(tffDataEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DataDevolucao1)
                    .addComponent(tffDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        TbpPrincipal.addTab("Manutenção", jPanel2);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEditar.setText("Finalizar/Desfazer");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        BtnCadastrar.setText("Cadastrar");
        BtnCadastrar.setEnabled(false);
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

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
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
                        .addComponent(TbpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
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
                .addComponent(TbpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnEditar)
                    .addComponent(BtnCadastrar)
                    .addComponent(BtnFechar)
                    .addComponent(btnExcluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnFecharActionPerformed

    private void TbpPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbpPrincipalMouseClicked
        if (TbpPrincipal.getSelectedIndex() == 0) {
            pessoaSelecionada = null;
            objetoSelecionado = null;
            emprestimoSelecionado = null;
            limparCadastro();
        }

        alterarBotoesPrincipais();
    }//GEN-LAST:event_TbpPrincipalMouseClicked

    private void BtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadastrarActionPerformed
        if (verificarCampos()) {
            JOptionPane.showMessageDialog(this, Formatacao.mensagemErroPreenchimento());
        } else {
            Emprestimo emprestimo = criarEntidade();
            if (emprestimoSelecionado == null) {
                if (new EmprestimoDAO().salvar(emprestimo) == null && new ObjetoDAO().emprestar(emprestimo.getIdObjeto()) == null) {
                    JOptionPane.showMessageDialog(this, Formatacao.mensagemSalvarSucess("Empréstimo"));
                    popularTabelaEmprestimos();
                } else {
                    JOptionPane.showMessageDialog(this, Formatacao.mensagemSalvarError("Empréstimo"));
                }
            } else {
                if (emprestimoSelecionado.getIdObjeto() != emprestimo.getIdObjeto()) {
                    //devolver objeto do emprestimoSelecionado
                    if (new EmprestimoDAO().atualizar(emprestimo) == null
                            && new ObjetoDAO().emprestar(emprestimo.getIdObjeto()) == null
                            && new ObjetoDAO().devolver(emprestimoSelecionado.getIdObjeto()) == null) {
                        JOptionPane.showMessageDialog(this, Formatacao.mensagemAtualizarSucess("Empréstimo"));
                        popularTabelaEmprestimos();
                        emprestimoSelecionado = null;
                        tffDataDevolucao.setEnabled(false);
                    } else {
                        JOptionPane.showMessageDialog(this, Formatacao.mensagemAtualizarError("Empréstimo"));
                    }
                } else {
                    if (new EmprestimoDAO().atualizar(emprestimo) == null && new ObjetoDAO().emprestar(emprestimo.getIdObjeto()) == null) {
                        JOptionPane.showMessageDialog(this, Formatacao.mensagemAtualizarSucess("Empréstimo"));
                        popularTabelaEmprestimos();
                        emprestimoSelecionado = null;
                        tffDataDevolucao.setEnabled(false);
                    } else {
                        JOptionPane.showMessageDialog(this, Formatacao.mensagemAtualizarError("Empréstimo"));
                    }

                }
            }
        }
    }//GEN-LAST:event_BtnCadastrarActionPerformed

    private void btnLimparFiltrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparFiltrosActionPerformed
        limparFiltroListagem();
        popularTabelaEmprestimos();
    }//GEN-LAST:event_btnLimparFiltrosActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        System.out.println("Botão BUSCAR");
        popularTabelaEmprestimos();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Emprestimo emp = emprestimos.get(tblEmprestimos.getSelectedRow());

        if (emp.getDataDevolucao().trim().isBlank()) {
            new DlgDataDevolucao(null, true, emp, this).setVisible(true);
        } else {
            if (JOptionPane.showConfirmDialog(this, "Realmente deseja desfazer a devolução deste empréstimo?", "Confirmação", JOptionPane.YES_NO_OPTION) == 0) {
                if (new ObjetoDAO().estaEmprestado(emp.getIdObjeto())) {
                    JOptionPane.showMessageDialog(this, "Objeto já possui empréstimo cadastrado.");
                } else {
                    emp.setDataDevolucao("");
                    if (new EmprestimoDAO().atualizar(emp) == null && new ObjetoDAO().emprestar(emp.getIdObjeto()) == null) {
                        popularTabelaEmprestimos();
                        JOptionPane.showMessageDialog(this, Formatacao.mensagemAtualizarSucess("Empréstimo"));
                    } else {
                        JOptionPane.showMessageDialog(this, Formatacao.mensagemAtualizarError("Empréstimo"));
                    }
                }
            }
        }


    }//GEN-LAST:event_btnEditarActionPerformed

    private void tblEmprestimosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmprestimosMouseClicked
        alterarBotoesEdicao();
    }//GEN-LAST:event_tblEmprestimosMouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(this, Formatacao.mensagemConfirmacaoExclusao("Empréstimo"), "Confirmação", JOptionPane.YES_NO_OPTION) == 0) {
            Emprestimo emprestimo = emprestimos.get(tblEmprestimos.getSelectedRow());
            if (new EmprestimoDAO().excluir(emprestimo.getId()) == null && new ObjetoDAO().devolver(emprestimo.getIdObjeto()) == null) {
                JOptionPane.showMessageDialog(this, Formatacao.mensagemExclusaoSucess("Empréstimo"));
                popularTabelaEmprestimos();
            } else {
                JOptionPane.showMessageDialog(this, Formatacao.mensagemExclusaoError("Empréstimo"));
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnObjetoSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObjetoSelecionarActionPerformed
        new DlgBuscarObjeto(null, true, this).setVisible(true);
    }//GEN-LAST:event_btnObjetoSelecionarActionPerformed

    private void btnPessoaSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPessoaSelecionarActionPerformed
        new DlgBuscarPessoa(null, true, this).setVisible(true);
    }//GEN-LAST:event_btnPessoaSelecionarActionPerformed

    public void imprimirObjetoSelecionado() {
        TipoObjetoDAO tipoObjetoDAO = new TipoObjetoDAO();
        TipoObjeto tipo = tipoObjetoDAO.consultarId(objetoSelecionado.getTipo());

        String tipoDesc = tipo.getDescricao();

        tfdTipoObjeto.setText(tipoDesc);
        tfdDescricao.setText(objetoSelecionado.getTitulo());
        tfdDescricao.setCaretPosition(0);
        tfdAutor.setText(objetoSelecionado.getAutor());
        tfdEditora.setText(objetoSelecionado.getPublisher());
    }

    public void imprimirPessoaSelecionada() {
        tfdNomePessoa.setText(pessoaSelecionada.getNome());
        tfdApelidoPessoa.setText(pessoaSelecionada.getApelido());
    }

    private void imprimirEmprestimoSelecionado() {
        pessoaSelecionada = new PessoaDAO().consultarId(emprestimoSelecionado.getIdPessoa());
        imprimirPessoaSelecionada();
        objetoSelecionado = new ObjetoDAO().consultarId(emprestimoSelecionado.getIdObjeto());
        imprimirObjetoSelecionado();

        tffDataEmprestimo.setText(emprestimoSelecionado.getDataEmprestimo());
        tffDataDevolucao.setText(emprestimoSelecionado.getDataDevolucao());
    }

    private void limparFiltroListagem() {
        tffFiltroDataDevolucao.setText("");
        tffFiltroDataEmprestimo.setText("");
        cmbFiltroStatus.setSelectedIndex(0);
        chbFiltroDataDevolucao.setSelected(false);
        chbFiltroDataEmprestimo.setSelected(false);
    }

    private boolean verificarCampos() {
        Automatizar.data(tffDataEmprestimo, false);
        Automatizar.data(tffDataDevolucao, true);

        return Automatizar.data(tffDataEmprestimo, false)
                || Automatizar.data(tffDataDevolucao, true);
    }

    private Emprestimo criarEntidade() {
        return new Emprestimo(objetoSelecionado.getId(), pessoaSelecionada.getId(), 4, tffDataEmprestimo.getText());
    }

    private String criarFiltroEmprestimo() {
        String dml = "SELECT * FROM emprestimo WHERE id > 0 ";

        if (cmbFiltroStatus.getSelectedIndex() > 0) {
            ComboItem item = (ComboItem) cmbFiltroStatus.getSelectedItem();

            String add = "AND status_id = " + item.getId() + " ";

            dml += add;
        }

        if (!tffFiltroDataEmprestimo.getText().trim().equals("/  /")) {
            if (Validacao.validarDataFormatada(tffFiltroDataEmprestimo.getText())) {
                String add = "AND data_emprestimo = '" + Formatacao.ajustaDataAMD(tffFiltroDataEmprestimo.getText()) + "' ";
                if (chbFiltroDataEmprestimo.isSelected()) {
                    add = "AND data_emprestimo >= '" + Formatacao.ajustaDataAMD(tffFiltroDataEmprestimo.getText()) + "' ";
                }
                dml += add;
            }
        }

        if (!tffFiltroDataDevolucao.getText().trim().equals("/  /")) {
            if (Validacao.validarDataFormatada(tffFiltroDataDevolucao.getText())) {
                String add = "AND data_devolucao = '" + Formatacao.ajustaDataAMD(chbFiltroDataDevolucao.getText()) + "' ";
                if (chbFiltroDataDevolucao.isSelected()) {
                    add = "AND data_emprestimo >= '" + Formatacao.ajustaDataAMD(chbFiltroDataDevolucao.getText()) + "' ";
                }
                dml += add;
            }
        }
        return dml + "ORDER BY data_emprestimo;";
    }

    public void popularTabelaEmprestimos() {
        btnEditar.setEnabled(false);

        emprestimos = new EmprestimoDAO().consultar(criarFiltroEmprestimo());

        Object[] cabecalho = {
            "Status",
            "Objeto",
            "Pessoa",
            "Data Empréstimo",
            "Data Devolução"
        };

        DefaultTableModel model = new DefaultTableModel(cabecalho, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        for (Emprestimo emprestimo : emprestimos) {
            String status = new StatusDAO().consultarId(emprestimo.getIdStatus()).getDescricao();
            String objeto = new ObjetoDAO().consultarId(emprestimo.getIdObjeto()).getTitulo();
            String pessoa = new PessoaDAO().consultarId(emprestimo.getIdPessoa()).getNome();
            String dataEmprestimo = emprestimo.getDataEmprestimo();
            String dataDevolucao = emprestimo.getDataDevolucao();

            Object[] row = {
                status,
                objeto,
                pessoa,
                dataEmprestimo,
                dataDevolucao
            };

            model.addRow(row);
        }

        tblEmprestimos.setModel(model);
    }

    public void focoCadastro() {
        TbpPrincipal.setSelectedIndex(1);
    }

    public void focoListagem() {
        TbpPrincipal.setSelectedIndex(0);
    }

    public void alterarBotoesEdicao() {
        btnExcluir.setEnabled(tblEmprestimos.getSelectedRow() > -1);
        btnEditar.setEnabled(tblEmprestimos.getSelectedRow() > -1);
    }

    private void alterarBotoesPrincipais() {
        btnBuscar.setEnabled(TbpPrincipal.getSelectedIndex() == 0);
        BtnCadastrar.setEnabled(TbpPrincipal.getSelectedIndex() == 1);
    }

    private void limparCadastro() {
        tfdTipoObjeto.setText("");
        tfdDescricao.setText("");
        tfdDescricao.setCaretPosition(0);
        tfdAutor.setText("");
        tfdEditora.setText("");

        tfdNomePessoa.setText("");
        tfdApelidoPessoa.setText("");

        tffDataEmprestimo.setText("");
        tffDataDevolucao.setText("");

        tffDataEmprestimo.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCadastrar;
    private javax.swing.JButton BtnFechar;
    private javax.swing.JLabel DataDevolucao1;
    private javax.swing.JLabel Status;
    private javax.swing.JTabbedPane TbpPrincipal;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimparFiltros;
    private javax.swing.JButton btnObjetoSelecionar;
    private javax.swing.JButton btnPessoaSelecionar;
    private javax.swing.JCheckBox chbFiltroDataDevolucao;
    private javax.swing.JCheckBox chbFiltroDataEmprestimo;
    private javax.swing.JComboBox<String> cmbFiltroStatus;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblEmprestimos;
    private javax.swing.JTextField tfdApelidoPessoa;
    private javax.swing.JTextField tfdAutor;
    private javax.swing.JTextField tfdDescricao;
    private javax.swing.JTextField tfdEditora;
    private javax.swing.JTextField tfdNomePessoa;
    private javax.swing.JTextField tfdTipoObjeto;
    private javax.swing.JFormattedTextField tffDataDevolucao;
    private javax.swing.JFormattedTextField tffDataEmprestimo;
    private javax.swing.JFormattedTextField tffFiltroDataDevolucao;
    private javax.swing.JFormattedTextField tffFiltroDataEmprestimo;
    // End of variables declaration//GEN-END:variables

    public void setObjetoSelecionado(Objeto objetoSelecionado) {
        this.objetoSelecionado = objetoSelecionado;
    }

    public void setPessoaSelecionada(Pessoa pessoaSelecionada) {
        this.pessoaSelecionada = pessoaSelecionada;
    }
}
