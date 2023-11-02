//키 더큰사람
package easy.code.test;

import java.util.Scanner;

class Solution28 {
	public Solution28 () {
		
	}
	public int solution (int[] array, int height) {
		int answer =0;
		for (int i=0; i<array.length; i++ ) {
			if (array[i] > height) {
				answer ++;
			}
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		Solution28 sol = new Solution28() ;
		Scanner scan = new Scanner(System.in);
		System.out.println("배열 수 ");
		int count = scan.nextInt();
		int[] array = new int[count];
		System.out.println(count + "수만큼 배열입력 :");
		for (int i=0; i<array.length; i++) {
			array[i] = scan.nextInt();
		}
		System.out.println("학생 키 입력 :");
		int height = scan.nextInt();
		
		int answer = sol.solution(array, height);
		
		System.out.println(answer);
	}
	
	
	
}