package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import br.com.fiap.model.Apolice;

public class ApoliceDAO {
	
	private Connection conexao;

	public ApoliceDAO(Connection conexao) {
		this.conexao = conexao;
	}
	
	public void insert(Apolice apolice) throws SQLException {
		String sql = "insert into T_APOLICE (nr_assegurado, ds_forma_pag, dt_apolice, vl_mensalidade, ds_cnpj_seguro, cd_contrato) values (?,?,?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);

		stmt.setInt(1, apolice.getNrAssegurado());
		stmt.setString(2, apolice.getDsFormaPag());
		stmt.setDate(3, apolice.getDtApolice());
		stmt.setDouble(4, apolice.getVlMensalidade());
		stmt.setString(5,apolice.getDsCnpjSeguro());
		stmt.setInt(6, apolice.getCdContrato());

		stmt.execute();
		stmt.close();
	}
	
	public List<Apolice> select() {
		return null;
		
	}
	
	public void update(Apolice apolice, int cd) {
		
	}
	
	public void excluir(int cd) {
		try {
			PreparedStatement stmt = conexao.prepareStatement("DELETE FROM t_apolice WHERE cd_apolice = ?");
			stmt.setInt(1, cd);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
