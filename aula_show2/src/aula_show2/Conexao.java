package aula_show2;

import java.sql.*;

public class Conexao {

	private static Connection connection;

	static public Connection getConnection() {

		try {

			if (connection == null) {

				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aula 1", "root", "");

			}

		} catch (Exception e) {

			e.printStackTrace();

		}

		return connection;

	}

	public static void main(String[] args) throws SQLException {

		Conexao c = new Conexao();

		PreparedStatement ps = c.getConnection()
				.prepareStatement("insert into pessoa (nome, dtNascimento, genero) values (?, ?, ?)");

		ps.setString(1, "Reginaldo");

		java.util.Date date = new java.util.Date();

		ps.setDate(2, new Date(date.getTime()));

		ps.setString(3, "H");

		ps.executeUpdate();

		ps.close();

		c.getConnection().close();
	}

}
