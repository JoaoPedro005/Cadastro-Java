package exec1_java;

//Programa que armazena cadastros
// Cadastro: nome - idade - endereco
public class Main {

	public static void main(String[] args) {
		/*
		 * String nome1 = "Alicia"; int idade1 = 30; String endereco1 = "Bragança Pta";
		 * 
		 * String nome2 = "Pedro"; int idade2 = 25; String endereco2 = "Atibaia";
		 * 
		 * String nome3 = "Suzana"; int idade3 = 28; String endereco3 = "Socorro";
		 */
		
		Cadastro cad1 = new Cadastro("Alicia", 30, "bragança pta");
		Cadastro cad2 = new Cadastro("Pedro", 30, "bragança pta");
		Cadastro cad3 = new Cadastro("Suzana", 30, "bragança pta");

//		System.out.println(formataCadastro(nome1, idade1, endereco1));
//		System.out.println(formataCadastro(nome2, idade2, endereco3));
		
		System.out.println(cad1.formataCadastro());
		String cadFormatado = cad2.formataCadastro();
		System.out.println(cadFormatado);

	}
	
	public static String formataCadastro(String nome, 
									   int idade,
									   String endereco) {
		return "Nome: " + nome + "\n" + 
				"Idade: " + idade + "\n" + 
				"endereco: " + endereco + "\n";
	}

}
