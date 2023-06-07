/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import apoio.ConexaoBD;
import apoio.Formatacao;
import apoio.IDAOT;
import entidade.Emprestimo;
import java.util.ArrayList;
import java.sql.*;
import java.time.LocalDate;

/**
 *
 * @author artur
 */
public class EmprestimoDAO implements IDAOT<Emprestimo> {

    @Override
    public String salvar(Emprestimo o) {

        try {
            String dml = "INSERT INTO emprestimo VALUES ("
                    + "DEFAULT, "
                    + o.getIdObjeto() + ", "
                    + o.getIdPessoa() + ", "
                    + o.getIdStatus() + ", "
                    + "'" + o.getDataEmprestimo() + "', "
                    + "NULL"
                    + ");";

            System.out.println("DML: " + dml);
            int retorno = ConexaoBD.getInstance().getConnection().createStatement().executeUpdate(dml);
            return null;
        } catch (SQLException e) {
            System.out.println("Erro ao inserir Emprestimo: " + e);
            return e.toString();
        }
    }

    @Override
    public String atualizar(Emprestimo o) {
        try {
            String dml = "UPDATE emprestimo SET "
                    + "objeto_id = " + o.getIdObjeto() + ", "
                    + "pessoa_id = " + o.getIdPessoa() + ", "
                    + "status_id = " + o.getIdStatus() + ", "
                    + "data_emprestimo = '" + o.getDataEmprestimo() + "', "
                    + "data_devolucao = '" + o.getDataDevolucao() + "' "
                    + "WHERE id = " + o.getId();
            
            if (o.getDataDevolucao() == null) {
                dml = "UPDATE emprestimo SET "
                    + "objeto_id = " + o.getIdObjeto() + ", "
                    + "pessoa_id = " + o.getIdPessoa() + ", "
                    + "status_id = " + o.getIdStatus() + ", "
                    + "data_emprestimo = '" + o.getDataEmprestimo() + "', "
                    + "data_devolucao = NULL "
                    + "WHERE id = " + o.getId();
            }

            System.out.println("DML: " + dml);
            int retorno = ConexaoBD.getInstance().getConnection().createStatement().executeUpdate(dml);

            return null;

        } catch (SQLException e) {
            System.out.println("Erro ao atualizar Emprestimo: " + e);
            return e.toString();
        }
    }

    @Override
    public String excluir(int id) {
        try {
            String dml = "DELETE FROM emprestimo WHERE id = " + id + ";";

            int retorno = ConexaoBD.getInstance().getConnection().createStatement().executeUpdate(dml);

            return null;

        } catch (SQLException e) {
            System.out.println("Erro ao escluir Emprestimo: " + e);
            return e.toString();
        }
    }

    @Override
    public ArrayList<Emprestimo> consultarTodos() {
        ArrayList<Emprestimo> emprestimos = new ArrayList<>();

        try {
            String dml = "SELECT * FROM emprestimo ORDER BY data_emprestimo;";

            ResultSet rs = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(dml);

            if (rs.isBeforeFirst()) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    int idObjeto = rs.getInt("objeto_id");
                    int idPessoa = rs.getInt("pessoa_id");
                    int idStatus = rs.getInt("status_id");
                    String dataEmprestimo = Formatacao.ajustaDataDMA(rs.getString("data_emprestimo"));
                    String dataDevolucao = "";

                    if (rs.getString("data_devolucao") != null) {
                        dataDevolucao = Formatacao.ajustaDataDMA(rs.getString("data_devolucao"));
                    }

                    emprestimos.add(new Emprestimo(id, idObjeto, idPessoa, idStatus, dataEmprestimo, dataDevolucao));
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao consultar Emprestimos: " + e);
        }

        return emprestimos;
    }

    @Override
    public ArrayList<Emprestimo> consultar(String criterio) {
        ArrayList<Emprestimo> emprestimos = new ArrayList<>();

        try {
            ResultSet rs = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(criterio);

            if (rs.isBeforeFirst()) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    int idObjeto = rs.getInt("objeto_id");
                    int idPessoa = rs.getInt("pessoa_id");
                    int idStatus = rs.getInt("status_id");
                    String dataEmprestimo = Formatacao.ajustaDataDMA(rs.getString("data_emprestimo"));
                    String dataDevolucao = "";

                    if (rs.getString("data_devolucao") != null) {
                        dataDevolucao = Formatacao.ajustaDataDMA(rs.getString("data_devolucao"));
                    }

                    emprestimos.add(new Emprestimo(id, idObjeto, idPessoa, idStatus, dataEmprestimo, dataDevolucao));
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao consultar Emprestimos: " + e);
        }

        return emprestimos;
    }

    @Override
    public Emprestimo consultarId(int id) {
        Emprestimo emprestimo = null;

        try {
            String dml = "SELECT * FROM emprestimo WHERE id = " + id + ";";

            ResultSet rs = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(dml);

            if (rs.isBeforeFirst()) {
                while (rs.next()) {
                    int idObjeto = rs.getInt("objeto_id");
                    int idPessoa = rs.getInt("pessoa_id");
                    int idStatus = rs.getInt("status_id");
                    String dataEmprestimo = Formatacao.ajustaDataDMA(rs.getString("data_emprestimo"));
                    String dataDevolucao = "";

                    if (rs.getString("data_devolucao") != null) {
                        dataDevolucao = Formatacao.ajustaDataDMA(rs.getString("data_devolucao"));
                    }

                    emprestimo = new Emprestimo(id, idObjeto, idPessoa, idStatus, dataEmprestimo, dataDevolucao);
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao consultar Emprestimos: " + e);
        }

        return emprestimo;
    }
}
