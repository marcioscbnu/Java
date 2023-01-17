package ProjetoTryAninhados;

public class ProjetoTryAninhados {

	public static void main(String[] args) {
		
		// numer é mais longo do que denom.
		int[] numer = { 4, 8, 16, 32, 64, 128, 256, 512 };
		int[] denom = { 2, 0, 4, 4, 0, 8 };
		
		try { // try externo
			for(int i=0; i<numer.length; i++) {
				try { // try aninhado
					System.out.println(numer[i] + " / " +
					denom[i] + " é " +
					numer[i]/denom[i]);
				}
				catch (ArithmeticException exc) {
					// captura a exceção
					System.out.println("Divisão por ZERO!");
				}
			}
		}
		catch (ArrayIndexOutOfBoundsException exc) {
			// captura a exceção
			System.out.println("Acesso além dos limites do ARRAY");
			System.out.println("ERRO FATAL - PROGRAMA CANCELADO !!");
		}

	}

}
