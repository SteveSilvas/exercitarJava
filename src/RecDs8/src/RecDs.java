/*import javax.swing.JOptionPane;

public class RecDs {

	public static void main(String[] args) {
		
	


		for (i=0;i<=vendas.length;i++) {
			vendas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da venda " + i));
		
		
		
		}
		media=soma/vendas[i];
		JOptionPane.showMessageDialog(null,"a média é" + media);
JOptionPane.showMessageDialog(null, vendas[i]);
	*/



import javax.swing.JOptionPane;

public class RecDs {

	public static void main(String[] args) {
		
		double vendas [] = new double [3];
		int i;
		double soma=0;
		String aux;
		for (i = 1; i <= 3; i++) {
			 aux = JOptionPane.showInputDialog("digite um némero");
			vendas[i] = Double.parseDouble(aux);
			
		JOptionPane.showMessageDialog(null, "Sinto muito, você não ganhou desta vez, tente novamente");}

		/*for (contador = 1; contador < 4; contador++) {	
			soma += vendas[i];
		}*/
		

	}
}


