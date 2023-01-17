package ProjetoInterfaces;

public class Bovino implements Animal {

	@Override
	public void emitirSom() {
		System.out.println("Muuuuuu");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo feno");
		
	}

	
}
