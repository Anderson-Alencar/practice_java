package exercise1;

import java.util.Scanner;

public class App {
//  Faça um algoritmo que receba dois números e exiba o resultado da sua soma;

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int firstNumber = reader.nextInt();
        System.out.println("Digite o segundo número: ");
        int secondNumber = reader.nextInt();

        System.out.println(
                "A soma desses dois números é: "
                + (firstNumber + secondNumber)
        );
    }
}
