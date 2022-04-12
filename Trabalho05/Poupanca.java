package Trabalho05;

public class Poupanca extends Conta{
	
private int aniversário;
	
	

	public Poupanca() {
		super();
	}


	public Poupanca(int numero, float saldo, int aniversário) {
		super(numero, saldo);
		
		this.aniversário = aniversário;
	}
	

	public int getAniversário() {
		return aniversário;
	}

	public void setAniversário(int aniversário) {
		this.aniversário = aniversário;
	}
	
	// Replicado por ser abstract
	public String retornaConta()  {
		return "Numero: " + this.numero + " Saldo: " + this.saldo + " Aniversário: " + this.aniversário;
	}

}
