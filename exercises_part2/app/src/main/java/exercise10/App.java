package exercise10;

import java.util.Scanner;

public class App {
//A Loja Mamão com Açúcar está vendendo seus produtos em5(cinco)prestações sem juros. Faça um
//algoritmo que receba um valor de uma compra e mostre o valor das prestações
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Digite o valor total da sua compra: ");
        float price = reader.nextFloat();
        
        float parcel = price / 5.0f;
        
        System.out.printf("O produto pode ser pago em até 5 x R$ %.2f sem juros", parcel);
    }
}
