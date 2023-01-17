package ProjetoInterfaces;

public class ProjetoInterfaces {

	public static void main(String[] args) {
		Animal boi = new Bovino();
		boi.alimentar();
		boi.emitirSom();
		
		Animal ave = new Aves();
		ave.alimentar();
		ave.emitirSom();

	}

}
