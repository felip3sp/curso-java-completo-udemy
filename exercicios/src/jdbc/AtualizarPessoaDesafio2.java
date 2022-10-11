package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarPessoaDesafio2 {
	
		public static void main(String[] args) throws SQLException {
		
			Scanner entrada = new Scanner(System.in);// Instanciar o scanner
			
			System.out.println("Insira o codigo da pessoa: ");	// Imprimindo msg ao usuario
			int codigo = entrada.nextInt();	// Armazenando a entrada
			
			String selectSQL = "select codigo, nome from pessoas where codigo = ?";	// Parametros para consulta
			String updateSQL = "update pessoas set nome = ? where codigo = ?";	// Parametros para consulta
			
			Connection conexao = FabricaConexao.getConexao(); // Conexão com o banco de dados
			PreparedStatement stmt = conexao.prepareStatement(selectSQL); // chamando a primeira consulta
			stmt.setInt(1, codigo); // setando o parametro
			ResultSet resultado = stmt.executeQuery(); // executequery retorna um resultset (conjunto de dados) e armazena na variavel
			
			if(resultado.next()) { // condicional se há resultado
				Pessoa pessoa = new Pessoa(resultado.getInt(1), resultado.getString(2)); // instancia uma pessoa com codigo e nome
				
				System.out.println("Fulano tal: " + pessoa.getNome()); // imprime o nome da pessoa
				entrada.nextLine();
				
				System.out.println("Insira o novo nome do fulado: "); // msg solicitando novo nome
				String novoNome = entrada.nextLine(); // armazena o novo nome
				
				stmt.close();
				stmt = conexao.prepareStatement(updateSQL);
				stmt.setString(1, novoNome);
				stmt.setInt(2, codigo);
				stmt.execute();
				
				System.out.println("Nome alterado!");
			} else {
				System.out.println("Pessoa não encontrada.");
			}
			
			stmt.close();
			conexao.close();
			entrada.close();
		}
}
