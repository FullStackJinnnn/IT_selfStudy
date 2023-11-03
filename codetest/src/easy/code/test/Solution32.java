//문자열에서 특정문자 제거
package easy.code.test;

import java.util.Scanner;

class Solution32 {
    public String solution(String my_string, String letter) {
        String answer = "";
        char c = letter.charAt(0);
        for(int i=0; i<my_string.length(); i++){
            char temp = my_string.charAt(i);
            if(temp==c) continue; //continue로 동일한값 빼고 문자열 받기.
            answer+=temp;

        }

        return answer;
    }
//    class Solution {
//        public String solution(String my_string, String letter) {
//            String answer = "";
//            answer = my_string.replace(letter,"");
//            return answer;
//        }
//    }
    
	
	
	public static void main(String[] args) {
		Solution32 sol = new Solution32() ;
		Scanner scan = new Scanner(System.in);
		String my_string = "abcddddef";
		String letter = "d";
		String answer = sol.solution(my_string,letter);
		
		System.out.println(answer);
	}
	
	
	
}