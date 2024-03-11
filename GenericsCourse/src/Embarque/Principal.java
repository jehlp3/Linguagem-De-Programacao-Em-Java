package Embarque;

import java.util.Scanner;

import Controle.Aeronaves;

/*Informar a quantidade de aeronaves no pátio, o nr dos voos por ordem de chegada
 * FIFO para a decolagem
 * Mostrar qual o primeiro voo a decolar*/


public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Aeronaves air = new Aeronaves();
		System.out.println("Informe a quantidade de aeronaves");
		int nrAeronaves = sc.nextInt();
		
		System.out.println("Informe o identificador dos voos");
		for (int i = 0; i < nrAeronaves; i++) {
			int nrVoo = sc.nextInt();
			air.addVoo(nrVoo);
		}
		System.out.println("O primeiro a decolar vai ser o nr: "+air.primeiroVoo());
		air.listaVoos();
		sc.close();
	}
}
