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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String excluir(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
