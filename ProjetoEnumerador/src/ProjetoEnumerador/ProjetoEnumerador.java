package ProjetoEnumerador;

import ProjetoEnumerador.Aluno.STATUS;

public class ProjetoEnumerador {

	public static void main(String[] args) {
		Aluno alu = new Aluno(2.0, 2.0, 9.0);
		
		System.out.println("A média do aluno é : " );

		double mediaAlunoFinal = alu.calcularMedia();
		
		System.out.printf("%,.2f", mediaAlunoFinal);
		System.out.println();
		
		if (mediaAlunoFinal < 6 ) {
			alu.situacaoAluno = STATUS.REPROVADO;
			System.out.println("Aluno REPROVADO");
		} else {
			alu.situacaoAluno = STATUS.APROVADO;
			System.out.println("Aluno APROVADO");
		}
	}
}
