package com.ifsc.tds;

public class Uc {

	private int ucld;
	private int leituraAnterior;
	private int leituraAtual;
	Cliente cliente = new Cliente();
	//Endereco endereco = new Endereco();
	
	
	public Uc() {}

	public int getUcld() {
		return ucld;
	}

	public void setUcld(int ucld) {
		this.ucld = ucld;
	}

	public int getLeituraAnterior() {
		return leituraAnterior;
	}

	public void setLeituraAnterior(int leituraAnterior) {
		this.leituraAnterior = leituraAnterior;
	}

	public int getLeituraAtual() {
		return leituraAtual;
	}

	public void setLeituraAtual(int leituraAtual) {
		this.leituraAtual = leituraAtual;
	}

	public String toString() {
		String texto = "";
		
		texto = "-------------------------"
				+ "\n UCLD: " + getUcld()
				+ "\n Leitura Anterior: " + getLeituraAnterior()
				+ "\n Leitura Atual: " + getLeituraAtual();
		
		return texto;
	}
	
	public int faturar(int leitura) {
		return 0;
	}
	
	public int pegarConsumo() {
		return 0;
	}
}
