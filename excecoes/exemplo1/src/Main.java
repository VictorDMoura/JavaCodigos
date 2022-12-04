import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Index out of range");
        }
        catch (InputMismatchException e){
            System.out.println("Invalid input!");
        }

        sc.close();
    }
}