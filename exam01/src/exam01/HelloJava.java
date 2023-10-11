package exam01;

import java.util.Arrays;
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
		//반전 삼각형 별모양찍기 
	 	for(int i=1 ; i<=5; i++) {
	 		for (int j =1; j< 6-i ; j++){
	 				System.out.print(" ");
	 			}
	 		
	 		for (int k =1 ; k< i+1 ; k++) {
	 			System.out.print("*");
	 		}
	 		System.out.println();
	 	}
	 	
	 	//while~문
	 	
	 	int sum4 = 0;
	 	int count = 1;

	 	while(count<=10) {
	 		sum4 = sum4 + count;
	 		count++;
	 	}
	 	
	 	System.out.println(sum4);
	 	
	 	
	 	// Up Down game~
	 	
//	 	int Target = (int)(Math.random()*50) +1;  // random 함수는 0~ 0.999 까지 
//	 	Scanner scan = new Scanner (System.in); //scanner는 ㅑmport를 해야한다 Command Ctrl + shift + O (알파벳)
//	 	
//	 	int userin = 0;
//	 	int usercount = 1;
//	 	while (Target != userin) {
//	 		
//	 		System.out.println("숫자를 입력하세요 :");
//	 		userin = scan.nextInt() ; //정수 값 입력받기 
//	 		
//	 		if (Target < userin) {
//	 			System.out.println("숫자가 너무 큽니당");
//	 		}
//	 		else if (Target > userin) {
//	 			System.out.println("숫자가 작습니당 ");
//	 		}
//	 		else {
//	 			System.out.println("정답~ 값은 바로 :" + Target);
//	 			System.out.println(usercount + "번에 맞췄습니다!");
//	 		}
//	 		
//	 		usercount ++;
//	 	}
//	 	scan.close(); //스캐너 닫기 
//	 	
	 	
	 	//Do while 문 과 while 문의 다른점은 Do while 문은 조건을 나중에 검색한다.
	 	//Do while은 조건에 들어가기 전에 한번은 꼭 실행시킨다.
	 	
	 	// 배열 
	 	// 배열을 선언하면 그것은 배열의 값을 가릐키는게 아닌 주소를 가르킨다.
	 	
	 	int[] array = new int[5]; // 메모리에 새롭게 5요소를 가지고 있는 int 배열 선언 
	 	System.out.println(array); // int[5] 배열의 주소를 출ㄺ 
	 	array[1] = 10;
	 	array[0] = 12;
	 	
	 
	 	System.out.println(array[1]);
	 	System.out.println(array[0]);
	 	
	 	//null 은 없다 라는 뜻 or 참조할 것이 없다.
	 	
	 	
	 	int[] array2 = new int[10];
	 	int array2sum =0;
	 	for (int i=0 ; i<10; i++) {
	 		array2[i] = (int)(Math.random()*100)+1;
	 		System.out.print(array2[i]+"\t");
	 		array2sum += array2[i];
	 	}
	 	System.out.println("\n" + array2sum);
	 	System.out.println("정렬전 : " + Arrays.toString(array2));
	 //배열 정렬법 버블정렬, 퀵정렬, 선택정렬 
	 	
	 	//버블정렬
	 	
	 	int temp =0;
	 	for (int i=0; i<array2.length; i++) {
	 		for (int j=0; j<array2.length-1-i; j++) {
	 			if (array2[j] > array2[j+1]) {
	 				temp = array2[j+1];
	 				array2[j+1] = array2[j];
	 				array2[j] = temp;
	 			}
	 		}
	 		
	 	}
	 	
	 	System.out.println("정렬후 :" + Arrays.toString(array2));
	 	
	 	
	 		
	 		// 로또당첨기원
	 		
	 	int LottoMachine[] = new int[45];
	 	int LottoBall[] = new int[6];
	 	
	 	for (int i=0 ; i<45 ; i++) {
	 		LottoMachine[i] = i+1;
	 	}
	 	int ballcount =0;
	 	int bonusnumber =0;
	 	while (ballcount <7) {
	 		int index = (int)(Math.random()*45);
	 		// 공을 찾고 나면 그 위치를 0 으로 바꾼다
		 	// 선택된 인덱스의 값이 0이면 사용 아니면 미사용
		 	
	 		if (LottoMachine[index] != 0) {
	 			
	 			if (ballcount <6) {
	 				LottoBall[ballcount++] = LottoMachine[index]; 
	 			} else {
	 				bonusnumber = LottoMachine[index];
	 				ballcount ++;
	 			}
	 			LottoMachine[index] = 0;
	 		}
	 		
	 	}
	 	System.out.print("로또 번호는 !!! -> ");
	 	for (int i=0; i<LottoBall.length; i++) {
	 		System.out.print(LottoBall[i] +" ");
	 	}
		System.out.println("보너스 넘버 : " + bonusnumber );
	 	
		Scanner scan = new Scanner(System.in);
		
		int userLotto[] = new int[6];
		count = 0;
		while (count<6) {
			
			System.out.println( (count+1) + " 번째 로또번호를 입력하세요 : ");
			int balls = scan.nextInt();
			
			//유저 로또번호 중복체크
			for (int i=0; i<count; i++) {
				if(userLotto[i] == balls) {
					balls = 0; //중복되었다는 의미
					break;
				}
			}
		
			if(balls !=0 ) {
				userLotto[count++] = balls;
			}
		}
			scan.close();
			System.out.println("사용자 로또 : ");
			for (int i=0; i<LottoBall.length; i++) {
			System.out.println(userLotto[i] + " ");
		}
			System.out.println();
			int matchcount =0;
			boolean isBonus = false;
			
	 	// match 카운트로 당첨등수 확인
			for (int i=0; i<LottoMachine.length; i++) {
				for (int j=0; j<userLotto.length; j++) {
					if ( LottoMachine[i]==userLotto[j]) {
						matchcount ++;
						break;
					}
				}
				
				if (!isBonus) {
					if(userLotto[i] == bonusnumber){
						isBonus = true;
					}
				}
			}
	 	
			
			if(matchcount == 6) {
				System.out.println("1등");
			}
			else if(matchcount == 5 && isBonus) {
				System.out.println("2등");
			}
			else if(matchcount == 4) {
				System.out.println("3등");
			}
			else if(matchcount == 3) {
				System.out.println("4등");
			}
	}
}
