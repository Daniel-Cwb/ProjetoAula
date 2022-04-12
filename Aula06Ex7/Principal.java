package Aula06Ex7;

public class Principal {
	
	public static void main(String[] args) {
		
		
		Cliente cliente_01 = new Cliente("03510400902",1985,"Ana Maria Marques","aninha@gmail.com");
		
		Conta[] conta = new Conta[2];
		conta[0] = new Conta(1515, 1500.00f);
		conta[1] = new Conta(1517, 2500.00f);
		
		cliente_01.setConta(conta); // criou a relação com as duas contas
		
		System.out.println("Mostrando cliente e as contas\n");
		
		System.out.println(cliente_01.retornaCliente());
		
		System.out.println(cliente_01.getConta()[0].retornaConta());
		System.out.println("\nSegunda conta\n");
		System.out.println(cliente_01.getConta()[1].retornaConta());
		
		System.out.println("Creditando o Valor da conta1 em 100\n");
		
		cliente_01.getConta()[0].credita_saldo(100.00f);
		
		System.out.println(cliente_01.getConta()[0].retornaConta());
		
		System.out.println("Debitando o Valor da conta1 em 2500\n");
		
		cliente_01.getConta()[0].debita_saldo(2500.00f);
		
		System.out.println(cliente_01.getConta()[0].retornaConta());
		
	}
	

}
