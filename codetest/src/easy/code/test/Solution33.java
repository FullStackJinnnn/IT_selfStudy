//문자열에서 특정문자 제거
package easy.code.test;

import java.util.Scanner;

class Solution33 {
    public String solution(String my_string) {
        String answer = "";
        
        String[] vowel = {"a","e","i","o","u"};
        for (int i=0; i<my_string.length(); i++) {
            int count = 0;
            for (int j=0; j<vowel.length; j++) {
                if (vowel[j].equals("" + my_string.charAt(i)) == false ){
                    count ++;
                    if (count == 5) {
                        answer += my_string.charAt(i);
                        }
                }
            }
            
        }
        return answer;
    }
    
	
	
	public static void main(String[] args) {
		Solution33 sol = new Solution33() ;
		Scanner scan = new Scanner(System.in);
		String my_string = "abcddddef";
		String answer = sol.solution(my_string);
		
		System.out.println(answer);
	}
	
	
	
}