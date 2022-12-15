package application;

import entities.Product;

import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> products;
        ReadFile file = new ReadFile("data.csv");
        file.readFile();
        products = file.getProducts();
        WriteFile newFile = new WriteFile(products);
        newFile.writeFile();

    }
}