package br.com.fiap.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private String schema = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
	private String user = "TM_MATHEUS_SANTOS"; // JOptionPane.showInputDialog("Usuario: ");
	private String password = "280504"; // JOptionPane.showInputDialog("Senha: ");

	public Connection conectar() {

		try {
			return DriverManager.getConnection(schema, user, password);
		} catch (SQLException e) {
			System.out.println("Erro ao conectar");
			throw new RuntimeException(e);
		}
	}

}
