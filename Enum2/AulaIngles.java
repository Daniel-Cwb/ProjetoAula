package Enum2;

public class AulaIngles {
	
	private int diaSemana1;
	private int diaSemana2;
	private String professor;
	private int periodo;
	
	


	public AulaIngles() {
		
	}


	public AulaIngles(int diaSemana1, int diaSemana2, String professor, int periodo) {
	
		this.diaSemana1 = diaSemana1;
		this.diaSemana2 = diaSemana2;
		this.professor = professor;
		this.periodo = periodo;
	}


	public int getDiaSemana1() {
		return diaSemana1;
	}

	public void setDiaSemana1(int diaSemana1) {
		this.diaSemana1 = diaSemana1;
	}

	public int getDiaSemana2() {
		return diaSemana2;
	}

	public void setDiaSemana2(int diaSemana2) {
		this.diaSemana2 = diaSemana2;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	
	public String mostraTurma() {
		
		return "Periodo: " + this.periodo + " Professor: " + this.professor +
				" Aulas: " + DiaSemana.retornaDiaSemana(this.diaSemana1) +
				" e " + DiaSemana.retornaDiaSemana(this.diaSemana2);
	}

}
