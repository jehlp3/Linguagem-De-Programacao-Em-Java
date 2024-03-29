package Controle;

import java.util.ArrayList;
import java.util.List;

public class Aeronaves {
	
	private List<Integer> listaAeronaves = new ArrayList<Integer>();
	
	public void addVoo(Integer numeroVoo) {
		listaAeronaves.add(numeroVoo);
	}
	
	public Integer primeiroVoo() {
		if (listaAeronaves.isEmpty()) {	
		}
	return listaAeronaves.get(0);
	}
	
	public void listaVoos() {
		System.out.print("[");
		if (!listaAeronaves.isEmpty()) {
			System.out.print(listaAeronaves.get(0));
		}
		for (int i = 1; i < listaAeronaves.size(); i++) {
			System.out.print(" "+ listaAeronaves.get(i));
		}
	System.out.print("]");
	}
}