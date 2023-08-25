package br.com.baumgratz.ctrl_efetivos.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.baumgratz.ctrl_efetivos.model.Pessoal;
import br.com.baumgratz.ctrl_efetivos.repository.PessoalRepository;

@Controller
public class PessoalController {
	
	@Autowired
	private PessoalRepository pessoalRepository;
	
	@GetMapping("/ctrlEfetivos")
	public String paginaPrincipal() {
		return "index";
	}
	
	
	// @GetMapping("/pessoal")
	// public String pg(Model requisicao) {
		// List<Pessoal> integrantes = pessoalRepository.findAll();
		// requisicao.addAttribute("integrantes", integrantes);
		// return "pessoal";
	// }
	
	@GetMapping("/contato2")
	public String pgPessoal2(Model requisicao) {
		List<Pessoal> integrantes = pessoalRepository.findAll();
		requisicao.addAttribute("integrantes", integrantes);
		return "contato2";
	}
	
	
	
	@GetMapping("/cadastro")
	public String pgCadastrarPessoal(Pessoal pessoal) {
		return "cadastro";
	}
	@PostMapping("/cadastro")
	public String cadastroPessoal (@Valid Pessoal pessoal, Errors erros, BindingResult result, Model model) {
		if(result.hasErrors() || (null != erros && erros.getErrorCount() > 0)) {
			return "cadastro";
		}
		pessoalRepository.save(pessoal);
		return "redirect:/contato2";
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateForm(@PathVariable("id") long id, Model model) {
	    Pessoal pessoal = pessoalRepository.findById(id)
	      .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
	    
	    model.addAttribute("pessoal", pessoal);
	    return "editarPessoal";
	}
	
	@PostMapping("/update/{id}")
	public String updateUser(@PathVariable("id") long id, @Valid Pessoal pessoal, 
	  BindingResult result, Model model) {
	    if (result.hasErrors()) {
	        pessoal.setId(id);
	        return "editarPessoal";
	    }
	        
	    pessoalRepository.save(pessoal);
	    return "redirect:/contato2";
	}
	    
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
	    Pessoal pessoal = pessoalRepository.findById(id)
	      .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
	    pessoalRepository.delete(pessoal);
	    return "redirect:/contato2";
	}
	
	@GetMapping("/login")
	public String paginaLogin() {
		return "login";
	}

	@GetMapping("/contato")
	public String paginaContato() {
		return "contato";
	}
	
	@GetMapping("/cad_admin")
	public String paginaCad_Admin() {
		return "cad_admin";
	}
	
	@GetMapping("/esqueci")
	public String paginaEsqueci() {
		return "esqueci";
	}
	
	
	
	

}
