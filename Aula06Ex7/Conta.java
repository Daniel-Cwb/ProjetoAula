package Aula06Ex7;

public class Conta {
	
	private int numero;
	private float saldo;
	
	
	public Conta() {
		super();
	}


	public Conta(int numero, float saldo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public float getSaldo() {
		return saldo;
	}


	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public String retornaConta() {
		return "Número: " + this.numero + " Saldo: " + this.saldo;
	}
	
	public void credita_saldo(float credita) {
		this.saldo = this.saldo + credita;
	}
	
	public void debita_saldo(float debita) {
		this.saldo = this.saldo - debita;
	}

}
