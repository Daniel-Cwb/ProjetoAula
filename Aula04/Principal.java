package Aula04;

public class Principal {
	
	public static void main(String[] args) {	
	      
		      // Sem Usar o Construtor
		      Poupanca poup_01 = new Poupanca();
		      
		     poup_01.setNumero(1789);
		     poup_01.setSaldo(756.96f);
		     poup_01.setAnivers�rio(15);
		     
		     Especial espec_02 = new Especial();
		     
		     espec_02.setNumero(2049);
		     espec_02.setSaldo(5048.05f);
		     espec_02.setLimite(7000.00f);
		     
		    		 
		      // Usando o Construtor
		      Poupanca poup_02 = new Poupanca(12174, 241.95f, 02);
		      Especial espec_01 = new Especial(3341, 10522.00f, 5000.00f);
		      
		      poup_01.debitaSaldo(110.00f);
		      
		      espec_01.debitaSaldo(50000.0f);
		      
	}
}
