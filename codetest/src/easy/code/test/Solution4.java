//나이출력
package easy.code.test;

import java.util.Scanner;

public class Solution4 {
	public int solution(int num1) {
	
	    int age = 0;
        int answer = 0;
        age = 2022 - num1 + 1; //한국나이
        answer = age;
        return answer;
}


	public static void main(String[] args){
	    
		Solution4 sol = new Solution4();
	    Scanner scan = new Scanner(System.in);
	    System.out.println("나이 입력 :");
	    int num1 = scan.nextInt();
	    int answer = 0;
	    answer = sol.solution(num1);
	    System.out.println("2022년생기준 " + num1 +"살 이므로 " + answer +"년생입니다." );
	    
	     
	}
}
