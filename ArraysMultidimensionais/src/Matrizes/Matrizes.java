package Matrizes;

import java.util.Scanner;

public class Matrizes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] alunos = {"JOAO", "JOSE", "MARIA"};
        float[][] notas = new float[3][4];
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Aluno: " + alunos[i]);
            float somaNotas = 0;

            for (int j = 0; j < 4; j++) {
                System.out.print("Informe a nota nº " + (j + 1) + " do aluno " + alunos[i] + ": ");
                notas[i][j] = scanner.nextFloat();
                somaNotas += notas[i][j];
            }

            float mediaAluno = somaNotas / 4;
            String statusAluno;
            if (mediaAluno < 5.5) {
                statusAluno = "REPROVADO";
            } else if (mediaAluno < 7.5) {
                statusAluno = "EM RECUPERAÇÃO";
            } else {
                statusAluno = "APROVADO";
            }

            System.out.println("\n************ BOLETIM *************");
            System.out.println("Aluno.: " + alunos[i]);
            System.out.println("Notas");
            for (int j1 = 0; j1 < 4; j1++) {
                System.out.println((j1 + 1) + " - " + notas[i][j1]);
            }
            System.out.println("Média ..: " + mediaAluno + " - " + statusAluno);
        }
        scanner.close();
    }
}
