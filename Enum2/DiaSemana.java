package Enum2;

public class DiaSemana {
	
	public static final int DOMINGO = 1; // Declaração de constante em CAIXA ALTA
	public static final int SEGUNDA = 2;
	public static final int TERCA = 3;
	public static final int QUARTA = 4;
	public static final int QUINTA = 5;
	public static final int SEXTA = 6;
	public static final int SABADO = 7;
	
	public static String retornaDiaSemana(int dia) {
		
		switch (dia) {
		case 1:
			return "Domingo";
			
		case 2:
			return "Segunda";
		
		case 3:
			return "Terça";
			
		case 4:
			return "Quarta";
			
		case 5:
			return "Quinta";

		case 6:
			return "Sexta";
			
		case 7:
			return "Sabado";
			
		default:
			return "Valor incorreto";
		}
		
	}
	
	

}
