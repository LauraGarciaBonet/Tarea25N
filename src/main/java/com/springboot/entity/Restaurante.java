package com.springboot.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="restaurantes")
public class Restaurante {

	@Id
	Long id;
	
	@ManyToMany
	Set<Proveedor> likedProveedores;
}