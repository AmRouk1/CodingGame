package pt.henriques.labyrinthe;

import java.util.Scanner;

public class Player {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int R = in.nextInt(); // number of rows.
		int C = in.nextInt(); // number of columns.
		int A = in.nextInt(); // number of rounds between the time the alarm
								// countdown is activated and the time the alarm
								// goes off.

		// game loop
		while (true) {
			int KR = in.nextInt(); // row where Kirk is located.
			int KC = in.nextInt(); // column where Kirk is located.
			for (int i = 0; i < R; i++) {
				String ROW = in.next(); // C of the characters in '#.TC?' (i.e.
										// one line of the ASCII maze).
			}

			// Write an action using System.out.println()
			// To debug: System.err.println("Debug messages...");

			System.out.println("RIGHT"); // Kirk's next move (UP DOWN LEFT or
											// RIGHT).
		}
	}
}