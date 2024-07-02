package oop;

interface Player {
	static final int aField = 10;
	int bField = 20;				// 자동으로 static final 적용됨
	
	public abstract void play();
	public void stop();				// 자동으로 abstract 적용됨 (인터페이스는 모든 메소드가 추상메소드이기 때문)
}

//interface A extends Player {		인터페이스끼리 상속가능
//	public abstract void methodA();
//}

interface A {
	public void methodA();
}

// 인터페이스 구현
public class DvdPlayer implements Player, A {

	@Override
	public void play() {
		System.out.println("dvd play");
	}

	@Override
	public void stop() {
		System.out.println("dvd stop");
	}
	
	@Override
	public void methodA() {
		
	}

	public static void main(String[] args) {
		Player p = new DvdPlayer();
		p.play();
		p.stop();
		A a = new DvdPlayer();
//		a.play();
		((DvdPlayer)a).play();
		((DvdPlayer)a).stop();
	}

	
}