package br.com.dao;

import java.sql.PreparedStatement;

import java.awt.List;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;

import javax.servlet.jsp.tagext.TryCatchFinally;

import com.mysql.jdbc.Connection;

import br.com.connection.ConnectionFactory;
import br.com.model.Noticia;
import junit.framework.TestCase;

public class NoticiaDao {

	private java.sql.Connection connection;

	public NoticiaDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adicionaNoticia(Noticia noticia) {
		String sql = "insert into noticiasInfomoney" + "(noticia, dataNoticia)" + " values(?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, noticia.getNoticia());
			stmt.setDate(2, new java.sql.Date(Calendar.getInstance().getTimeInMillis()));
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public java.util.List<Noticia> getLista() {
		try {
			java.util.List<Noticia> noticias = new ArrayList<Noticia>();
			java.sql.PreparedStatement stmt = this.connection.prepareStatement("select * from noticiasInfomoney");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Noticia noticia = new Noticia();
				noticia.setId(rs.getLong("id"));
				noticia.setNoticia(rs.getString("noticia"));
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataNoticia"));
				noticia.setDataNoticia(data);
				noticias.add(noticia);
			}
			rs.close();
			stmt.close();
			return noticias;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public java.util.List<Noticia> getBusca(String palavra) throws SQLException {
		java.sql.Connection con = new ConnectionFactory().getConnection();
		try {
			java.util.List<Noticia> buscaNoticias = new ArrayList<Noticia>();
			PreparedStatement stmt = con.prepareStatement("select * from noticiasInfomoney where noticia LIKE ? ");
			stmt.setString(1, "%" + palavra + "%");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Noticia news = new Noticia();

				Long id = rs.getLong("id");
				String noticia = rs.getString("noticia");

				news.setId(id);
				news.setNoticia(noticia);
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataNoticia"));
				news.setDataNoticia(data);

				System.out.print("Noticia encontrada: --->  " + id + " - " + noticia + "\n");
				buscaNoticias.add(news);
			}
			rs.close();
			stmt.close();
			con.close();

			return buscaNoticias;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}