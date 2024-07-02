public class Operator5 {
	public static void main(String[] args) {
		/* 조건 연산자 (삼항 연산자)
		 * 조건? 수식1 : 수식2
		 * -> 조건식이 true 이면 수식1, false이면 수식2에 대입 후 값을 출력
		 */
		boolean result;
		int num1 = 3;
		int num2 = 1;
		result = num1 < num2 ? true : false;
		System.out.println(result);
		
		//윤년 구하기
		boolean result2;
		int year = 2020;
		result2 = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0) ? true : false;
		System.out.println(result2);
		
		
	}

}
