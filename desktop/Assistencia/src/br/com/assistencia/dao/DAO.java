package br.com.assistencia.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
	
	private Connection conexao;
	private PreparedStatement statment;
	
	private final static int BANCO_PG = 1;
	private final static int BANCO_MYSQL = 2;
	
	public final static int DEFAULT = BANCO_MYSQL;
		
	public DAO() {
		this.conectar(DEFAULT);
	}	
	
	public boolean conectar(int banco){
		switch (banco) {
		case 1:
			try {
				Class.forName("org.postgresql.Driver");
				setConexao(DriverManager.getConnection("jdbc:postgresql://localhost:5432/assistencia", "postgres", "rootroot"));
				return true;			
			} catch (Exception e) {
				e.printStackTrace();				
			}
			break;
		case 2:
			try {
				/*
				 *  é necessário executar um comando no SGDB para que o hash da senha do usuário seja reconhecido
				 *  ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'rootrootusuariousuario';
				 *  
				 *  é necessário também a inclusão de alguns códigos depois da base de dados
				 *  ?characterEncoding=latin1&useConfigs=maxPerformance
				 */
				Class.forName("com.mysql.jdbc.Driver");
				setConexao(DriverManager.getConnection("jdbc:mysql://localhost:3306/assistencia?characterEncoding=latin1&useConfigs=maxPerformance", "root", "rootroot"));
			} catch (Exception e) {				
				e.printStackTrace();
			}
		default:
			break;
		}
		return false;
		
	}
	
	public boolean testaronxao() {		
		return false;
	}
	
	public void desconectar(){
		try {
			getConexao().close();
		} catch (SQLException e) {
			System.out.println("Erro ao desconectar!");
			e.printStackTrace();
		}
	}

	public ResultSet query(){
		try {			
			ResultSet result =  getStatment().executeQuery();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}	
	
	public Connection getConexao() {
		return conexao;
	}

	public void setConexao(Connection conexao) {
		this.conexao = conexao;
	}

	public PreparedStatement getStatment() {
		return statment;
	}

	public void setStatment(PreparedStatement statment) {
		this.statment = statment;
	}	
	
}
