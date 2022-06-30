package testeDAO;

import java.sql.SQLException;
import java.util.Scanner;

import dao.AlunoDao;
import model.Aluno;

public class TesteDaoConsultaLetra {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Consulta Contatos por Id: \n");
		
		System.out.println("Informe a letra inicial do nome:");
		String letra = scan.nextLine();
		
		try {
			AlunoDao dao = new AlunoDao();
			dao.consultarPorLetra(aluno, letra);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
			
	}
}
