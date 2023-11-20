package application;

import entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos funcionários vão ser registrados?");
        int n = sc.nextInt();

        Funcionario funcionario;
        List<Funcionario> func = new ArrayList<>();

        for (int i = 0; i < n; i++){
            System.out.println();
            System.out.println("Funcionário: #" + i + ":");

            System.out.print("Id: ");
            int id = sc.nextInt();

            sc.nextLine();
            System.out.print("NOME: ");
            String nome = sc.nextLine();

            System.out.print("SALÁRIO: ");
            double salario = sc.nextDouble();

            funcionario = new Funcionario(id, nome, salario);
            func.add(funcionario);

            System.out.println();
        }

        System.out.println();
        for(Funcionario item : func){
            System.out.println(item);
        }

        System.out.println("----------------------------------");

        System.out.print("\nEntre com o ID do funcionário que você quer aumentar o salário: ");
        int aumentaSalarioId = sc.nextInt();

        Funcionario employee = func.stream().filter(x->x.getId() == aumentaSalarioId).findFirst().orElse(null);
        if (employee == null){
            System.out.println("O funcionário não existe");
        } else {
            System.out.print("Entre com a porcentagem: ");
            double percentage = sc.nextDouble();
            employee.aumentaSalario(percentage);
        }

        System.out.println("\nLista de funcionários");
        for(Funcionario item : func){
          System.out.println(item + "\n");
        }

        System.out.println();

        sc.close();
    }
}