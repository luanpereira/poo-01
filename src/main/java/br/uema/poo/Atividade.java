package br.uema.poo;

import java.io.IOException;w

public class Atividade {

    public static void main(String[] args){

        int op = 99;

        try {

            while (op > 0) {
                System.out.println("Entre com uma das opções abaixo:\n");
                System.out.println(" 1 - Produto de dois números");
                System.out.println(" 2 - Média de três números");
                System.out.println(" 3 - Cálculo das raízes de uma eq do 2º grau com três coeficientes");
                System.out.println(" 4 - Diferença entre dois números");
                System.out.println(" 5 - Determinar o maior e o menor número entre três inteiros");
                System.out.println(" 6 - Calcula a distância entre dois pontos, A(X,Y) e B(X,Y)");
                System.out.println(" 7 - Academia de Ginástica, cadastro e cáculo do IMC");
                System.out.println(" 8 - Idade de uma pessoa para votar e habilitação para dirigir");
                System.out.println(" 9 - Cálculo a pagar de um produto conforme condição de pagamento");
                System.out.println(" 0 - Encerrar programa");

                System.out.print("\nEscolha: ");

                op = System.in.read();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}