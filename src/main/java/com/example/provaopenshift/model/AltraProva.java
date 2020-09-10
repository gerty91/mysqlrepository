package com.example.provaopenshift.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class AltraProva {

	@Id
	@Column
	private Integer altroid;
	
	@Column
	private String altronome;

	public Integer getAltroid() {
		return altroid;
	}

	public void setAltroid(Integer altroid) {
		this.altroid = altroid;
	}

	public String getAltronome() {
		return altronome;
	}

	public void setAltronome(String altronome) {
		this.altronome = altronome;
	}
	
	
	
	
}
