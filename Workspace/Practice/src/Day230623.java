import java.util.Scanner;

public class Day230623 {

	public static void main(String[] args) {
	      /*
	       * 시간과 분을 따로 입력받고 추가로 분을 더 입력받아 입력받은 시간에서
	       * 추가로 입력한 분의 더한 시간을 출력하도록 한다.
	       * 입력 시간은 24시간 형식을 입력받고 출력시간은 오전/오후를 구분하는
	       * 12시간 형식을 출력하도록 한다.
	       * 
	       * ex) 24시간 형식의 12시 30분은 12시간 형식의 오후 12시 30분이다.
	       * ex) 24시간 형식의 00시 30분은 12시간 형식의 오전 12시 30분이다.
	       * 
	       * 예 1)
	       * 시간 입력 : 23
	       * 분 입력 : 50
	       * 추가 분 입력 : 20
	       * 입력시간에서 20분을 추가한 시간은 오전 12시 10분입니다.
	       * 
	       * #0~23 시간의 입력 범위를 넘기면 지정한 범위의 값을 입력하도록 하는 메세지 출력
	       */
		Scanner sc = new Scanner(System.in);
		int newMin;
		int newHr = 0;
		String day = "오전";
		
		System.out.print("시간 입력 : ");
		int hour = sc.nextInt();
		System.out.print("분 입력 : ");
		int min = sc.nextInt();
		
			
		if (hour >= 24 || min >= 60) {
			System.out.println("형식에 맞게 시간을 다시 입력하세요.");
		} 
		
		else {
			System.out.print("추가 분 입력 : ");
			int extraMin = sc.nextInt();
		
			newMin = min + extraMin;
		
			if (newMin >= 60) {
				newHr = hour + (newMin / 60);
				newMin = newMin - 60;
			}
			
			if (newHr < 0) {
				newHr = newHr * -1;
			}
			
			if(newHr > 12 && newHr < 24 ) {
				day = "오후";
				newHr -= 12;
			}
			
			if (newHr == 24) {
				newHr -= 24;
			}
			
			
			System.out.println("입력시간에서 " + extraMin + "분을 추가한 시간은 " + day + " " + newHr + "시 " + newMin + "분 입니다.");
		}

	}

}