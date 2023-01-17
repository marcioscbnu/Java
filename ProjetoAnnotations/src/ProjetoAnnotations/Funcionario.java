package ProjetoAnnotations;

public class Funcionario {

	@Deprecated
	public double calcularSalario(double vlrSalario, double qtdHoras) {
		double salarioTotal = 0;
		salarioTotal = vlrSalario * qtdHoras;
		
		return salarioTotal;
	}
	
	public double calcularSalarioNovo(double vlrSalario, double qtdHoras, double vlrDescontos) {
		double salarioTotal = 0;
		salarioTotal = (vlrSalario * qtdHoras) - vlrDescontos;
		
		return salarioTotal;
	}
}
