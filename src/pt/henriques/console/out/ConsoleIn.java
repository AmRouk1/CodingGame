package pt.henriques.console.out;

import java.util.Scanner;

public class ConsoleIn {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			ecritureDeLaSortie(in.next());
		}
	}
	
	private static void ecritureDeLaSortie(String str) {
		System.out.println("Lecture de : " + str);
	}
}
