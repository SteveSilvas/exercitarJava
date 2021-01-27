package pooFolha;

public class Folha {
	String nome;
	String cargo;
	String setor;
	Double salb;
	String cpf;
	String mes;
	Integer faltas;
	Double hextras;
	Integer diastb;
	Integer diasmes;
	diastb = diasmes-faltas;
	
	
	void mostrarFuncionario() {
		System.out.println("Mostrando Dados do Funcionário");
		System.out.println("Nome: " + nome);
		System.out.println("Cargo: " + cargo);
		System.out.println("Setor: " + setor);
		System.out.println("Salb: " + salb);
		System.out.println("CPF: " + cpf);
	}

//Gerindo o Holerite


	
	

	
void mostrarHolerite() {
	System.out.println("Holerite do Mês de "+mes);
System.out.println("Total de faltas "+faltas);
System.out.println("horas extras realizadas "+hextras);
System.out.println("Dias trabalhados "+diastb);
 

}
}
