//각도기
package easy.code.test;

import java.util.Scanner;

public class Solution9 {
    public int solution(int angle) {
        int answer = 0;
        if (0 < angle && angle< 90) {
            answer =1;
        } 
        else if (angle == 90) {
            answer =2;
        }
        else if (90 < angle && angle < 180) {
            answer =3;
        } else {
            answer =4;
        }
        
        return answer;
    }



	public static void main(String[] args){
	    
		Solution9 test = new Solution9();
	    Scanner scan = new Scanner(System.in);
	    System.out.println("각도 입력 :");
	    int num1 = scan.nextInt();
	
	    int answer = test.solution(num1);
	    System.out.println("각도 : " + num1 + "\nretrun 값 : " + answer);
	     
	}
}
