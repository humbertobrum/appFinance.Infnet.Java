
package br.edu.infnet.appfinance.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appfinance.model.domain.ContaBancaria;
import br.edu.infnet.appfinance.model.repository.ContaRepository;

@Service
public class ContaService {
	
	@Autowired
	private ContaRepository repository;

	public void incluir(ContaBancaria item) {
		repository.save(item);
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}
	
	public Collection<ContaBancaria> obterLista(){
		return (Collection<ContaBancaria>) repository.findAll();
	}		
}