package br.furb.u2.p2.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Observable;

import br.furb.u2.p2.services.Operacao;
import br.furb.u2.p2.services.OperacaoTransferencia;
import br.furb.u2.p2.services.enums.TipoOperacao;

public class ContaCorrente extends Observable {

	public List<Operacao> operacoes= new ArrayList<>();
	public OperacaoTransferencia transferencia;
	
	private int numero;
	private int agencia;
	private Cliente cliente;
	private double saldo;

	public ContaCorrente(int numero, int agencia, Cliente cliente) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.cliente = cliente;
		this.saldo = 0;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	private void addSaldo(double valor) {
		this.saldo += valor;
	}
		
	public void sacar(double valor) {
		Operacao operacao = new Operacao(valor, saldo, TipoOperacao.SAIDA, this, new Date());
		addSaldo(-valor);
		operacoes.add(operacao);
		System.out.printf(this+", Saque de R$ %.2f\n",valor);
	}
	
	public void depositar(double valor) {
		Operacao operacao = new Operacao(valor, saldo, TipoOperacao.ENTRADA, this, new Date());
		addSaldo(valor);
		operacoes.add(operacao);
		System.out.printf(this+", Deposito de R$ %.2f\n",valor);
	}
	
	public void transferir(double valor, ContaCorrente contaDestino) {
		OperacaoTransferencia transferencia = new OperacaoTransferencia(valor, saldo, TipoOperacao.SAIDA, this, new Date(), contaDestino);
		contaDestino.receberTransferencia(valor, this);
		operacoes.add(transferencia);
	}
	
	private void receberTransferencia(double valor, ContaCorrente contaOrigem) {
		transferencia = new OperacaoTransferencia(valor, saldo, TipoOperacao.ENTRADA, this, new Date(), contaOrigem);
		contaOrigem.addSaldo(-valor);
		addSaldo(valor);
		System.out.printf("Foi transferido R$ %.2f de %s para %s \n", valor, contaOrigem ,this);
	}
	
	@Override
	public String toString() {
		return "Cliente "+cliente.getNome()+", conta "+numero;
	}
}
