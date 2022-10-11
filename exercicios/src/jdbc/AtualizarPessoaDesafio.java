package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarPessoaDesafio {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in); // Instanciar o scanner
		
		System.out.print("Informe o código da pessoa: "); // Imprimindo msg ao usuario
		int codigo = entrada.nextInt(); // Armazenando a entrada
		
		String select = "SELECT codigo, nome FROM pessoas WHERE codigo = ?"; // Parametros para consulta
		String update = "UPDATE pessoas SET nome = ? WHERE codigo = ?"; // Parametros para consulta
		
		Connection conexao = FabricaConexao.getConexao(); // Conexão com o banco de dados
		PreparedStatement stmt = conexao.prepareStatement(select); // Inicia o PreparedStatement fornecendo o parametro na conexao
		stmt.setInt(1, codigo); // setando os parametros
		ResultSet resultado = stmt.executeQuery(); // ExecuteQuery retorna um resultset (conjunto de dados) e armazena na variavel 
		
		if(resultado.next()) { // condicional se há resultado
			Pessoa p = new Pessoa(resultado.getInt(1), resultado.getString(2)); // Instancia uma pessoa com codigo e nome
			
			System.out.println("O nome atual é " + p.getNome()); // Imprime o nome da pessoa
			entrada.nextLine();
			
			System.out.println("Informe o novo nome: "); // Imprime msg solicitando novo nome
			String novoNome = entrada.nextLine(); // Armazena o novo nome
			
			stmt.close(); // Encerra a conexao do PreparedStatement
			stmt = conexao.prepareStatement(update); // Inicia outro PreparedStatement com novos parametros
			stmt.setString(1, novoNome); // seta o novo parametro
			stmt.setInt(2, codigo); // setando o paramentro do novo nome
			stmt.execute(); // executa a instrução
			
			System.out.println("Pessoa alterada com sucesso!"); // Imprime msg bem sucedida
			
		} else {
			System.out.println("Pessoa não encontrada."); // Imprime msg de pessoa não encontrada
		}
		
		stmt.close(); // Encerra o Statement
		conexao.close(); // Encerra a conexao do banco
		entrada.close(); // Encerra o scanner
	}
}
