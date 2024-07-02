import java.util.Scanner;

class Calculator {
	boolean odd(int num) {
		return num % 2 == 1;
	}
		
}

class NewCalculator {
	int avg(int[] data) {
	  int total = 0;
      for (int num : data) {
          total += num;
	      }
	  return total / data.length;
	}
	
}

class Name {
	String getName() {
		return "김채윤";
	}
}

class Add {
	static int sum(int num1, int num2) {
		return num1 + num2;
	}
}

class ShowName {
	void name(String name) {
		System.out.println("이름은 " + name + "입니다.");
	}
}

public class Practice_2905 {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.odd(3));
		System.out.println(cal.odd(4));
		
		int[] data = {1, 3, 5, 7, 9};
		NewCalculator cal2 = new NewCalculator();
		int result = cal2.avg(data);
		System.out.println(result);
		
		Name myName = new Name();
		System.out.println(myName.getName());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 2개를 입력해 주세요.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("정수의 합 : " + Add.sum(num1, num2));
		
		System.out.print("이름을 입력해 주세요. : ");
		String name = sc.next();
		ShowName Name = new ShowName();
		Name.name(name);
				
	}
}