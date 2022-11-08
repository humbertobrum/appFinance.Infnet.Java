package br.edu.infnet.appfinance;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appfinance.model.domain.ContaBancaria;

@Component
public class ContaBancariaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		ContaBancaria c1 = new ContaBancaria();		
		c1.setAgencia("5566");
		c1.setConta("617819-6");
		c1.setDescricao("Conta Bradesco");
		System.out.println("ContaBancaria - " + c1);
		
		
	}
}