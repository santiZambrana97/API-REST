package com.example.Entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

import lombok.Data;



@Entity
@Table(name="FotballClub")
@Data
@Audited
public class FotballClub extends Base {
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "localidad")
	private String localidad;
	
	@Column(name = "dt")
	private String dt;
	
	@Column(name = "estadio")
	private String estadio;
	
	@OneToMany(cascade= CascadeType.PERSIST)
	private List<Jugador> jugadores = new ArrayList<Jugador>();
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "fk_liga")
	private Liga liga;
}




/*Cascade, en JPA o Hibernate, permite simplificar las operaciones en nuestro código Java.Cuando realizamos alguna acción 
 * en la entidad objetivo, la misma acción se aplicará automáticamente a sus entidades asociadas.*/
 