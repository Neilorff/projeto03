package br.com.arq;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.arq.entity.Produto;

@SpringBootApplication
public class Projeto03Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Projeto03Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Produto p = new Produto(10L,"Celular",50.,"hiphone da empresa pear","hiphone.png" );
			
		String message="{\"Preço\": 15.00}";		
		System.out.println(message);
		System.out.println(p);
	}

}
