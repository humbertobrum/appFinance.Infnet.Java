package br.edu.infnet.appfinance.model.domain;

import java.time.LocalDateTime;

public class Transacao {
	public String descricao;
	public LocalDateTime data;
	public float valor;
	public String operacao;
	
	public ContaBancaria conta;
	
	@Override
	public String toString() {
		return descricao + ";" + data + ";" + valor + ";" + operacao;
	}
}
