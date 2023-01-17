package ProjetoLancandoThrow;

public class ProjetoLancandoThrow {

	public static void main(String[] args) {
		try {
			System.out.println("Antes do throw.");
			throw new ArithmeticException(); //Lança uma exceção.
			}
			catch (ArithmeticException exc) {
			// captura a exceção
			System.out.println("Peguei a exceção");
			}
			System.out.println("Finalizando o Try/Catch");

	}

}
