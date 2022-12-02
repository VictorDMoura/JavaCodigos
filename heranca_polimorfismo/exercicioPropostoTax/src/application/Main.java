package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for(int i = 0; i<n; i++){
            System.out.println("Tax payer #"+(i+1)+" data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Annual income: ");
            double annualIncome = sc.nextDouble();
            if(ch == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpenditure = sc.nextDouble();
                list.add(new Individual(name, annualIncome, healthExpenditure));
            } else if (ch == 'c'){
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                list.add(new Company(name, annualIncome, numberOfEmployees));
            }

        }

        System.out.println();

        System.out.println("TAXES PAID:");

        double sum = 0;
        for(TaxPayer taxPayer: list){
            System.out.println(taxPayer);
            sum += taxPayer.tax();
        }
        System.out.printf("TOTAL TAXES: $ %.2f", sum);

    }
}