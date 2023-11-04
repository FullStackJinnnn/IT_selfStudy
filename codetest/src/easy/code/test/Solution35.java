//문자열에서 제곱
package easy.code.test;

import java.util.Scanner;

class Solution35 {
    public int solution(int n) {
        int answer = 0;
        int i = 1;
        while (true) {
            if (n == (i*i)) {
                answer = 1;
                break;
            } else {
                answer = 2;
            }
            i++;
        }
        
        return answer;
    }

    
	
	
	public static void main(String[] args) {
		Solution35 sol = new Solution35() ;
		Scanner scan = new Scanner(System.in);
		int number = 144;
		int answer = sol.solution(number);
		
		System.out.println(answer);
	}
	
	
	
}