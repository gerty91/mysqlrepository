package com.example.provaopenshift.service;

import java.util.List;

import com.example.provaopenshift.model.Prova;

public interface ProvaService {
	
	void saveProva(Prova p);
	List<Prova> getAll();
	

}
