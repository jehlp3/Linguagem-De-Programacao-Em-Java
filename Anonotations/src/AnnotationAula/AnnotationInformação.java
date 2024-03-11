package AnnotationAula;

class DeprecatedTeste {
	void visualizar() {
		System.out.println("Método visualização");
	}
	/*
	 * @deprecated replaced by display  = Fora de uso
	 */
	
	@Deprecated
	void exibir() {
		System.out.println("Mostrando que o método exibir é deprecated");
	}
}
