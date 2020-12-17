package CriacaoEControle;

public class Main {

	public static void main(String[] args) {
		
		RunnableHelloWorld paralelo = new RunnableHelloWorld();
		Thread t1 = new Thread (paralelo);	
		t1.start();
		
		System.out.println("Hello World!" + Thread.currentThread().getName());

	}

}
