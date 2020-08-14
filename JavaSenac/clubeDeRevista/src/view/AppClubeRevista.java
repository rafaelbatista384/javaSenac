package view;

import model.Colecao;
import model.Revista;
import model.Leitor;

class AppClubeRevista {

	public static void main(String[] args) {
		Colecao colecao = new Colecao();
		Revista revista = new Revista();
		Leitor leitor = new Leitor();
		
		leitor.codigo=80;
		leitor.nome="João Pedro";
		
		colecao.codigo=200;
		colecao.nome="Quadrinhos";
		
		revista.codigo=1;
		revista.nome="Turma da Mônica";
		revista.ano=2020;
		revista.edicao=8;
		revista.descricao="Procurando Sansão";
		revista.colecao=colecao;
		
		System.out.print(revista.retornarInfo());
		System.out.print(colecao.retornarInfo());
		System.out.print(leitor.retornarInfo());
	}
	
}
