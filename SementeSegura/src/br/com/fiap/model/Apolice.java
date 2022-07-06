package br.com.fiap.model;

import java.sql.Date;

public class Apolice {
	
	private int cdApolice, nrAssegurado;
	private String dsFormaPag;
	private Date dtApolice;
	private String dsCnpjSeguro;
	private int cdContrato;
	private double vlMensalidade;
	
	public Apolice(int nrAssegurado, String dsFormaPag, Date dtApolice, String dsCnpjSeguro, int cdContrato,
			double vlMensalidade) {
		this.nrAssegurado = nrAssegurado;
		this.dsFormaPag = dsFormaPag;
		this.dtApolice = dtApolice;
		this.dsCnpjSeguro = dsCnpjSeguro;
		this.cdContrato = cdContrato;
		this.vlMensalidade = vlMensalidade;
	}
	
	public int getCdApolice() {
		return cdApolice;
	}
	public void setCdApolice(int cdApolice) {
		this.cdApolice = cdApolice;
	}
	public int getNrAssegurado() {
		return nrAssegurado;
	}
	public void setNrAssegurado(int nrAssegurado) {
		this.nrAssegurado = nrAssegurado;
	}
	public String getDsFormaPag() {
		return dsFormaPag;
	}
	public void setDsFormaPag(String dsFormaPag) {
		this.dsFormaPag = dsFormaPag;
	}
	public Date getDtApolice() {
		return dtApolice;
	}
	public void setDtApolice(Date dtApolice) {
		this.dtApolice = dtApolice;
	}
	public String getDsCnpjSeguro() {
		return dsCnpjSeguro;
	}
	public void setDsCnpjSeguro(String dsCnpjSeguro) {
		this.dsCnpjSeguro = dsCnpjSeguro;
	}
	public int getCdContrato() {
		return cdContrato;
	}
	public void setCdContrato(int cdContrato) {
		this.cdContrato = cdContrato;
	}
	public double getVlMensalidade() {
		return vlMensalidade;
	}
	public void setVlMensalidade(double vlMensalidade) {
		this.vlMensalidade = vlMensalidade;
	}

}
