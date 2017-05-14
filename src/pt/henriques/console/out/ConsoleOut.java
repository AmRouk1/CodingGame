package pt.henriques.console.out;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ConsoleOut {
	
	public static void main(String[] args) {
		try {
			new OutputStreamWriter(System.out).write("toto");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
