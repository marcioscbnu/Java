package ProjetoPessoa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PessoaDAO extends DAO {

	private Pessoa p;

	public void incluirPessoa(Pessoa p) throws Exception {
		String sql = "insert into pessoa (nomepessoa, email) values(?,?)";
        Connection con = DAO.conectar();
	
		try {
	        PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, p.getNomePessoa());
			stm.setString(2, p.getEmail());
			stm.execute();
		}
		catch(SQLException ex) {
			throw new Exception(ex);
		}
	}
	
	public void alterarPessoa(Pessoa p) throws Exception {
		String sql  = "update Pessoa ";
		       sql += "   set nomepessoa = ?, ";
		       sql += "       email      = ?  ";
		       sql += "where  idPessoa   = ?  ";
		Connection con = DAO.conectar();		       

		try {
	        PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, p.getNomePessoa());
			stm.setString(2, p.getEmail());
			stm.setInt(3, p.getIdPessoa());
			stm.execute();
		}
		catch(SQLException ex) {
			throw new Exception(ex);
		}
	}

	public void excluirPessoa(Pessoa p) throws Exception {
		String sql = "delete from Pessoa where idPessoa = ?";
		Connection con = DAO.conectar();
		
		try {
	        PreparedStatement stm = con.prepareStatement(sql);
			stm.setInt(1, p.getIdPessoa());
			stm.execute();
		}
		catch(SQLException ex) {
			throw new Exception(ex);
		}
	}
	
	// retornando um objeto
	
	public Pessoa consultarPessoaIndividual(int cod) throws Exception, SQLException {
	        Connection con = DAO.conectar();
	        String sql = "select nomepessoa, email from pessoa where idPessoa = ? ";
			
			try {
		        PreparedStatement stm = con.prepareStatement(sql);
				stm.setInt(1, cod);
				ResultSet rs = stm.executeQuery();
				if(rs.next()){
					p = new Pessoa();
					p.setNomePessoa(rs.getString("nomepessoa"));
					p.setEmail(rs.getString("email"));					
				}
			}
			catch (SQLException ex) {
				throw new Exception(ex);		
			}
			
			return p;
	}

	public List<Pessoa> ListarPessoas() throws Exception, SQLException {
        List<Pessoa> listaPessoas = new ArrayList<>();
        Connection con;
		con = DAO.conectar();
		
		String sql  = "select idpessoa, nomepessoa, email ";
	       sql += "from pessoa ";
	       sql += "order by idpessoa";
	    PreparedStatement stm = con.prepareStatement(sql);			       
		
		try {
            ResultSet rs = stm.executeQuery();
			while (rs.next()) {
				Pessoa p = new Pessoa();
				p.setIdPessoa(rs.getInt("idPessoa"));
				p.setNomePessoa(rs.getString("nomePessoa"));
				p.setEmail(rs.getString("email"));
				listaPessoas.add(p);
			}
			return listaPessoas;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
}
