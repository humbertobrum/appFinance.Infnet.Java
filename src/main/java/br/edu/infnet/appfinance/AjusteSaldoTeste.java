package br.edu.infnet.appfinance;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appfinance.model.domain.AjusteSaldo;

@Component
public class AjusteSaldoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		AjusteSaldo item01 = new AjusteSaldo();		
		item01.dataLancado = LocalDateTime.now();
		item01.dataReferencia = LocalDateTime.now().minusDays(2);
		item01.descricao = "Correção de Saldo";
		item01.valor = 55;
		
		System.out.println("Correção - " + item01);
		
		
	}
}