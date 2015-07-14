package classes;

public class CallbackTest {

	private interface Callback {
		public void run(Object ctx);
	}

	public void execute(Callback clbck) {
		System.err.println("executing");
		String ctx = "ctx";
		clbck.run(ctx);
	}

	public static void main(String... args) {
		CallbackTest test = new CallbackTest();

		test.execute(new Callback() {
			@Override
			public void run(Object ctx) {
				System.err.println("c");
				System.err.println(ctx);
			}
		});

		int x = 0;
		test.execute((Object ctx) -> {
			System.err.println("d");
			System.err.println(ctx);
			System.err.println(x);
		});
	}
}
