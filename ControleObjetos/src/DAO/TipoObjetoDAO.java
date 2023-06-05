/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import apoio.ConexaoBD;
import apoio.IDAOT;
import entidade.TipoObjeto;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author artur
 */
public class TipoObjetoDAO implements IDAOT<TipoObjeto> {

    @Override
    public String salvar(TipoObjeto o) {

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String dml = "INSERT INTO tipo_objeto VALUES ("
                    + "DEFAULT, "
                    + "'" + o.getDescricao() + "'"
                    + ");";

            int retorno = st.executeUpdate(dml);

            return null;
        } catch (Exception e) {
            System.out.println("Erro: " + e);
            return e.toString();
        }

    }

    @Override
    public String atualizar(TipoObjeto o) {
        String dml = "UPDATE tipo_objeto SET "
                + "descricao = '" + o.getDescricao() + "' "
                + "WHERE id = " + o.getId();

        try {
            int retorno = ConexaoBD.getInstance().getConnection().createStatement().executeUpdate(dml);
            return null;
        } catch (Exception e) {
            System.out.println("Erro ao atualizar: " + e);
            return e.toString();
        }
    }

    @Override
    public String excluir(int id) {
        String dml = "DELETE FROM tipo_objeto WHERE id = " + id;
        try {
            int retorno = ConexaoBD.getInstance().getConnection().createStatement().executeUpdate(dml);
            return null;
        } catch (Exception e) {
            System.out.println("Erro ao excluir Tipo de Objeto: " + e);
            return e.toString();
        }
    }

    @Override
    public ArrayList<TipoObjeto> consultarTodos() {
        ArrayList<TipoObjeto> tipos = new ArrayList<>();

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String dml = "SELECT * FROM tipo_objeto ORDER BY descricao;";

            System.out.println("DML: " + dml);

            ResultSet rs = st.executeQuery(dml);

            while (rs.next()) {
                int id = rs.getInt("id");
                String descricao = rs.getString("descricao");

                TipoObjeto tipo = new TipoObjeto(id, descricao);

                tipos.add(tipo);
            }

        } catch (Exception e) {
        }

        return tipos;
    }

    @Override
    public ArrayList<TipoObjeto> consultar(String criterio) {
        ArrayList<TipoObjeto> tipos = new ArrayList<>();

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            ResultSet rs = st.executeQuery(criterio);

            while (rs.next()) {
                int id = rs.getInt("id");
                String descricao = rs.getString("descricao");

                TipoObjeto tipo = new TipoObjeto(id, descricao);

                tipos.add(tipo);
            }

        } catch (Exception e) {
        }

        return tipos;
    }

    @Override
    public TipoObjeto consultarId(int id) {

        TipoObjeto tipo = null;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String dml = "SELECT * FROM tipo_objeto "
                    + "WHERE id = " + id + " "
                    + "ORDER BY descricao;";

            ResultSet rs = st.executeQuery(dml);

            while (rs.next()) {
                String descricao = rs.getString("descricao");

                tipo = new TipoObjeto(id, descricao);
            }

        } catch (Exception e) {
        }

        return tipo;
    }

}
