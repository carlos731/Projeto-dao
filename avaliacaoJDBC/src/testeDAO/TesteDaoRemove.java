package testeDAO;

import java.sql.SQLException;
import java.util.Scanner;

import dao.AlunoDao;
import model.Aluno;

public class TesteDaoRemove {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Remoção de Contatos: \n");
		
		System.out.println("Informe o id: ");
		Long id = scan.nextLong();
		
		Aluno aluno = new Aluno(id);
		
		try {
			AlunoDao dao = new AlunoDao();
			dao.remover(aluno);
			System.out.println("Gravação feita no BD com sucesso!");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
