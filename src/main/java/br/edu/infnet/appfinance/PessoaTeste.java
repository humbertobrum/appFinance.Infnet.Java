package br.edu.infnet.appfinance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appfinance.model.domain.Pessoa;
import br.edu.infnet.appfinance.model.service.PessoaService;

@Component
public class PessoaTeste implements ApplicationRunner {

	@Autowired
	private PessoaService service;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Pessoa p1 = new Pessoa();		
		p1.setNome("Pessoa da Silva Teste");
		p1.setIdade(26);
		p1.setCpf("000.000.000-00");
		System.out.println("Pessoa - " + p1);
		service.incluir(p1);

		
		Pessoa p2 = new Pessoa();		
		p2.setNome("Pessoa da Silva Teste 02");
		p2.setIdade(32);
		p2.setCpf("000.000.000-00");
		System.out.println("Pessoa - " + p2);
		service.incluir(p2);
		
		
		Pessoa p3 = new Pessoa();		
		p3.setNome("Pessoa da Silva Teste  03");
		p3.setIdade(45);
		p3.setCpf("000.000.000-00");
		System.out.println("Pessoa - " + p3);
		service.incluir(p3);
		
		
	}
}