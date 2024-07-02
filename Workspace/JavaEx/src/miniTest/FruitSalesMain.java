package miniTest;

class FruitSeller {

	int numOfApple;
	int myMoney;
	final int APPLE_PRICE;

	public FruitSeller(int myMoney, int numOfApple, int APPLE_PRICE) {
		this.myMoney = myMoney;
		this.numOfApple = numOfApple;
		this.APPLE_PRICE = APPLE_PRICE;
	}

	public int saleApple(int price) {
		int apple = price / APPLE_PRICE;
		numOfApple -= apple;
		myMoney = price;
		return apple;
	}
	
	public void showSaleResult() {
		System.out.println("남은 사과 : " + numOfApple);
		System.out.println("판매 수익 : " + myMoney);
	}
}

class FruitBuyer {

	int numOfApple;
	int myMoney;
	
	public FruitBuyer(int myMoney) {
		this.myMoney = myMoney;
	}
	
	// 메소드
	public void buyApple(FruitSeller seller, int price) {
		numOfApple += seller.saleApple(price);
		myMoney -= price;
	}
	
	// 메소드
	public void showBuyResult() {
		System.out.println("현재 잔액 : " + myMoney);
		System.out.println("사과 개수 : " + numOfApple);
	}
}

public class FruitSalesMain {
	
	public static void main(String[] args) {
		
		FruitSeller seller1 = new FruitSeller(0, 30, 1500);
		FruitSeller seller2 = new FruitSeller(0, 20, 1000);
		
		FruitBuyer buyer = new FruitBuyer(10000);
		buyer.buyApple(seller1, 4500);
		buyer.buyApple(seller2, 2000);
		
		System.out.println("과일 판매자1의 현재상황");
		seller1.showSaleResult();
		
		System.out.println("과일 판매자2의 현재상황");
		seller2.showSaleResult();
		
		System.out.println("과일 구매자의 현재상황");
		buyer.showBuyResult();
	}
}
