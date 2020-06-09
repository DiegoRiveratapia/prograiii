package com.defensa.Hito4;

import com.defensa.Hito4.Service.AlphabetService;
import com.defensa.Hito4.Service.diccionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Hito4Application {

	@Autowired
	private AlphabetService alphabetService;
	@Autowired
	private diccionarioService diccionarioService;
	public static void main(String[] args) {
		//SpringApplication.run(Hito4Application.class, args);

		SpringApplicationBuilder springApp = new SpringApplicationBuilder(Hito4Application.class);
		springApp.headless(false);
		springApp.run(args);
	}
	@PostConstruct
	public void insertDataToDataBase(){
		alphabetService.saveData();
		diccionarioService.saveData();
	}
}
