package exercise11;

import java.util.Scanner;

public class App {
//Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o
//preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário;
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Informe o preço de custo do produto: ");
        float costPrice = reader.nextFloat();
        
        System.out.println("Informe o percentual do lucro desejado: ");
        float inc = reader.nextFloat() / 100;
        
        float finalPrice = costPrice + (costPrice * inc);
        
        System.out.printf("O valor de venda desse produto é R$ %.2f", finalPrice);
    }
    
}
