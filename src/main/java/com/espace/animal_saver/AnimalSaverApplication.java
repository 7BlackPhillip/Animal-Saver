package com.espace.animal_saver;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

// Seek beans at the code
@EnableFeignClients

@SpringBootApplication
public class AnimalSaverApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnimalSaverApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}


}
