
package br.edu.infnet.appfinance.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appfinance.model.domain.Pessoa;

@Controller
public class PessoaController {
	
	@GetMapping(value = "/bebida/lista")
	public String telaLista(Model model) {
		
		Pessoa p1 = new Pessoa();		
		p1.setNome("Pessoa da Silva Teste");
		p1.setIdade(32);
		p1.setDocumento("000.000.000-00");
		
		Pessoa p2 = new Pessoa();		
		p2.setNome("Pessoa da Silva Teste");
		p2.setIdade(32);
		p2.setDocumento("000.000.000-00");

		

		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(p1);
		pessoas.add(p2);
	

		model.addAttribute("listagem", pessoas);

		return "pessoa/lista";
	}
}