package live.faciliti.jogodavelha.ui;

import br.com.softblue.commons.io.Console;

public class UI {
	
	public static void printText(String text){
		System.out.println(text);
	}
	
	public static void printTextNoNewLine(String text) {
		System.out.print(text);
	}
	
	public static void printNewline() {
		System.out.println();
	}
	
	public static void printGameTitle() {
		printText("================================");
		printText("        Jogo da Velha           ");
		printText("================================");
		printNewline();
	}
	
	public static String readInput(String text) {
		printTextNoNewLine(text + " ");
		return Console.readString();
	}
}
