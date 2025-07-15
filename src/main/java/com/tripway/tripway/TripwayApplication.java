package com.tripway.tripway;

import com.tripway.tripway.model.Cliente;
import com.tripway.tripway.model.PacoteViagem;
import com.tripway.tripway.repository.ClienteRepository;
import com.tripway.tripway.repository.PacoteViagemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TripwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(TripwayApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ClienteRepository clienteRepository,
											   PacoteViagemRepository pacoteViagemRepository) {
		return args -> {
			
		};
	}
}