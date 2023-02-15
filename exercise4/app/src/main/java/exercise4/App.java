package exercise4;

import java.util.Scanner;

public class App {
//Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o 
//total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este 
//vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu 
//nome, o salário fixo e salário no final do mês;

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Informe o nome do vendedor");
        String name = reader.next();
        System.out.println("Informe o salário fixo do vendedor");
        float salary = reader.nextFloat();
        System.out.println("Qual o total de vendas efetuadas por esse vendedor?");
        float totalSales = reader.nextFloat();

        float commission = totalSales * 0.15f;

        System.out.println(
                "INFORMAÇÕES DO VENDEDOR \n"
                + "NOME: " + name + "\n"
                + "SALÁRIO FIXO: " + salary + "\n"
                + "SALÁRIO FINAL: " + (salary + commission)
        );
    }
}
