//문자열에서 숫자만더하기
package easy.code.test;

import java.util.Scanner;

class Solution37 {
    public int solution(String my_string) {
        int answer = 0;
        int num = 0;
        for (int i=0; i<my_string.length(); i++) {
            String str = "" + my_string.charAt(i);
            try {
            num = Integer.valueOf(str);
            }   catch (NumberFormatException e){
            num = 0; // 숫자로 변환할수 없는 문자열 형태이면 0으로 초기화
               }
            answer += num;
        }
        return answer;
    }

    
	
	
	public static void main(String[] args) {
		Solution37 sol = new Solution37() ;
		Scanner scan = new Scanner(System.in);
		String str = "12345abc";
		int answer = sol.solution(str);
		
		
		System.out.print(answer);
		}
	
	
	
	
}