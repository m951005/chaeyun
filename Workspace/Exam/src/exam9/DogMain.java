package exam9;
//	실행결과
//	bow wow
//	moved
//	foot : 4
//	color : white

public class DogMain {
	public static void main(String[] args) {
		Dog dog = new Dog("white");
		dog.cry();
		dog.move();
		dog.displayInformation();
		System.out.println("color : " + dog.getColor());
	}

}
