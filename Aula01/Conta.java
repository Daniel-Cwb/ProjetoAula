package Aula01;

public class Conta {
	
	int numero;
	double saldo;
	
	
	public Conta(int numero, double saldo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public void creditaSaldo(float valorCreditado) {
		this.saldo = this.saldo + valorCreditado;
	}
	
	

}
