package ProjetoInterfaces;

public class Aves implements Animal {

	@Override
	public void emitirSom() {
		System.out.println("Pi pi pi ");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo farelo de milho");
		
	}

}
