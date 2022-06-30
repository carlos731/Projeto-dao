//1- Como fazer as inserção e pesquisa utilizando Scanner

//2- Crie um método que receba uma letra e faz a consulta aos contatos que iniciam com aquela letra:
//DICA: cláusula: where nome like 'C%' || Pode ser UPPER

//3- Crie um método pesquisa que recebe um id(int) e retorna um objeto do tipo contato

//4- Criem um método altera no seu ContatoDAO

//5- Criem um método remove no seu ContatoDAO

package testeDAO;

import java.sql.SQLException;
import java.util.List;

import dao.AlunoDao;
import model.Aluno;

public class TesteListaDao {
	public static void main(String[] args) {
		try {
			AlunoDao cdao = new AlunoDao();
			List<Aluno> alunos = cdao.getLista();
			
			for (Aluno aluno : alunos) {
				System.out.println("Id: " + aluno.getId());
				System.out.println("Nome: " + aluno.getNome());
				System.out.println("Email: " + aluno.getEmail());
				System.out.println("Endereco: " + aluno.getEndereco());
				System.out.println("");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
