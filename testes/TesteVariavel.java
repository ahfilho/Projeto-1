 import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.dao.NoticiaDao;
import br.com.model.Noticia;

class TesteVariavel {

	@Test
	void test() {
	NoticiaDao dao = new NoticiaDao();
		
		Noticia nt = new Noticia();
		
		assertSame("teste de variáveis",nt.getNoticia(),nt.getDataNoticia());
	
		assertNotSame("testa se estão relacionadas a objetos diferentes",dao.getLista(), nt.getNoticia());	
	}

}
