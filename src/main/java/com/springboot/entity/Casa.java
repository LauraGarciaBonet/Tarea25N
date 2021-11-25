package com.springboot.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="casas")
public class Casa implements Serializable {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	private String title;
	private String autor;
	
	@Column(unique=true)
	private String isbn;
	
	
	@OneToMany(mappedBy="casa", fetch= FetchType.LAZY, cascade= CascadeType.All)
	private Set<Urbanizacion> pages;
	
	
	public Casa() {
		
	}
	
	public Casa(String title, String autor, String isbn) {
		this.title=title;
		this.autor=autor;
		this.isbn=isbn;
		
	}
	
	
	
	private static final long serialVersionUID = 1L;
	
	
	
	
}
