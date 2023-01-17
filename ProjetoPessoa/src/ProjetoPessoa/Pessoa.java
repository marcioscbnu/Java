package ProjetoPessoa;

public class Pessoa {
	private int    idPessoa;
	private String nomePessoa;
	private String email;
	
	public Pessoa() {
		
	}
	// area de construtores
	
	public Pessoa(String nomePessoa, String email) {
		super();
		this.nomePessoa = nomePessoa;
		this.email = email;
	}

	
	// fim area construtores
	
	
	// area de getters e setters
	int getIdPessoa() {
		return idPessoa;
	}
	void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}
	String getNomePessoa() {
		return nomePessoa;
	}
	void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}
	String getEmail() {
		return email;
	}
	void setEmail(String email) {
		this.email = email;
	}
	
	
}
