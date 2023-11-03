//두수의 차
package easy.code.test;

import java.util.Scanner;

public class Solution {
	public Solution () {} //클래스를 만들면 기본생성자 선언 안해도 자동으로 생성
	public int Solution(int num1, int num2) {
	
	    int diff = 0;
        int answer = 0;
        diff = num1 - num2;
        answer = diff;
        return answer;
}


	public static void main(String[] args){
		Solution test = new Solution(); //기본생성자를 이용한 객체화
	    Scanner scan = new Scanner(System.in);
//	    System.out.println("첫번째 숫자 입력 :");
//	    int num1 = scan.nextInt();
//	    System.out.println("두번째 숫자 입력 :");
//	    int num2 = scan.nextInt();
//	    int answer = 0;
//	    int[] a = {1,2};
//	    System.out.println(answer);
//	    answer = test.Solution(num1,num2);
//	    System.out.println("num1이" + num1 +"이고 num2가 " + num2 +"이므로" + num1 +"-" +num2 + "=" + answer + "을 return합니다" );
	   //와.........2중 반복문 이지만 j바복문에서 i가 계속 1씩 증가해 최종적으로 5가 되기 떄문에 
	   //첫번째 반복문의 조건인 i <= 4 일때까지를 만족하지 않음으로 첫번째 루프는 돌지 않는다.
	    int num1 = 2;
	    int num2 = 4;
	    int[] numbers = {1,2,3,4,5};
	    int[] ans = new int[num2-num1+1];
        for(int i = num1; i <= num2; i++) {
        	System.out.println("i첫번째증가" + i);
            for(int j = 0; j <= num2-num1; j++) {
                    ans[j]=numbers[i++];
                    System.out.println("i증가==========" + i);
                    System.out.println("j증가" + j);
            }
        }
        
        String[] s = Integer.toString(1234).split(""); //특정 문자를 기준으로 문자를 나눈다.1234 -> 문자열 배열 {1,2,3,4};
        for (int i=0; i<s.length; i++) {
        System.out.println(s[i]);
        }

	
	}
}
