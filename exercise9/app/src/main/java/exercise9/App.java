package exercise9;

import java.util.Scanner;

public class App {
//Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um
//mês.Considere fixo o juro da poupança em 0,07% a. m;
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Insira o valor depositado: ");
        float cash = reader.nextFloat();
        
        System.out.println("Quantos meses seu dinheiro ficou rendendo? ");
        int months = reader.nextInt();
        
        for(int i = 0; i < months; i += 1) {
            cash += cash * 0.07f;
        }
        
        System.out.printf("Você tem agora: R$ %.2f", cash);
    }
}
