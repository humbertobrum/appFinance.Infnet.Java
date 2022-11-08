package br.edu.infnet.appfinance;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appfinance.model.domain.Transacao;

@Component
public class TransacaoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Transacao t1 = new Transacao();		
		t1.data = LocalDateTime.now();
		t1.descricao = "Transação de Crédido";
		t1.valor = 150;
		t1.operacao = "CREDIT";
		System.out.println("Transação - " + t1);
		
		
	}
}