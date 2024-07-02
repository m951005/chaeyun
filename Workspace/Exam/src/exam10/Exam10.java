package exam10;

import java.util.Scanner;

//	실행결과 1
//	점수를 입력하세요 : 100
//	입력한 점수는 : 100점
//	실행결과 2
//	점수를 입력하세요 : 200
//	점수가 입력 범위를 벗어남.

public class Exam10 {
	
	public static int input() throws ScoreInputException  {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		if(score < 0 || score > 100) {
			throw new ScoreInputException();
		}
		return score;
	}
	
	public static void main(String[] args) {
		int score = 0;
		try {
		score = input();
		System.out.println("입력한 점수는 : " + score + "점");
		} catch (ScoreInputException e) {
		}
	}

}
