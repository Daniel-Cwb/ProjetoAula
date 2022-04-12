package Trabalho07Ex2;

public class Piloto extends Thread {
	
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
				sleep(this.voltas);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("piloto: " + this.nome + " Número: " + this.numero + " Equipe: " + this.equipe + " Terminou a Corrida.");
	}

}
