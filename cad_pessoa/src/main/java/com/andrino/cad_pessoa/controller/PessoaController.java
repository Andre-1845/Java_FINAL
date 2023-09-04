package com.andrino.cad_pessoa.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.andrino.model.Endereco;
import com.andrino.model.Pessoa;
import com.andrino.model.Telefone;
import com.andrino.model.TipoTelefone;

@Controller
public class PessoaController {
	
	@ResponseBody
	@GetMapping("/pessoas")
	public List<Pessoa> listarPessoa(){
		Endereco endereco = new Endereco("77300-900", "Rua Nova Fronteira", "Boa Vista");
		List<Telefone> telefones = new ArrayList<>();
		telefones.add(new Telefone("(061)","98855-1234",TipoTelefone.celular));
		
		Pessoa pessoa = new Pessoa("Andre", "Masc", endereco, telefones );
		
		return Arrays.asList(pessoa, pessoa, pessoa, pessoa);
	}
	
	

}
