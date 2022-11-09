
package br.edu.infnet.appfinance.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appfinance.model.domain.ContaBancaria;
import br.edu.infnet.appfinance.model.domain.Pessoa;
import br.edu.infnet.appfinance.model.service.ContaService;

@Controller
public class ContaController {
		
	@Autowired
	private ContaService service;
	
	@GetMapping(value = "/conta/lista")
	public String telaLista(Model model) {	
		model.addAttribute("listagem", service.obterLista());
		return "conta/lista";
	}
	
	@GetMapping(value = "/adicionarConta")
	public String telaCadastro() {
		return "conta/cadastro";
	}
	
	@PostMapping(value = "/conta/incluir")
	public String incluir(ContaBancaria item) {
		
		service.incluir(item);
		
		return "redirect:/conta/lista";
	}
	
	
	@GetMapping(value = "/conta/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		service.excluir(id);	
		return "redirect:/conta/lista";
	}
	
}

