package testeDAO;

import java.sql.SQLException;
import java.util.Scanner;

import dao.AlunoDao;
import model.Aluno;

public class TesteDaoInsere {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("FORMULÁRIO DE CADASTRO DE ALUNO: \n");
		
		System.out.println("Nome: ");
		String nome = scan.nextLine();
		
		System.out.println("Email: ");
		String email = scan.nextLine();
		
		System.out.println("CPF: ");
		String cpf = scan.nextLine();
		
		System.out.println("Data de nascimento: ");
		String dataNascimento = scan.nextLine();
		
		System.out.println("Naturalidade: ");
		String naturalidade = scan.nextLine();
		
		System.out.println("Endereço: ");
		String endereco = scan.nextLine();
		
		Aluno aluno = new Aluno(nome, email, cpf, dataNascimento, naturalidade, endereco);

		try {
			AlunoDao dao = new AlunoDao();
			dao.adicionar(aluno);
			System.out.println("\nGravação feita no BD com sucesso!\n");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
