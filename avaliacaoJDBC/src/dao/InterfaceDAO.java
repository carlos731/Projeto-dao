package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import model.Aluno;

public interface InterfaceDAO {
	
	/*M�todo de Listagem*/
	public List<Aluno> getLista() throws SQLException;
	
	/*M�todo de Adicionar*/
	public void adicionar(Aluno aluno) throws SQLException;
	
	/*M�todo de Consultar*/
	public void consultar(Aluno aluno) throws SQLException;
	
	/*M�todo Consultar por Id*/
	public void consultarPorId(Aluno aluno) throws SQLException;
	
	/*M�todo Consultar por Letra*/
	public void consultarPorLetra(Aluno aluno, String letra) throws SQLException;	
	
	/*M�todo Editar*/
	public void editar(Aluno aluno) throws SQLException;
	
	/*M�todo Excluir*/
	public void remover(Aluno aluno) throws SQLException;

}
