package ProjetoTry;

public class ProjetoTry {

	public static void main(String[] args) {
		int[] nums = new int[4];
		try {
			System.out.println("Entrei no Try");
			// gera uma exceção de índice fora dos limites
			nums[0] = 10;
			System.out.println("Rotina não apresentou erro.");
		}
		catch(ArrayIndexOutOfBoundsException exc) {
			// captura a exceção
			System.out.println("Você acessou um índice além do limite do array. Verifique");
		}
		System.out.println("Depois do catch");
	}

}
