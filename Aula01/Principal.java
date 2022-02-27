package Aula01;

import java.util.Scanner;

public class Principal {
	
  public static void main(String[] args) {	
		
		
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
      
      Conta conta_01 = new Conta(1521,750.63f);
      System.out.println(conta_01.retornaConta());
      
      Conta conta_02 = new Conta(1314,10.36f);
      conta_02.debitaSaldo(1000.2f);
      System.out.println(conta_02.retornaConta());
      conta_02.creditaSaldo(1000f);
      System.out.println(conta_02.retornaConta());
      
      Conta conta_03 = new Conta(3568,-50.45f);
      System.out.println(conta_03.retornaConta());
      
      Conta conta_04 = new Conta(2224,91.23f);
      System.out.println(conta_04.retornaConta());
      
      Conta conta_05 = new Conta(1019,-70.35f);
      System.out.println(conta_05.retornaConta());
      
      Cliente cliente;
      cliente = new Cliente();
      
      Conta conta;
      conta = new Conta();
      
      
// Abaixo codigo onde o usuario informa valor.      
      
      Scanner menu = new Scanner (System.in);
      
      printMenu();
      int OpMenu = menu.nextInt();
      float debita;
      float credita;
      
      switch (OpMenu) {
      
      case 1:
    	  System.out.print("\nOpção Novo Cliente Selecionado\n");
    	  System.out.print("Qual é o CPF do cliente: ");
    	  cliente.cpf = menu.nextLine();
    	  
    	  menu.nextLine();
    	  
    	  System.out.print("\nQual é o Ano de Nascimento do cliente: ");
    	  cliente.anoNascimento = menu.nextInt();
    	  
    	  menu.nextLine();  
    	  
    	  System.out.print("\nQual é o Nome do cliente: ");
    	  cliente.nome = menu.nextLine();
    	  
    	  System.out.print("\nQual é o E-mail do cliente: ");
    	  cliente.email = menu.nextLine();
    	  
    	  System.out.println(cliente.retornaCliente());
    	  

          printMenu();
          OpMenu = menu.nextInt();
    	  
      case 2:
    	  System.out.print("\nOpção Nova Conta\n");
    	  System.out.print("Qual é o número da conta: ");
    	  conta.numero = menu.nextInt();
    	  
    	  menu.nextLine(); 
    	  
    	  System.out.print("\nQual é o Saldo da conta: ");
    	  conta.saldo = menu.nextFloat();
    	  
    	  System.out.println(conta.retornaConta());
    	  
    	  printMenu();
          OpMenu = menu.nextInt();
          
      case 3:
    	  System.out.print("\nOpção Creditar Saldo\n");
    	  System.out.print("\nQual é o valor que deseja Creditar da conta: ");
    	  credita = menu.nextFloat();
    	  conta.creditaSaldo(credita);
    	  System.out.println(conta.retornaConta());
    	  System.out.println("\n");
    	  printMenu();
          OpMenu = menu.nextInt();
          
      case 4:
    	  System.out.print("\nOpção Debitar Saldo\n");
    	  System.out.print("\nQual é o valor que deseja Debitar da conta: ");
    	  debita = menu.nextFloat();
    	  conta.debitaSaldo(debita);
    	  System.out.println(conta.retornaConta());
    	  System.out.println("\n");
    	  
    	  printMenu();
          OpMenu = menu.nextInt();
          
      case 5:
			System.out.print("\nAté logo!");
			break;
          
    	  default:
    		 System.out.println("*** Valor Invalido, tente novamente ***\n");
    		 printMenu();
             OpMenu = menu.nextInt();
      }
      

    
  }
  public static void printMenu(){
      System.out.print("##------ Menu Principal-----##\n\n");
      System.out.print("|------------------------------|\n");
      System.out.print("| Digite 1 - Novo Cliente      |\n");
      System.out.print("| Digite 2 - Nova Conta        |\n");
      System.out.print("| Digite 3 - Creditar Saldo    |\n");
      System.out.print("| Digite 4 - Debitar Saldo     |\n");
      System.out.print("| Digite 5 - Sair              |\n");
      System.out.print("|------------------------------|\n");
      System.out.print("Digite uma opção: ");
  }
}
