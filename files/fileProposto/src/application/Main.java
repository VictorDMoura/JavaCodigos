package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String strPath = "data.csv";

        try(BufferedReader bf = new BufferedReader(new FileReader(strPath))){

            String line = bf.readLine();
            while (line != null){
                System.out.println(line);
                line = bf.readLine();
            }

        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }


    }
}