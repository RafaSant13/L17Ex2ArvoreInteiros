package view;

import br.edu.fateczl.arvore.inteiro.ArvoreInt;

public class Principal {

	public static void main(String[] args) {
		ArvoreInt a = new ArvoreInt();
		int [] vetor = {33, 15, 41, 38, 47, 34, 49, 43};
		for (int i: vetor) {
			a.insert(i);
		}
		try {
			a.prefixSearch();
			a.infixSearch();
			a.postfixSearch();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
