package ProjetoWrapperConstrutores;

import java.time.temporal.ValueRange;

public class ProjetoWrapperConstrutores {

	public static void main(String[] args) {
		 String numInt = "9822";
         
	        //Representação em String do tipo que está sendo criado
	        Float fNum1    = new Float("500.50");
	        Integer iNum1  = new Integer(numInt);
	        Double dNum1   = new Double("512.22");
	         
	        //o argumento somente aceita do tipo char, por isso que é usado aspas simples
	        Character cNum = new Character('a');
	         
	        System.out.println("Float representadopor string: "+fNum1);
	        System.out.println("Integer representado por string: "+iNum1);
	        System.out.println("Char: "+cNum);
	}
}
