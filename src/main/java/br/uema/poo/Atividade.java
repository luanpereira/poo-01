package br.uema.poo;

import java.io.IOException;
import java.util.Scanner;

public class Atividade {
    private static Scanner scanner = new Scanner(System.in);

    public void Iniciar(){
        double a, b, c, result;

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

                op = Integer.parseInt(scanner.nextLine());

                switch (op){
                    case 1 :
                        System.out.print("\nEntre com o primeiro número: ");
                        a = Double.parseDouble(scanner.nextLine());

                        System.out.print("\nEntre com o segundo número: ");
                        b = Double.parseDouble(scanner.nextLine());

                        result = new Produto(a, b).calcular();
                        System.out.printf("Resultado: %f \n\n", result);
                        break;

                    case 2 :
                        System.out.print("\nEntre com o primeiro número: ");
                        a = Double.parseDouble(scanner.nextLine());

                        System.out.print("\nEntre com o segundo número: ");
                        b = Double.parseDouble(scanner.nextLine());

                        System.out.print("\nEntre com o terceiro número: ");
                        c = Double.parseDouble(scanner.nextLine());

                        result = new Media(a, b, c).calcular();
                        System.out.printf("Resultado: %f \n\n", result);
                        break;
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}