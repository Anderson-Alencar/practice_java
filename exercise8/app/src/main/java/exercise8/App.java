package exercise8;

import java.util.Scanner;

public class App {
//Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valorlido em
//dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também aquantidade de dólares
//disponíveis com ousuário;
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Cotação atual do dólar: ");
        float price = reader.nextFloat();
        System.out.println("Quantidade de dólares do usuário: ");
        float dollars = reader.nextFloat();
        
        float reais = dollars * price;
        
        System.out.printf("Você tem R$ %.2f", reais);
    }
}
