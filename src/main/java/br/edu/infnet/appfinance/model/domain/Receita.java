package br.edu.infnet.appfinance.model.domain;

import java.time.LocalDateTime;

public class Receita {
	public String descricao;
	public LocalDateTime dataLancado;
	public LocalDateTime dataVencimento;
	public float valor;
	public Boolean recebido;
	
	public Pessoa pessoa;
	public ContaBancaria conta;
	
	@Override
	public String toString() {
		return descricao + ";" + dataVencimento + ";" + valor + ";" + recebido;
	}
}
