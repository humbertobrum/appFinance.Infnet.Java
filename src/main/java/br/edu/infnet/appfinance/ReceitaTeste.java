package br.edu.infnet.appfinance;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appfinance.model.domain.Receita;

@Component
public class ReceitaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Receita item01 = new Receita();		
		item01.dataLancado = LocalDateTime.now();
		item01.dataVencimento = LocalDateTime.now().plusDays(15);
		item01.descricao = "Salário";
		item01.valor = 15000;
		item01.recebido = true;
		
		System.out.println("Receita - " + item01);
		
		
	}
}