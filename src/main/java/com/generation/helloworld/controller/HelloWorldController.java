package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	@GetMapping
	public String helloWorld() {
		return "Hello Word";
	}
	@GetMapping("bsm")
	public String listaBsm() {
		return "Lista de BSM's da Generation Brasil:"
				+ "\nPersistência"
				+ "\nResponsabilidade pessoal"
				+ "\nComunicação"
				+ "\nTrabalho em equipe"
				+ "\nOrientação ao detalhe"
				+ "\nMentalidade de crescimento"
				+ "\nMenatalidades e HAbilidades comportamentais"
				+ "\nOrientação ao futuro"
				+ "\nProatividade";
	}
	
	
	@GetMapping("objetivos")
	public String Objetivos() {
		return "objetivos de aprendizagem desta semana.\n"
				+ "\nIniciar o Blog Pessoal"
				+ "\nRealizar as tasks do PI"
				+ "\nEntender Spring Boot";
	}
	

	

}
