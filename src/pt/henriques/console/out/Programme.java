package pt.henriques.console.out;

public class Programme {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread Run");
				ConsoleIn.main(args);
			}
		});
		thread.start();
		ConsoleOut.main(args);
	}

}
