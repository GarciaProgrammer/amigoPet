package br.com.amigopet.dao;

import java.sql.*;
import java.util.ArrayList;

import br.com.amigopet.beans.AnimalBean;
import br.com.amigopet.connection.ConnectionFactory;

public class AnimalDao {
	
	public static int criarAnimal(AnimalBean animal) {
		String sql = "INSERT INTO Animal(Nome,Tipo,Raca,Idade,Sexo,Descricao,Imagem) VALUES (?,?,?,?,?,?,?);";
		Connection cnn = ConnectionFactory.getConnection();
		int linhasAfetadas = 0;
		
		try {
			PreparedStatement ps = cnn.prepareStatement(sql);
			ps.setString(1, animal.getNome());
			ps.setString(2, animal.getTipo());
			ps.setString(3, animal.getRaca());
			ps.setInt(4, animal.getIdade());
			ps.setString(5, animal.getSexo());
			ps.setString(6, animal.getDescricao());
			ps.setByte(7, animal.getImagem());
			linhasAfetadas = ps.executeUpdate();
			cnn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return linhasAfetadas;
	}
	
	public static AnimalBean lerAnimal(int id) {
		AnimalBean animal = new AnimalBean();
		String sql = "SELECT * FROM Animal WHERE id=?;";
		Connection cnn = ConnectionFactory.getConnection();
		
		try {
			PreparedStatement ps = cnn.prepareStatement(sql);
			ps.setInt(1,id);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				animal.setId(id);
				animal.setNome(rs.getString("Nome"));
				animal.setTipo(rs.getString("Tipo"));
				animal.setRaca(rs.getString("Raca"));
				animal.setIdade(rs.getInt("Idade"));
				animal.setSexo(rs.getString("Sexo"));
				animal.setDescricao(rs.getString("Descricao"));
				animal.setImagem(rs.getByte("Imagem"));
			}
			cnn.close();
			rs.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return animal;
	}
	
	public static int atualizarAnimal(AnimalBean animal) {
		String sql = "UPDATE Animal SET Nome=?, Tipo=?, Raca=?, Idade=?, Sexo=?, Descricao=?, Imagem=? WHERE id = ?;";
		Connection cnn = ConnectionFactory.getConnection();
		int linhasAfetadas = 0;
		
		try {
			PreparedStatement ps = cnn.prepareStatement(sql);
			ps.setString(1, animal.getNome());
			ps.setString(2, animal.getTipo());
			ps.setString(3, animal.getRaca());
			ps.setInt(4, animal.getIdade());
			ps.setString(5, animal.getSexo());
			ps.setString(6, animal.getDescricao());
			ps.setByte(6, animal.getImagem());
			linhasAfetadas = ps.executeUpdate();
			cnn.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return linhasAfetadas;
	}
	
	public static int deletarAnimal(int id) {
		String sql ="DELETE FROM Animal WHERE id=?;";
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
	
	public static ArrayList<AnimalBean> listarAnimais(){
		String sql = "SELECT * FROM Animal;";
		Connection cnn = ConnectionFactory.getConnection();
		ArrayList<AnimalBean> listaAnimais = new ArrayList<AnimalBean>();
		try {
			PreparedStatement ps = cnn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				AnimalBean animal = new AnimalBean(rs.getInt("id"),rs.getString("Nome"),rs.getString("Tipo"),
						rs.getString("Raca"),rs.getInt("Idade"),rs.getString("Sexo"),rs.getString("Descricao"),rs.getByte("Imagem"));
				listaAnimais.add(animal);
			}
			cnn.close();
			rs.close();
			return listaAnimais;
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
