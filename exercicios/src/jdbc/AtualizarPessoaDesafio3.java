package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarPessoaDesafio3 {

	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o codigo da pessoa: ");
		int codigo = entrada.nextInt();
		
		Connection conexao = FabricaConexao.getConexao();
		
		String selectSQL = "select codigo, nome from pessoas where codigo = ?";
		String updateSQL = "update pessoas set nome = ? where codigo = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(selectSQL);
		stmt.setInt(1, codigo);
		ResultSet resultado = stmt.executeQuery();
		
		if(resultado.next()) {
			Pessoa p = new Pessoa(resultado.getInt(1), resultado.getString(2));
			
			System.out.println("Fulado de tal: " + p.getNome());
			entrada.nextLine();
			
			System.out.println("Digite o novo nome do fulado: ");
			String novoNome = entrada.nextLine();
			
			stmt.close();
			stmt = conexao.prepareStatement(updateSQL);
			stmt.setString(1, novoNome);
			stmt.setInt(2, codigo);
			stmt.execute();
			
			System.out.println("Nome atualizado!");			
		} else {
			System.out.println("Pessoa não encontrada.");
		}
		
		entrada.close();
		stmt.close();
		conexao.close();
	}
}
