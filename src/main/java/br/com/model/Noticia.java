package br.com.model;

import java.util.Calendar;

public class Noticia {

	private Long id;
	private String noticia;
	private Calendar dataNoticia;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNoticia() {
		return noticia;
	}

	public void setNoticia(String noticia) {
		this.noticia = noticia;
	}

	public Calendar getDataNoticia() {
		return dataNoticia;
	}

	public void setDataNoticia(Calendar dataNoticia) {
		this.dataNoticia = dataNoticia;
	}

}