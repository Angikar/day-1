
package com.ibm.car;

public class Application {
	public static void main(String[] args) {
		Car car1 = new Car("Swift", "8CC");

		// create an object of inner class using the outer class
		Car.Engine engine = car1.new Engine();
		engine.setEngine();
		System.out.println("Engine Type for 8CC= " + engine.getEngineType());

		Car car2 = new Car("Suzuki", "4CC");
		Car.Engine c2engine = car2.new Engine();
		c2engine.setEngine();
		System.out.println("Engine Type for 4CC = " + c2engine.getEngineType());
	}

}