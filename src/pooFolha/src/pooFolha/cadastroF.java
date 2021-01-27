package pooFolha;


public class cadastroF {
	public static void main(String[] args) {
		//CADASTRO DOS FUNCION�RIOS**
Folha folha1 = new Folha();
folha1.nome = "Jo�o Maria dos Contos";
folha1.cargo = "Gerente";
folha1.setor = "Administra��o";
folha1.salb = 4000.00;
folha1.cpf = "123.456.789-00";

folha1.mostrarFuncionario();

		//PREENCHENDO HOLERITE**

folha1.mes = "janeiro";
folha1.faltas = 1;
folha1.hextras = (double) 5;
folha1.diasmes= 22;



folha1.mostrarHolerite();
	}
}
