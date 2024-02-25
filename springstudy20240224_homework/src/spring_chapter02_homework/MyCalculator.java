package spring_chapter02_homework;

public class MyCalculator {
	
	public int calculator(int fNum, int sNum, ICalculator calculator) {
		return calculator.doOperation(fNum, sNum);
	}
}
