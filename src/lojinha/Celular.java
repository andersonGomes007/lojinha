package lojinha;

/**
 * A classe Celular estende a classe Produto Ou seja, Celular É UM Produto
 * 
 * TODOS os atributos e métodos da classe Produto são herdados pela classe
 * Celular
 */
public class Celular extends Produto {
	private String sistemaOperacional;
	private double tamanhoDaTela;
	private int memoriaRam;
	private int armazenamento;
	// abaixo são os métodos GET e SET gerados automaticamente
	public String getSistemaOperacional() {
		return sistemaOperacional;
	}

	public void setSistemaOperacional(String sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}

	public double getTamanhoDaTela() {
		return tamanhoDaTela;
	}

	public void setTamanhoDaTela(double tamanhoDaTela) {
		this.tamanhoDaTela = tamanhoDaTela;
	}

	public int getMemoriaRam() {
		return memoriaRam;
	}

	public void setMemoriaRam(int memoriaRam) {
		this.memoriaRam = memoriaRam;
	}

	public int getArmazenamento() {
		return armazenamento;
	}

	public void setArmazenamento(int armazenamento) {
		this.armazenamento = armazenamento;
	}
}
