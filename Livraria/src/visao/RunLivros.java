package visao;

import javax.swing.JOptionPane;

import modelagem.Livro;
import negocio.ColecaoLivros;

/**
 * @author  JORGE-PC
 * A classe deverá interagir com o usuário utilizando painéis da classe JOptionPane.
 **/
public class RunLivros {

	public static void main(String[] args) {
		//criação do obj
		ColecaoLivros colecaoLivros = new ColecaoLivros();
		//criação de objs
		Livro livroUm = new Livro();
		Livro livroDois = new Livro();
		//painel de recepção
		JOptionPane.showMessageDialog(null, "BEM VINDO AO REGISTRO DE LIVROS");
		JOptionPane.showMessageDialog(null, "Clique em OK para prosseguir");
		//recebe os dados do usuário e grava nos atributos do obj
		livroUm.setTitulo(JOptionPane.showInputDialog("Insira o nome do primeiro livro: "));
		livroUm.setAutor(JOptionPane.showInputDialog("Insira o nome do autor: "));
		livroUm.setCategoria(JOptionPane.showInputDialog("Insira a categoria do livro: "));
		//recebe os dados do usuário e grava nos atributos do obj
		livroDois.setTitulo(JOptionPane.showInputDialog("Insira o nome do segundo livro: "));
		livroDois.setAutor(JOptionPane.showInputDialog("Insira o nome do autor: "));
		livroDois.setCategoria(JOptionPane.showInputDialog("Insira a categoria do livro: "));
		//insere os objs no vetor colecaoLivros
		colecaoLivros.adicionarLivros(0, livroUm);
		colecaoLivros.adicionarLivros(1, livroDois);
		//informa ao usuário as informações inseridas
		JOptionPane.showMessageDialog(null, "Confira os livros registrados!");

		JOptionPane.showMessageDialog(null, "        PRIMEIRO LIVRO" + "\n Título: " + livroUm.getTitulo() + "\n Autor: "
				+ livroUm.getAutor() + "\n Categoria: " + livroUm.getCategoria());

		JOptionPane.showMessageDialog(null, "        SEGUNDO LIVRO" + "\n Título: " + livroDois.getTitulo() + "\n Autor: "
				+ livroDois.getAutor() + "\n Categoria: " + livroDois.getCategoria());
	}
}
