
package br.edu.infnet.appfinance.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appfinance.model.domain.Pessoa;

@Controller
public class PessoaController {
	
	private static Map<Integer, Pessoa> mapa = new HashMap<Integer, Pessoa>();	
	private static Integer id = 1;

	public static void incluir(Pessoa pessoa) {
		pessoa.setId(id++);
		mapa.put(pessoa.getId(), pessoa);		
		System.out.println("> " + pessoa);
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<Pessoa> obterLista(){
		return mapa.values();
	}
	
	@GetMapping(value = "/pessoa/lista")
	public String telaLista(Model model) {	
		model.addAttribute("listagem", obterLista());
		return "pessoa/lista";
	}
	
	@GetMapping(value = "/pessoa/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);	
		return "redirect:/pessoa/lista";
	}
	
}

