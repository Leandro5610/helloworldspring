package br.senai.cotia.hellospring.modelo;

public enum TipoProduto {
	PERECIVEL("Perec�vel"),
	NAO_PERECIVEL("N�o perec�vel"),
	MEIO_PERECIVEL("Meio perec�vel");
	
	
	String desc;
	
	private TipoProduto(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return this.desc;
	}
}
