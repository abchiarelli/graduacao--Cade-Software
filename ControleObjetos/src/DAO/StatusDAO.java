/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import apoio.ConexaoBD;
import apoio.IDAOT;
import entidade.Status;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author artur
 */
public class StatusDAO implements IDAOT<Status> {

    @Override
    public String salvar(Status o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String atualizar(Status o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String excluir(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Status> consultarTodos() {
        ArrayList<Status> retorno = new ArrayList<>();
        String dml = "SELECT * FROM status;";

        try {
            ResultSet rs = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(dml);

            while (rs.next()) {
                Status status = new Status(rs.getInt(0), rs.getString(1), rs.getInt(2));
                retorno.add(status);
            }

        } catch (Exception e) {
            System.out.println("Erro ao pesquisar Status: " + e);
        }
        return retorno;
    }

    @Override
    public ArrayList<Status> consultar(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Status consultarId(int id) {
        String dml = "SELECT * FROM status WHERE id = " + id + ";";

        Status retorno = null;

        try {
            ResultSet rs = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(dml);

            if (rs.isBeforeFirst()) {
                while (rs.next()) {
                    retorno = new Status(rs.getInt(1), rs.getString(2), rs.getInt(3));
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao pesquisar Status: " + e);
        }
        return retorno;
    }

}
