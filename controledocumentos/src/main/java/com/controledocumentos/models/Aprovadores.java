package com.controledocumentos.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Aprovadores implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column (nullable = false, length = 50)
	private String Aprovador;
	
	@Column (nullable = false, length = 50)
	private String Area;

	public String getAprovador() {
		return Aprovador;
	}

	public void setAprovador(String aprovador) {
		Aprovador = aprovador;
	}

	public String getArea() {
		return Area;
	}

	public void setArea(String area) {
		Area = area;
	}
	
	

}
