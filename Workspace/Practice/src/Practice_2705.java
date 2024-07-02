import java.util.Scanner;

public class Practice_2705 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//음료수 종류와 잔 수를 입력받으면 가격을 알려주는 프로그램을 작성하라.(switch문 활용)
		System.out.println("Coke(2000) / Cider(1500) / Fanta(2300)");
		System.out.print("Choose the Beverage : ");
		String bvg = sc.next();
		System.out.print("How many glass : ");
		int glass = sc.nextInt();
		int price = 0;
		switch(bvg) {
		case "Coke" : 
			price = glass * 2000;
			System.out.println("You ordered " + glass + " of " + bvg + ".");
			System.out.println("Total price : " + price);
			break;
		case "Cider" : 
			price = glass * 1500;
			System.out.println("You ordered " + glass + " of " + bvg + ".");
			System.out.println("Total price : " + price);
			break;
		case "Fanta" : 
			price = glass * 2300;
			System.out.println("You ordered " + glass + " of " + bvg + ".");
			System.out.println("Total price : " + price);
			break;
		default : System.out.println("There is no type you selected.");
		}
		System.out.println();


		/*
		 * 돈의 액수를 입력받아 오만원권, 만원권, 천원권, 500원짜리 동전, 100원짜리 동전, 10원짜리 동전, 1원짜리 동전 
		 * 각 몇 개로 변환되는지 출력하라. (Scanner, if문 연습)
		 */
		System.out.print("금액을 입력하시오 : ");
		int money = sc.nextInt();
		int count = 0;
		if(money % 50000 != 0) {
			count = money / 50000;
			System.out.println("5만원권은 " + count + "장 입니다.");
			money = money - (count * 50000);
			
			count = money / 10000;
			System.out.println("1만원권은 " + count + "장 입니다.");
			money = money - (count * 10000);
			
			count= money / 1000;
			System.out.println("1천원권은 " + count + "장 입니다.");
			money = money - (count * 1000);
			
			count= money / 500;
			System.out.println("5백원은 " + count + "개 입니다.");
			money = money - (count * 500);
			
			count= money / 100;
			System.out.println("1백원은 " + count + "개 입니다.");
			money = money - (count * 100);
			
			count= money;
			System.out.println("1원은 " + count + "개 입니다.");
			money = money - count;
		} else {
			count= money / 50000;
			System.out.println("5만원권만 " + count + "장 입니다.");
		}
		System.out.println();
		
		//한 층의 높이가 5m일 때, 건물이 몇 층인지 입력받아 높이를 출력하라.
		System.out.print("건물의 층수 : ");
		int floor = sc.nextInt();
		System.out.println("건물의 높이는 " + floor * 5 + "m 입니다.\n");
		
		/*
		 * 10미만의 자연수에서 3과 5의 배수를 구하면 3,5,6,9이다. 이들의 총합은 23이다.
		1000미만의 자연수에서 3,5의 배수의 총합을 구하라.
		 */
		int sum = 0;
		for(int i = 1; i < 1000; i++) {
			if(i%3<1||i%5<1) {
				sum += i;
			}
		}
		System.out.println("1~1000사이 3,5의 배수의 총합 : " + sum);
		System.out.println();
		
		//두 개의 숫자를 입력받아 그 합을 출력하는 프로그램을 작성하시오.
		System.out.println("2가지 수의 합을 출력하는 프로그램");
		System.out.print("첫번째 숫자를 입력하시오. : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하시오. : ");
		int num2 = sc.nextInt();
		
		int result = num1 + num2;
		System.out.printf("%d + %d = %d 입니다.\n\n", num1, num2, result);
		
		/*
		 *영문을 입력하고 엔터를 입력하면 입력한 영문을 대문자로 변경하여 출력하는 프로그램을 작성하시오.
			(단, 사용자가 "END" 라는 문자열을 입력하기 전까지 반복해서 문장을 입력받을 수 있게 할것)
		 */
		System.out.println("영어문장을 입력 시 대문자로 변환하는 프로그램");
		while(true) {
			System.out.print("영어 문장을 입력하시오. : ");
			String line = sc.next();
			System.out.println(line.toUpperCase());
			if(("END".equals(line))|| ("end".equals(line))) {
				break;
			}
		}

	}

}
