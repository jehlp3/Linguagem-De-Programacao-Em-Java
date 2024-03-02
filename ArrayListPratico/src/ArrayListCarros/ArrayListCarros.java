//Arrays são limitados, vc não consegue acrescentar novos valores, ao contrário do Arraylist.

package ArrayListCarros;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayListCarros {
	public static void main (String[] args) {
		
		ArrayList<String>  carros = new ArrayList<>();  //inicia instanciando
		//Estrutura diamante <>
		
		//ADIÇÕES
		carros.add("FLUENCE");
		carros.add("KOMBI");
		carros.add("JAGUAR");
		carros.add("BMW");
		carros.add("MERCEDES");
		carros.add("FUSCA");
		carros.add("VECTRA");
		System.out.println(carros);
		
		//SUBSTITUIÇÕES
		carros.set(4, "MITSUBISHI");
		System.out.println(carros);
		
		//REMOÇÕES
		carros.remove("VECTRA");  //mesmo sem a posição! com base no conteúdo
		System.out.println(carros);
		
		//ADIÇÕES PELO USUÁRIO
        carros.add(JOptionPane.showInputDialog("Informe a marca do carro"));
		System.out.println(carros);
	
		/*
		//LIMPANDO O ARRAYLIST
		carros.clear();
		System.out.println(carros);
		
		if (carros.isEmpty()) {
			System.out.println("O vetor está vazio! O estagiário fez o que não devia! ôO ");	
		}
		*/
		System.out.println(carros.size());
		boolean achei = false;
		if (carros.contains("BMW")) {
			for (int i = 0; i < carros.size(); i++) {
				if ("BMW".equals(carros.get(i))) {
					carros.set(i, "BUGATTI");
					achei = true;
					break;
				}
			}
		}
		if (!achei) {
		System.out.println("O parâmetro não foi encontrado");
		}else {
			System.out.println("O parâmetro foi encontrado na posição " + carros.indexOf("BUGATTI"));
		}
		System.out.println(carros);
	}
}
