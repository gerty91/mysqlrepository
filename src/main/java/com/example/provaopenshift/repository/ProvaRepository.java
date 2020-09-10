package com.example.provaopenshift.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.provaopenshift.model.Prova;

@Repository("provaRepository")
public interface ProvaRepository extends JpaRepository<Prova,Integer>{

}
