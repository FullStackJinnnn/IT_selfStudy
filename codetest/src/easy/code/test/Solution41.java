////입문 코드문제 모음 ... 
//package easy.code.test;
//
//import java.util.Scanner;
//
//import java.util.ArrayList;
//class Solution41 {
//   
//  	public static void main(String[] args) {
//		}
//
//}
////개미군단
//class Solution {
//    public int solution(int hp) {
//        int answer = 0;
//        
//            int jang = hp/5;
//            int byung = (hp-jang*5)/3;
//            int ill = (hp-jang*5-byung*3);
//        
//        
//        
//        return answer=jang+byung+ill;
//    }
//}
//
////대소문자
//class Solution {
//    public String solution(String my_string) {
//        String answer = "";
//        for (int i=0; i<my_string.length(); i++) {
//            if (Character.isUpperCase(my_string.charAt(i))) {
//                answer += Character.toLowerCase(my_string.charAt(i));
//            } else {
//                answer += Character.toUpperCase(my_string.charAt(i));
//            }
//            
//        }
//        return answer;
//    }
//}
////암호해독
//class Solution {
//    public String solution(String cipher, int code) {
//        String answer = "";
//        for (int i=0; i<cipher.length(); i++) {
//            if ((i+1)%code ==0) {
//                answer += cipher.charAt(i);
//            }
//        }
//        return answer;
//    }
//}
////가위바위보
//class Solution {
//    public String solution(String rsp) {
//        String answer = "";
//        for (int i=0; i<rsp.length(); i++) {
//            if (Integer.valueOf(""+ rsp.charAt(i)) == 2) {
//                answer += "0";
//            } else if (Integer.valueOf(""+ rsp.charAt(i)) == 0) {
//                answer += "5";
//            }  else {
//                answer += "2";
//            }
//       
//        }
//    
//        return answer;
//    }
//}
////최대값만들기
//class Solution {
//    public int solution(int[] numbers) {
//        int answer = 0;
//        int temp =0;
//        for (int i=0; i<numbers.length-1; i++) {
//            for (int j=0; j<numbers.length-1-i; j++ ) { 
//                if (numbers[j] > numbers[j+1]) {
//                    temp = numbers[j];
//                    numbers[j] = numbers[j+1];
//                    numbers[j+1] = temp;
//                }
//            }
//        }
//        if (numbers[0]*numbers[1] > numbers[numbers.length-1]*numbers[numbers.length-2]) {
//            answer = numbers[0]*numbers[1];
//        } else
//            answer = numbers[numbers.length-1]*numbers[numbers.length-2] ;
//        return answer;
//    }
//}
//
////직각삼각형 출력
//import java.util.Scanner;
//
//public class Solution {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        
//        for (int i=0; i<n; i++) {
//            for (int j=0; j<=i; j++) {
//                System.out.print("*");    
//            }
//            System.out.println("");
//        }
//
//        
//    }
//}
////주사위개수
//class Solution {
//    public int solution(int[] box, int n) {
//        int answer = 1;
//        for (int i=0; i<box.length; i++) {
//            answer *= box[i]/n ;
//        }
//        return answer;
//    }
//}
//
////문자정렬
//class Solution {
//    public int[] solution(String my_string) {
//        String result = "";
//        int count = 0;
//        int temp =0;
//        
//        for (int i=0; i<my_string.length(); i++){
//            if ( (my_string.charAt(i) - '0' <= 9 && (my_string.charAt(i) - '0'  >=0))){ 
//                //answer[i-count] = (int)(my_string.charAt(i)); 
//                count++;
//            }
//        }
//        
//        int[] answer = new int[count];
//        
//            for (int i=0; i<my_string.length(); i++) {
//            if ( (my_string.charAt(i) -'0' <= 9 && (my_string.charAt(i) - '0'  >=0))){
//                result += my_string.charAt(i);
//                }
//            }
//            
//            for (int i=0; i<result.length(); i++) {
//                answer[i] =  result.charAt(i) -'0';
//            }
//        
//            for (int i=0; i<answer.length-1; i++) {
//            for (int j=0; j<answer.length-1-i; j++ ) { 
//                if (answer[j] > answer[j+1]) {
//                    temp = answer[j];
//                    answer[j] = answer[j+1];
//                    answer[j+1] = temp;
//                }
//            }
//        }
//        //메모...문자열에 문자 지울때
//          //my_string = my_string.replaceAll("[a-z]","");    
//        
//        return answer;
//    }
//}
//
//
////참조..........
//// import java.util.*;
//
//// class Solution {
////     public int[] solution(String my_string) {
////         int[] answer = {};
//
////         int length = 0;
//
////         for(int i=0; i<my_string.length(); i++){
//
////             char c = my_string.charAt(i);
////             if(c>='0'&&c<='9') length++;
//
////         }
//
////         answer = new int[length];
////         int index=0;
//
////         for(int i=0; i<my_string.length(); i++){
//
////             char c = my_string.charAt(i);
////             if(c>='0'&&c<='9') answer[index++]=c-'0';
//
////         }        
//
////         Arrays.sort(answer);
//
////         return answer;
////     }
//
//// }
//
////가장큰수찾기
//import java.util.Arrays;
//class Solution {
//    public int[] solution(int[] array) {
//        //int[] answer = {};
//        //answer = new int[2];
//        //int[] temp = array;
//        //Arrays.sort(temp);
//        int index = 0;
//        int max = array[0];
//        for (int i=1; i<array.length; i++) {
//            if (max < array[i]) {
//                max = array[i];
//                index = i;
//            }  
//            
//        }
//        
//        int[] answer ={max, index};
//        return answer;
//    }
//}
////인덱스바꾸기
//class Solution {
//    public String solution(String my_string, int num1, int num2) {
//        String answer = "";
//        char temp1 = my_string.charAt(num1);
//        char temp2 = my_string.charAt(num2);
//        
//        for (int i=0; i<my_string.length(); i++) {
//            if (i==num1) {
//                answer += temp2;
//            } else if (i==num2) {
//                answer += temp1;
//            } else
//                answer +=  my_string.charAt(i);
//        }
//        
//        
//        return answer;
//    }
//}
////이계행성나이
//class Solution {
//    public String solution(int age) {
//        String answer = "";
//        for (int i=0; i<(age + "").length(); i++ ) {
//        answer += (char)(97 + (age +"").charAt(i)-'0'); 
//            }
//        return answer;
//    }
//}
////배열 회전시키기
//class Solution {
//    public int[] solution(int[] numbers, String direction) {
//        int[] answer = {};
//        answer = new int[numbers.length];
//        
//        if (direction.equals("right")) {
//            int temp = numbers[numbers.length-1];
//            for (int i=0; i<numbers.length-1; i++) {
//                numbers[numbers.length-i-1] = numbers[numbers.length-i-2];
//            }
//            numbers[0] = temp;
//        } else if (direction.equals("left")) {
//            int temp = numbers[0];
//            for (int i=0; i<numbers.length-1; i++) {
//                numbers[i] = numbers[i+1];
//            }
//            numbers[numbers.length-1] = temp;
//        } 
//        answer = numbers;
//        return answer;
//    }
//}
////약수구하기
//class Solution {
//    public int[] solution(int n) {
//        int[] answer = {};
//        int count =0;
//        for (int i=1; i<=n; i++) {
//            if (n%i==0) {
//                count ++;
//            }
//        }
//        System.out.println(count);
//         answer = new int[count];
//        int k = 0;
//           for (int i=1; i<=n; i++) {
//               if (n%i==0) {
//                   answer[k] = i;
//                   k++;
//               }
//              
//           }
//        return answer;
//    }
//}
//피자나눠먹기
//class Solution {
//    public int solution(int n) {
//        int answer = 1;
//        int i =1;
//        while ((i*6)%n!=0) {
//            i++;
//        }
//        answer = i;
//        return answer;
//    }
//}
//369게임
//class Solution {
//    public int solution(int order) {
//        int answer = 0;
//        String num = order + "";
//        for (int i=0; i<num.length(); i++ ) {
//            if (num.charAt(i) == '3' || num.charAt(i) == '6' || num.charAt(i)  == '9') {
//                answer ++;
//            }
//        }
//        return answer;
//    }
//}
//숫자찾기
//class Solution {
//    public int solution(int num, int k) {
//        int answer = 0;
//        String str = num + "";
//        for (int i=0; i<str.length(); i++) {
//            if (str.charAt(i) == (char)k+'0') {
//                answer = i;
//                answer++;
//                break;
//            } else {
//                answer = -1;
//            }
//             
//        }
//        return answer;
//    }
//}
//문자열 정렬
//import java.util.*;
//class Solution {
//    public String solution(String my_string) {
//        String answer = "";
//        answer = my_string.toLowerCase();
//        char[] temp = answer.toCharArray();
//        Arrays.sort(temp);
//        answer = String.valueOf(temp);
//        return answer;
//    }
//}