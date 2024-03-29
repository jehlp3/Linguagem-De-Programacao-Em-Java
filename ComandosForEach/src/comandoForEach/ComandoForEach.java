package comandoForEach;

public class ComandoForEach {

	public static void main(String[] args) {
		// criação de um vetor, carregá-lo  já inicializado e em seguida
		//ler os elementos do vetor usando um For Each
		
		int[] vetorNumeros = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Varrendo o vetor utilizando a estrutura For ");
		for (int i=0; i < vetorNumeros.length; i++) {
			System.out.println("Nr: "+vetorNumeros[i]);
		}
	
		System.out.println("Varrendo o vetor utilizando a estrutura For Each");
		for (int listaNumeros : vetorNumeros) {
			System.out.println("Nr: "+listaNumeros);
		}

}
}