package testeDAO;

import java.sql.SQLException;

import dao.AlunoDao;
import model.Aluno;

public class TesteDaoConsulta {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();

		System.out.println("Consulta da tabela contatos: ");
		
		try {
			AlunoDao dao = new AlunoDao();
			dao.consultar(aluno);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
