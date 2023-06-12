/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import apoio.ConexaoBD;
import apoio.IDAOT;
import entidade.Pessoa;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author artur
 */
public class PessoaDAO implements IDAOT<Pessoa> {

    @Override
    public String salvar(Pessoa o) {
        try {
            String dml = "INSERT INTO pessoa VALUES ("
                    + "DEFAULT, "
                    + "'" + o.getNome() + "', "
                    + "'" + o.getApelido() + "', "
                    + "'" + o.getEmail() + "', "
                    + "'" + o.getTelefone() + "'"
                    + ")";

            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            int retorno = st.executeUpdate(dml);

            return null;
        } catch (Exception e) {
            return e.toString();
        }
    }

    @Override
    public String atualizar(Pessoa o) {
        String dml = "UPDATE pessoa SET "
                + "nome = '" + o.getNome() + "', "
                + "apelido = '" + o.getApelido() + "', "
                + "email = '" + o.getEmail() + "', "
                + "telefone = '" + o.getTelefone() + "' "
                + "WHERE id = " + o.getId() + ";";

        System.out.println("DML alterar Pessoa: " + dml);

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            int retorno = st.executeUpdate(dml);

            return null;
        } catch (Exception e) {
            System.out.println("Erro ao alterar: " + e);
            return e.toString();
        }
    }

    @Override
    public String excluir(int id) {
        String dml = "DELETE FROM pessoa WHERE id = " + id;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            int rotorno = st.executeUpdate(dml);

            return null;
        } catch (Exception e) {
            System.out.println("Erro ao excluir: " + e);
            return e.toString();
        }
    }

    @Override
    public ArrayList<Pessoa> consultarTodos() {
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        try {
            String dml = "SELECT * FROM pessoa ORDER BY nome;";

            Statement st = ConexaoBD.getInstance().getConnection().createStatement();
            ResultSet rs = st.executeQuery(dml);

            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String apelido = rs.getString("apelido");
                String email = rs.getString("email");
                String telefone = rs.getString("telefone");

                Pessoa pessoa = new Pessoa(id, nome, apelido, email, telefone);

                pessoas.add(pessoa);
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar PESSOA: " + e);
        }

        return pessoas;
    }

    @Override
    public ArrayList<Pessoa> consultar(String criterio) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();
            ResultSet rs = st.executeQuery(criterio);

            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String apelido = rs.getString("apelido");
                String email = rs.getString("email");
                String telefone = rs.getString("telefone");

                Pessoa pessoa = new Pessoa(id, nome, apelido, email, telefone);

                pessoas.add(pessoa);
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar PESSOA: " + e);
        }

        return pessoas;
    }

    @Override
    public Pessoa consultarId(int id) {
        Pessoa pessoa = null;

        try {
            String dml = "SELECT * FROM pessoa WHERE id = " + id + ";";

            Statement st = ConexaoBD.getInstance().getConnection().createStatement();
            ResultSet rs = st.executeQuery(dml);

            while (rs.next()) {
                String nome = rs.getString("nome");
                String apelido = rs.getString("apelido");
                String email = rs.getString("email");
                String telefone = rs.getString("telefone");

                pessoa = new Pessoa(id, nome, apelido, email, telefone);
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar PESSOA: " + e);
        }

        return pessoa;
    }

}
