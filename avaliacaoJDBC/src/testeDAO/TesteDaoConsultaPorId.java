package testeDAO;

import java.sql.SQLException;
import java.util.Scanner;

import dao.AlunoDao;
import model.Aluno;

public class TesteDaoConsultaPorId {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Consulta Contatos por Id: \n");
		
		System.out.println("Informe o id:");
		Long id = scan.nextLong();
		
		Aluno aluno = new Aluno(id);
		
		AlunoDao dao;
		try {
			dao = new AlunoDao();
			dao.consultarPorId(aluno);
			
			System.out.println("Id: " + aluno.getId());
			System.out.println("Nome: " + aluno.getNome());
			System.out.println("Email: " + aluno.getEmail());
			System.out.println("Endereco: " + aluno.getEndereco());
			System.out.println("");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
