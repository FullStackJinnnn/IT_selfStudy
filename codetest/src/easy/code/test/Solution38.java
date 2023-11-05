//시간마다 2배
package easy.code.test;

import java.util.Scanner;

class Solution38 {
    public int solution(int n, int t) {
        int answer = 0;
        answer = (int)(n*Math.pow(2,t));
        return answer;
    }

    
	
	
	public static void main(String[] args) {
		Solution38 sol = new Solution38() ;
		Scanner scan = new Scanner(System.in);
		int n = 7;
		int t = 4;
		int answer = sol.solution(n,t);
		
		
		System.out.print(answer);
		}
	
	
	
	
}