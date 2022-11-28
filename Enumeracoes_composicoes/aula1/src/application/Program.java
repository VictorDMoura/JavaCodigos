package application;

import java.time.LocalDateTime;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Order order = new Order(1080, LocalDateTime.now(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus od1 = OrderStatus.DELIVERED;
		OrderStatus od2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(od1);
		System.out.println(od2);
		
		

	}

}
