package br.com.main;

import java.io.IOException;
import java.sql.Date;
import java.util.Calendar;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import br.com.dao.NoticiaDao;
import br.com.model.Noticia;

public class Teste {

	public static void main(String[] args) throws IOException {

		Document doc = Jsoup.connect(
				"https://www.infomoney.com.br/onde-investir/anbima-reducao-dos-gastos-com-lazer-se-torna-maior-"
						+ "fonte-de-economia-dos-brasileiros-na-pandemia/	")
				.get();

		System.out.println(doc.getElementById("url"));
		System.out.println(doc.getElementsByTag("title"));
		

	}

}
/*
 * Scanner sc = new Scanner(System.in); Scanner scan = new Scanner(System.in);
 * 
 * Noticia noticia = new Noticia();
 * 
 * System.out.println("NOME"); noticia.setNoticia("noticia");
 * 
 * System.out.println("DATA");
 * noticia.setDataNascimento(Calendar.getInstance());
 * 
 * // grava a conexão NoticiaDao dao = new NoticiaDao();
 * 
 * 
 * System.out.println("GRAVADO!");
 */
