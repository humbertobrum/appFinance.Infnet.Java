package br.edu.infnet.appfinance.model.domain;

import java.time.LocalDateTime;

public class Despesa {
	public String descricao;
	public LocalDateTime dataLancado;
	public LocalDateTime dataVencimento;
	public float valor;
	public Boolean pago;
	
	@Override
	public String toString() {
		return descricao + ";" + dataVencimento + ";" + valor + ";" + pago;
	}
}
