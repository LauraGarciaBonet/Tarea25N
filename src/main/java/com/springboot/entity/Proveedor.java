package com.springboot.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="proveedores")
public class Proveedor {
	@Id
	Long id;
	
	@ManyToMany
	Set<Restaurante> likes;
}
