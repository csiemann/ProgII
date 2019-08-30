package br.furb.u2.p2.models;

public class ClientePessoaJuridica extends Cliente {

	String cpf;
	
	public ClientePessoaJuridica(String nome, String telFixo, String telCelular, String cpf) {
		super(nome, telFixo, telCelular);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
