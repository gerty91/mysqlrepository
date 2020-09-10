package com.example.provaopenshift.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.provaopenshift.model.Prova;
import com.example.provaopenshift.service.ProvaService;

@Controller
public class MioController {

	
	@Autowired
	private ProvaService ps;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		
		mv.addObject("prova", new Prova());
		
		return mv;	
	}
	
	@RequestMapping(value="/salva",method=RequestMethod.POST)
	public ModelAndView aggiungiDato(Prova p,BindingResult br) {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("salva");
		ps.saveProva(p);
		return mv;
		
	}
	
	@RequestMapping(value="/lista",method=RequestMethod.GET)
	public ModelAndView listaDati() {
		
		ModelAndView mv = new ModelAndView();
		List<Prova> lista = ps.getAll();
		mv.addObject("lista", lista);
		return mv;
	}
}
