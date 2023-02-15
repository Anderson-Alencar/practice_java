package exercise3;

import java.util.Scanner;

public class App {
//    Escreva um algoritmo para determinar o consumo médio de um automóvel sendo
//fornecida a distância total percorrida pelo automóvel e o total de combustível 
//gasto;

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println(
                "Informe a distância total percorrida pelo automóvel (km): "
        );
        float distance = reader.nextFloat();
        System.out.println("Informe o total de combustível gasto (litros): ");
        float fuel = reader.nextFloat();
        
        float cost = distance / fuel;
        
        System.out.println("O consumo médio desse automóvel é: " + cost + " km/l");
    }
}
