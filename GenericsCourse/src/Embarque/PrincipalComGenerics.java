package Embarque;

import java.util.Scanner;

import Controle.Aeronaves;
import Controle.AeronavsComGenerics;

public class PrincipalComGenerics {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AeronavsComGenerics<Integer> air = new AeronavsComGenerics<>();
		System.out.println("Informe o nr de aeronaves");
		int nrAeronaves = sc.nextInt();
		
		for (int i = 0; i < nrAeronaves; i++) {
			Integer nrVoo = sc.nextInt();
			air.addVoo(nrVoo);
		}
		air.primeiroVoo();
		Integer x = (Integer) air.primeiroVoo();
		System.out.println("O primeiro a decolar é o voo: " + x);
		sc.close();
		
	}
}
