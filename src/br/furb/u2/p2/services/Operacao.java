package br.furb.u2.p2.services;

import java.util.Date;

import br.furb.u2.p2.models.ContaCorrente;
import br.furb.u2.p2.services.enums.TipoOperacao;

public class Operacao {
	private double valor;
	private double saldoAnterior;
	private TipoOperacao tipo;
	private ContaCorrente conta;
	private Date date;
	
	public Operacao(double valor, double saldoAnterior,TipoOperacao tipo, ContaCorrente conta, Date date) {
		this.valor = valor;
		this.saldoAnterior = saldoAnterior;
		this.tipo = tipo;
		this.conta = conta;
		this.date = date;
	}

	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getSaldoAnterior() {
		return saldoAnterior;
	}
	public void setSaldoAnterior(double saldoAnterior) {
		this.saldoAnterior = saldoAnterior;
	}
	public TipoOperacao getTipo() {
		return tipo;
	}

	public void setTipo(TipoOperacao tipo) {
		this.tipo = tipo;
	}

	public ContaCorrente getConta() {
		return conta;
	}
	public void setConta(ContaCorrente conta) {
		this.conta = conta;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Operacao [valor=" + valor + ", saldoAnterior=" + saldoAnterior + ", tipo=" + tipo + ", conta=" + conta
				+ ", date=" + date + "]";
	}
	
	
	
}
