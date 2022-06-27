package Enum2;

public class Principal {

	public static void main(String[] args) {
		
		AulaIngles turma_1 = new AulaIngles(DiaSemana.SEGUNDA, DiaSemana.QUARTA,"Maria Cristina", 1);
		System.out.println(turma_1.mostraTurma());
		
		AulaIngles turma_2 = new AulaIngles(DiaSemana.TERCA, DiaSemana.QUINTA,"Marcos Paulo", 2);
		System.out.println(turma_2.mostraTurma());
		
		AulaIngles turma_3 = new AulaIngles();
		
		turma_3.setPeriodo(2);
		turma_3.setProfessor("Marcia");
		turma_3.setDiaSemana1(8);
		turma_3.setDiaSemana2(9);
		System.out.println(turma_3.mostraTurma());

	}

}
