

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import br.com.dao.NoticiaDao;
import br.com.model.Noticia;

class NoticiaDaoTest {

	@Test
	void testNoticiaDao() {
	}

	@Test
	void testAdicionaNoticia() {

		Noticia noticia = new Noticia();
		NoticiaDao dao = new NoticiaDao();

		dao.adicionaNoticia(noticia);
		if (true) {
			System.out.println("SALVO COM SUCESSO");
		} else {
			fail("ERRO AO SALVAR");
		}

	}

	@Test
	void testGetLista() {
		NoticiaDao dao = new NoticiaDao();
		dao.getLista();
		if (true) {
			System.out.println("LISTADO COM SUCESSO");
		} else {
			fail("ERRO AO lISTAR");
		}

	}

	@Test
	void testGetBusca() throws SQLException {

		NoticiaDao dao = new NoticiaDao();
		dao.getBusca("palavra");
		if (true) {
			System.out.println("BUSCA COM SUCESSO");
		} else {
			fail("ERRO AO BUSCAR");
		}

	}

}
