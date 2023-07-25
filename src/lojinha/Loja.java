package lojinha;

import java.util.ArrayList;

public class Loja {
	private ArrayList<Produto> produtos = new ArrayList<>();

	public void adicionarProduto(Produto p) {
		produtos.add(p);
	}

	public void listarProdutos() {
		for (Produto p : produtos) {
			System.out.println(p.getNome() + " R$ " + p.getPreco());
		}
	}

	public static void main(String[] args) {
		Loja bodega = new Loja();

		Celular iphone = new Celular();
		iphone.setSistemaOperacional("IOS");
		iphone.setTamanhoDaTela(7.5);
		iphone.setMemoriaRam(6);
		iphone.setArmazenamento(128);
		iphone.setNome("iPhone 20");
		iphone.setPreco(50000);
		bodega.adicionarProduto(iphone); // ADICIONANDO NA LOJA

		Livro memoriasPostumas = new Livro();
		memoriasPostumas.setNome("Memórias Póstumas de Brás Cubas");
		memoriasPostumas.setAutor("Machado de Assis");
		memoriasPostumas.setEditora("Editora");
		memoriasPostumas.setAno(1800);
		memoriasPostumas.setPreco(25);
		bodega.adicionarProduto(memoriasPostumas); // ADICIONANDO NA LOJA

		bodega.listarProdutos();
	}
}
