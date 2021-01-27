
import javax.swing.JOptionPane;

public class RecDs8 {

	public static void main(String[] args) {

		double vendas[] = new double[1000];
		int i = 0;
		int j = 0;
		double soma = 0;
		double media;
		String aux;
		for (i = 0; i <= 999; i++) {
			aux = JOptionPane.showInputDialog("digite um némero");
			vendas[i] = Double.parseDouble(aux);
			soma += vendas[i];
			j+=i;
		}
		media = soma/j;
		JOptionPane.showMessageDialog(null, soma );
		JOptionPane.showMessageDialog(null, media);
	}
}
