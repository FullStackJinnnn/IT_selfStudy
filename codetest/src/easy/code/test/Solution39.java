//개미 데미지
package easy.code.test;

import java.util.Scanner;

class Solution39 {
    public int solution(int hp) {
        int answer = 0;
        
            int jang = hp/5;
            int byung = (hp-jang*5)/3;
            int ill = (hp-jang*5-byung*3);
        
      
        return answer=jang+byung+ill;
    }


    
	
	
	public static void main(String[] args) {
		Solution39 sol = new Solution39() ;
		Scanner scan = new Scanner(System.in);
	
		int answer = sol.solution(39);
		
		
		System.out.print(answer);
		}
	
	
	
	
}