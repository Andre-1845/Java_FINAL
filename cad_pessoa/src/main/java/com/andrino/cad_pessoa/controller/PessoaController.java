package com.andrino.cad_pessoa.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andrino.cad_pessoa.controller.dto.PessoaDto;
import com.andrino.model.Pessoa;


/* EXEMPLO de inicio
 
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
*/

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
	
	
	@GetMapping
	public List<PessoaDto> listarPessoa(){
		List<Pessoa> pessoas = pessoaRepository.findAll();
		
		return Arrays.asList(pessoas, pessoas, pessoas, pessoas);
	}
	
}
