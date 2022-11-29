package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private LocalDateTime date;
	private OrderStatus status;
	
	private static DateTimeFormatter dft2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	private Client client;
	
	List<OrderItem> items = new ArrayList<>();
	
	public Order() {
		
	}

	public Order(LocalDateTime date, OrderStatus status, Client client) {
		this.date = date;
		this.status = status;
		this.client = client;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getItems() {
		return items;
	}
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public Double total() {
		double sum = 0;
		for(OrderItem item: items) {
			sum += item.subTotal();
		}
		return sum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Oder Moment: " + date.format(dft2) + "\n");
		sb.append("Oder status: " + status.toString()+ "\n");
		sb.append("Client: " + client + "\n");
		sb.append("Order items: \n");
		for(OrderItem item: items) {
			sb.append(item + "\n");
		}
		sb.append("Total Price: ");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
		

}
