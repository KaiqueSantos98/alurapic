package br.com.alura.gerenciador.servlet;

import java.util.Date;

public class Empresa {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nomeEmpresa;
	private Date dataAbertura = new Date();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	public Date getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
