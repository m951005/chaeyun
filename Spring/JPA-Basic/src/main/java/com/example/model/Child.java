package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Child {
	@Id @GeneratedValue
	private Long Id;
	
	@ManyToOne
	@JoinColumn(name = "parent_id")
	private Parent parent;
}
