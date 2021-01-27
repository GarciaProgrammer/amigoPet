package br.com.amigopet.dao;

import java.sql.*;
import java.util.ArrayList;

import br.com.amigopet.beans.UsuarioBean;
import br.com.amigopet.connection.ConnectionFactory;

public class UsuarioDao {
	
	public static int criarUsuario(UsuarioBean usuario) {
		String sql = "INSERT INTO Usuario(Nome,Email,Senha,Celular) VALUES (?,?,?,?);";
		Connection cnn = ConnectionFactory.getConnection();
		int linhasAfetadas = 0;
		
		try {
			PreparedStatement ps = cnn.prepareStatement(sql);
			ps.setString(1, usuario.getNome());
			ps.setString(2, usuario.getEmail());
			ps.setString(3, usuario.getSenha());
			ps.setString(4, usuario.getCelular());
			
			linhasAfetadas = ps.executeUpdate();
			cnn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return linhasAfetadas;
	}
	
	public static UsuarioBean lerUsuario(int id) {
		UsuarioBean usuario = new UsuarioBean();
		String sql = "SELECT * FROM Usuario WHERE id=?;";
		Connection cnn = ConnectionFactory.getConnection();
		
		try {
			PreparedStatement ps = cnn.prepareStatement(sql);
			ps.setInt(1,id);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				usuario.setId(id);
				usuario.setNome(rs.getString("Nome"));
				usuario.setEmail(rs.getString("Email"));
				usuario.setCelular(rs.getString("Celular"));
				
			}
			cnn.close();
			rs.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return usuario;
	}
	
	public static int atualizarUsuario(UsuarioBean usuario) {
		String sql = "UPDATE Usuario SET Nome=?, Email=?, Senha=?, Celular=? WHERE id = ?;";
		Connection cnn = ConnectionFactory.getConnection();
		int linhasAfetadas = 0;
		
		try {
			PreparedStatement ps = cnn.prepareStatement(sql);
			ps.setString(1, usuario.getNome());
			ps.setString(2, usuario.getEmail());
			ps.setString(3, usuario.getSenha());
			ps.setString(4, usuario.getCelular());
			
			linhasAfetadas = ps.executeUpdate();
			cnn.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return linhasAfetadas;
	}
	
	public static int deletarUsuario(int id) {
		String sql ="DELETE FROM Usuario WHERE id=?;";
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
	
	public static ArrayList<UsuarioBean> listarUsuarios(){
		String sql = "SELECT * FROM Usuario;";
		Connection cnn = ConnectionFactory.getConnection();
		ArrayList<UsuarioBean> listaUsuarios = new ArrayList<UsuarioBean>();
		try {
			PreparedStatement ps = cnn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				UsuarioBean usuario = new UsuarioBean(rs.getInt("id"), rs.getString("Nome"), rs.getString("Email"), rs.getString("Celular"));
				
				listaUsuarios.add(usuario);
			}
			cnn.close();
			rs.close();
			return listaUsuarios;
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
