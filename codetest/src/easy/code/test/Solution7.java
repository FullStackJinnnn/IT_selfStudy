//두수의 합
package easy.code.test;

import java.util.Scanner;

public class Solution7 {
	public int solution(int num1, int num2) {
	
	    double div = 0;
        int answer = 0;
        div = (double)num1 / num2 * 1000;
        answer = (int)div;
        return answer;
}


	public static void main(String[] args){
	    
		Solution7 test = new Solution7();
	    Scanner scan = new Scanner(System.in);
	    System.out.println("첫번째 숫자 입력 :");
	    int num1 = scan.nextInt();
	    System.out.println("두번째 숫자 입력 :");
	    int num2 = scan.nextInt();
	    int answer = 0;
	    answer = test.solution(num1,num2);
	    System.out.println("num1이" + num1 +"이고 num2가 " + num2 +"이므로" + num1 +"+" +num2 + "=" + answer + "를 return합니다" );
	    
	     
	}
}

////두수의 나눗셈............프로그래머스 답변과 똑같이 나오게하기
//package easy.code.test;
//
//import java.util.Scanner;
//
//public class Solution7 {
//	public int solution(int a, int b) {
//        int answer = 2;
//        // 약분하기 //기약분수만들기
//        for (int i=1; i<Math.min(a, b) + 1; i++) {
//            if (a % i == 0 && b % i == 0) {
//                a /= i;
//                b /= i;
//            }
//        }
//        
//        // 소인수찾기
//        if (check(b)) {
//            answer = 1;
//        }
//        return answer;
//    }
//	
//	// 소인수 찾기
//    public boolean check(int num){
//        while (num > 1) {
//            if (num % 2 == 0) {
//                num /= 2;
//            } else if (num % 5 == 0) {
//                num /= 5;
//            } else {
//                return false;
//            }
//        }
//        return true;
//    }
//
//
//	public static void main(String[] args) {
//	    
//		Solution7 test = new Solution7();
//	    Scanner scan = new Scanner(System.in);
//	    System.out.println("첫번째 숫자 입력 :");
//	    int a = scan.nextInt();
//	    System.out.println("두번째 숫자 입력 :");
//	    int b = scan.nextInt();
//	    double c = (double)a/b;
//	    double e = c*1000;
//	    int d = a * 1000 / b;
//	    
//	    int answer = 0;
//	    answer = test.solution(a,b);
//	    if (answer == 1 && (a*1000) % b == 0) {
//	    //String answerS = String.format("%.3f",answer);
//	    System.out.println("num1이" + a +"이고 num2가 " + b +"이므로" + a +"/" +b + "=" + c + "에 1000을 곱하면 " + d + "이 됩니다");
//	    }
//	    else if (answer ==1 && (a*1000) % b != 0) {
//	    	System.out.println("num1이" + a +"이고 num2가 " + b +"이므로" + a +"/" +b + "=" + c + "에 1000을 곱하면 " + e + "이가 되며, 정수부분은" + (int)e + "입니다.");
//	    }
//	    else {
//	    	System.out.println("num1이" + a +"이고 num2가 " + b +"이므로" + a +"/" +b + "=" + c + "에 1000을 곱하면 " + e + "이가 되며, 정수부분은" + (int)e + "입니다.");
//	    }
//	    
//	}
//}
