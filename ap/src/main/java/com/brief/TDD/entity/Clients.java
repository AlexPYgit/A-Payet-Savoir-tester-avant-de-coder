package com.brief.TDD.entity;

import java.util.Date;

import com.brief.TDD.entity.Sexe.Sexe_type;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "clients")
@Getter
@Setter
public class Clients {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JoinColumn(name = "idclient")
	private int id_client;
	@JoinColumn(name = "email")
	private String email;
	@JoinColumn(name = "name")
	private String name;
	@JoinColumn(name = "first_name")
	private String first_name;
	@JoinColumn(name = "number_cellphone")
	private int number_cellphone;
	@JoinColumn(name = "birthday")
	private Date birthday;
	@ManyToOne
	private Sexe sexe;

}
