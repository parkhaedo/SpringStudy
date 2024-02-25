package spring_chapter02_homework;

public class CalRem implements ICalculator{
	public int doOperation(int fNum, int sNum) {
		return sNum!=0 ? (fNum%sNum) : 0;
	}
}
