package ProjetoWrapperConversao;

public class ProjetoWrapperConversao {

	public static void main(String[] args) {
		  //cria um objeto wrapper
        Integer velocidade = new Integer(587);
         
        //converte a variável velocidade para tipo primitivo
        double total = velocidade.doubleValue();
        short total1 = velocidade.shortValue();
        byte total2 = velocidade.byteValue();
         
        Float pi = new Float(3.14f);
        int valorPi = pi.intValue();
        
        //Conversão de uma String para o tipo primitivo.
        double soma = Double.parseDouble("685.65");
  
        System.out.println("Valor de PI arredondado: "+valorPi);   
        System.out.println("Total: "+total);
        System.out.println("Soma: "+soma);
	}
}