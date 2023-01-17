package ProjetoUsoWrapper;

import javax.swing.JOptionPane;

public class ProjetoUsoWrapper {

	public static void main(String[] args) {
		 	Funcionario funcionario = new Funcionario();
	        funcionario.setNome(JOptionPane.showInputDialog("Digite o nome do funcionário: "));
	         
	        //invocado as classes Wrappers para fazer a conversão, pois o argumento JOptionPane.showInputDialog é um objeto string
	        //e para ser inserido nos outros tipos primitivos é necessário fazer a conversão
	        
	        funcionario.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do funcionário: ")));
	        funcionario.setSalario(Float.parseFloat(JOptionPane.showInputDialog("Digite o salário do funcionário: ")));
	         
	        //exibição em tela dos dados digitados
	        
	        JOptionPane.showMessageDialog(null, "Funcionário: "+funcionario.getNome() +
	                                            "\n " +"Idade: "+funcionario.getIdade() +
	                                            "\n " + "Salário: "+funcionario.getSalario(),
                                            	"Detalhes Funcionário",JOptionPane.INFORMATION_MESSAGE);
	         
	        System.exit(0);
	}
}
