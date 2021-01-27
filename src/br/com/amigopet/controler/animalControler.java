package br.com.amigopet.controler;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.amigopet.dao.AnimalDao;



/**
 * Servlet implementation class animalControler
 */
@WebServlet("/animalControler")
public class animalControler extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Fui chamado");
		
		String nome = request.getParameter("nome");
		String tipo = request.getParameter("tipo");
		String raca = request.getParameter("raca");
		String idade = request.getParameter("idade");
		String sexo = request.getParameter("sexo");
		String descricao = request.getParameter("descricao");
		String urlFoto = request.getParameter("imagem");
	
		
	

		
		
	
	


	


	
	 

}
}
