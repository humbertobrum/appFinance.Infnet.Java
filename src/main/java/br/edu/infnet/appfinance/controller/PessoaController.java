
package br.edu.infnet.appfinance.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appfinance.model.domain.Pessoa;
import br.edu.infnet.appfinance.model.domain.Usuario;
import br.edu.infnet.appfinance.model.service.PessoaService;

@Controller
public class PessoaController {
		
	@Autowired
	private PessoaService service;
	
	@GetMapping(value = "/pessoa/lista")
	public String telaLista(Model model) {	
		model.addAttribute("listagem", service.obterLista());
		return "pessoa/lista";
	}
	
	@GetMapping(value = "/adicionarPessoa")
	public String telaCadastro() {
		return "pessoa/cadastro";
	}
	
	@PostMapping(value = "/pessoa/incluir")
	public String incluir(Pessoa pessoa) {
		
		service.incluir(pessoa);
		
		return "redirect:/pessoa/lista";
	}
	
	
	@GetMapping(value = "/pessoa/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		service.excluir(id);	
		return "redirect:/pessoa/lista";
	}
	
}

