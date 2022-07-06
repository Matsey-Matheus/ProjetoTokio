package br.com.fiap.controller;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.fiap.dao.ApoliceDAO;
import br.com.fiap.factory.ConnectionFactory;
import br.com.fiap.model.Apolice;

public class ApoliceController {

	private ApoliceDAO apoliceDAO;

	public ApoliceController() {
		Connection connection = new ConnectionFactory().conectar();
		this.apoliceDAO = new ApoliceDAO(connection);
	}
	
	public void insert(Apolice apolice) throws SQLException {
		this.apoliceDAO.insert(apolice);
		System.out.println("Apolice criada.");
	}
	
}
