package com.andrino.cad_pessoa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OlaMundoController {
	
	@GetMapping("/ola")
	@ResponseBody
	public String paginaInicial() {
		return "Ola mundo controller";
	}

}
