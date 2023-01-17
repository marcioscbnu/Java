package ProjetoErroOutroMetodo;

public class ProjetoErroOutroMetodo {

	public static void main(String[] args) {
		try {
			genException();
			} catch (ArrayIndexOutOfBoundsException exc) {
			
			// captura a exceção
			System.out.println("Você acessou um índice além do limite do array. Verifique");
			}
			System.out.println("Depois do catch");

	}
	static void genException() {
		int[] nums = new int[4];
		System.out.println("Gerando o erro");
		// gera uma exceção de índice fora do limite
		nums[0] = 10; //A exceção é gerada aqui.
		System.out.println("Rotina não apresentou erro.");
		}

}
