package Embarque;

import java.util.Scanner;

import Controle.Aeronaves;
import Controle.AeronavsComGenerics;

public class PrincipalComGenerics {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AeronavsComGenerics<String> air = new AeronavsComGenerics<>();
		System.out.println("Informe a quantidade de aeronaves");
		int nrAeronaves = sc.nextInt();
		System.out.println("Informe o identificador dos voos");
		for (int i = 0; i < nrAeronaves; i++) {
			String nrVoo = sc.next();
			air.addVoo(nrVoo);
		}
		air.primeiroVoo();
		String x = (String) air.primeiroVoo();
		System.out.println("O primeiro a decolar é o voo: " + x);
		air.listaVoos();
		sc.close();
		
	}
}
