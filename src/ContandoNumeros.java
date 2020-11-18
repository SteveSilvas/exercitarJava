import javax.swing.JOptionPane;

public class ContandoNumeros {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Este Programa Calcula a Quantidade de Caracteres do seu texto  (a soma inclui os espaços vazios");
		String tec = JOptionPane.showInputDialog("digite seu texto ");
		
		int numCar = tec.length();
		JOptionPane.showMessageDialog(null, "Você digitou " +numCar+ " caracteres");
		
		
	}

}
