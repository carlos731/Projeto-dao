package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import model.Aluno;

public interface InterfaceDAO {
	
	/*Método de Listagem*/
	public List<Aluno> getLista() throws SQLException;
	
	/*Método de Adicionar*/
	public void adicionar(Aluno aluno) throws SQLException;
	
	/*Método de Consultar*/
	public void consultar(Aluno aluno) throws SQLException;
	
	/*Método Consultar por Id*/
	public void consultarPorId(Aluno aluno) throws SQLException;
	
	/*Método Consultar por Letra*/
	public void consultarPorLetra(Aluno aluno, String letra) throws SQLException;	
	
	/*Método Editar*/
	public void editar(Aluno aluno) throws SQLException;
	
	/*Método Excluir*/
	public void remover(Aluno aluno) throws SQLException;

}
