package com.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="viviendas")
public class Vivienda {

	@Id
	@GeneratedValue
	private long id;
	
	@Column
	private String catastro1;
	
	@OneToOne
	@JoinColumn(name="catastro_id")
	private Catastro catastro;
}
