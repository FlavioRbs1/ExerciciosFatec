package com.controledocumentos.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class Documento  implements Serializable {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer id;
	
	@Column (nullable = false, length = 50)
	private String documento;
	
	@Column (nullable = false, length =2)
	private String revisao;
	
	@Column (nullable = false)
	private String dataAprovacao;
	
	@Column (nullable = false)
	private String dataValidade;
	
	@Column (nullable = false, length = 150)
	private String justificativa;
	
	@Column (nullable = false, length = 50)
	private String nomeAprovador;
	
	@Column (nullable = false, length = 50)
	private String area;
	
	
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getRevisao() {
		return revisao;
	}
	public void setRevisao(String revisao) {
		this.revisao = revisao;
	}
	public String getDataAprovacao() {
		return dataAprovacao;
	}
	public void setDataAprovacao(String dataAprovacao) {
		this.dataAprovacao = dataAprovacao;
	}
	public String getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}
	public String getJustificativa() {
		return justificativa;
	}
	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}
	public String getNomeAprovador() {
		return nomeAprovador;
	}
	public void setNomeAprovador(String nomeAprovador) {
		this.nomeAprovador = nomeAprovador;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
}
	
	