package model;

public class Leitor {
	public int codigo;
	public String nome;
	
	public String retornarInfo(){
		return "\nCódigo do Leitor: " + codigo +
				"\nNome do Leitor: " + nome; 
	}

}
