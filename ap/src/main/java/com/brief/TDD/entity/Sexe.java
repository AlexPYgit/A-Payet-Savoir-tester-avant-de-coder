package com.brief.TDD.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "sexe")
@Getter
@Setter
public class Sexe {

	@Id
	private int id;
	@Enumerated(EnumType.STRING)
	private SexeEnum sexe;

}
