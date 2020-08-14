package model;

public class Colecao {
	public int codigo; 
	public String nome; 

	
	public String retornarInfo(){
		return "\nCódigo da Coleção: " + codigo +
				"\nNome da Coleção: " + nome; 
	}
	
	
}