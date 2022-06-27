package Constante;

public class DiaSemana {
	
	public static final int DOMINGO = 1; // Declaração de constante em CAIXA ALTA
	public static final int SEGUNDA = 2;
	public static final int TERCA = 3;
	public static final int QUARTA = 4;
	public static final int QUINTA = 5;
	public static final int SEXTA = 6;
	public static final int SABADO = 7;
	
	public static void imprimeDiaSemana(int dia) {
		
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sabado");
			break;
		}
	}

}
