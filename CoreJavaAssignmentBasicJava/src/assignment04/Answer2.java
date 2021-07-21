package assignment04;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Orders{
	int orderID;
	double cost;
	String status;

	public Orders(int orderID, double cost, String status) {
		super();
		this.orderID = orderID;
		this.cost = cost;
		this.status = status;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Orders [orderID=" + orderID + ", cost=" + cost + ", status=" + status + "]";
	}	
}

public class Answer2 {
	public static void main(String[] args) {
		
		List<Orders> order = Arrays.asList(new Orders(100, 304, "Accepted"),
				new Orders(101, 10234, "Accepted"),
				new Orders(102, 200, "Cancelled"),
				new Orders(103, 3000, "Rejected"),
				new Orders(104, 10000, "Accepted"),
				new Orders(105, 50000, "Accepted"),
				new Orders(106, 20050, "Cancelled"), 
				new Orders(109, 390, "Accepted"),
				new Orders(112, 54000, "Accepted"),
				new Orders(126, 32050, "Completed"), 
				new Orders(149, 39000, "Accepted"));

		System.out.println("Order price more than 10000 && Order status is accepted : ");
		display(order, a-> a.getCost()>10000 && (a.getStatus().equalsIgnoreCase("accepted") || (a.getStatus().equalsIgnoreCase("completed"))));
		
	}
	private static void display(List<Orders> orders,Predicate<Orders> predicate) {
		orders.stream()
		.filter(predicate)
		.forEach(System.out::println);
	}
}