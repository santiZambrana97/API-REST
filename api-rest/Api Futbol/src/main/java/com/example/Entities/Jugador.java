package com.example.Entities;



import javax.persistence.*;

import org.hibernate.envers.Audited;


@Entity
@Table(name="Jugador")
@Audited
public class Jugador extends Base {
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name="nacionacidad")
	private String nacionalidad;
	
	@Column(name ="edad")
	private int edad;
	
	@Column(name="posicion")
	private String posicion;
	
}
