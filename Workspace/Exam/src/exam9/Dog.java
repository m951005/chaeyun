package exam9;

public class Dog implements AnimalInterface {
private String color;
	
	public Dog(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	@Override
	public void cry() {
		System.out.println("bow wow");
	}

	@Override
	public void move() {
		System.out.println("moved");
	}

	@Override
	public void displayInformation() {
		System.out.println("foot : " + foot);
	}
	

}
