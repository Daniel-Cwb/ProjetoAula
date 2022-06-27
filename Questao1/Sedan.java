package Questao1;

public class Sedan extends Carro {
	
	protected int portamalas;

	

	public Sedan(String marca, int ano, float preco, int portamalas) {
		super(marca, ano, preco);
		this.portamalas = portamalas;
	}

	public int getPortamalas() {
		return portamalas;
	}

	public void setPortamalas(int portamalas) {
		this.portamalas = portamalas;
	}
	
	public void mostrarCarro() { 
		
		 }
	
	
	

}
