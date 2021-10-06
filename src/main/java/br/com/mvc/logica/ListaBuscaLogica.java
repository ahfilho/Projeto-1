package br.com.mvc.logica;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import br.com.dao.NoticiaDao;
import br.com.main.Teste;
import br.com.model.Noticia;
import br.com.servlet.PesquisaPalavra;

public class ListaBuscaLogica implements Logica {

	

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		//List<Noticia> noticias = new NoticiaDao().getBusca("palavra");
		//req.setAttribute("noticiasInfomoney", noticias);
		//System.out.println("LISTANDO TODOS...");
		//System.out.println("Busca encontrada..."+noticias);
		return "/WEB-INF/jsp/pesquisa.jsp";
	}

}
