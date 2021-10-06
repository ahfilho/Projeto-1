package br.com.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.dao.NoticiaDao;
import br.com.model.Noticia;
import br.com.mvc.logica.ListaBuscaLogica;

class NoticiaDaoTest {

	@Test
	void testAdicionaNoticia() {
		NoticiaDao dao = new NoticiaDao();
		
		Noticia nt = new Noticia();
		
		assertSame("teste de variáveis",nt.getNoticia(),nt.getDataNoticia());
	
		assertNotSame("testa se estão relacionadas a objetos diferentes",dao.getLista(), nt.getNoticia());	
	}
	@Test
	void TestaObjeto() {
		ListaBuscaLogica lbl = new ListaBuscaLogica();
		
		fail("pulou aqui");
	}
}
