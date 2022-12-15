package application;

import entities.Product;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteFile {

    List<Product> products = new ArrayList<>();

    public WriteFile(List<Product> products) {
        this.products = products;
        boolean success = new File("outcome").mkdir();

    }

    public WriteFile() {
    }

    public void writeFile(){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("outcome/summary.csv"))){

            for(Product product: products) {
                bw.write(product.toString());
                bw.newLine();
            }
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());

            }
    }
}
