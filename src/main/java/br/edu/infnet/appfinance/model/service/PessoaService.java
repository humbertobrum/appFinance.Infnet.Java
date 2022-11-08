
package br.edu.infnet.appfinance.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appfinance.model.domain.Pessoa;
import br.edu.infnet.appfinance.model.repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository repository;

	public void incluir(Pessoa item) {
		repository.save(item);
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}
	
	public Collection<Pessoa> obterLista(){
		return (Collection<Pessoa>) repository.findAll();
	}		
}