package exam14.exam.excp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomExceptionMain {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	try {
		
		System.out.println("나이입력 ");
		int age = scan.nextInt();
		
		if(age <1) {
			throw new CustomException();//"입력 범위오류"); //예외처리를 직접 만들 수 있다.
		}else if (age <=5) {
			System.out.println("유아");
		}else if(age <15 ) {
			System.out.println("청소년");
		}else {
			System.out.println("성인");
		}
		
	
	}catch (CustomException e) {
		System.out.println(e.getMessage() ==null ? "입력범위오류 " : e.getMessage());
	}catch (InputMismatchException e) {
		System.out.println(e.getMessage() ==null ? "입력오류 " : e.getMessage());
	}
}
}
