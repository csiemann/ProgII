package br.models;

public class ClientePessoaFisica extends Cliente {

	private String cnpj;
	private String servidorJMS;
	
	public ClientePessoaFisica(String nome, String telFixo, String telCelular, String cpf) {
		super(nome, telFixo, telCelular);
		this.cnpj = cpf;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getServidorJMS() {
		return servidorJMS;
	}

	public void setServidorJMS(String servidorJMS) {
		this.servidorJMS = servidorJMS;
	}
}
