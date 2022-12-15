package application;

import entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    String strPath;

    List<Product> products = new ArrayList<>();

    public ReadFile() {
    }

    public ReadFile(String srtPath) {
        this.strPath = srtPath;
    }

    public void readFile(){
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

        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public List<Product> getProducts() {
        return products;
    }
}
