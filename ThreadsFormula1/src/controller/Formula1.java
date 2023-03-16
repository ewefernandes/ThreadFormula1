package controller;

import java.util.Random;

public class Formula1 extends Thread {
	
	Random r = new Random();
	private static int posicao;
	private int idCarro;
	
	public Formula1(int idCarro) {
		this.idCarro = idCarro;
	}

	public void run() {
		CorrerVoltas();
	}
	
	private void CorrerVoltas() {
		int distanciaVolta = 150; //Cada volta tem 150m.
		int deslocamento = r.nextInt(41);
		int tempo = 1000;
		int distPercorrida = 0;
		
		for (int volta = 0; volta < 3; volta ++) {
			while (distPercorrida < distanciaVolta) {
				distPercorrida += deslocamento;
				try {
					sleep(tempo);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("O carro #" +idCarro+ " completou a volta " +(volta+1));
		}
		
		posicao++;
		System.out.println("O carro #" +idCarro+ " chegou em " +posicao+ "o. lugar!");
	}
	
}
