//피자조각,사람수 체크
package easy.code.test;

import java.util.Scanner;

import java.lang.Math;

class Solution22 {
    public int solution(int slice, int n) {
        int answer = 0;
        return n%slice != 0 ? (n/slice+1) : n/slice;
    }


	public static void main(String[] args){
	    
		Solution22 test = new Solution22();
	    Scanner scan = new Scanner(System.in);
	    System.out.println("피자조각 입력 :");
	    int num1 = scan.nextInt();
	    System.out.println("사람수 입력:");
	    int num2 = scan.nextInt();
	
	    
	    
	    int answer = test.solution(num1,num2);
	    System.out.println("필요한 피자 :" + answer);
	     
	}
}
