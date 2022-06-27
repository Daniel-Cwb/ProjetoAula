package Enum;

public class Principal {

	public static void main(String[] args) {
		
		DiaSemana dia;
		
		AulaIngles turma_1 = new AulaIngles(DiaSemana.SEGUNDA, DiaSemana.QUARTA,"Maria Cristina", 1);
		System.out.println(turma_1.toString());
		
		AulaIngles turma_2 = new AulaIngles(DiaSemana.TERCA, DiaSemana.QUINTA,"Marcos Paulo", 2);
		System.out.println(turma_2.toString());
		
		dia = DiaSemana.DOMINGO;
		System.out.println(dia);
		System.out.println(dia.getValor());
	}

}
