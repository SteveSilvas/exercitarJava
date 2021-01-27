
public class CadLivros {

	public static void main(String[] args) {
		System.out.println("");
		System.out.println("Mostrando os livros da nossa Biblioteca");
		System.out.println("");
		System.out.println("");

		
		Livro a = new Livro();
		a.titulo = "Quem tem medo de feminismo negro?";
		a.autor = "Djalma Ribeiro";
		a.editor = "Companhia das Letras";
		a.edicao = 1;
		a.isbn = "978-85-359-3113-6";

		Editora z = new Editora();
		z.nomeEd =  "Companhia das Letras";
		z.uFEd = "SP"	;
		z.siteEd = "www.companhiadasletras.com.br";
		z.emailED = "facebook.com/companhiadasletras";
		
		
	a.mostrarCatalogo();
	z.mostrarEditora();
		
	Livro b = new Livro();
	b.titulo = "A capoeira Angola na Bahia";
	b.autor = "Mestre Bola Sete (José Luís Oliveira)";
	b.editor = "Pallas Editora e Distribuidora Ltda";
	b.edicao = 4;
    b.isbn = "85-347-0271-3";
    
    b.mostrarCatalogo();
    
    Livro c = new Livro();
    c.titulo = "Vício";
    c.autor = "Mariana Félix";
	c.editor = "";	
	c.edicao = 1;
	c.isbn = "962-97-6797-033-4";
			
	c.mostrarCatalogo();
	
	Livro d = new Livro();
    d.titulo = "Bom dia camaradas";
    d.autor = "Ondjaki";
	d.editor = "Nova Fronteira Participações S.A.";	
	d.edicao = 0;
	d.isbn = "978-85-220-0714-1";	
		
	/*Modelo de inserção de novo livro
	 * 
	 * c.mostrarCatalogo();
	Livro c = new Livro();
    c.titulo =
    c.autor = 
	c.editora = 	
	c.edicao = 	
	c.isbn = 	
		
	c.mostrarCatalogo();
	*/
	Livro e = new Livro();
    e.titulo = "Os Meninos da Rua Paulo (Original:A Pál-Utcai Fiuk";
    e.autor = "Forenc Molnár";
	e.editor = "Tecnoprint S.A";	
	e.edicao = 0;	
	e.isbn = "Ediouro 81643";	
		
	e.mostrarCatalogo();
	
	}

}
