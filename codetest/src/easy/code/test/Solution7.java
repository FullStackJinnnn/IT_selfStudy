//두수의 합
package easy.code.test;

import java.util.Scanner;

public class Solution7 {
	public double solution(int num1, int num2) {
	
	    double add = 0;
        double answer = 0;
        add = (double)num1 / num2;
        answer = add;
        return answer;
}


	public static void main(String[] args){
	    
		Solution7 test = new Solution7();
	    Scanner scan = new Scanner(System.in);
	    System.out.println("첫번째 숫자 입력 :");
	    int num1 = scan.nextInt();
	    System.out.println("두번째 숫자 입력 :");
	    int num2 = scan.nextInt();
	    double answer = 0;
	    answer = test.solution(num1,num2);
	    //String answerS = String.format("%.3f",answer);
	    if (num1%num2 ==0) {
	    	System.out.println("num1 이 " + num1 + "num2 가 " + num2 + "이므로" + num1 + "/" + num2 + "=" + );
	    }
	    
	    
	    System.out.println("num1이" + num1 +"이고 num2가 " + num2 +"이므로" + num1 +"+" +num2 + "=" + answer + "를 return합니다" );
	    
	     
	}
}
