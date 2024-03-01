package Declaracoes;

public class Declaracoes {

	public static void main (String[] args) {
		int[] numeros = new int[4];
		
		int[] numeros2;
			numeros2 = new int[10];
			
		int[] numeros3 = new int [44], numeros4 = new int[23];
		
		int[] meuArray;	
			meuArray = new int[10];
			
		int[] iniciaValores = {12,32,54,6,8,89,64,64,6};
		
		int[] meuArray2;
			meuArray2= new int [10];
				meuArray2 [0]= 100;
				meuArray2 [1]= 85;
				meuArray2 [2]= 88;
				meuArray2 [3]= 93;
				meuArray2 [4]= 123;
				meuArray2 [5]= 952;
				meuArray2 [6]= 344;
				meuArray2 [7]= 233;
				meuArray2 [8]= 622;
				meuArray2 [9]= 8522;
				//meuArray2 [10]= 564; //estoura a pilha
				
		System.out.println(meuArray2[9]); //esperado valor 8522
		System.out.println(meuArray2[2]); //esperado valor 85
		}
}
