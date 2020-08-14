package model;

public class Revista {
	public int codigo, ano, edicao;
	public String nome, descricao;
	public Colecao colecao; // Associação
	
	public String retornarInfo() {
		return "\nCódigo da Revista: " + codigo +
				"\nNome da Revista: " + nome +
				"\nAno: " + ano +
				"\nEdição: " + edicao +
				"\nDescrição: " + descricao +
				"\nColeção: " + colecao.nome;
	}
}
