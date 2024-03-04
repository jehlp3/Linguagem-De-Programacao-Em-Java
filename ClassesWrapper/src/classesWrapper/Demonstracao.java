package classesWrapper;

public class Demonstracao {

	//Um tipo primitivo não tem como transformar em um objeto, a não ser utilizando as classes Wrapper.
	//Converte dados
	//Exemplos primitivo Number = byteValue(), shortValue()
	//Ex String = parse
	//Consomem pouca memória!!
	//Eficientes em laços e expressões
	
	
	public static void main (String[] args) {
		Boolean bolWrapped = true;
		System.out.println(bolWrapped.getClass());
		
		Character chWrapped = 'a';
		System.out.println(chWrapped.getClass());
		
		Byte byteWrapped = 1;
		System.out.println(byteWrapped.getClass());
		
		Short shoWrapped = 'B';
		System.out.println(shoWrapped.getClass());
		
		Integer intWrapped = 5215;
		System.out.println(intWrapped.getClass());
		
		Long longWrapped = 14585645666L;
		System.out.println(longWrapped.getClass());
		
		Double doubWrapped = 3.14159;
		System.out.println(doubWrapped.getClass());
		
		//int numero = "1"; Você não consegue
		int numero = Integer.parseInt("1");
		numero = numero + 1;
		System.out.println(numero); //eu tinha uma String e consegui fazer uma soma com ela
	}
}
