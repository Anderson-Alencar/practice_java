package exercise5;

import java.util.Scanner;

public class App {
//Escreva um algoritmo que leia o nome de um aluno e as notas das três provas 
//que ele obteve no semestre. No final informar o nome do aluno e a sua 
//média (aritmética);
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Nome do aluno: ");
        String name = reader.next();
        System.out.println("Nota 1: ");
        float gradeOne = reader.nextFloat();
        System.out.println("Nota 2: ");
        float gradeTwo = reader.nextFloat();
        System.out.println("Nome 3: ");
        float gradeThree = reader.nextFloat();
        
        float average = (gradeOne + gradeTwo + gradeThree) / 3;
        
        System.out.println("A média do(a) aluno(a) " + name + " é: " + average);
        
    }
}
