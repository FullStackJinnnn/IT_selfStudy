//홀수 배열 만들기
package easy.code.test;

import java.util.Scanner;

class Solution36 {
    public int[] solution(int n) {
        int[] answer = null;
        if (n%2==0) {
            answer = new int[n/2];
        } else {
            answer = new int[(n/2)+1];
        }
        
        for (int i=1; i<=n; i++) {
            if (i%2!=0) {
                answer[i/2] = i;
            } 
        }
        return answer;
    }

    
	
	
	public static void main(String[] args) {
		Solution36 sol = new Solution36() ;
		Scanner scan = new Scanner(System.in);
		int number = 144;
		int[] answer = sol.solution(number);
		
		for (int i=0; i<answer.length; i++) {
		System.out.print(answer[i] + " ");
		}
	}
	
	
	
}