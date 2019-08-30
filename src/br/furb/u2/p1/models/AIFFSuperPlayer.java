package br.furb.u2.p1.models;

import br.furb.u2.p1.interfaces.FormatoAudio;

public class AIFFSuperPlayer implements FormatoAudio{

	private String arquivo;
	private int posicao;
	private boolean estaReproduzindo;
	private boolean estaParado;
	
	public AIFFSuperPlayer(String arquivo) {
		this.setArquivo(arquivo);
		abrir(arquivo);
	}
	
	public String getArquivo() {
		return arquivo;
	}

	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}
	
	public int getPosicao() {
		return posicao;
	}
	
	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
	
	public boolean isEstaReproduzindo() {
		return estaReproduzindo;
	}
	
	public void setEstaReproduzindo(boolean estaReproduzindo) {
		this.estaReproduzindo = estaReproduzindo;
	}
	
	public boolean isEstaParado() {
		return estaParado;
	}
	
	public void setEstaParado(boolean estaParado) {
		this.estaParado = estaParado;
	}
	
	public void setCursor(int posicao) {
		setPosicao(posicao);
	}

	@Override
	public void abrir(String arquivo) {
		System.out.println("Arquivo: "+getArquivo()+" aberto");
	}

	@Override
	public void reproduzir() {
		if (estaParado) {
			System.out.println("Não pode ser reproduzido, defina o cursor");
		}else {
			System.out.println("Reproduzindo arquivo "+arquivo);
			setEstaReproduzindo(true);
		}
	}

	@Override
	public void pausar() {
		System.out.println("Pausado arquivo "+arquivo);
		setEstaReproduzindo(false);
	}

	@Override
	public void parar() {
		setEstaParado(true);
		System.out.println("Arquivo parado");
	}

	@Override
	public void avancar(int segundos) {
		System.out.println("Avançado "+segundos+" segundos, arquivo foi para "+posicao+" segundo");
		setCursor(posicao+segundos);
	}

	@Override
	public void retornar(int segundos) {
		setCursor(posicao-segundos);
	}

	@Override
	public void liberar() {
		parar();
		setArquivo(null);
	}

}
