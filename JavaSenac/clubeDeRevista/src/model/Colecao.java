package model;

public class Colecao {
	private int codigo; 
	private String nome; 

	public String getNome() {
		return this.nome;
	}

	public int getCodigo () {
		return this.codigo;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCodigo (int codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Colecao [codigo=" + codigo + ", nome=" + nome + "]";
	}
	
}