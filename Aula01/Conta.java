package Aula01;

public class Conta {
	
	int numero;
	double saldo;
	
	
	public Conta(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	
	// fun��o de credito
	public void creditaSaldo(float valorCreditado) {
		this.saldo = this.saldo + valorCreditado;
	}
	
	// fun��o retorna valor
	public String retornaConta()  {
		return "Numero: " + this.numero + " Saldo: " + this.saldo;
	}
	
	// fun��o de debita Credito
	public void debitaSaldo(float valorDebitado) {
		this.saldo = this.saldo - valorDebitado;
	}

}
