package exam10;

public class ScoreInputException extends Exception {
	public ScoreInputException() {
		System.out.println("점수가 입력 범위를 벗어남.");
	}
}
