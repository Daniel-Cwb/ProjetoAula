package Aula01;

public class Conta {
	
	int numero;
	float saldo;
	
	
	public Conta(int numero, float saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	
	// função de credito
	public void creditaSaldo(float valorCreditado) {
		this.saldo = this.saldo + valorCreditado;
	}
	
	// função retorna valor
	public String retornaConta()  {
		return "Numero: " + this.numero + " Saldo: " + this.saldo;
	}
	
	// função de debita Credito
	public void debitaSaldo(float valorDebitado) {
		this.saldo = this.saldo - valorDebitado;
	}

}
