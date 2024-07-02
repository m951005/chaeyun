class Car {
	String name = "레이";
}


public class ClassEx3 {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		System.out.println("변경 전 car1 : " + car1.name);
		System.out.println("변경 전 car2 : " + car2.name);
		System.out.println(car1.name == car2.name);		//name의 값이 같으므로 true
		System.out.println(car1 == car2);				//주소값이 다르므로 false
		car1.name = "스파크";
		car2.name = "아반떼";
		System.out.println("변경 후 car1 : " + car1.name);
		System.out.println("변경 후 car2 : " + car2.name);
		System.out.println(car1.name == car2.name);		//name의 값이 달라졌으므로 false
		
		
		
		
//		String str1 = new String("Hello");
//		String str2 = new String("Hello");
//		System.out.println(str1 == str2);				변수가 가지고 있는 주소값이 다름 -> false
//		System.out.println(str1.equals(str2));			변수가 가지고 있는 값이 같음 -> true
		
				
	}

}
