package javaoop;

public class car {
	
	String brand = "BMW";
	int wheel;
	String color;
	String enigne;
	float price;
	float fuel;
	float miles;
	
	public car(String brand, int wheel, String color, String enigne, float price,float fuel, float miles) {
		super();
		this.brand = brand;
		this.wheel = wheel;
		this.color = color;
		this.enigne= enigne;
		this.price = price;
		this.fuel  =fuel;
		this.miles = miles;
	}

	@Override
	public String toString() {
		return "car [brand=" + brand + ", wheel=" + wheel + ", color=" + color + ", enigne=" + enigne + ", price="
				+ price + ", fuel=" + fuel + ", miles=" + miles + "]";
	}
	
	
	
	
	
//	public car(String brand, int wheel, String color, String enigne, float price) {
//		super();
//		this.brand = brand;
//		this.wheel = wheel;
//		this.color = color;
//		this.enigne = enigne;
//		this.price = price;	
//	}



	

//	car (String brand, int wheel){
//		this.brand= brand;
//		this.wheel= wheel;
//		System.out.println(brand);
//		System.out.println(wheel);
//	}
//	
//	public void showData() {
//		System.out.println(brand);
//		System.out.println(wheel);	
//	}
//	
//	
//	car(){
//		System.out.println("Default car");
//		System.out.println(wheel);
//	}
}
