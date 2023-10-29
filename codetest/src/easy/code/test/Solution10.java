//각도기
package easy.code.test;

import java.util.Scanner;

class Solution10 {
    public int solution(int n) {
        int answer = 0; 
        for (int i=0; i<=n; i++) {
            if (i%2 == 0) {
                answer += i;
            }            
        }
        return answer;
    }




	public static void main(String[] args){
	    
		Solution10 test = new Solution10();
	    Scanner scan = new Scanner(System.in);
	    System.out.println("정수 입력 :");
	    int num1 = scan.nextInt();
	
	    int answer = test.solution(num1);
	    System.out.println("정수 이하 짝수 합 :" + answer);
	     
	}
}
