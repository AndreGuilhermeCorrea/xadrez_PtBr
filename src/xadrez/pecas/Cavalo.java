package xadrez.pecas;

import tabuleiroJogo.Posicao;
import tabuleiroJogo.Tabuleiro;
import xadrez.Cor;
import xadrez.PecaXadrez;

//pecas do xadrez no sub-pacote (apenas para Oganiza�ao das classes)

public class Cavalo extends PecaXadrez {

	// construtor para repassar a chamada para superclasse
	public Cavalo(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	
	}

	// toString da classe
	// coversao da torre para string
	@Override
	public String toString() {
		return "C";// essa letra entrar� na impressao do tabuleiro, ou seja no local da pe�a
					// aparecer� a letra
	}

	// m�todo auxiliar para implementacao dos possiveis movimentos do Cavalo
	private boolean podeMover(Posicao posicao) {
		PecaXadrez p = (PecaXadrez) getTabuleiro().peca(posicao);
		// verificar se a peca p que esta na posicao � nula ou se � adversaria
		return p == null || p.getCor() != getCor();

	}

	@Override
	public boolean[][] movimentosPossiveis() {
		// matriz de boolean na mesma dimens�o do tabuleiro
		boolean[][] mat = new boolean[getTabuleiro().getLinhas()][getTabuleiro().getColunas()];
		// movimentos possiveis
		Posicao p = new Posicao(0, 0);

		// teste para cada uma das posicoes possiveis em que pode-se mover o cavalo
		p.setValores(posicao.getLinha() - 1, posicao.getColuna() -2);
		if (getTabuleiro().posicaoExistente(p) && podeMover(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}

		p.setValores(posicao.getLinha() -2, posicao.getColuna() - 1);
		if (getTabuleiro().posicaoExistente(p) && podeMover(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}

		p.setValores(posicao.getLinha() -2, posicao.getColuna() + 1);
		if (getTabuleiro().posicaoExistente(p) && podeMover(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}

		p.setValores(posicao.getLinha() - 1, posicao.getColuna() +2);
		if (getTabuleiro().posicaoExistente(p) && podeMover(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}

		p.setValores(posicao.getLinha() + 1, posicao.getColuna() +2);
		if (getTabuleiro().posicaoExistente(p) && podeMover(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}

		p.setValores(posicao.getLinha() +2, posicao.getColuna() + 1);
		if (getTabuleiro().posicaoExistente(p) && podeMover(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}

		p.setValores(posicao.getLinha() + 2, posicao.getColuna() - 1);
		if (getTabuleiro().posicaoExistente(p) && podeMover(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}

		p.setValores(posicao.getLinha() + 1, posicao.getColuna() - 2);
		if (getTabuleiro().posicaoExistente(p) && podeMover(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}

		return mat;
	}
}