package Aula01;

public class Cliente {
	
	String cpf;
	int anoNascimento;
	String nome;
	String email;
	
	
	public Cliente(String cpf, int anoNascimento, String nome, String email) {
		super();
		this.cpf = cpf;
		this.anoNascimento = anoNascimento;
		this.nome = nome;
		this.email = email;
	}


// função que vai printar os dados, como é string obrigatório usar return, void não.
	public String retornaCliente() {
			return "CPF: " + this.cpf + " Ano nascimento: " + this.anoNascimento + "Nome: " + this.nome + "E-mail: " + this.email;
		}
}
