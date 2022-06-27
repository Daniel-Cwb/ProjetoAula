package ConexaoBD;

import java.sql.*;

public class BancoDeDados {
	
	private Connection connection = null; // Gerencia a conex�o com o BD
	private Statement statement = null; // Gerencia os comandos (querys) enviadas ao BD
	private ResultSet resultset = null; // armazena o retorno de uma query de consulta (Select) no BD
	
	public void conectar() {
		// variaveis que v�o receber  servidor, usuario e senha : jbdc = conecta esta sendo via o jdbc - mysql = BD mysql
		String servidor = "jdbc:mysql://localhost:3306/agenda";
		String usuario = "root";
		String senha = "Astra2.5";
		
		// traz a informa��o se a conex�o foi efetivado ou se deu erro ao tentar conectar
		try {
			this.connection = DriverManager.getConnection(servidor, usuario, senha); // getConnection = estabelece a conex�o com o BD
			this.statement = this.connection.createStatement(); // Statement envia comando para o BD
		}catch (Exception e) {
			System.out.println("Erro na conex�o com o Banco de dados");
			System.out.println(e.getMessage());
		}		
	}
	public boolean estaConectado() {
			
			if (this.connection != null) {
				return true;
			}else {
				return false;
			}
		}
	public void inserirContato(String nome, String telefone) {
		
		String query;
		
		try {
			query = "INSERT INTO contato (nome, telefone) VALUES ('" + nome + "', '" + telefone + "');";
			this.statement.executeUpdate(query);
		}catch (Exception e){
			
			System.out.println("Erro na inser��o");
			System.out.println(e.getMessage());
		}
	}
	
	public void listarContato() {
		
		String query;
		
		try {
			query = "SELECT * FROM contato ORDER BY nome";
			this.resultset = statement.executeQuery(query);
			
			while (this.resultset.next()) {
				System.out.println("Codigo: " + this.resultset.getString("id"));
				System.out.println("Nome: " + this.resultset.getString("nome"));
				System.out.println("Fone: " + this.resultset.getString("telefone"));
			}
		}catch (Exception e) {
			
			System.out.println("Erro no SELECT");
			System.out.println(e.getMessage());
		}
	}
	
	public void apagarContato(String id) {
		String query;
		
		try {
			query = "DELETE FROM contato WHERE id = " + id;
			this.statement.executeUpdate(query);
		}catch (Exception e) {
			
			System.out.println("Erro na EXCLUS�O");
			System.out.println(e.getMessage());
		}
	}
	
	public void atualizarContato(String id, String nome, String telefone) {
		String query;
		
		try {
			query = "UPGRADE contato SET nome = '" + nome + "', telefone = '" + telefone + "' WHERE id = " + id + ";";
			this.statement.executeUpdate(query);
		}catch (Exception e) {
			
			System.out.println("Erro na ATUALIZA��O");
			System.out.println(e.getMessage());
		}
	}

}
