package com.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="barrios")
public class Barrio {
	
	@ManyToOne
	@JoinColumn(name="edificio_id", nullable=false)
private Edificio edificio;
	
	public Barrio() {}
}
