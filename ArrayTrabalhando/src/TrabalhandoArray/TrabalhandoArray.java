package TrabalhandoArray;

import javax.swing.JOptionPane;

public class TrabalhandoArray {
	
	public static void main (String[]args) {
	
	String [] paises = new String[5];
	
	paises [0]="Brasil";
	paises [1]="Alemanha";
	paises [2]="Itália";
	paises [3]="Áustria";
	paises [4]="Polônia";
	
	for (String lista: paises) {
		System.out.println(lista);
	}	
	
	int [] numeros = new int [10];
	
	for (int i = 0; i < numeros.length; i++) {
		numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));
	}
	
	System.out.println("Após a entrada de dados: ");
	for (int listaNumeros : numeros) {
		System.out.println(listaNumeros + " ");
	}
	
	numeros[8] = numeros[7]+4;
	System.out.println("\nApós a alteração do valor da posição 8");
	
	for (int listaNumeros: numeros) {
		System.out.println(listaNumeros + " ");
	}
}
