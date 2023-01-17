package ProjetoPessoa;

import java.sql.SQLException;
import java.util.List;

public class ProjetoPessoa {

	public static void main(String[] args) throws SQLException, Exception {
		PessoaDAO pd = new PessoaDAO();
		// Incluir uma pessoa
		/*
		Pessoa p1 = new Pessoa("Ana Maria de Souza", "anamariadesouza@gmail.com");
		
		try {
			pd.incluirPessoa(p1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Pessoa não incluída");
		}
		Pessoa p2 = new Pessoa("Adriana Costa e Silva", "adrianacostaesilva@gmail.com");
		try {
			pd.incluirPessoa(p2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Pessoa não incluída");
		}
		*/
		
		// Alterar uma pessoa
		
		Pessoa pes = new Pessoa();

		pes.setIdPessoa(2);
	    pes.setNomePessoa("João do Nascimento");
		pes.setEmail("joadonascimento@gmail.com");

		pd.alterarPessoa(pes);
		

		// Listando todas as pessoas
		List<Pessoa> listaPessoas = pd.ListarPessoas();
		
		for(Pessoa p : listaPessoas){
			System.out.println("Id.: " + p.getIdPessoa());
			System.out.println("Nome : "  +p.getNomePessoa());
			System.out.println("Email : " +p.getEmail());
		}
		
		/*		// Excluir uma pessoa    
		// verificar se a pessoa existe por codigo
		Pessoa pessoa1 = pd.consultarPessoaIndividual(1);
		// chamar o metodo que contem o comando delete
		pd.excluirPessoa(pessoa1);
		*/
	}
}
