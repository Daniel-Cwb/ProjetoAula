package Questao1;

public class Esportivo extends Carro {
	
	protected int potencia;

	public Esportivo(String marca, int ano, float preco, int potencia) {
		super(marca, ano, preco);
		this.potencia = potencia;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	

}
