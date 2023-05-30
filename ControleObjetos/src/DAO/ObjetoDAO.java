/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import apoio.ConexaoBD;
import apoio.IDAOT;
import entidade.Objeto;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author artur
 */
public class ObjetoDAO implements IDAOT<Objeto> {

    @Override
    public String salvar(Objeto o) {
        try {
            String dml = "INSERT INTO objeto VALUES ("
                    + "DEFAULT, "
                    + "'" + o.getTitulo() + "', "
                    + "'" + o.getAutor() + "', "
                    + "'" + o.getPublisher() + "', "
                    + o.getStatus() + ", "
                    + o.getTipo()
                    + ");";

            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            System.out.println("DML: " + dml);

            int retotno = st.executeUpdate(dml);

            return null;
        } catch (Exception e) {
            System.out.println("ERRO: " + e);
            return e.toString();
        }
    }

    @Override
    public String atualizar(Objeto o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String excluir(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Objeto> consultarTodos() {
        ArrayList<Objeto> objetos = new ArrayList<>();

        try {
            String dml = "SELECT * FROM objeto ORDER BY titulo;";

            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            ResultSet rs = st.executeQuery(dml);

            while (rs.next()) {
                int id = rs.getInt("id");
                String titulo = rs.getString("titulo");
                String autor = rs.getString("autor");
                String publisher = rs.getString("publisher");
                int status = rs.getInt("status_id");
                int tipo = rs.getInt("tipo_objeto_id");

                Objeto objeto = new Objeto(id, titulo, autor, publisher, status, tipo);

                objetos.add(objeto);
            }
        } catch (Exception e) {
        }

        return objetos;
    }

    @Override
    public ArrayList<Objeto> consultar(String criterio) {
        ArrayList<Objeto> objetos = new ArrayList<>();

        try {
            ResultSet rs = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(criterio);

            if (rs.isBeforeFirst()) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String titulo = rs.getString("titulo");
                    String autor = rs.getString("autor");
                    String publisher = rs.getString("publisher");
                    int status = rs.getInt("status_id");
                    int tipo = rs.getInt("tipo_objeto_id");

                    Objeto objeto = new Objeto(id, titulo, autor, publisher, status, tipo);

                    objetos.add(objeto);
                }
            }
        } catch (Exception e) {
        }

        return objetos;
    }

    @Override
    public Objeto consultarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
