package live.faciliti.jogodavelha.core;

import live.faciliti.jogodavelha.Constantes;
import live.faciliti.jogodavelha.ui.UI;

public class Board {

	char[][] matrix;

	public Board() {
		matrix = new char[Constantes.BOARD_SIZE][Constantes.BOARD_SIZE];
		clear();
	}

	void clear() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = ' ';
			}
		}
	}

	public void print() {

		UI.printNewline();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				UI.printTextNoNewLine(String.valueOf(matrix[i][j]));
				if (j < matrix[i].length - 1) {
					UI.printTextNoNewLine(" | ");
				}

			}

			UI.printNewline();

			if (i < matrix.length - 1) {
				UI.printText("---------");
			}

		}
	}

	public boolean isfull() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j] == ' ') {
					return false;
				}
			}
		}
		return true;
	}

	public void play(Player player, Move move) {
		
		int i = move.i;
		int j = move.j;
		
		matrix[i][j] = player.symbol;

	}

}
