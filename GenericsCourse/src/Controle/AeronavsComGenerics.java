package Controle;

import java.util.ArrayList;
import java.util.List;

public class AeronavsComGenerics<T> {
	
	private List<T> listaAeronaves = new ArrayList<>();
	
	public void addVoo(T numeroVoo) {
		listaAeronaves.add(numeroVoo);
	}
	
	public T primeiroVoo() {
		if(listaAeronaves.isEmpty()) {
			throw new IllegalStateException("Não há voos!");
		}
		return listaAeronaves.get(0);
	}
	public void listaVoos() {
		System.out.print("[");
		if(!listaAeronaves.isEmpty()) {
			System.out.print(listaAeronaves.get(0));
		}
		for (int i = 1; i < listaAeronaves.size(); i++) {
			System.out.print(" "+ listaAeronaves.get(i));
		}
		System.out.print("]");
	}

}
