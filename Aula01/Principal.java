package Aula01;

import java.util.Scanner;

public class Principal {
	
  public static void main(String[] args) {
	 
		String cliente;
		
	  Cliente cliente_01 = new Cliente("02850435902",1980,"Marcos da Rocha Souza","mr_souza@gmail.com");
	// chamando as funções e printando
      System.out.println(cliente_01.retornaCliente());
      
	  Cliente cliente_02 = new Cliente("03510400902",1985,"Ana Clara Marques","aninha@gmail.com");
	// chamando as funções
	  System.out.println(cliente_02.retornaCliente());
      
      
	  Cliente cliente_03 = new Cliente("04564238906",1975,"Pedro de Alcantara", "pedro_75@gmail.com");
	// chamando as funções
	  System.out.println(cliente_03.retornaCliente());
      
	  Cliente cliente_04 = new Cliente("06989186909",1990,"Daniel Fialho","daniel.fialho90@gmail.com");
	// chamando as funções
	  System.out.println(cliente_04.retornaCliente());
      
      Conta conta_01 = new Conta(1521,750.63);
      System.out.println(conta_01.retornaConta());
      
      Conta conta_02 = new Conta(1314,10.36);
      conta_02.debitaSaldo(1000);
      System.out.println(conta_02.retornaConta());
      
      Conta conta_03 = new Conta(3568,-50.45);
      System.out.println(conta_03.retornaConta());
      
      Conta conta_04 = new Conta(2224,91.23);
      System.out.println(conta_04.retornaConta());
      
      Conta conta_05 = new Conta(1019,-70.35);
      System.out.println(conta_05.retornaConta());
    
	  
  }
}
