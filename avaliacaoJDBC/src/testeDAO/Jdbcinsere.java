//ISSO È UMA APLICAÇÂO MAIN
package testeDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bancodedados.ConnectionFactory;

public class Jdbcinsere {
	public static void main(String[] args) {
		try {
			String sql = "INSERT INTO contatos(nome, email, endereco) values (?, ?, ?)";
			Connection con = ConnectionFactory.getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, "joao");//primeiro interrogação
			stmt.setString(2, "joao@gmail.com");//segunda interrogação
			stmt.setString(3, "Av. Brasil, 1000");//terceira interrogação
			stmt.execute();//abri execução
			stmt.close();//fechar execução
			System.out.println("Gravação executada com sucesso!");
			con.close();//fecha conexão
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
