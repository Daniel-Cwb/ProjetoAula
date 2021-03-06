package Questao2;

public class Endereco {
	
	protected String rua;
	protected int numero;
	protected String bairro;
	protected String cidade;
	protected String estado;
	

	public Endereco(String rua, int numero, String bairro, String cidade, String estado) {
		super();
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String retornaEnd() {
		return "Rua: " + this.rua + " N?mero: " + this.numero + " Bairro: " + this.bairro + " Cidade: " + this.cidade + " Estado: " + this.estado;
	}


}
