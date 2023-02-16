package exercise20;

import java.util.Scanner;

public class App {
//A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos 
//com desconto. Faça um algoritmo que calcule e exiba o valor do desconto e o 
//valor a ser pago pelo cliente de vários carros. O desconto deverá ser calculado 
//de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O sistema 
//deverá perguntar se deseja continuar calculando desconto até que a resposta 
//seja: “(N) Não”. Informar total de carros com ano até 2000 e total geral;

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        float off;
        char repeat = 's';
        int carsBy2000 = 0;
        int allCars = 0;

        while (repeat == 's' || repeat == 'S') {
            System.out.println("Informe o nome do carro: ");
            String car = reader.next();
            System.out.println("Informe o preço do carro: ");
            float cost = reader.nextFloat();
            System.out.println("Informe o ano do carro: ");
            int year = reader.nextInt();

            if (year <= 2000) {
                off = cost * 0.12f;
                System.out.println("O desconto do " + car + " é de " + off + " (12%)");
                carsBy2000 += 1;
            } else {
                off = cost * 0.07f;
                System.out.println("O desconto do " + car + " é de " + off + " (7%)");
            }
            
            System.out.println("O valor a ser pago é " + (cost - off));
            
            allCars += 1;
            
            System.out.println("Deseja continuar? (S) Sim - (N) Não");
            repeat = reader.next().charAt(0);
        }
        
        System.out.println("Total de carros com ano até 2000: " + carsBy2000);
        System.out.println("Total de carros geral: " + allCars);

    }
}
