package Questao3;

public class Conta {
	
		private int numero;
		private float saldo;
		
		
		
		public Conta(int numero, float saldo) {
			this.numero = numero;
			this.saldo = saldo;
		}
		
		
		public Conta() {
			super();
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

		public void creditaSaldo(float valorCreditado){
			this.saldo = this.saldo + valorCreditado;
		}
		
		public String retornaConta(){
			return "Numero: " + this.numero + " Saldo: " + this.saldo;
		}

		public void debitaSaldo(float valorDebitado){
			this.saldo = this.saldo - valorDebitado;
		}
		
		public boolean possuiSaldo() {
			if(this.saldo > 0) {
				return true;
			}
			else {
				return false;
			}
		}
}
