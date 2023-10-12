package exam02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열은 공간의 위치 -> 참조 -> 접근 -> 사용 
		//배열은 일반 상수처럼 복사하면 주소값을 전해준다 ( 얕은복사 ) 
		// int[] a = {1,2,3,4,} ; 
		// int{} b = a ; 를 하면 같은 주소를 공유해서 a의 원소를 바꾸면 b도 같이 바뀐다.
		
		
		int[] array01 = {1,2,5,4,5};
		int[] array02 = null;
		
		//얕은 복사
		array02 = array01;
		
		for(int i=0; i<array01.length; i++) {
			System.out.println(array02[i] + "\t");
		}
		
		array01[1] = 11;
		
		for(int i=0; i<array01.length; i++) {
			System.out.println(array02[i] + "\t");
		}
		
		int[] arr01 = {1,3,5,7,9};
		int[] arr02 = new int[5];
		
		//하나씩 대입하면 서로 다른 배열이 된다.
		
		for (int i=0; i<arr01.length; i++) {
			arr02[i] = arr01[i];
			System.out.print(arr02[i] );
		}
		System.out.println();
		
		arr01[0]=12;
		arr01[1]=15;
		
		for (int i=0; i<arr01.length; i++) {
		
			System.out.print(arr02[i]);
		}
		
		
		int[] card = {1,2,3,4,5,8,9};
		int[] newcard = new int[5];
		System.out.println();
		//복사 메서드 이용 깊은 복사
		System.arraycopy(card, 1, newcard, 0, newcard.length);
		// 복사대상, 복사시작위치, 복사해올공간, 시작위치, 어디까지 
		for (int i=0; i<newcard.length; i++) {
		System.out.print(newcard[i] +"\t");
		}
		
		
		//array 클래스 메서드를 사용한 출력
		System.out.println(Arrays.toString(arr01));
		//오름차순 정렬 메서드 
		Arrays.sort(arr01);
		System.out.println(Arrays.toString(arr01));
		//wrapper class
		//string 은 클래스형태인데 데이터타입 클래스도 데이터타입으로 사용할수있다.
		
		//Integer -> int의 클래스타입
		Integer[] arr03= {1,5,7,9,20};
		System.out.println(Arrays.toString(arr03));
		
		//내림차순 정렬
		Arrays.sort(arr03,Comparator.reverseOrder());
		System.out.println(Arrays.toString(arr03));
		// copyOf는 복사대상 복사길이. 간단한 깊은복사 가능 
		newcard = Arrays.copyOf(card,card.length);
		
		// 2차원 배열은 행렬구조가 아니다 . 각 각 배열마다 공간을 다르게 가질 수 있음 열과 행이 뒤죽박죽
		
		//2차 배열
		
		int[][]	arr4 = new int[3][5];
		int[][] arr5 = new int[3][];
		int[][] arr6 = {{1,2,3,}, {4,5,6,}};
		
		System.out.println(arr4);
		System.out.println(arr4[1]);
		System.out.println(arr4[2]);
		
		//2차원 배열을 1차로 출력하면 각각의 배열이 가진 주소를 알려준다.
		
		//열을 쓰지 않고 선언하면 추가해 주어야한다.
		for (int i=0; i<arr5.length; i++) {
			arr5[i]=new int[3]; //이제 arr5는 3 by 3 배열 
		}
		
		//학생들 점수 2차원 배열
//		
//		int[][] std = new int[3][3];
//		Scanner scan = new Scanner(System.in);
//		
//		for (int i=0; i <std.length; i++) {
//			System.out.println((i+1) + " 번째 학생 국어점수 :"); 
//			std[i][0] = scan.nextInt();
//			System.out.println((i+1) + " 번째 학생 수학점수 :");
//			std[i][1] = scan.nextInt();
//			System.out.println((i+1) + " 번째 학생 과학점수 :");
//			std[i][2] = scan.nextInt();
//			
//				
//		}
//		//arrays.toStrong이용
//		for (int i=0; i<std.length; i++) {
//			System.out.println((i+1) + " 번쨰 학생" + Arrays.toString(std[i])); 
//		}
		
		
		// 제일 잘본 학생 찾기
		
//		int sum = 0;
//		int maxsum = 0;
//		int maxIndex = 0;
//		
//		for (int i=0; i<std.length; i++) {
//			for (int j=0; j<std[i].length; j++) {
//				sum = 0;
//				
//				sum += std[i][j];
//				
//				if (maxsum < sum) {
//					maxsum = sum;
//					maxIndex = i;
//				}
//				
//				
//			}
//		}
//		
//		System.out.println("성적 우수자는"+ (maxIndex+1) + "번 학생 점수 :" + Arrays.toString(std[maxIndex])+"총점 "+maxsum);
//		
		
		
		// 마방진? 만들기 조건
		// 1. 대각선 오른쪽으로만 이동
		// 2. row가 넘어가면 해당 column의 제일 마지막으로 이동 
		// 3. column이 넘어가면 해당 row의 첫번째로 이동 
		// 4. 둘다 넘어가면 직전값 밑으로 이동
		// 5. 이동위치에 값이 있으면 바로 아래로 이동 
		
		int[][] mabangjin = new int[5][5];
		
		int row = 0; //현재위치 
		int col = 2; //현재위치
		
		mabangjin[row][col] = 1;
		for (int i=2; i<=25; i++) {
			row--;
			col++;
		
			//row 벗어나면 ?
			if (row<0 && col<5) {
				row=4;
			}
			
			//column 벗어나면 ?
			if (col>4 && row>=0) {
				col=0;
			}
			//둘다 벗어나면 ?
			if (row<0 && col>4) {
				row+=2;
				col--;
			}
			
			//이동위치에 값이 이미 있으면 
			if (mabangjin[row][col] != 0) {
				row+=2;
				col--;
			}
			
			mabangjin[row][col] = i;
		}
		
		for (int i=0 ; i<mabangjin.length; i++) {
			System.out.println(Arrays.toString(mabangjin[i]));
		}
		
		
		//class 객체지향의 기본 객체지향 프로그램 object oriented program
		//프로그램의 객체는 속성이 있고 기능이 있는것들 학생 -> 번호 이름 학년 성별 / 기능 -> 공부하다 등교하다 등등 ..
		//클래스란 객체를 표현한 것 
		//객체를 코드화 해서 클래스로 표현 
		//컴퓨터는 input이 있어야 output이 생긴다. 객체를 컴퓨터에게 알려줘야한다.
		//체계는 클래스를 크게 2가지로나눈다. 1. 실행용 main 2. 라이브러리 (Math, System, Array) 기능, 도움들  3.data (사람,사물) 정보들
		
		
		//접근제한자 class 클래스명 { }
		//class 명 앞글자는 대문자. 
		
		//class 구성의 3요소 필드(변수), 메서드(기능), 생성자 (클래스 생성에 필수 )
		
	}	
}