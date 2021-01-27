package br.com.amigopet.dao;

import java.sql.*;
import java.util.ArrayList;

import br.com.amigopet.beans.DicaBean;
import br.com.amigopet.connection.ConnectionFactory;

public class DicaDao {
	
	public static int criarDica(DicaBean dica) {
		String sql = "INSERT INTO Dica(Titulo,Descricao) VALUES (?,?);";
		Connection cnn = ConnectionFactory.getConnection();
		int linhasAfetadas = 0;
		
		try {
			PreparedStatement ps = cnn.prepareStatement(sql);
			ps.setString(1, dica.getTitulo());
			ps.setString(2, dica.getDescricao());
			linhasAfetadas = ps.executeUpdate();
			cnn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return linhasAfetadas;
	}
	
	public static DicaBean lerDica(int id) {
		DicaBean dica = new DicaBean();
		String sql = "SELECT * FROM Dica WHERE id=?;";
		Connection cnn = ConnectionFactory.getConnection();
		
		try {
			PreparedStatement ps = cnn.prepareStatement(sql);
			ps.setInt(1,id);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				dica.setId(id);
				dica.setTitulo(rs.getString("Titulo"));
				dica.setDescricao(rs.getString("Descricao"));
			}
			cnn.close();
			rs.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return dica;
	}
	
	public static int atualizaDica(DicaBean dica) {
		String sql = "UPDATE Dica SET Titulo=?, Descricao=? WHERE id = ?;";
		Connection cnn = ConnectionFactory.getConnection();
		int linhasAfetadas = 0;
		
		try {
			PreparedStatement ps = cnn.prepareStatement(sql);
			ps.setString(1, dica.getTitulo());
			ps.setString(2, dica.getDescricao());
			linhasAfetadas = ps.executeUpdate();
			cnn.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return linhasAfetadas;
	}
	
	public static int deletarDica(int id) {
		String sql ="DELETE FROM Dica WHERE id=?;";
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
	
	public static ArrayList<DicaBean> listarDicas(){
		String sql = "SELECT * FROM Dica;";
		Connection cnn = ConnectionFactory.getConnection();
		ArrayList<DicaBean> listaDicas = new ArrayList<DicaBean>();
		try {
			PreparedStatement ps = cnn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				DicaBean dica = new DicaBean(rs.getInt("id"),rs.getString("Titulo"),rs.getString("Descricao"));
				listaDicas.add(dica);
			}
			cnn.close();
			rs.close();
			return listaDicas;
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
