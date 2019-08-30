package br.furb.u2.p2.controller;

import java.util.Date;

import br.furb.u2.p2.models.ContaCorrente;

public class OperacaoTransferencia extends Operacao {

	private ContaCorrente contraPartida;

	public OperacaoTransferencia(double valor, double saldoAnterior, TipoOperacao tipo, ContaCorrente conta,
			Date date, ContaCorrente contraPartida) {
		super(valor, saldoAnterior, tipo, conta, date);
		this.contraPartida = contraPartida;
	}

	public ContaCorrente getContraPartida() {
		return contraPartida;
	}

	public void setContraPartida(ContaCorrente contraPartida) {
		this.contraPartida = contraPartida;
	}
	
	@Override
	public String toString() {
		return super.toString()+"conta origem: "+contraPartida;
	}
}
