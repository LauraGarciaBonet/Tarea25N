package com.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="codigo")
public class Catastro {

	@Id
	@GeneratedValue
	private long id;
	
	@Column(nullable=false)
	private String codigo;
	
	@OneToOne(mappedBy="catastro")
	private Vivienda viviendas;
}
