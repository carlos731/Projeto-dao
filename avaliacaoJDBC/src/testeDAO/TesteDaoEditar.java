package testeDAO;

import java.sql.SQLException;
import java.util.Scanner;

import dao.AlunoDao;
import model.Aluno;

public class TesteDaoEditar {
	public static void main(String[] args) {
		//Contato contato = new Contato();
		Scanner scan = new Scanner(System.in);

		System.out.println("Edição:");
		
		System.out.println("Informe o id do registro que deseja editar: ");
		Long id = scan.nextLong();
		scan.nextLine();
		
		System.out.println("Informe o nome: ");
		String nome = scan.nextLine();
		
		System.out.println("Informe o email: ");
		String email = scan.nextLine();
		
		System.out.println("Informe o cpf: ");
		String cpf = scan.nextLine();
		
		System.out.println("Informe a data de nascimento: ");
		String dataNascimento = scan.nextLine();
		
		System.out.println("Informe a naturalidade: ");
		String naturalidade = scan.nextLine();
		
		System.out.println("Informe o endereço: ");
		String endereco = scan.nextLine();
		
		Aluno aluno = new Aluno(id, nome, email, cpf, dataNascimento, naturalidade, endereco);
		
		try {
			AlunoDao dao = new AlunoDao();
			dao.editar(aluno);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
