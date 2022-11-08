package br.edu.infnet.appfinance;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appfinance.model.domain.Pessoa;

@Component
public class PessoaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Pessoa p1 = new Pessoa();		
		p1.setNome("Pessoa da Silva Teste");
		p1.setIdade(32);
		p1.setDocumento("000.000.000-00");
		System.out.println("Pessoa - " + p1);
		
		
	}
}