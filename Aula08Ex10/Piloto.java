package Aula08Ex10;

public class Piloto implements Runnable{
	
	private String nome;
	private String equipe;
	private int numero;
	private int voltas;
	private int tempo;
	
	public Piloto(String nome, String equipe, int numero, int voltas, int tempo) {
		this.nome = nome;
		this.equipe = equipe;
		this.numero = numero;
		this.voltas = voltas;
		this.tempo = tempo;
		
	}

	public void run() {
		System.out.println(this.nome + " Largada");
		try {
			for(int i = 0; i <= this.voltas;i++) {
				Thread.sleep(this.tempo);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("piloto: " + this.nome + " Número: " + this.numero + " Equipe: " + this.equipe + " Terminou a Corrida.");
	}

}
