package br.com.mvc.logica;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.dao.NoticiaDao;
import br.com.model.Noticia;

public class ListaNoticiasLogica implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {

		List<Noticia> noticias = new NoticiaDao().getLista();
		req.setAttribute("noticiasInfomoney", noticias);
		System.out.println("LISTANDO TODOS...");
		return "WEB-INF/jsp/lista-noticias.jsp";
	}

}
