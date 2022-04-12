package Aula06Ex7;

public class Cliente {
	
	private String cpf;
	private int anoNascimento;
	private String nome;
	private String email;
	
	
	private Conta[] conta; // conta é um vetor


	public Cliente(String cpf, int anoNascimento, String nome, String email) {
		super();
		this.cpf = cpf;
		this.anoNascimento = anoNascimento;
		this.nome = nome;
		this.email = email;
		
		this.conta = new Conta[2]; // conta é um vetor de 2 conta
	}// temos que adicinar os get's e Set's como vetores


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

// temos que adicinar os get's e Set's como vetores
	public Conta[] getConta() {
		return conta;
	}


	public void setConta(Conta[] conta) {
		this.conta = conta;
	}
	
	public String retornaCliente() {
		return "CPF: " + this.cpf + " Ano de Nascimento: " + this.anoNascimento + " Nome: " + this.nome + " E-mail: " + this.email;
	}

}
