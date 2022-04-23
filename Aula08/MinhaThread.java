package Aula08;

public class MinhaThread implements Runnable  {
	
	String nome;
	int tempo;
	
	
	public MinhaThread(String nome, int tempo) {
		super();
		this.nome = nome;
		this.tempo = tempo;
	}
	
	public void run() {
		
		try{
			for(int i = 0; i < 10; i++) {
				System.out.println(this.nome + " Contador: " + i);
				Thread.sleep(this.tempo);
				}		
			}catch (Exception e) {
				e.printStackTrace();		
			}
		System.out.println(this.nome + " Terminou a Execução");
		}
		
}
	
	

