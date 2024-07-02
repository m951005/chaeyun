package com.example.model;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Movie extends Product {
	private String director;
	private String genre;

}
