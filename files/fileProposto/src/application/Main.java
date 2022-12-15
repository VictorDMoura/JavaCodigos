package application;

import entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String strPath = "data.csv";

        List<Product> products = new ArrayList<>();

        try(BufferedReader bf = new BufferedReader(new FileReader(strPath))){

            String completeLine = bf.readLine();
            String[] line = completeLine.split(",");
            while (completeLine != null){
                products.add(new Product(line[0], Double.valueOf(line[1]), Integer.valueOf(line[2])));
                completeLine = bf.readLine();
                if(completeLine != null){
                    line = completeLine.split(",");
                }
            }
            
            System.out.println("List of products");
            for(Product product: products){
                System.out.println(product);
            }

        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }


    }
}