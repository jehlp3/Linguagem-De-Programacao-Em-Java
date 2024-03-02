package TrabalhandoArray;

import javax.swing.JOptionPane;

public class TrabalhandoArray {
	public static void main (String[] args) {
		int[] numeros = new int[10];
		
		String [] paises = new String[4];
		
		/*
		for (int i = 0; i < 4; i++) {
			paises[i] = JOptionPane.showInputDialog("Informe um país: ");
			//variavel i ficou dentro do escopo, e foi finalizada 
		}
		for (String listaPaises:paises) {
			System.out.println(listaPaises);
		}*/
		
		for (int i = 0; i < 10; i++) {
			numeros[i] = Integer.parseInt( JOptionPane.showInputDialog("informe um número: "));
		}
		for (Integer listaNumeros : numeros) {
			System.out.println(listaNumeros);
		}
		int novoValor = 11;
		numeros[8] = novoValor+4;
		for (Integer listaNumeros : numeros) {
			System.out.println(listaNumeros);
		}
		
	} 
	

}