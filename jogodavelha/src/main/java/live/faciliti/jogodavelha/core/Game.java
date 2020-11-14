package live.faciliti.jogodavelha.core;

import live.faciliti.jogodavelha.Constantes;
import live.faciliti.jogodavelha.ui.UI;

public class Game {
	
	Board board = new Board();
	Player [] players = new Player[Constantes.SYMBOL_PLAYER.length];
	
	
	public void play() {
		UI.printGameTitle();
		//board.clear();
		board.print();
		//UI.readInput("Nome do jogador: ");
	}

}
