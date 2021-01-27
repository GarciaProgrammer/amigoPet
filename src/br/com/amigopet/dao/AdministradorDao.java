package br.com.amigopet.dao;

import java.sql.*;
import java.util.ArrayList;

import br.com.amigopet.beans.AdministradorBean;
import br.com.amigopet.connection.ConnectionFactory;

public class AdministradorDao {
	
	public static int criarAdministrador(AdministradorBean administrador) {
		String sql = "INSERT INTO Administrador(Email,Senha) VALUES (?,?);";
		Connection cnn = ConnectionFactory.getConnection();
		int linhasAfetadas = 0;
		
		try {
			PreparedStatement ps = cnn.prepareStatement(sql);
			ps.setString(1, administrador.getEmail());
			ps.setString(2, administrador.getSenha());
			
			linhasAfetadas = ps.executeUpdate();
			cnn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return linhasAfetadas;
	}
	
	public static AdministradorBean lerAdministrador(int id) {
		AdministradorBean administrador = new AdministradorBean();
		String sql = "SELECT * FROM Administrador WHERE id=?;";
		Connection cnn = ConnectionFactory.getConnection();
		
		try {
			PreparedStatement ps = cnn.prepareStatement(sql);
			ps.setInt(1,id);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				administrador.setId(id);
				administrador.setEmail(rs.getString("Email"));
				
			}
			cnn.close();
			rs.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return administrador;
	}
	
	public static int atualizarAdministrador(AdministradorBean administrador) {
		String sql = "UPDATE Administrador SET Email=?, Senha=? WHERE id = ?;";
		Connection cnn = ConnectionFactory.getConnection();
		int linhasAfetadas = 0;
		
		try {
			PreparedStatement ps = cnn.prepareStatement(sql);
			ps.setString(1, administrador.getEmail());
			ps.setString(2, administrador.getSenha());
			
			linhasAfetadas = ps.executeUpdate();
			cnn.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return linhasAfetadas;
	}
	
	public static int deletarAdministrador(int id) {
		String sql ="DELETE FROM Administrador WHERE id=?;";
		Connection cnn = ConnectionFactory.getConnection();
		int linhasAfetadas = 0;
		
		try {
			PreparedStatement ps = cnn.prepareStatement(sql);
			
			ps.setInt(1, id);
			linhasAfetadas = ps.executeUpdate();
			cnn.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return linhasAfetadas;
	}
	
	public static ArrayList<AdministradorBean> listarAdministradores(){
		String sql = "SELECT * FROM Administrador;";
		Connection cnn = ConnectionFactory.getConnection();
		ArrayList<AdministradorBean> listaAdministradores = new ArrayList<AdministradorBean>();
		try {
			PreparedStatement ps = cnn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				AdministradorBean administrador = new AdministradorBean(rs.getInt("id"), rs.getString("Email"));
				
				listaAdministradores.add(administrador);
			}
			cnn.close();
			rs.close();
			return listaAdministradores;
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	

}
