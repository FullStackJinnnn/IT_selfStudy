//숫자 비교 
package easy.code.test;

import java.util.Scanner;

public class Solution5 {
	public int solution(int num1, int num2) {
	
        int diff = 0;
        int answer = 0;
        diff = num1 - num2;
        if (diff == 0) {
        	answer = 1;
        }else {
        	answer = -1;
        }
        return answer;
	}


	public static void main(String[] args){
	    
		Solution5 sol = new Solution5();
	    Scanner scan = new Scanner(System.in);
	    System.out.println("숫자 1 입력 :");
	    int num1 = scan.nextInt();
	    System.out.println("숫자 2 입력 :");
	    int num2 = scan.nextInt();
	    int answer = 0;
	    answer = sol.solution(num1,num2);
	    if (answer == 1) {
	        System.out.println("num1이" + num1 +"이고 num2가 " + num2 +"이므로" + "같습니다. 따라서" + answer + "를 return 합니다.");
	    }else {
	        System.out.println("num1이" + num1 +"이고 num2가 " + num2 +"이므로" + "다릅니다. 따라서" + answer + "를 return 합니다.");
	    }
	     
	}
}
