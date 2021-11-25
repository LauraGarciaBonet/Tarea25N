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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

@Entity
@Table(name="urbanizaciones")
public class Urbanizacion implements Serializable {
	
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	private int number;
	private String content;
	private String chapter;
	
	
	@ManyToOne(fetch= FetchType.LAZY, optional=false)
	@JoinColumn(name="casa_id", nullable=false)
	private Casa casa;
	
	
	public Urbanizacion() {
		
	}
	
	public Urbanizacion(int number, String content,String chapter, Casa casa) {
		this.number=number;
		this.content=content;
		this.chapter=chapter;
		this.casa=casa;
		
	
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
}