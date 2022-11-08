package br.edu.infnet.appfinance;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appfinance.model.domain.Pessoa;
import br.edu.infnet.appfinance.controller.PessoaController;
@Component
public class PessoaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Pessoa p1 = new Pessoa();		
		p1.setNome("Pessoa da Silva Teste");
		p1.setIdade(26);
		p1.setDocumento("000.000.000-00");
		System.out.println("Pessoa - " + p1);
		PessoaController.incluir(p1);

		
		Pessoa p2 = new Pessoa();		
		p2.setNome("Pessoa da Silva Teste 02");
		p2.setIdade(32);
		p2.setDocumento("000.000.000-00");
		System.out.println("Pessoa - " + p2);
		PessoaController.incluir(p2);
		
		
		Pessoa p3 = new Pessoa();		
		p3.setNome("Pessoa da Silva Teste  03");
		p3.setIdade(45);
		p3.setDocumento("000.000.000-00");
		System.out.println("Pessoa - " + p3);
		PessoaController.incluir(p3);
		
		
	}
}