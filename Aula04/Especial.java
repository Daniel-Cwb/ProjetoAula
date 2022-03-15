package Aula04;

public class Especial  extends Conta {
	
	private float limite;

	public Especial() {
		super();
	}

	public Especial(int numero, float saldo, float limite) {
		super(numero, saldo);
		
		this.limite = limite;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	public boolean debitaSaldo(float valorDebitado) {
		if(valorDebitado >= this.saldo + this.limite) {
			System.out.println("Saldo Insuficiente");
			return false;
		}else {
			this.saldo = this.saldo - valorDebitado;
			System.out.println("Saldo Sulficiente");
			return true;
		}
	}
	
	

}
