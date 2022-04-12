package Aula07;

public class MinhaThread extends Thread{
	
	private String nome;
	private int tempo;

	
	public MinhaThread(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		
		start(); //executa quando foi chamado o construtor
	}
	
	public void run() { // Executa a Thread, toda logica vai no run
		
		try {
			for(int i = 0; i <= 10; i++) {
				System.out.println(this.nome + " contador: " + i);
				// colocando para dormiu por um tempo em milissigundos
				//So executa sleep dentro de um try catch
				sleep(this.tempo);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("termino da execução");
	}
	
	
	
	
	
	
	

}
