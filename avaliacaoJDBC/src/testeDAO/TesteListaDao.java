//1- Como fazer as inser��o e pesquisa utilizando Scanner

//2- Crie um m�todo que receba uma letra e faz a consulta aos contatos que iniciam com aquela letra:
//DICA: cl�usula: where nome like 'C%' || Pode ser UPPER

//3- Crie um m�todo pesquisa que recebe um id(int) e retorna um objeto do tipo contato

//4- Criem um m�todo altera no seu ContatoDAO

//5- Criem um m�todo remove no seu ContatoDAO

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
