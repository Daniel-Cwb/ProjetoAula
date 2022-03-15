package Aula04;

public class Conta {
	
	public int numero;
	public float saldo;
	
	

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
	
	// Se valor debitado maior ou igual a saldo retorna false
	public boolean debitaSaldo(float valorDebitado) {
		if(valorDebitado >= this.saldo) {
			System.out.println("Valor NÃO debitado devido a falta de saldo");
			return false;
		}else {
			System.out.println("Valor debitado com SUCESSO");
			return true;
		}
	}


}
