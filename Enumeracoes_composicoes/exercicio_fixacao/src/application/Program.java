package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter dft1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String date = sc.next();
		LocalDate birthDate = LocalDate.parse(date, dft1);
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String status = sc.next();
		
		Order oder = new Order(LocalDateTime.now(), OrderStatus.valueOf(status) , client);
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			System.out.println("Enter #"+(i+1)+" item data:");
			System.out.print("Product name: ");
			String nameProduct  = sc.next();
			System.out.print("Product price:");
			double price = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			oder.addItem(new OrderItem(quantity, price, new Product(nameProduct, price)));				
		}
		
		
		System.out.println();
		
		System.out.println("ORDER SUMMARY:");
		System.out.println(oder);
		
		sc.close();
	}

}
