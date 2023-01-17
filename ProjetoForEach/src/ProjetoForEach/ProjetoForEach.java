package ProjetoForEach;

import java.util.Arrays;
import java.util.List;

public class ProjetoForEach {

	public static void main(String[] args) {
		List<Integer> listaNumeros = Arrays.asList(15, 11, 13, 9, 35);
	    listaNumeros.forEach(System.out::println);
	}
}