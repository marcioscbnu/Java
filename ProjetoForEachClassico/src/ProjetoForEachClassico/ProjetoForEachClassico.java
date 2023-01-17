package ProjetoForEachClassico;

import java.util.Arrays;
import java.util.List;

public class ProjetoForEachClassico {

	public static void main(String[] args) {
		
		List<Integer> listaNumeros = Arrays.asList(15, 11, 13, 9, 35);

        for(Integer numero : listaNumeros){
            System.out.println(numero);
        }
	}
}