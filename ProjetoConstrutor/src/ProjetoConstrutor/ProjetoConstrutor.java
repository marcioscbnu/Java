package ProjetoConstrutor;

public class ProjetoConstrutor {

	public static void main(String[] args) {
		
		Aluno alu = new Aluno(8.0, 8.0, 9.0);
		
		System.out.println("A média do aluno é : " );
		System.out.printf("%,.2f", alu.calcularMedia());
	}

}
