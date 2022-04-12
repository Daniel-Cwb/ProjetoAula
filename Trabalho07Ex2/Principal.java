package Trabalho07Ex2;

public class Principal {

	public static void main(String[] args) {
		
		Piloto piloto1 = new Piloto("Leclerc", "Ferrari", 9, 50, 10);
		Piloto piloto2 = new Piloto("Verstappen", "RBR/Honda", 3, 50, 110);
		Piloto piloto3 = new Piloto("Lewis Hamilton", "Mercedes", 15, 50, 150);
		
		piloto1.start();
		piloto2.start();
		piloto3.start();

	}

}
