package model;

public class Revista {
	public int codigo, ano, edicao;
	public String nome, descricao;
	public Colecao colecao; // Associa��o
	
	public String retornarInfo() {
		return "\nC�digo da Revista: " + codigo +
				"\nNome da Revista: " + nome +
				"\nAno: " + ano +
				"\nEdi��o: " + edicao +
				"\nDescri��o: " + descricao +
				"\nCole��o: " + colecao.nome;
	}
}
