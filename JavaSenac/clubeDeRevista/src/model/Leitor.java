package model;

public class Leitor {
	public int codigo;
	public String nome;
	
	public String retornarInfo(){
		return "\nC�digo do Leitor: " + codigo +
				"\nNome do Leitor: " + nome; 
	}

}
