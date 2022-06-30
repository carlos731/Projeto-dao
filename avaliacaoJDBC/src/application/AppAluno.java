package application;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import dao.AlunoDao;
import dao.InterfaceDAO;
import model.Aluno;

public class AppAluno implements InterfaceDAO{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*Váriaveis da Aplicação*/
		int op;
		int resp = 1;
		/*Váriaveis da Aplicação*/
		
		/*LISTAS*/
		
		while(resp == 1 && resp != 2) {
			System.out.println("------------SISTEMA GERENCIADOR DE ALUNOS--------------");
			System.out.println("\n1 - ALUNOS\n");
	
			System.out.println("INFORME UMA OPÇÃO: ");
			op = scan.nextInt();
			
			switch(op) {
				case 1:{
					while(resp == 1 && resp != 2) {
						
						System.out.println("---------------------------------------------------------------------------------------------------------------");
							
					System.out.println("\n1 - INSERIR ALULNO: ");
					System.out.println("2 - CONSULTAR TODOS ALUNOS: ");
					System.out.println("3 - CONSULTAR ALUNO POR ID: ");
					System.out.println("4 - CONSULTAR ALUNO POR LETRA: ");
					System.out.println("5 - EDITAR ALUNO: ");
					System.out.println("6 - REMOVER ALUNO: ");
					
					System.out.println("\nINFORME UMA OPERAÇÃO: ");
					op = scan.nextInt();
					scan.nextLine();
					
					switch(op){
						case 1:{
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
							/*
							contato.setNome("Maria");
							contato.setEmail("Maria@gmail.com");
							contato.setEndereco("Rua da Passagem, 500");
							 */	
							try {
								AlunoDao dao = new AlunoDao();
								dao.adicionar(aluno);
								System.out.println("\nGravação feita no BD com sucesso!\n");
							} catch (SQLException e) {
								e.printStackTrace();
							}
							
						break;
						}
						case 2:{
							System.out.println("\nLISTA DE ALUNOS: ");
							
							try {
								AlunoDao cdao = new AlunoDao();
								List<Aluno> alunos = cdao.getLista();
								
								/*Tabela com listagem de alunos*/
								System.out.println("---------------------------------------------------------------------------------------------------------------");
								for (Aluno aluno : alunos) {
									//System.out.println(contato.getId() + ", " + contato.getNome() + ", " + contato.getEmail() + ", " + contato.getEndereco());
									System.out.println("Id: " + aluno.getId());
									System.out.println("Nome: " + aluno.getNome());
									System.out.println("Email: " + aluno.getEmail());
									System.out.println("Cpf: " + aluno.getCpf());
									System.out.println("Data de Nascimento: " + aluno.getDataNascimento());
									System.out.println("Naturalidade: " + aluno.getNaturalidade());
									System.out.println("Endereco: " + aluno.getEndereco());
									System.out.println("");
									
								
								}
								System.out.println("---------------------------------------------------------------------------------------------------------------");
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						break;
						}
						case 3:{
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
								System.out.println("Cpf: " + aluno.getCpf());
								System.out.println("Data de Nascimento: " + aluno.getDataNascimento());
								System.out.println("Naturalidade: " + aluno.getNaturalidade());
								System.out.println("Endereco: " + aluno.getEndereco());
								System.out.println("");
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						break;
						}
						case 4:{
							System.out.println("CONSULTA POR LETRA");
							
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
							break;
						}
						case 5:{
							
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
						
							
							break;
						}
						case 6:{
							
							System.out.println("\nRemoção de Aluno: \n");
							
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
							
							break;
						}
						
					}/*fim do case 1*/
					
					System.out.println("\nDESEJA FAZER MAIS UMA OPERAÇÂO? (1 ou 2)");
					resp = scan.nextInt();
				}
					
			}/*Fim do switch Case*/
					default:{
						System.out.println("SISTEMA ENCERRADO");
						break;
					}
			}
		}
	}

	@Override
	public List<Aluno> getLista() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adicionar(Aluno aluno) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void consultar(Aluno aluno2) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void consultarPorId(Aluno aluno) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void consultarPorLetra(Aluno aluno, String letra) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editar(Aluno aluno) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(Aluno aluno) throws SQLException {
		// TODO Auto-generated method stub
		
	}
}
