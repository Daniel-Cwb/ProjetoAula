package Aula04;

public class Poupanca extends Conta{
	
	private int anivers�rio;
	
	

	public Poupanca() {
		super();
	}


	public Poupanca(int numero, float saldo, int anivers�rio) {
		super(numero, saldo);
		
		this.anivers�rio = anivers�rio;
	}
	

	public int getAnivers�rio() {
		return anivers�rio;
	}

	public void setAnivers�rio(int anivers�rio) {
		this.anivers�rio = anivers�rio;
	}
	
	// Replicado por ser abstract
	public String retornaConta()  {
		return "Numero: " + this.numero + " Saldo: " + this.saldo + " Anivers�rio: " + this.anivers�rio;
	}
	

}
