package com.example.provaopenshift.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.provaopenshift.model.Prova;
import com.example.provaopenshift.repository.ProvaRepository;

@Service("provaService")
public class ProvaServiceImpl implements ProvaService {

	@Autowired
	private ProvaRepository pr;
	
	@Override
	public void saveProva(Prova p) {
		pr.save(p);
	}
	
	@Override
	public List<Prova> getAll() {
		return pr.findAll();
	}
}
