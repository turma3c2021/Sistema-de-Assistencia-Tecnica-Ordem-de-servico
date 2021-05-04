package br.com.assistencia.main;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.assistencia.dao.DAO;

public class Main {
	
	public static void main(String[] arg) {
		DAO dao = new DAO();
		try {
			PreparedStatement ps = dao.getConexao().prepareStatement("SELECT * FROM usuario");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {				
				System.out.println(rs.getString("nome"));
			}
		} catch (SQLException e) {			
			e.printStackTrace();
		}
	}	
	
}
