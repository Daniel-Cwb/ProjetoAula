package Aula2;

public class Conta {
	
	private int numero;
	private float saldo;
	
	public Conta() {

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



	public boolean setSaldo(float novo_saldo) {
		if(novo_saldo < 0) {
			return false;
		}else {
			this.saldo = novo_saldo;
			return true;
		}
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
