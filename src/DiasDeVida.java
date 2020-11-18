import javax.swing.JOptionPane;

public class DiasDeVida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idadeA;
		
		
		idadeA = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		int idadeM = idadeA*12;
		int idadeD = idadeA*360;
		int idadeH = idadeD*24;
		int idadeMin = idadeH*60;
		int idadeSeg = idadeMin*60;
		
		JOptionPane.showMessageDialog(null, "sua idade em Meses é: "+idadeM);
		JOptionPane.showMessageDialog(null, "sua idade em dias é: "+idadeD);
		JOptionPane.showMessageDialog(null, "sua idade em Horas é: "+idadeH);
		JOptionPane.showMessageDialog(null, "sua idade em Minutos é: "+idadeMin);
		JOptionPane.showMessageDialog(null, "sua idade em Segundos é: "+idadeSeg);




		
	}

}
