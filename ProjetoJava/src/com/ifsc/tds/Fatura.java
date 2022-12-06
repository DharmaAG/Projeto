package com.ifsc.tds;
//ooop
public class Fatura {
	
	
	private int faturaId;
	private int mesAno;
	private int consumo;
	private boolean pago; 
	
	Uc unidadeConsumidora = new Uc();
	
	public Fatura() {}

	public int getFaturaId() {
		return faturaId;
	}

	public void setFaturaId(int faturaId) {
		this.faturaId = faturaId;
	}

	public int getMesAno() {
		return mesAno;
	}

	public void setMesAno(int mesAno) {
		this.mesAno = mesAno;
	}

	public int getConsumo() {
		return consumo;
	}

	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

	public boolean isPago() {
		return pago;
	}

	public void setPago(boolean pago) {
		this.pago = pago;
	}

	
	
}
