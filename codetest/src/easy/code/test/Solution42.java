//배열에서 배수 뺴기 
package easy.code.test;

import java.util.Scanner;

import java.util.ArrayList;
class Solution42 {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        for (int i=4; i<=n; i++) {
            for (int j=1; j<=i; i++) {
                if (i%j ==0) {
                    count++;
                }
            }
            if (count>=3) {
                answer ++;
            }
            
            
        }
        return answer;
    }

    
	
	
	public static void main(String[] args) {
		Solution42 sol = new Solution42() ;
		Scanner scan = new Scanner(System.in);
		int answer = sol.solution(4);
		
		
		System.out.print(answer);
		}



	
	
	
	
}