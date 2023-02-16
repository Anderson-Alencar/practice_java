package exercise7;

import java.util.Scanner;

public class App {
//Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. Afórmula de
//conversão é:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura emCelsius;
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Informe a temperatura atual (em graus Celsius): ");
        float c = reader.nextFloat();
        
        float f = (9.0f * c + 160.0f) / 5.0f;
        
        System.out.println("A temperatura em Fahrenheit é: " + f + " F°");
    }
}
