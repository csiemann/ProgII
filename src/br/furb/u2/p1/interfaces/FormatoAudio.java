package br.furb.u2.p1.interfaces;

public interface FormatoAudio {
	public void abrir(String audio);
	public void reproduzir();
	public void pausar();
	public void parar();
	public void avancar(int segundos);
	public void retornar(int segundos);
	public void liberar();
}