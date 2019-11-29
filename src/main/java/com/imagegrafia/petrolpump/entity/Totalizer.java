package com.imagegrafia.petrolpump.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.annotation.CreatedDate;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Totalizer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private int amount;
	public Totalizer(int amount, int volume, Date createdDate) {
		super();
		this.amount = amount;
		this.volume = volume;
		this.createdDate = createdDate;
	}
	private int volume;
	@CreatedDate
	private Date createdDate;

}
