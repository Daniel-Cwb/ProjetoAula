package Trabalho05;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Conta[] contas = new Conta[3];
		
		Especial espec = new Especial(); // preparando para o cast
		Poupanca poup = new Poupanca();
		
		int OpMenu;
		float totalLimite = 0;
		float totalSaldo = 0;
		
		
		Scanner ler = new Scanner(System.in);
		
		
		for(int i = 0; i < contas.length; i++) {
			
			printMenu();
			OpMenu = ler.nextInt();
			
			if(OpMenu == 1) {
				System.out.println("Você escolheu Conta Especial \n");
				
			//	espec = (Especial) contas[i]; // Usando o cast para jogar os valores da conta i para espec
				
				espec = new Especial();
				
				System.out.println("Qual o número da Conta: ");
				espec.setNumero(ler.nextInt()); // setando 
				
				
				System.out.println("Qual o Saldo da Conta: ");
				espec.setSaldo(ler.nextFloat());
				
				totalSaldo = totalSaldo + espec.getSaldo();
				
				System.out.println("Qual o Limite da Conta: \n");			
				espec.setLimite(ler.nextFloat());
				
				totalLimite = totalLimite + espec.getLimite();
				
				contas[i] = espec;
	
				
			}else if(OpMenu == 2) {
				
				System.out.println("Você escolheu Conta Poupança: \n");
				
				poup = new Poupanca();
				
				System.out.println("Qual o número da Conta: ");
				poup.setNumero(ler.nextInt());
				
				System.out.println("Qual o Saldo da Conta: ");
				poup.setSaldo(ler.nextFloat());
				
				totalSaldo = totalSaldo + poup.getSaldo();
				
				System.out.println("Qual é o Ano de seu aniversário: \n");
				poup.setAniversário(ler.nextInt());
				
				contas[i] = poup;
				
				
			}else {
				
				System.out.println("Valor inválido Tente Novamente: \n");
				ler.nextLine(); // limpando buffer
			}
		}
		
		for(int i = 0; i < contas.length; i++) {
			
			if (contas[i] instanceof Especial) {
				
				System.out.println("***Contas Especial***\n" + contas[i].retornaConta());
				
				
			}else {
				
				System.out.println("***Contas Poupanca***\n" + contas[i].retornaConta());
			}
			
		}
		
		System.out.println("A soma total dos Saldos é: \n" + totalSaldo);
		System.out.println("A soma total dos Limites é: \n" + totalLimite);
		
	}
	
	public static void printMenu(){
	      System.out.print("##------ Tipo Conta ----------##\n\n");
	      System.out.print("|------------------------------|\n");
	      System.out.print("| Digite 1 - Especial          |\n");
	      System.out.print("| Digite 2 - Poupança          |\n");
	      System.out.print("|------------------------------|\n");
	      System.out.print("Digite uma opção: ");
	  }

}
