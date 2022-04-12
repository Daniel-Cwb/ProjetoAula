package Trabalho07;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Cliente[] clientes = new Cliente[2];
		
		Scanner ler = new Scanner(System.in);
		
		String cpf;
		int anoNascimento;
		String nome;
		String email;
		int numero;
		float saldo;
		
		float totalSaldo = 0;
		
		for(int i = 0; i < clientes.length; i++) {
			
			
			System.out.println("Digite o número do CPF: ");
			cpf = ler.nextLine();
			
			
			System.out.println("Digite o ano de Nascimento: ");
			anoNascimento = ler.nextInt();
			
			ler.nextLine();
			
			System.out.println("Digite o Nome: ");
			nome = ler.nextLine();
			
			System.out.println("Digite o E-mail: ");
			email = ler.nextLine();
			
			
			System.out.println("Digite o Numero da Conta: ");
			numero = ler.nextInt();
			
			
			System.out.println("Digite o Saldo da Conta: ");
			saldo = ler.nextFloat();
			
			ler.nextLine();
			
			clientes[i] = new Cliente(cpf, anoNascimento, nome, email);
			clientes[i].setConta(new Conta(numero,saldo));
			
		//	totalSaldo = totalSaldo + saldo;
			
		}
			
			for(int i = 0; i < clientes.length; i++) {
				
				System.out.println(clientes[i].retornaCliente()); // printando os cliente
				System.out.println(clientes[i].getConta().retornaConta()); // printando a conta do cliente
				System.out.println("\n");
				
				totalSaldo = totalSaldo + clientes[i].getConta().getSaldo();
				
				clientes[i].start();
		}
			
			System.out.println("O saldo total é: " + totalSaldo);
		
		
	}

}
