package br.com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;

import br.com.connection.ConnectionFactory;
import br.com.dao.NoticiaDao;
import br.com.model.Noticia;
import br.com.mvc.logica.ListaBuscaLogica;

@WebServlet("/pesquisa")

public class PesquisaPalavra extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		String busca = req.getParameter("buscaPalavra"); /// pego o valor do input
		Noticia noticia = new Noticia(); // objeto criado
		noticia.setNoticia(busca); // noticia agora vale o que eu digitei no input
		try {
			List<Noticia> noticias = new NoticiaDao().getBusca(busca); // lista recebe os dados do banco de acordo com a
			System.out.println("QUANTIDADE ENCONTRADA NO BANCO: " + noticias.size());
			req.setAttribute("noticiasInfomoney", noticias);
		} catch (SQLException e) {
			System.out.println("ERRO NA BUSCA");
			e.printStackTrace();
		}
		// resp.sendRedirect("/WEB-INF/jsp/pesquisa.jsp");
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/pesquisa.jsp");
		rd.forward(req, resp);

	}
}
