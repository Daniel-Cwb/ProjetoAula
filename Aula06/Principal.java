package Aula06;

public class Principal {
	
	public static void main(String[] args) {
	
		Cliente cliente_01 = new Cliente("06989186900",1990,"Pedro Sampaio","sampaio@gmail.com");
		
		Conta conta = new Conta(1519,759.20f); // instanciando
		
		cliente_01.setConta(conta); // associando cliente a conta
		
		System.out.println(cliente_01.retornaCliente()); // retorna cliente
		
		System.out.println(cliente_01.getConta().retornaConta());
		
		
		Cliente cliente_02 = new Cliente("02950338954",1978,"Marcos Paulo Nunes","marquito@gmail.com");
		
		cliente_02.setConta(new Conta(2374,1500.00f)); // ja esta associando ao cliente e setando os valores de conta
		
		System.out.println(cliente_02.retornaCliente()); // retorna cliente
		
		System.out.println(cliente_02.getConta().retornaConta()); // printando o cliente e conta
		
		cliente_02.getConta().credita_saldo(75.00f); // creditando valor na conta do cliente 2
		
		System.out.println("Com valor 75 reais creditado\n");
		System.out.println(cliente_02.getConta().retornaConta());
		
		Cliente cliente_03 = new Cliente("03598268790",1990,"João Cunha","cunha@gmail.com");
		
		cliente_03.setConta(new Conta(3322,1200.00f));
		System.out.println("\n");
		System.out.println(cliente_03.retornaCliente());
		System.out.println(cliente_03.getConta().retornaConta());
	}	
}
