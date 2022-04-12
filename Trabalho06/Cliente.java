package Trabalho06;

public class Cliente {
	
	private String cpf;
	private int anoNascimento;
	private String nome;
	private String email;
	
	
	private Conta conta;


	public Cliente() {
	}

	public Cliente(String cpf, int anoNascimento, String nome, String email) {
		super();
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


	public Conta getConta() {
		return conta;
	}


	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	public String retornaCliente() {
		return "CPF: " + this.cpf + " Ano de Nascimento: " + this.anoNascimento + " Nome: " + this.nome + " E-mail: " + this.email;
	}

}
