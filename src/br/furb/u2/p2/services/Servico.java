package br.furb.u2.p2.services;

import java.util.Observer;

public interface Servico extends Observer{

	public abstract void executar(Operacao op);
	
}
