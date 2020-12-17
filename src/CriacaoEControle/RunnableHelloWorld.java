package criacaoEControle;

public class RunnableHelloWorld implements Runnable {

	public void run() {

		try {

			Thread.sleep(5000);

		} catch (Exception e) {
		}
		System.out.println("Hello World Paralelo " + Thread.currentThread().getName());
	}
}
