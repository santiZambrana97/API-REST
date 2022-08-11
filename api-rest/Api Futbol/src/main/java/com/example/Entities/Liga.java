package com.example.Entities;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

import lombok.Data;

@Entity
@Table(name="Liga")
@Data
@Audited
public class Liga extends Base {
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "pais")
	private String pais;
	
	@Column(name = "cantidadEquipos")
	private int cantidadEquipos;
	
	@Column(name = "formato")
	private String formato;
	
	
}
