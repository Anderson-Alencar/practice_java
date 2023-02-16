package exercise6;

import java.util.Scanner;

public class App {
//Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variávelApasse a
//possuir ovalor da variável B e a variável B passe a possuir o valor da variável A.Apresentar osvalores
//trocados;
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Insira o valor de A:");
        int a = reader.nextInt();
        System.out.println("Insira o valor de B:");
        int b = reader.nextInt();
        
        int c;
        
        System.out.println("Deseja inverter o valor das variáveis? (S) Sim | (N) Não");
        char decision = reader.next().charAt(0);
        
        if (decision == 'S' || decision == 's') {
             c = b;
             b = a;
             a = c;
             System.out.println("Os valores foram TROCADOS!");
        } else {
            System.out.println("Os valores foram MANTIDOS!");
        }
        
        System.out.println("A: " + a + " | B: " + b );
    }
}
