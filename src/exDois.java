import java.util.Scanner;

import javax.swing.JOptionPane;


public class exDois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("testando sistema");
			
			double saldo = 235.00;
			double vlrsaq;
			String aux;
			
			Scanner leitor = new Scanner(System.in);
			vlrsaq = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de saque: "));
			
			if (saldo > vlrsaq) {
				//verificando se o valor de saque é maior que 100
				if (vlrsaq >100) {
				
					double notasCem = (vlrsaq/100);
					double resto = vlrsaq % 100;
			
					System.out.println("o seu saldo é: "+saldo);
					System.out.println("valor de saque = "+vlrsaq);
					/*usei o metodo math.round() que entre 
					 * parentes recebe um valor a ser arredondado*/
					System.out.println("número de notas de Cem: "+Math.round(notasCem));
					System.out.println ("saldo atual: " + resto);
			
					}
				//se o valor de saque for menor que o saldo disponível
			} else {
				JOptionPane.showMessageDialog(null, "Valor indisponível para saque");
				vlrsaq = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de saque: "));

						
			}
		
			
			
	}

}
