package Construtores;

/*AQUI!
 * CONSTRUTOR - Serve para passar parâmetros.
 * ENUM - P q criar em uma tabela 3 dados, por ex.
 * 		O Enum serve para isso */

import Construtores.Aluno.MATRICULA;
import Construtores.Aluno.STATUS;


public class Construtor {

	public static void main(String[] args) {
		// passando os dados atrav�s do construtor com sobrecarga
		Aluno alu = new Aluno( 8,  8,  8);
		// calculando a m�dia
		double mediaAlunoFinal = alu.calcularMediaAluno();
		
		// definindo situa��o do aluno
		if (mediaAlunoFinal < 6 ) {
			alu.situacaoAluno = STATUS.REPROVADO;
		} else {
			alu.situacaoAluno = STATUS.APROVADO;
		}
		
		// imprimindo situa��o do aluno
		System.out.println("A média do aluno é : " + alu.calcularMediaAluno() + " e o aluno está " + alu.situacaoAluno);
		
		//usa enum MATRICULA
		alu.situacaoMatricula=MATRICULA.MATRICULADO;
		System.out.println("O aluno está: "+ alu.situacaoMatricula);
	}
}