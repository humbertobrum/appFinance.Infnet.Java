package br.edu.infnet.appfinance.model.domain;

public class Pessoa {
	public String nome;
	public String documento;
	public int idade;
	
	@Override
	public String toString() {
		return nome + ";" + documento + ";" + idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
