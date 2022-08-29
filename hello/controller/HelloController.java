package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")


public class HelloController {
	
	@GetMapping("hello-word")
	public String hello() {
		return "hello generation!!!";
	}
	
	@GetMapping("bms-mentalidades")
	public String[] bmsMentalidades() {		
		return new String[] {"Orientação ao Futuro", "Responsabilidade Pessoal","Mentalidade de Crescimento", "Persistência"};
	}
	
	@GetMapping("bms-habilidades")
	public String[] bmsHabilidades() {
		return new String[] {"Trabalho em equipe", "Atenção aos Detalhes", "Proatividade", "Comunicação"};
	}
	
	@GetMapping("objetivos")
	public String[] listaObjetivos() {
		return new String[] {"Aprender sobre Spring Boot", "Consumir uma API"};
	}
	
}
