package br.edu.infnet.appfinance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appfinance.model.domain.ContaBancaria;
import br.edu.infnet.appfinance.model.service.ContaService;

@Component
public class ContaBancariaTeste implements ApplicationRunner {

	@Autowired
	private ContaService service;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		ContaBancaria c1 = new ContaBancaria();		
		c1.setAgencia("5566");
		c1.setConta("617819-6");
		c1.setDescricao("Conta Bradesco");
		System.out.println("ContaBancaria - " + c1);
		
		service.incluir(c1);
		
		
	}
}