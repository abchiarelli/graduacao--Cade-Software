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
                    + o.getTitulo() +"'', "
                    + o.getAutor() + "'', "
                    + o.getPublisher() + "'', "
                    + o.getStatus() + ", "
                    + o.getTipo()
                    + ");";
            
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();
            
            int retotno = st.executeUpdate(dml);
            
            return null;
        } catch (Exception e) {
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Objeto> consultar(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Objeto consultarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
