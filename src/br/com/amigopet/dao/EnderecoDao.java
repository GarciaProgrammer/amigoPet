package br.com.amigopet.dao;

import java.sql.*;

import br.com.amigopet.beans.EnderecoBean;
import br.com.amigopet.connection.ConnectionFactory;

public class EnderecoDao {
	
	public static int criarEndereco(EnderecoBean endereco) {
		String sql = "INSERT INTO Endereco(Cep,Rua,Numero,Bairro,Complemento,Cidade,Estado) VALUES (?,?,?,?,?,?,?);";
		Connection cnn = ConnectionFactory.getConnection();
		int linhasAfetadas = 0;
		
		try {
			PreparedStatement ps = cnn.prepareStatement(sql);
			ps.setString(1, endereco.getCep());
			ps.setString(2, endereco.getRua());
			ps.setInt(3, endereco.getNumero());
			ps.setString(4, endereco.getBairro());
			ps.setString(5, endereco.getComplemento());
			ps.setString(6, endereco.getCidade());
			ps.setString(7, endereco.getEstado());
			linhasAfetadas = ps.executeUpdate();
			cnn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return linhasAfetadas;
	}
	
	public static EnderecoBean lerEndereco(int id) {
		EnderecoBean endereco = new EnderecoBean();
		String sql = "SELECT * FROM Endereco WHERE id=?;";
		Connection cnn = ConnectionFactory.getConnection();
		
		try {
			PreparedStatement ps = cnn.prepareStatement(sql);
			ps.setInt(1,id);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				endereco.setId(id);
				endereco.setCep(rs.getString("Cep"));
				endereco.setRua(rs.getString("Rua"));
				endereco.setNumero(rs.getInt("Numero"));
				endereco.setBairro(rs.getString("Bairro"));
				endereco.setComplemento(rs.getString("Complemento"));
				endereco.setCidade(rs.getString("Cidade"));
				endereco.setEstado(rs.getString("Estado"));
			}
			cnn.close();
			rs.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return endereco;
	}
	
	public static int atualizarEndereco(EnderecoBean endereco) {
		String sql = "UPDATE Endereco SET Cep=?, Rua=?, Numero=?, Bairro=?, Complemento=?, Cidade=?, Estado=? WHERE id = ?;";
		Connection cnn = ConnectionFactory.getConnection();
		int linhasAfetadas = 0;
		
		try {
			PreparedStatement ps = cnn.prepareStatement(sql);
			ps.setString(1, endereco.getCep());
			ps.setString(2, endereco.getRua());
			ps.setInt(3, endereco.getNumero());
			ps.setString(4, endereco.getBairro());
			ps.setString(5, endereco.getComplemento());
			ps.setString(6, endereco.getCidade());
			ps.setString(7, endereco.getEstado());
			linhasAfetadas = ps.executeUpdate();
			cnn.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return linhasAfetadas;
	}
	
	public static int deletarEndereco(int id) {
		String sql ="DELETE FROM Endereco WHERE id=?;";
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
	
	
}
