//문자열에서 특정문자 제거
package easy.code.test;

import java.util.Scanner;

class Solution31 {
    public int solution(int n) {
        int answer = 0;

        String str = "" + n;

        for(int i=0;i<str.length();i++){
            answer += Integer.parseInt(""+str.charAt(i)); //char 가 아닌 문자열로 리턴
        }

        return answer;
    }
   //또다른방법
//    class Solution {
//        public int solution(int n) {
//            int answer = 0;
//            while (n!=0) {
//                 answer += n%10;
//                 n /= 10;
//                    
//                }
//            
//             
//            return answer;
//        }
//    }

	
	
	public static void main(String[] args) {
		Solution31 sol = new Solution31() ;
		Scanner scan = new Scanner(System.in);
		System.out.println("정수입력 :");
		int num = scan.nextInt();
		int answer = sol.solution(num);
		
		System.out.println(answer);
	}
	
	
	
}