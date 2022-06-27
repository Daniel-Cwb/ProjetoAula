package Questao2;

public class Principal {

	public static void main(String[] args) {
		
		Funcionario func = new Funcionario("Daniel Failho", 1020, new Endereco("Rua sem saida",233,"CIC","Curitiba","Parana"));
		
		System.out.println(func.retornaFunc());
		System.out.println(func.getEndereco().retornaEnd());
		
		Funcionario func2 = new Funcionario("Leticia", 100, new Endereco("Rua Argemiro Candido", 33,"CIC","Curitiba","Parana"));
		
		System.out.println("\n");
		
		System.out.println(func2.retornaFunc());
		System.out.println(func2.getEndereco().retornaEnd());
		

	}

}
