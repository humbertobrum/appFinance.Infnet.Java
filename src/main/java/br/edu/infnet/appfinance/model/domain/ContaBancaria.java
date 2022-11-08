package br.edu.infnet.appfinance.model.domain;



public class ContaBancaria {
	public String descricao;
	public String agencia;
	public String conta;
	public float saldo;
	
	@Override
	public String toString() {
		return descricao + ";" + agencia + ";" + conta + ";" + saldo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
}
