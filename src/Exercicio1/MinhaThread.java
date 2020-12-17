package Exercicio1;

public class MinhaThread extends Thread {

	private String nome;
	private int tempo;

	public MinhaThread(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		start();
	}

	public void run() {

		try {
			for (int i = 0; i <= 3; i++) {
				System.out.println("Executando a thread" + nome + ":" + i);
				Thread.sleep(tempo);// Fazer a thread dormir por n segundos estipulado na variavel tempo
			}

		} catch (Exception e) {
		}

		   
		System.out.println("Encerrada a execução da " + nome);
	}
	
	

}
