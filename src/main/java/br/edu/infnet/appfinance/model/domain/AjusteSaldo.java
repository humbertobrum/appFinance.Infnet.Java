package br.edu.infnet.appfinance.model.domain;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "tbAjuste")
public class AjusteSaldo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	public String descricao;
	public LocalDateTime dataLancado;
	public LocalDateTime dataReferencia;
	public float valor;

	@Transient
	public ContaBancaria conta;
	
	
	@Override
	public String toString() {
		return descricao + ";" + dataReferencia + ";" + valor;
	}
}
