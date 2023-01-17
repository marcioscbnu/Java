package ProjetoWrapperValueOF;

public class ProjetoWrapperValueOF {

	public static void main(String[] args) {
		Integer idade = new Integer(39);
		String idadeString = String.valueOf(idade);
		String velocidade = new String("568.55");
		Double velocidadeDouble = Double.valueOf(velocidade);
		         
		System.out.println("Idade string: "+idadeString);
		System.out.println("Velocidade double: "+velocidadeDouble); 
	}

}
