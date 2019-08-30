package br.models;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	List<ContaCorrente> contas = new ArrayList<>();
	
	private String nome;
	private String telFixo;
	private String telCelular;
	
	public Cliente(String nome, String telFixo, String telCelular) {
		super();
		this.nome = nome;
		this.telFixo = telFixo;
		this.telCelular = telCelular;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelFixo() {
		return telFixo;
	}
	public void setTelFixo(String telFixo) {
		this.telFixo = telFixo;
	}
	public String getTelCelular() {
		return telCelular;
	}
	public void setTelCelular(String telCelular) {
		this.telCelular = telCelular;
	}
	@Override
	public String toString() {
		return nome;
	}
}
