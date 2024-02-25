package spring_chapter02_homework;

public class CalculatorAssembler {
	MyCalculator myCalculator;
	CalAdd calAdd;
	CalDiv calDiv;
	CalMul calMul;
	CalSub calSub;
	CalRem calRem;
	
	CalculatorAssembler(){
		myCalculator = new MyCalculator();
		calAdd = new CalAdd();
		calSub = new CalSub();
		calMul = new CalMul();
		calDiv = new CalDiv();
		calRem = new CalRem();
		
		assemble();
	}
	public void assemble() {
		System.out.println("add result : "+calAdd);
		System.out.println("sub result : "+calSub);
		System.out.println("mul result : "+calMul);
		System.out.println("div result : "+calDiv);
		System.out.println("rem result : "+calRem);
	}
	
	
}
