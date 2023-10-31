 	//문자열 개수 
package easy.code.test;

import java.util.Scanner;

class Solution13 {
    public int solution(String message) {
        int answer = 0;
        answer = message.length() * 2; //문자도 length() 사용~
        return answer;
    }





	public static void main(String[] args){
	    
		Solution13 test = new Solution13();
	    Scanner scan = new Scanner(System.in);
	    System.out.println("글자입력  :");
	    String str = scan.next();
	
	    int answer = test.solution(str);
	    System.out.println("입력된 문자열 ->  \"" + str + "\" " // \"로 출력문 안에 "표시하기		
	    		+ "\n문자열 개수 * 2 :" + answer);
	     
	}
}
