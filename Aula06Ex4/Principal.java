package Aula06Ex4;

public class Principal {
	
	public static void main(String[] args) {
		
		Cliente cliente_01 = new Cliente("03510400902",1985,"Ana Maria Marques","aninha@gmail.com",1519,759.20f);
		
		System.out.println(cliente_01.retornaCliente());
		System.out.println(cliente_01.getConta().retornaConta());
		
		cliente_01.getConta().credita_saldo(100.00f);
		
		System.out.println("Valor Creditado 100 reais\n");
		
		System.out.println(cliente_01.retornaCliente());
		System.out.println(cliente_01.getConta().retornaConta());
		
		System.out.println("Valor Debitando 2750 reais\n");
		
		cliente_01.getConta().debita_saldo(2750.00f);
		
		System.out.println(cliente_01.retornaCliente());
		System.out.println(cliente_01.getConta().retornaConta());
		
		System.out.println("\nExercicio 5\n"); 
		
		Conta conta = new Conta(1519, 759.20f);
		Cliente cliente_02 = new Cliente("03510400902",1985,"Ana Maria Marques","aninha@gmail.com",conta);
		
		System.out.println(cliente_02.retornaCliente());
		System.out.println(cliente_02.getConta().retornaConta());
		
		cliente_02.getConta().credita_saldo(100.00f);
		
		System.out.println("Valor Creditado 100 reais\n");
		
		System.out.println(cliente_02.retornaCliente());
		System.out.println(cliente_02.getConta().retornaConta());
		
		System.out.println("Valor Debitando 2750 reais\n");
		
		cliente_02.getConta().debita_saldo(2750.00f);
		
		System.out.println(cliente_02.retornaCliente());
		System.out.println(cliente_02.getConta().retornaConta());
		
		System.out.println("\nExercicio 6\n");
		
		Cliente cliente_03 = new Cliente("02950338954",1978,"Marcos Paulo Nunes","marquito@gmail.com", new Conta(2374,1500.00f));
		
		System.out.println(cliente_03.retornaCliente());
		System.out.println(cliente_03.getConta().retornaConta());
		
		cliente_03.getConta().credita_saldo(75.00f);
		
		System.out.println("Valor Creditado 75 reais\n");
		
		System.out.println(cliente_03.retornaCliente());
		System.out.println(cliente_03.getConta().retornaConta());
		
		System.out.println("Valor Debitando 2750 reais\n");
		
		cliente_03.getConta().debita_saldo(150.00f);
		
		System.out.println(cliente_03.retornaCliente());
		System.out.println(cliente_03.getConta().retornaConta());
		
		
		
	}

}
