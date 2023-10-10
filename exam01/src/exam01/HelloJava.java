package exam01;

import java.util.Scanner;

public class HelloJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		// 자료형 
		int num01 = 130;
		byte byNum = 20;
		byte byNum2 = 30;
		long lynum01 = 30;
		double doubleNum = 30.3111;
		float flNum = 33.12f;
		char ch = 'A';
		
		String str = "날씨";
		
		boolean b =false;
		
		lynum01 = num01;// 자동 형변환 
		byNum = (byte)num01; //강제 형변환
		
		System.out.println(num01);
		System.out.println(byNum);
		System.out.println(doubleNum);
		System.out.println(ch);
		System.out.println(b);
		
		char ch2 = 'E';
		char num = 98;
		
		int chToNum = 0;
		char numToCh = ' ';
		
		chToNum = ch2;
		numToCh = num; // int 가 char보다 크기때문에 강제형변환 해야한다...고하는데
		//강제가 아니어도 된다. 
		System.out.println(chToNum);
		System.out.println(numToCh);
		
		// byte bySum = byNum + byNum2; byte 끼리 더해도 defualt는 int. byte 로 형변환 불가 
		
		int Sum = num01++;
		System.out.println("Sum = " + Sum + " num01 " + num01);
		Sum = ++num01;
		System.out.println("Sum = " + Sum + " num01 " + num01);
		
//		Scanner scan = new Scanner (System.in); // 유저한테 입력받기 
//		
//		System.out.println("정수를 입력하세요 :");
//		int score = scan.nextInt();
//		if (score>90) {
//			System.out.println("점수 : " + score + "확정 :A");
//		} else if (score >=80) {
//			System.out.println("점수 : " + score + "확정 :B");
//		} else {
//			System.out.println("점수 : " + score + "확정 :F");
//		}
		//범위가 좁은 것 부터 해야한다.
		
		
		// Switch case문
		int score2 = 0;
		
		score2 = (int)(Math.random() * 100 ) +1;
		switch(score2 / 10) {
		
		case 10:
		case 9:
			System.out.println(score2   + "A");
			break;
		case 8:
			System.out.println(score2   + "B");
			break;
		default :
			System.out.println(score2   + "F");
			
		}
		int multi = 0;
		// for 문
//		for (int i=1 ; i<=9 ; i ++) {
//			for ( int j =1 ; j<=9 ; j++) {
//				multi = i * j;
//				System.out.println(i + "*" + j + "=" + multi + "\t");
//			}
//		}
	
	 	for(int i=1 ; i<=5; i++) {
	 		for (int j =5; j>i; j--){
	 				System.out.print("*");
	 			} 	
	 		System.out.println();
	 	}
	}
}
