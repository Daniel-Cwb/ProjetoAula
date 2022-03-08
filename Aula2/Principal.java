package Aula2;

import java.util.Scanner;

public class Principal {
	
  public static void main(String[] args) {	
      
      
// Abaixo codigo onde o usuario informa valor. 
	 
      
      Scanner menu = new Scanner (System.in);
      
      Cliente cliente;
      cliente = new Cliente();
      
      Conta conta;
      conta = new Conta();
      
      
      printMenu();
      int OpMenu = menu.nextInt();
      float debita;
      float credita;
      float novo_saldo;
      boolean alterar;
      
      
      switch (OpMenu) {
      
      case 1:
    	  System.out.print("\nOp��o Novo Cliente Selecionado\n");
    	  System.out.print("Qual � o CPF do cliente: ");
    	  cliente.cpf = menu.nextLine();
    	  
    	  menu.nextLine();
    	  
    	  System.out.print("\nQual � o Ano de Nascimento do cliente: ");
    	  cliente.anoNascimento = menu.nextInt();
    	  
    	  menu.nextLine();  
    	  
    	  System.out.print("\nQual � o Nome do cliente: ");
    	  cliente.nome = menu.nextLine();
    	  
    	  System.out.print("\nQual � o E-mail do cliente: ");
    	  cliente.email = menu.nextLine();
    	  
    	  System.out.println(cliente.retornaCliente());
    	  
          printMenu();
          OpMenu = menu.nextInt();
    	  
      case 2:
    	  System.out.print("\nOp��o Nova Conta\n");
    	  System.out.print("Qual � o n�mero da conta: ");
    	  conta.setNumero(menu.nextInt());
    	  
    	  menu.nextLine(); 
    	  
    	  // conta setSaldo esta recebendo o valor digitado
    	  System.out.print("\nQual � o Saldo da conta: ");
    	  conta.setSaldo(menu.nextFloat());
    	  
    	  System.out.println(conta.retornaConta());
    	  
    	  printMenu();
          OpMenu = menu.nextInt();
          menu.nextLine(); 
          
      case 3:
    	  System.out.print("\nOp��o Creditar Saldo\n");
    	  System.out.print("\nQual � o valor que deseja Creditar da conta: ");
    	  credita = menu.nextFloat();
    	  conta.creditaSaldo(credita);
    	  System.out.println(conta.retornaConta());
    	  System.out.println("\n");
    	  printMenu();
          OpMenu = menu.nextInt();
          menu.nextLine(); 
          
      case 4:
    	  System.out.print("\nOp��o Debitar Saldo\n");
    	  System.out.print("\nQual � o valor que deseja Debitar da conta: ");
    	  debita = menu.nextFloat();
    	  conta.debitaSaldo(debita);
    	  System.out.println(conta.retornaConta());
    	  System.out.println("\n");
    	  
    	  printMenu();
          OpMenu = menu.nextInt();
          menu.nextLine(); 
          
      case 5:
    	  System.out.print("\nOp��o Mudar Saldo\n");
    	  System.out.print("\nQual � o novo valor: ");
    	  novo_saldo = menu.nextFloat();
    	  alterar = conta.setSaldo(novo_saldo);
    	  if(alterar) {
    		  System.out.println("Saldo atualizado com sucesso");
    	  }else {
    		  System.out.println("Saldo n�o atualizado. N�o pode ser negativo");
    	  }
    	  System.out.println(conta.retornaConta());
    	  System.out.println("\n");
    	  
      case 6:
			System.out.print("\nAt� logo!");
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
      System.out.print("| Digite 5 - Mudar Saldo       |\n");
      System.out.print("| Digite 6 - Sair              |\n");
      System.out.print("|------------------------------|\n");
      System.out.print("Digite uma op��o: ");
  }
}
