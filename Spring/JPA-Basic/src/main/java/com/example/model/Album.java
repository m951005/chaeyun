package com.example.model;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Album extends Product {
	private String artist;
	
}
