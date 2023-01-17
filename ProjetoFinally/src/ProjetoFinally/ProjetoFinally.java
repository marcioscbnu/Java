package ProjetoFinally;

public class ProjetoFinally {
	public static void genException(int what) {
		int t;
		int[] nums = new int[2];
		System.out.println("Processando... " + what);
		try {
			switch(what) {
				case 0:
					t = 10 / what; // gera erro de divisão por zero
					break;
				case 1:
					nums[4] = 4; // gera erro de índice de array.
					break;
				case 2:
					return; // retorna do bloco try
			}
		}
		catch (ArithmeticException exc) {
			// captura a exceção
			System.out.println("Divisão por ZERO!");
			return; // retorna de catch
		}
		catch (ArrayIndexOutOfBoundsException exc) {
			// captura a exceção.
			System.out.println("ARRAY acessado além dos limites");
		}
		finally { //Esta instrução é executada quando saímos de blocos try/catch.
			System.out.println("Deixando o try.");
		}
	}
		
	public static void main(String[] args) {
		for(int i=0; i < 3; i++) {
			ProjetoFinally.genException(i);
			System.out.println();
		}
	}
}
