package br.com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.jupiter.api.Test;

import br.com.dao.NoticiaDao;
import br.com.model.Noticia;

@WebServlet("/adicionaNoticia")

public class AdicionaNoticiaServlet extends HttpServlet {


	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		String noticia = request.getParameter("noticia");
		String dataEmTexto = request.getParameter("dataNoticia");
		Calendar dataNoticia = null;
		try {
			Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);
			dataNoticia = Calendar.getInstance();
			dataNoticia.setTime(date);
		} catch (ParseException e) {
			out.println("Erro de conversão da data");
			return;
		}
		Noticia objetoNoticia = new Noticia();
		objetoNoticia.setNoticia(noticia);
		objetoNoticia.setDataNoticia(dataNoticia);
		NoticiaDao dao = new NoticiaDao();
		dao.adicionaNoticia(objetoNoticia);

		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/noticia-adicionada.jsp");
		rd.forward(request, response);

	}
}