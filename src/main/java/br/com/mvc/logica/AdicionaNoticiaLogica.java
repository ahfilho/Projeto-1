package br.com.mvc.logica;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.dao.NoticiaDao;
import br.com.model.Noticia;

public class AdicionaNoticiaLogica implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {

		String noticia = req.getParameter("noticia");
		String dataEmTexto = req.getParameter("dataNoticia");
		Calendar dataNoticia = null;

		try {
			java.util.Date date = new SimpleDateFormat("dd/mm/yyyy").parse(dataEmTexto);
			dataNoticia = Calendar.getInstance();
			dataNoticia.setTime(date);
		} catch (Exception e) {
			System.out.println("Erro na conversão da data");
		}
		try {
			Noticia noti = new Noticia();
			noti.setNoticia(noticia);
			noti.setDataNoticia(dataNoticia);

			NoticiaDao dao = new NoticiaDao();
			dao.adicionaNoticia(noti);
		} catch (Exception e) {
			System.out.println("ERRO AO SALVAR NO BANCO");
			return "/WEB-inf/jsp/erro.html";
		}
		return "/WEB-INF/jsp/noticia-adicionada.jsp";

	}

}
