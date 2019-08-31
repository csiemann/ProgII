package br.furb.u2.p2.services;

import java.util.Observable;

import br.furb.u2.p2.models.ContaCorrente;

public class NotificacaoOperacao implements Servico{

	Observable contaCorrente;
	
	public NotificacaoOperacao(Observable contaCorrente) {
		this.contaCorrente = contaCorrente;
		contaCorrente.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof ContaCorrente) {
			executar(((ContaCorrente) o).operacoes.);
		}
	}

	@Override
	public void executar(Operacao op) {
		
	}
	
}
