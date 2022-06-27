package Questao1;

import Aula06Ex7.Conta;

public class Principal {

	public static void main(String[] args) {
		
		Carro[] carro = new Carro[3];
		Sedan sedan;
		Esportivo esp;
		
		float valorTotal = 0;
		
		
		carro[0] = new Sedan("WW", 2019, 55000.00f,200);
		carro[1] = new Esportivo("Ford", 2021, 75000.00f,450);
		carro[2] = new Sedan("FIAT", 2020, 45000.00f,195);
		
		for(int i  = 0; i < carro.length; i++) {
			
			if(carro[i] instanceof Sedan) {
				sedan = (Sedan) carro[i];
				System.out.println("Marca: " + sedan.getMarca() + " Ano: " + sedan.getAno() + " Preço: " + sedan.getPreco() + " Porta Malas: " + sedan.getPortamalas());
			}else {
				esp = (Esportivo) carro[i];
				System.out.println("Marca: " + esp.getMarca() + " Ano: " + esp.getAno() + " Preço: " + esp.getPreco() + " Potência: " + esp.getPotencia());
			}
		}
		
		for(int i = 0; i < carro.length; i ++) {
			valorTotal = valorTotal + carro[i].getPreco();
		}
		
		System.out.println("O valor total é: " + valorTotal);

	}

}
