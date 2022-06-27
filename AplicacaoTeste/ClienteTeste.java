package AplicacaoTeste;

import org.junit.*;

import Questao3.Conta;

public class ClienteTeste {
	
	
	@Test
	public void credita(){
		
		float result = 1500;
		float result1 = -500;
		float result2 = 1000;
		
		Conta conta = new Conta(1210,1000f);
		
		conta.creditaSaldo(500f);
		Assert.assertEquals(1500f,result,0);
		
		Conta conta1 = new Conta(110,-1000f);
		
		conta1.creditaSaldo(500f);
		Assert.assertEquals(-500f,result1,0);
		
		Conta conta2 = new Conta(10,-1000f);
		
		conta2.creditaSaldo(2000f);
		Assert.assertEquals(1000f,result2,0);
		
	}
	
	@Test
	public void debita() {
		
		float result = 500;
		float result1 = -500;
		float result2 = 500;
		
		Conta conta = new Conta(1210,1000f);
		
		conta.debitaSaldo(500f);;
		Assert.assertEquals(500f,result,0);
		
		Conta conta1 = new Conta(110,1000f);
		
		conta1.debitaSaldo(1500f);;
		Assert.assertEquals(-500f,result1,0);
		
		Conta conta2 = new Conta(10,-1000f);
		
		conta2.debitaSaldo(500f);;
		Assert.assertEquals(500f,result2,0);
		
	}
	
	@Test
	public void possuisaldo() {
		
		
		
		Conta conta = new Conta(12,1000f);
		Conta conta1 = new Conta(132,-1000f);
		Conta conta2 = new Conta(235,0f);
		
		boolean teste;
		
		teste = conta.possuiSaldo();
		Assert.assertTrue(teste);
		
		teste = conta1.possuiSaldo();
		Assert.assertFalse(teste);
		
		teste = conta2.possuiSaldo();
		Assert.assertFalse(teste);
		
	}

}
