package oms;

public class Orders {
	private int quantity = 1;
	// private String address;
	private String orderId;
	private double price;
	private Status Stats = Status.PENDING;

	public Status getStats() {
		return Stats;
	}

	public void setStats(Status stats) {
		Stats = stats;
	}

	public Orders(int quantity, String orderId, double price) {
		this.quantity = quantity;
		// this.address = address;
		this.orderId = orderId;
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
