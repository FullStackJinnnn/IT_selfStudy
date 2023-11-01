//순서쌍 개수
package easy.code.test;

import java.util.Scanner;

import java.lang.Math;

class Solution23 {
    public int solution(int n) {
        int answer = 0;
        for (int i=1; i<=n; i++) {
            if (n%i==0) {
                answer++;
            }
        }
        return answer;
    }



	public static void main(String[] args){
	    
		Solution23 test = new Solution23();
	    Scanner scan = new Scanner(System.in);
	    System.out.println("숫자 입력 :");
	    int num1 = scan.nextInt();
	
	    int answer = test.solution(num1);
	    System.out.println("순서쌍 :" + answer);
	     
	}
}
