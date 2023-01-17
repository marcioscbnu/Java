package ProjetoPessoa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
	Connection con;  // Conexao ao Banco de Dados
	public static Connection conectar() throws ClassNotFoundException{
		 Connection con  = null;
	        String url      = "jdbc:mysql://localhost:3306/pessoadb";
	        String user     = "pessoauser";
	        String password = "pessoapwd";
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            con = DriverManager.getConnection(url, user, password);
	        } catch (SQLException ex) {
	            System.out.println("Erro ao conectar com o banco " + ex);
	        }
	        return con;                
        }
}
