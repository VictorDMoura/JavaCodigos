import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        method1();

        System.out.println("End of program");
    }

     public static void method1(){
         System.out.println("***START METHOD 1***");
         method2();
         System.out.println("***END METHOD 2***");

     }
     public static void method2(){
         System.out.println("***START METHOD 2***");
         Scanner sc = new Scanner(System.in);

         try {
             String[] vect = sc.nextLine().split(" ");
             int position = sc.nextInt();
             System.out.println(vect[position]);
         }
         catch (ArrayIndexOutOfBoundsException e) {
             System.out.println("Invalid position!");
             e.printStackTrace();
         }
         catch (InputMismatchException e) {
             System.out.println("Input error");
         }
         System.out.println("***END METHOD 2***");
         sc.close();

     }
}