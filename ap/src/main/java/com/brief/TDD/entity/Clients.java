package com.brief.TDD.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Clients {
	
	@Getter @Setter private int id_client; 
	@Getter @Setter private int email; 
	@Getter @Setter private String name; 
	@Getter @Setter private String first_name; 
	@Getter @Setter private int number_cellphone; 
	@Getter @Setter private Date birthday; 
	private Enum<Enum<E>> sexe; 
	
}
