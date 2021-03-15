package com.ibm.car;

class Car{
	private String carName;
	private String carType;
	public Car(String carName, String carType) {
		this.carName = carName;
		this.carType = carType;
	}
	private String getCarName() {
		return this.carName;
	}

	class Engine{
		private String engineType;

		public String getEngineType() {
			return this.engineType;
		}
		
		public void setEngine() {
			if(Car.this.carType.equals("4CC")) {
				if(Car.this.getCarName().equals("Suzuki")){
					this.engineType = "Small";
				}else {
					this.engineType ="Bigger";
				}
			}else {
				this.engineType = "Bigger";
			}
		}
	}
	
	
}