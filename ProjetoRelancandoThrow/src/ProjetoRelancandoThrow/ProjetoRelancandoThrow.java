package ProjetoRelancandoThrow;

public class ProjetoRelancandoThrow {

	public static void genException() {
		// aqui, numer é mais longo do que denom
		int[] numer = { 4, 8, 16, 32, 64, 128, 256, 512 };
		int[] denom = { 2, 0, 4, 4, 0, 8 };
		
		for(int i=0; i<numer.length; i++) {
			try {
				System.out.println(numer[i] + " / " +
				denom[i] + " é " +
				numer[i]/denom[i]);
			}
			catch (ArithmeticException exc) {
				// captura a exceção
				System.out.println("Divisão por ZERO");
			}
			catch (ArrayIndexOutOfBoundsException exc) {
				// captura a exceção
				System.out.println("ARRAY acessado além dos limites");
				throw exc; // relança a exceção
			}
		}
	}
	
	class RethrowDemo {
		public static void main(String[] args) {
			try {
				ProjetoRelancandoThrow.genException();
			}
			catch(ArrayIndexOutOfBoundsException exc) { //Captura a exceção relançada.
			// recaptura a exceção
			System.out.println("ERRO FATAL - PROGRAMA CANCELADO !!");
		}
		}
	}
}
