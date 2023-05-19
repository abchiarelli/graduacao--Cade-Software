/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apoio;

import java.io.*;
import java.sql.*;
import java.util.Properties;

/**
 *
 * @author artur
 */
public class ConexaoBD {

    static ConexaoBD instance = null;
    Connection connection = null;

    public ConexaoBD() {

        try {
            Properties prop = new Properties();
            prop.load(new FileInputStream("./nbproject/private/dbcon.properties"));

            String driver = prop.getProperty("db.driver");
            String url = prop.getProperty("db.url");
            String user = prop.getProperty("db.user");
            String pass = prop.getProperty("db.pass");

            Class.forName(driver);

            if (user.length() != 0) {
                connection = DriverManager.getConnection(url, user, pass);
            } else {
                connection = DriverManager.getConnection(url);
            }

        } catch (Exception e) {
            System.out.println("Erro ao tentar conexão com BD: " + e);
        }
    }

    public static ConexaoBD getInstance() {
        if (instance == null) {
            instance = new ConexaoBD();
        }
        return instance;
    }

    public Connection getConnection() {
        if (connection == null) {
            throw new RuntimeException("connection == null");
        }
        return connection;
    }

    public void shutDown() {
        try {
            connection.close();
            instance = null;
            connection = null;
        } catch (Exception e) {
            System.err.println(e);
        }
    }

}
