//피자조각나누기
package easy.code.test;

import java.util.Scanner;

import java.lang.Math;

class Solution14 {
    public int solution(int n) {
        return n%7!=0?(n/7+1):n/7;
    }

	public static void main(String[] args){
	    
		Solution14 test = new Solution14();
	    Scanner scan = new Scanner(System.in);
	    System.out.println("사람수 입력 :");
	    int num1 = scan.nextInt();
	
	    int answer = test.solution(num1);
	    System.out.println("필요한 피자 :" + answer);
	     
	}
}
