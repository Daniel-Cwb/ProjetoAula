package Aula08;

public class Principal {

	public static void main(String[] args) {
		
		MinhaThread thread1 = new MinhaThread("Thread 1",500);
		
		// passando os parâmetros para Thread
		
		Thread t1 = new Thread(thread1);
		// chamando o método start
		t1.start();
		// implementando outras thread
		
		MinhaThread thread2 = new MinhaThread("Thread 2",600);
		Thread t2 = new Thread(thread2);
		t2.start();
		
		MinhaThread thread3 = new MinhaThread("Thread 3",800);
		Thread t3 = new Thread(thread3);
		t3.start();
		

	}

}
