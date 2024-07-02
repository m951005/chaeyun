
public class ForEx1 {
	public static void main(String[] args) {
		/* for (초기값; 조건식; 증감식) {
		 *  조건식의 값이 true일 경우 실행될 문장
		 * }
		 */
		for (int i = 1; i <= 10; i++) {			//일반적으로 for문에서는 변수로 i를 자주 사용. for문 안에서 변수 선언 시 for문 종료 후 변수사용x
			System.out.println("i : " + i);		//초기값 -> 조건식 -> 블락 실행 -> 증감식 -> 조건식 ...
		}
		
		for (int i = 10; i >= 1; i-=2) {		//변수-=수 -> 수만큼 변수 감소, 변수+=수 -> 수만큼 변수 증가
			System.out.println("i : " + i);
		}
		
		//while문 -> 반복횟수가 정확하지 않을 때 / for문 -> 반복횟수가 명확할 때

	}

}
