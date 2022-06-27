package Enum;

public class AulaIngles {
	
	private DiaSemana diaSemana1;
	private DiaSemana diaSemana2;
	private String professor;
	private int periodo;
	
	
	public AulaIngles() {
		
	}

	public AulaIngles(DiaSemana diaSemana1, DiaSemana diaSemana2, String professor, int periodo) {
		super();
		this.diaSemana1 = diaSemana1;
		this.diaSemana2 = diaSemana2;
		this.professor = professor;
		this.periodo = periodo;
	}
	

	public DiaSemana getDiaSemana1() {
		return diaSemana1;
	}


	public void setDiaSemana1(DiaSemana diaSemana1) {
		this.diaSemana1 = diaSemana1;
	}

	public DiaSemana getDiaSemana2() {
		return diaSemana2;
	}

	public void setDiaSemana2(DiaSemana diaSemana2) {
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

	@Override
	public String toString() {
		return "AulaIngles [diaSemana1 = " + diaSemana1 + ", diaSemana2 = " + diaSemana2 + ", professor = " + professor
				+ ", periodo = " + periodo + "]";
	}
	
	

}
