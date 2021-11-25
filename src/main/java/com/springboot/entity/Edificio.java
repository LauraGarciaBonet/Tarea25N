package com.springboot.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="edificios")
public class Edificio {

	@OneToMany(mappedBy="edificio")
	private Set<Barrio> barrio;
}
