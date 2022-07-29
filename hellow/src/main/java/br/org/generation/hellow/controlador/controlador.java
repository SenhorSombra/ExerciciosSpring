package br.org.generation.hellow.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController //transformar em um controlador
@RequestMapping("/hello") //Diz o endereço onde será acessado localhost: 8080/hello

public class controlador {
	
	@GetMapping // Pegue a informação abaixo no endereço
	public String hello() {
		
		return "Hello World! Hello Spring!!!";
	}

}
