//ISSO � UMA APLICA��O MAIN
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
			stmt.setString(1, "joao");//primeiro interroga��o
			stmt.setString(2, "joao@gmail.com");//segunda interroga��o
			stmt.setString(3, "Av. Brasil, 1000");//terceira interroga��o
			stmt.execute();//abri execu��o
			stmt.close();//fechar execu��o
			System.out.println("Grava��o executada com sucesso!");
			con.close();//fecha conex�o
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
