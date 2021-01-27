package br.com.amigopet.dao;

import java.sql.*;
import java.util.ArrayList;

import br.com.amigopet.beans.OngBean;
import br.com.amigopet.connection.ConnectionFactory;

public class OngDao {

	public static int criarOng(OngBean ong) {
		String sql = "INSERT INTO Ong(Nome,Email,Senha,Celular) VALUES (?,?,?,?);";
		Connection cnn = ConnectionFactory.getConnection();
		int linhasAfetadas = 0;
		
		try {
			PreparedStatement ps = cnn.prepareStatement(sql);
			ps.setString(1, ong.getNome());
			ps.setString(2, ong.getEmail());
			ps.setString(3, ong.getSenha());
			ps.setString(4, ong.getCelular());
			
			linhasAfetadas = ps.executeUpdate();
			cnn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return linhasAfetadas;
	}
	
	public static OngBean lerOng(int id) {
		OngBean ong = new OngBean();
		String sql = "SELECT * FROM Ong WHERE id=?;";
		Connection cnn = ConnectionFactory.getConnection();
		
		try {
			PreparedStatement ps = cnn.prepareStatement(sql);
			ps.setInt(1,id);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				ong.setId(id);
				ong.setNome(rs.getString("Nome"));
				ong.setEmail(rs.getString("Email"));
				ong.setCelular(rs.getString("Celular"));
				
			}
			cnn.close();
			rs.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return ong;
	}
	
	public static int atualizarOng(OngBean ong) {
		String sql = "UPDATE Ong SET Nome=?, Email=?, Senha=?, Celular=? WHERE id = ?;";
		Connection cnn = ConnectionFactory.getConnection();
		int linhasAfetadas = 0;
		
		try {
			PreparedStatement ps = cnn.prepareStatement(sql);
			ps.setString(1, ong.getNome());
			ps.setString(2, ong.getEmail());
			ps.setString(3, ong.getSenha());
			ps.setString(4, ong.getCelular());
			
			linhasAfetadas = ps.executeUpdate();
			cnn.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return linhasAfetadas;
	}
	
	public static int deletarOng(int id) {
		String sql ="DELETE FROM Ong WHERE id=?;";
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
	
	public static ArrayList<OngBean> listarOngs(){
		String sql = "SELECT * FROM Ong;";
		Connection cnn = ConnectionFactory.getConnection();
		ArrayList<OngBean> listaOngs = new ArrayList<OngBean>();
		try {
			PreparedStatement ps = cnn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				OngBean ong = new OngBean(rs.getInt("id"), rs.getString("Nome"), rs.getString("Email"), rs.getString("Celular"));
				
				listaOngs.add(ong);
			}
			cnn.close();
			rs.close();
			return listaOngs;
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
