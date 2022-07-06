package br.com.fiap.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.dao.CorretorDAO;
import br.com.fiap.factory.ConnectionFactory;
import br.com.fiap.model.Corretor;

public class CorretorController {
	
	private CorretorDAO corretorDAO;

	public CorretorController() {
		Connection connection = new ConnectionFactory().conectar();
		this.corretorDAO = new CorretorDAO(connection);
	}

	public void insert(Corretor corretor) throws SQLException {
		this.corretorDAO.insert(corretor);
		System.out.println("Corretor inserido.");
	}
	
	public void select() throws SQLException {
		List<Corretor> corretor = this.corretorDAO.select();
		
		for(Corretor corretores:corretor) {
			System.out.println("Código: " + corretores.getCdCorretor() + "\t| Nome: " + corretores.getNmCorretor() + "\t| CPF: " + corretores.getNrCpfCorretor()  + "\t| Telefone: " + corretores.getNrTelCorretor() + "\t| Salario: " + corretores.getVlSalarioCorretor());
		}
		
	}
	
	public void selectSalarioMaior(double salario) throws SQLException {
		List<Corretor> corretor = this.corretorDAO.selectSalarioMaior(salario);
		
		for(Corretor corretores:corretor) {
			System.out.println("Código: " + corretores.getCdCorretor() + "\t| Nome: " + corretores.getNmCorretor() + "\t| CPF: " + corretores.getNrCpfCorretor() + "\t| Salario: " + corretores.getVlSalarioCorretor());
		}
		
	}
	
	public void selectSalarioMenor(double salario) throws SQLException {
		List<Corretor> corretor = this.corretorDAO.selectSalarioMenor(salario);
		
		for(Corretor corretores:corretor) {
			System.out.println("Código: " + corretores.getCdCorretor() + "\t| Nome: " + corretores.getNmCorretor() + "\t| CPF: " + corretores.getNrCpfCorretor() + "\t| Salario: " + corretores.getVlSalarioCorretor());
		}
		
	}
	
	public void update(Corretor corretor, int cd) throws SQLException {
		this.corretorDAO.update(corretor, cd);
		System.out.println("Update realizado.");
	}
	
	public void delete(int cd) {
		this.corretorDAO.excluir(cd);
		System.out.println("Corretor");
	}
	
}
