package view;

//import java.util.concurrent.Semaphore;

import controller.Formula1;

public class Main {

	public static void main(String[] args) {
		//int permissoes = 5;
		//Semaphore s = new Semaphore(permissoes);
		
		for (int idCarro = 0; idCarro < 5; idCarro++) {
			Thread formula = new Formula1(idCarro);
			formula.start();
		}
	}

}
