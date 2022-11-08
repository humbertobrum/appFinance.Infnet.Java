package br.edu.infnet.appfinance.model.domain;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "tbDespesa")
public class Despesa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	public String descricao;
	public LocalDateTime dataLancado;
	public LocalDateTime dataVencimento;
	public float valor;
	public Boolean pago;
	
	@Transient
	public Pessoa pessoa;
	
	@Transient
	public ContaBancaria conta;
	
	@Override
	public String toString() {
		return descricao + ";" + dataVencimento + ";" + valor + ";" + pago;
	}
}
