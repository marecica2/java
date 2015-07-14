package threads;

public class ThreadInstance implements Runnable {

	@Override
	public void run() {
		System.err.println("test");
	}

	public static void main(String... args) {
		ThreadInstance t = new ThreadInstance();
		Thread tt = new Thread(t);
		tt.start();

		String[] importantInfo = new String[100];
		for (int i = 0; i < importantInfo.length; i++) {
			// Pause for 4 seconds
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// We've been interrupted: no more messages.
				return;
			}
			// Print a message
			System.out.println(importantInfo[i]);
		}
	}

}
