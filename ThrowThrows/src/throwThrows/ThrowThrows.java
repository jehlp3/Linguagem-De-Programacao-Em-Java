package throwThrows;


public class ThrowThrows {

	private static void aumentarLetras() throws NullPointerException {
		//String frase = "Você terá muito sucesso em sua carreira!!!!";
		String frase = null;
		
		String novaFrase = null;
		novaFrase = frase.toUpperCase();
		System.out.println("Frase antiga: "+frase);
		System.out.println("Frase nova: "+novaFrase);

	}
	public static void main (String args[]) {
		try {
			aumentarLetras();
		}catch(NullPointerException e) {
			System.out.println("Ocorreu um NullPointerException ao executar método aumentarLetras()");
		}
	}

}
