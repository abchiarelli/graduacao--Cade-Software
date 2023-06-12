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
        } catch (SQLException e) {
            System.out.println("ERRO: " + e);
            return e.toString();
        }
    }

    @Override
    public String atualizar(Objeto o) {
        try {
            String dml = "UPDATE objeto SET "
                    + "titulo = '" + o.getTitulo() + "', "
                    + "autor = '" + o.getAutor() + "', "
                    + "publisher = '" + o.getPublisher() + "', "
                    + "status_id = " + o.getStatus() + ", "
                    + "tipo_objeto_id = " + o.getTipo() + " "
                    + "WHERE id = " + o.getId() + ";";

            int r = ConexaoBD.getInstance().getConnection().createStatement().executeUpdate(dml);
            return null;
        } catch (SQLException e) {
            System.out.println("Objeto > atualizar() Exception: " + e);
            return e.toString();
        }
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
        } catch (SQLException e) {
            System.out.println("Erro ao consultar Objeto: " + e);
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
        } catch (SQLException e) {
            System.out.println("Erro ao consultar Objeto: " + e);
        }

        return objetos;
    }

    @Override
    public Objeto consultarId(int id) {
        Objeto objeto = null;

        try {
            String dml = "SELECT * FROM objeto WHERE id = " + id + ";";

            ResultSet rs = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(dml);

            while (rs.next()) {
                String titulo = rs.getString("titulo");
                String autor = rs.getString("autor");
                String publisher = rs.getString("publisher");
                int status = rs.getInt("status_id");
                int tipo = rs.getInt("tipo_objeto_id");

                objeto = new Objeto(id, titulo, autor, publisher, status, tipo);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao consultar Objeto: " + e);
        }

        return objeto;
    }

    public String estaPerdido(int id) {
        try {
            String dml = "UPDATE objeto SET "
                    + "status_id = 3 "
                    + "WHERE id = " + id + ";";

            int retorno = ConexaoBD.getInstance().getConnection().createStatement().executeUpdate(dml);

            return null;
        } catch (SQLException e) {
            System.out.println("Erro ao alterar Objeto: " + e);
            return e.toString();
        }
    }

    public String desfazerPerdido(int id) {
        try {
            //Se NÃO TIVER Emprestimo ativo (Objeto volta como disponível (status_id = 1)
            String dml = "UPDATE objeto SET "
                    + "status_id = 1 "
                    + "WHERE id = " + id + ";";

            //Se TIVER Emprestimo ativo (Objeto volta como emprestado (status_id = 2)
            /*
                String dml = "UPDATE objeto SET "
                    + "status_id = 2 "
                    + "WHERE id = " + id + ";";
             */
            int retorno = ConexaoBD.getInstance().getConnection().createStatement().executeUpdate(dml);

            return null;
        } catch (SQLException e) {
            System.out.println("Erro ao alterar Objeto: " + e);
            return e.toString();
        }
    }

    public String emprestar(int id) {
        try {
            String dml = "UPDATE objeto SET "
                    + "status_id = 2 "
                    + "WHERE id = " + id + ";";

            int retorno = ConexaoBD.getInstance().getConnection().createStatement().executeUpdate(dml);

            return null;
        } catch (SQLException e) {
            System.out.println("Erro ao alterar Objeto: " + e);
            return e.toString();
        }
    }

    public String devolver(int id) {
        try {
            String dml = "UPDATE objeto SET "
                    + "status_id = 1 "
                    + "WHERE id = " + id + ";";

            int retorno = ConexaoBD.getInstance().getConnection().createStatement().executeUpdate(dml);

            return null;
        } catch (SQLException e) {
            System.out.println("Erro ao alterar Objeto: " + e);
            return e.toString();
        }
    }
    
    public boolean estaEmprestado(int id) {
        try {
            String dml = "SELECT * FROM objeto "
                    + "WHERE id = " + id + " "
                    + "AND status_id = 2;";
            
            ResultSet rs = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(dml);
            
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        }catch (SQLException e) {
            System.out.println("Erro na consulta: " + e);
            return false;
        }
    }
}
