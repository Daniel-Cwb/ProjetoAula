package Aula2;

public class Cliente {
	
	String cpf;
	int anoNascimento;
	String nome;
	String email;
	
	public Cliente() {
	}

	public Cliente(String cpf, int anoNascimento, String nome, String email) {
		this.cpf = cpf;
		this.anoNascimento = anoNascimento;
		this.nome = nome;
		this.email = email;
	}
	

	public String getCpf() {
			return cpf;
		}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// função que vai printar os dados, como é string obrigatório usar return, void não.
	public String retornaCliente() {
			return "CPF: " + this.cpf + " Ano de nascimento: " + this.anoNascimento + " Nome: " + this.nome + " E-mail: " + this.email;
		}
}