package Aula21_08;

public class pc {
	String objeto;
	String marca;
	String modelo;
	String preco;
	String cor;
	
	
	public String getObjeto() {
		return objeto;
}
	public void setObjeto(String objeto) {
		this.objeto = objeto;
	}
	public String getMarca() {
		return marca;
}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPreco() {
		return preco;
}
	public void setPreco(String preco) {
		this.preco = preco;
	}
	public String getCor() {
		return cor;
}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String ligar() {
		return "Liga";
	}
	public String desligar() {
		return "Desliga";
	}
	public String clicar() {
		return "Clica";
	}
}
