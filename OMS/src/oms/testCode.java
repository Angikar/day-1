package oms;

public class testCode {

	public static void main(String[] args) {

		Orders ord = new Orders(1, "12KJ", 2000.50);
		DataWareHouse data = new DataWareHouse("12KJ", 80665934);
		Address add = new Address("12 MG Road", "Kol", "WB", 700321);

		if (data.getPid().equals(ord.getOrderId()) && (add.getPinCode() == 700321)) {
			ord.setStats(Status.ORDERED);
			System.out.println("Your order status is :");
			System.out.println(ord.getStats());
			System.out.println("Your Order will be delivered to " + add.getStreet() + ", " + add.getState() + " ,"
					+ add.getPinCode());

		} else {
			System.out.println("Please try again !!");
		}
	}
}
