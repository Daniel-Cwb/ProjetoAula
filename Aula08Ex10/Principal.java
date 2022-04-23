package Aula08Ex10;

public class Principal {

	public static void main(String[] args) {
		
		Piloto piloto1 = new Piloto("Leclerc", "Ferrari", 9, 50, 100);
		Piloto piloto2 = new Piloto("Verstappen", "RBR/Honda", 3, 50, 110);
		Piloto piloto3 = new Piloto("Lewis Hamilton", "Mercedes", 15, 50, 150);
		
		Thread p1 = new Thread(piloto1);
		Thread p2 = new Thread(piloto2);
		Thread p3 = new Thread(piloto3);
		
		p1.start();
		p2.start();
		p3.start();


	}

}
