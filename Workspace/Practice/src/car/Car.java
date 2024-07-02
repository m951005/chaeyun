package car;

public class Car {
	int carNum;
	
	public int getCarNum() {
		return carNum++;
	}
	
	public void setCarNum(int num) {
		carNum = 10000 + num;
	}

}
