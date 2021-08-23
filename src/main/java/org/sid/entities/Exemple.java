package org.sid.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Exemple implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;	
	
	public Exemple() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Exemple(int id) {
		super();
		Id = id;
	}

	public int getId() {
		return Id;
	}
	
	
}
