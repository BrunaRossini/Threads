package CriacaoEControle;

public class RunnableHelloWorld implements Runnable {
	
	public void run() {
		System.out.println("Hello World paralelo" + Thread.currentThread().getName()								);
	}

	
}
