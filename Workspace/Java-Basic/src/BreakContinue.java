
public class BreakContinue {
	public static void main(String[] args) {
		/*
		 * break : 반복문에서 break문을 만나면 반복문의 실행을 중지하고 반복문을 빠져나온다.
		 * continue : 반복문에서 continue를 만나면 하위 문장을 실행하지 않고 조건 검사로 돌아간다.
		 * while, do~while 문에서도 사용 가능
		 */
//		for(int i = 1; i <= 10; i++) {
//			System.out.println(i);
//			if (i == 5) {
//				break;		//중괄호를 안쳐도 ok
//			}
//			System.out.println("for 블럭 실행 종료");
//		}
//
//		for(int i = 1; i <= 10; i++) {
//			System.out.println(i);
//			if (i == 5) {
//				continue;
//			}
//			System.out.println("for 블럭 실행 종료");
//		}
		
	for(int i = 0; i < 5; i++) {
		System.out.println("i의 값이 " + i + "일 때");
		for(int j = 0; j < 5; j++) {
			System.out.println("i : " + i + ", j : " + j);
			if (j==2) continue;
			/*
			 * 반복문의 중첩
			 * j의 반복문이 끝나면 i의 증감식으로 돌아가고 j는 다시 초기값으로 진행
			 */
		}
	}

	}

}
