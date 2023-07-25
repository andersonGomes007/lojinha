package lojinha;

public class Principal {
	public static void main(String[] args) {
		Pessoa jose = new Pessoa();
		
		jose.setNome("José da Silva");
		jose.setCpf("000.000.000-00");
		
		Endereco e = new Endereco();
		e.setRua("Floriano Peixoto");
		e.setNumero("S/N");
		e.setBairro("Centro");
		
		jose.setEndereco(e);
		
		System.out.println(jose.getNome());
		System.out.println(jose.getEndereco().getRua());
		System.out.println(jose.getEndereco().getNumero());
		System.out.println(jose.getEndereco().getBairro());
	}
}
