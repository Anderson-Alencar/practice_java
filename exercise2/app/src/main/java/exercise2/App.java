package exercise2;

import java.util.Scanner;

public class App {
//  Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão
//dos dois números lidos;

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        float firstNumber = reader.nextFloat();
        System.out.println("Digite o segundo número: ");
        float secondNumber = reader.nextFloat();

        System.out.println("SOMA: " + (firstNumber + secondNumber));
        System.out.println("SUBTRAÇÃO: " + (firstNumber - secondNumber));
        System.out.println("MULTIPLICAÇÃO: " + (firstNumber * secondNumber));
        System.out.println("DIVISÃO: " + (firstNumber / secondNumber));
    }
}
