//문자열 안에 문자열
package easy.code.test;

import java.util.Scanner;

class Solution29 {
    public int solution(String str1, String str2) {
        int answer = 0;
        if (str1.indexOf(str2) >= 0) { //문자열을 가지고있는 인덱스 반환 없으면 -1
            answer = 1;
        }  else {
            answer = 2;
            }
        return answer;
    }

	
	
	public static void main(String[] args) {
		Solution29 sol = new Solution29() ;
		Scanner scan = new Scanner(System.in);
		String str1 = "abcdefghi";
		String str2 = "abc";
 		
		int answer = sol.solution(str1, str2);
		
		System.out.println(answer);
	}
	
	
	
}