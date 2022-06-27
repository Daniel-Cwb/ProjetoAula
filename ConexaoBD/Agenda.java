package ConexaoBD;

public class Agenda {

	public static void main(String[] args) {
		
		BancoDeDados bd = new BancoDeDados();
		
		bd.conectar();
		
		if (bd.estaConectado()) {
			System.out.println("Banco de dados conectado");
			
			bd.inserirContato("Leticia Mayara", "4132488772");
			//bd.listarContato();
			//bd.apagarContato();
			//bd.listarContato();
			//bd.atualizarContato("1", "Senac Portão", "3314-5850");
			bd.listarContato();
			
		}else {
			System.out.println("Banco de dados NÃO conectado.");
		}

	}

}
