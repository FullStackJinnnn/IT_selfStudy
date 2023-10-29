//양꼬치 음료 보너스 
//양꼬치 10개당 음료 1개 보너스
package easy.code.test;

import java.util.Scanner;

class Solution12 {
    public int solution(int n, int k) {
        int answer = 0;
        int bonus = n/10;
        answer = n*12000 + (k-bonus)*2000;
        return answer;
    }





	public static void main(String[] args){
	    
		Solution12 test = new Solution12();
	    Scanner scan = new Scanner(System.in);
	    System.out.println("양꼬치 개수 :");
	    int num1 = scan.nextInt();
	    System.out.println("음료 개수 :");
	    int num2 = scan.nextInt();
	
	    int answer = test.solution(num1,num2);
	    System.out.println("양꼬치 + 음료 값 :" + answer);
	     
	}
}
