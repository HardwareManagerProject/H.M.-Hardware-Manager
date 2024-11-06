package br.com.DAO;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConexaoDAO {
    
    public static Connection conector() {
        java.sql.Connection conexao = null;

        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1:3306/hmdatabase";
        String user = "root";
        String password = "root";
        

        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Conexão falhou: " + e.getMessage());
            return null;
        }
}
}