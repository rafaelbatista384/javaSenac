package view;

import java.util.Date;

import model.Colecao;
import model.Emprestimo;
import model.Revista;
import model.Leitor;

class AppClubeRevista {

	public static void main(String[] args) {
		Colecao colecao = new Colecao();
		Revista revista = new Revista();
		Leitor leitor = new Leitor();
		Emprestimo emprestimo = new Emprestimo();
		
		colecao.setCodigo(200);
		colecao.setNome("Quadrinhos");
		
		revista.setCodigo(1);
		revista.setNome("Turma da Mônica");
		revista.setAno(2020);
		revista.setEdicao(8);
		revista.setDescricao("Procurando Sansão");
		revista.setColecao(colecao);
		
		leitor.setCodigo(80);
		leitor.setNome("João Pedro");
		
		emprestimo.setNumero(122232);
		emprestimo.setLeitor(leitor);
		emprestimo.setRevista(revista);
		emprestimo.setDataEmprestimo(new Date());
		emprestimo.setDataDevolucao(new Date(2020,8,30));
		
		//System.out.print(revista.retornarInfo());
		//System.out.print(colecao.retornarInfo());
		//System.out.print(leitor.retornarInfo());
		System.out.println(emprestimo);
	}
	
}
