package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bancodedados.ConnectionFactory;
import model.Aluno;

public class AlunoDao{
	private final Connection con;
	
	/*Construtor*/
	public AlunoDao() throws SQLException{
		this.con = ConnectionFactory.getConnection();
	}
	
	/*Método consultar e adicionar na lista*/
	public List<Aluno> getLista() throws SQLException{
		String sql = "SELECT * FROM aluno";
		PreparedStatement stmt = con.prepareStatement(sql);
		ResultSet rset = stmt.executeQuery();
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		while(rset.next()) {
			Aluno aluno = new Aluno();
			
			aluno.setId(rset.getLong("id"));
			aluno.setNome(rset.getString("nome"));
			aluno.setEmail(rset.getString("email"));
			aluno.setCpf(rset.getString("cpf"));
			aluno.setDataNascimento(rset.getString("dataNascimento"));
			aluno.setNaturalidade(rset.getString("naturalidade"));
			aluno.setEndereco(rset.getString("endereco"));
			alunos.add(aluno);
		}
		rset.close();
		stmt.close();
		return alunos;
	}
	
	/*Método Insert*/
	public void adicionar(Aluno aluno) throws SQLException {
		String sql = "INSERT INTO aluno (nome, email, cpf, dataNascimento, naturalidade, endereco) values (?, ?, ?, ?, ?, ?)";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, aluno.getNome());
		stmt.setString(2, aluno.getEmail());
		stmt.setString(3, aluno.getCpf());
		stmt.setString(4, aluno.getDataNascimento());
		stmt.setString(5, aluno.getNaturalidade());
		stmt.setString(6, aluno.getEndereco());
		stmt.execute();//abri execução
		stmt.close();//fechar execução
		con.close();//fecha conexão
	}
	
	/*Método Consulta*/
	public void consultar(Aluno aluno2) throws SQLException{
		String sql = "SELECT * FROM aluno";
		PreparedStatement stmt = con.prepareStatement(sql);
		
		ResultSet rs = stmt.executeQuery();
		
		stmt.execute();//abri execução
		
		while(rs.next()) {
			Long id = rs.getLong("Id");
			
			String nome = rs.getString("nome");
			
			String email = rs.getString("email");
			
			String cpf = rs.getString("cpf");
			
			String dataNascimento = rs.getString("dataNascimento");
			
			String naturalidade = rs.getString("naturalidade");
			
			String endereco = rs.getString("endereco");
			
			System.out.println(id + ", " + nome + ", " + email + ", " + cpf + ", " + dataNascimento + ", " + naturalidade + ", " + endereco);
		}
		stmt.close();
		con.close();
	}
	
	/*Método Consultar por Id*/
	public void consultarPorId(Aluno aluno) throws SQLException{
		String sql = "SELECT * FROM aluno where id = ?";
		PreparedStatement stmt = con.prepareStatement(sql);
		
		stmt.setLong(1, aluno.getId());
		
		ResultSet rset = stmt.executeQuery();
		
		
		if(rset.next()){
			aluno.setId(rset.getLong("id"));
			aluno.setNome(rset.getString("nome"));
			aluno.setEmail(rset.getString("email"));
			aluno.setCpf(rset.getString("cpf"));
			aluno.setDataNascimento(rset.getString("dataNascimento"));
			aluno.setNaturalidade(rset.getString("naturalidade"));
			aluno.setEndereco(rset.getString("endereco"));
		
		}else {
			System.out.println("ID não existe, ou incorreto!");
		}
		
	}
	
	/*Método Consultar por Letra*/
	public void consultarPorLetra(Aluno aluno, String letra) throws SQLException{
		String sql = "SELECT * FROM aluno where nome like '"+letra+"%'";
		PreparedStatement stmt = con.prepareStatement(sql);
		
		//stmt.setString(1, letra);
		
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next()) {
			Long id = rs.getLong("Id");
			
			String nome = rs.getString("nome");
			
			String email = rs.getString("email");
			
			String cpf = rs.getString("cpf");
			
			String dataNascimento = rs.getString("dataNascimento");
			
			String naturalidade = rs.getString("naturalidade");
			
			String endereco = rs.getString("endereco");
			
			System.out.println(id + ", " + nome + ", " + email + ", " + cpf + ", " + dataNascimento + ", " + naturalidade + ", " + endereco);
		}
		stmt.close();
		con.close();
		
	}
	
	/*Método Editar*/
	public void editar(Aluno aluno) throws SQLException{
		String sql = "UPDATE aluno SET nome=?, email=?, cpf=?, dataNascimento=?, naturalidade=?, endereco=? WHERE id=?";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, aluno.getNome());
		stmt.setString(2, aluno.getEmail());
		stmt.setString(3, aluno.getCpf());
		stmt.setString(4, aluno.getDataNascimento());
		stmt.setString(5, aluno.getNaturalidade());
		stmt.setString(6, aluno.getEndereco());
		stmt.setLong(7, aluno.getId());
		stmt.execute();//abri execução
		
		int retorno = stmt.executeUpdate();
		if(retorno > 0) {
			System.out.println("Novo registro alterado: ");
			System.out.println(aluno.getId() + ", " + aluno.getNome() + ", " + aluno.getEmail() + ", " + aluno.getCpf() + ", " + aluno.getDataNascimento() + ", " + aluno.getNaturalidade() + ", " +  aluno.getEndereco());
		}else {
			System.out.println("Não foi possível alterar os registros!");
		}
		stmt.close();//fechar execução
		con.close();//fecha conexão
	}
	
	/*Método Excluir*/
	public void remover(Aluno aluno) throws SQLException{
		String sql = "DELETE FROM aluno WHERE id = ?";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setLong(1, aluno.getId());
		
		int rowsDeleted = stmt.executeUpdate();
		if(rowsDeleted > 0) {
			System.out.println("Linha deletada com sucesso!!!");
		}
		stmt.close();//fechar execução
		con.close();//fecha conexão
	}
}
