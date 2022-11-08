package br.edu.infnet.appfinance.model.domain;

import java.time.LocalDateTime;

public class AjusteSaldo {
	public String descricao;
	public LocalDateTime dataLancado;
	public LocalDateTime dataReferencia;
	public float valor;

	
	@Override
	public String toString() {
		return descricao + ";" + dataReferencia + ";" + valor;
	}
}
