//배열의 평균값 
//배열입력개수는 정하고 입력해야한다. 무작정 원하는 만큼 넣을 수 없다.
package easy.code.test;

import java.util.Scanner;

public class Solution11 {

	public Solution11() {
		//기본생성자~
}
	public double solution(int[] numbers) {
		double answer = 0;
		int sum = 0;
		for (int i=0; i<numbers.length; i++) {
			sum += numbers[i];
		}
		answer = (double)sum / numbers.length;
		return answer;
	}
	
	public static void main(String[] args) {
		Solution11 sol = new Solution11();
		Scanner scan = new Scanner(System.in);
		
		// 입력받을 숫자 개수 입력받기
		System.out.print("입력할 숫자의 개수는 ? (100개 미만) : ");
		int count = scan.nextInt();
		int[] numbers = new int[count]; //입력받을 숫자 배열
		
		// 숫자 입력받기 
		System.out.print(count + " 개의 숫자를 입력하세요! : ");
		for (int i = 0 ; i < count ; i++) {
			numbers[i] = scan.nextInt();		
		}
		double avg = sol.solution(numbers);
		
		System.out.println("입력한 배열 :" );
		for (int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println("배열의 평균:" + avg);
		
	


	}
}