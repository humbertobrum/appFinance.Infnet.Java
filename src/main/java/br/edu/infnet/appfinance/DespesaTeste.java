package br.edu.infnet.appfinance;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appfinance.model.domain.Despesa;

@Component
public class DespesaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Despesa item01 = new Despesa();		
		item01.dataLancado = LocalDateTime.now();
		item01.dataVencimento = LocalDateTime.now().plusDays(30);
		item01.descricao = "Conta de Energia";
		item01.valor = 250;
		item01.pago = false;
		
		System.out.println("Receita - " + item01);
		
		
	}
}