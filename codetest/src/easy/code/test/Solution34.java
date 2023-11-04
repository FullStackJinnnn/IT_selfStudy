//가격할인
package easy.code.test;

import java.util.Scanner;

class Solution34 {
    public int solution(int price) {
        int answer = 0;
        if  (100000 <= price && price <300000) {
            answer = price*95/100;
        } else if (300000 <= price  && price < 500000) {
            answer = price*90/100;
        } else if (500000 <= price ) {
            answer = price*80/100;
        }  else {
            answer = price;
        }
        return answer;
    }


    
	
	
	public static void main(String[] args) {
		Solution34 sol = new Solution34() ;
		Scanner scan = new Scanner(System.in);
		int number = 144;
		int answer = sol.solution(number);
		
		System.out.println(answer);
	}
	
	
	
}