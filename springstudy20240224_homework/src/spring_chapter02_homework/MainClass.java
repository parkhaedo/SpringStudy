package spring_chapter02_homework;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("원하시는 첫 번째 숫자를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		int fn = sc.nextInt();
		System.out.println(fn+"을 입력하셨습니다.");
		System.out.println("원하시는 두 번째 숫자를 입력하세요.");
		
		Scanner sc2 = new Scanner(System.in);
		int sn = sc2.nextInt();
		System.out.println(sn+"을 입력하셨습니다.");
		
		System.out.print("원하시는 연산을 번호로 선택하세요.\n"
				+ "1: 더하기\n2:빼기\n3:곱하기\n4:나누기\n5:나머지");
		Scanner sc3 = new Scanner(System.in);
		int cal = sc3.nextInt();
		
		int result;
		MyCalculator myCalculator = new MyCalculator();
		if(cal==1) {
			System.out.println("더하기를 선택하셨습니다.");
			result = myCalculator.calculator(fn, sn, new CalAdd());
			System.out.println("결과는 "+result +"입니다.");
		}else if(cal==2){
			System.out.println("빼기를 선택하셨습니다.");
			result = myCalculator.calculator(fn, sn, new CalSub());
			System.out.println("결과는 "+result +"입니다.");			
		}else if(cal==3) {
			System.out.println("곱하기를 선택하셨습니다.");
			result = myCalculator.calculator(fn, sn, new CalMul());
			System.out.println("결과는 "+result +"입니다.");
		}else if(cal==4) {
			System.out.println("나누기를 선택하셨습니다.");
			result = myCalculator.calculator(fn, sn, new CalDiv());
			System.out.println("결과는 "+result +"입니다.");
		}else if(cal==5) {
			System.out.println("나머지를 선택하셨습니다.");
			result = myCalculator.calculator(fn, sn, new CalRem());
			System.out.println("결과는 "+result +"입니다.");
		}else {
			System.out.println("숫자를 잘못 입력하셨습니다.");
		}
		
	}

}
