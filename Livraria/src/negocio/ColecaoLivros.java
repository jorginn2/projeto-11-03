package negocio;

/**
 * @author JORGE-PC
 * Classe de criação do vetor 
 */
import java.util.ArrayList;
import java.util.Arrays;

import modelagem.Livro;

public class ColecaoLivros {

	public Livro[] listaLivros = new Livro[2];

	public void adicionarLivros(int posicao, Livro livro) {
		listaLivros[posicao] = livro;
	}

}
