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
//합성수찾기
//class Solution {
//    public int solution(int n) {
//        int answer = 0;
//        int count = 0;
//        for (int i=4; i<=n; i++) {
//            for (int j=1; j<=i; j++) {
//                if (i%j ==0) {
//                    count++;
//                }
//            }
//            if (count >=3) {
//                answer++;
//                count=0;
//            }
//        }
//    
//        return answer;
//    }
//}
//중복문자제거
//class Solution {
//    public String solution(String my_string) {
//        String answer = "";
//        answer += my_string.charAt(0); 
//        int count = 0;
//        for (int i=1; i<my_string.length(); i++) {
//            for(int j=0;  j<i; j++) {
//                if (my_string.charAt(i)==my_string.charAt(j)) {
//                    count ++;
//                }
//            }
//            if(count>0) {
//                answer += "";
//            } else {
//                answer += my_string.charAt(i);
//            }
//            count =0;
//        }
//        return answer;
//    }
//}
//2차원만들기
//class Solution {
//    public int[][] solution(int[] num_list, int n) {
//        int[][] answer = {};
//        int k = 0;
//        answer =new int[num_list.length/n][n];
//        for (int i=0; i<num_list.length/n; i++) {
//            for (int j=0; j<n; j++) {
//                answer[i][j] = num_list[k++];            
//                }
//        }
//        return answer;
//    }
//}
////A로 B만들기
//class Solution {
//    public int solution(String before, String after) {
//        int answer = 0;
//        int count = 0;
//        StringBuilder sb = new StringBuilder(after);
//        for (int i=0; i<before.length(); i++) {
//            for (int j=0; j<before.length(); j++) {
//                if (before.charAt(i) == after.charAt(j)) {
//                    sb.setCharAt(j, '1');
//                    after=sb.toString();
//                    //after = after.replace(after.charAt(j) +"", "1");
//                    count ++;
//                    break;
//                }
//                //System.out.println(after);
//            }
//        }
//        //System.out.println(count);
//        if (count == before.length()) {
//            answer = 1;
//        } else { 
//            answer = 0;
//        }
//        return answer;
//    }
//}
////모스부호
//import java.util.Arrays;
//class Solution {
//    public String solution(String letter) {
//        String answer = "";
//        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
//        char[] alpha = "abcdefghijklmnopqrstuvwxyz".toCharArray();
//        String space[] = letter.split(" ");
//        for (String x : space) {
//            for (int i=0; i<morse.length; i++) {
//                if (x.equals(morse[i])) {
//                    answer += alpha[i];
//                }
//            }
//        }
//      String morseStr = "'.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',"
//                + "'--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',"
//                + "'--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',"
//                + "'...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',"
//                + "'-.--':'y','--..':'z'";
//        System.out.print(morseStr.toString());
//        
//         String[] morseArr = morseStr.split(",");
//  
//
//        for (int i = 0; i < morseArr.length; i++) {
//            morseArr[i] = morseArr[i].replace("'", "");
//            int idx = morseArr[i].indexOf(":");
//             System.out.print(i);
//        }
//     return answer;
//    }
//   
//}
////팩토리얼
//class Solution {
//    public int factorial(int n) {
//        int factnum = 1;
//        for (int i=1; i<=n; i++) {
//            factnum *= i;
//        }
//        return factnum;
//    }
//    
//    public int solution(int n) {
//        int answer = 1;
//        while (factorial(answer) <= n) {
//            answer ++;
//        }
//        System.out.println(factorial(10));
//        return answer-1;
//    }
//}
////k의 개수
//class Solution {
//    public int solution(int i, int j, int k) {
//        int answer = 0;
//        String temp = "";
//    
//    
//        for (int a=i; a<=j; a++) {
//            temp += a + "" ;//Integer.toString(a);
//        }
//        
//        for (int a=0; a<temp.length(); a++) {
//            if (temp.charAt(a)  == (char)(k+'0')) {
//                answer ++;
//                
//            }
//        }
//                
//        return answer;
//    }
//}
////숨어있는 숫자 덧셈
//import java.util.Arrays;
//class Solution {
//    public int solution(String my_string) {
//        int answer = 0;
//        String num = "";
//        my_string = my_string.replaceAll("[a-zA-Z]"," ");
//
//        //my_string = my_string.trim();
//        System.out.print(my_string);
//       
//         String [] strarray = my_string.split(" ");
//         System.out.print(Arrays.toString(strarray));
//          for (int i=0; i<strarray.length; i++) {
//              if (!strarray[i].isBlank())  {
//               answer +=Integer.valueOf(strarray[i]);
//           }
//              }
//        return answer;
//    }
//}
////가까운수
//import java.util.Arrays;
//class Solution {
//    public int solution(int[] array, int n) {
//        int answer = 0;
//        int[] temp = new int[array.length];
//        for (int i=0; i<array.length; i++) {
//            temp[i] = Math.abs(array[i] -n);
//        }
//        System.out.print(Arrays.toString(temp));
//        Arrays.sort(temp);
//        for (int i=0; i<array.length; i++) {
//            if ((n - temp[0] ) == array[i]) {
//                answer = array[i];
//                break;
//            } else  {
//                answer = temp[0] +n;
//                
//            } 
//            
//        }
//        System.out.print(answer);
//        return answer;
//    }
//}
////진료순서정하기
//import java.util.Arrays;
//import java.util.Collections;
//class Solution {
//    public int[] solution(int[] emergency) {
//        int[] answer = {};
//        answer = new int[emergency.length];
//        Integer[] temp = new Integer[emergency.length];
//        for (int i=0; i<emergency.length; i++) {
//            temp[i] = emergency[i];
//        }
//        Arrays.sort(temp,Collections.reverseOrder());
//        for (int i=0; i<emergency.length; i++) {
//            for (int j=0; j<emergency.length; j++) {
//                if (emergency[i] == temp[j]) {
//                    answer[i] = j+1;
//                }
//            }
//        }
//        return answer;
//    }
//}
////한번등장문자
//import java.util.*;
//class Solution {
//    public String solution(String s) {
//        String answer = "";
//        String temp = "";
//        for (int i=0; i<s.length(); i++) {
//                for (int j=i+1 ;j<s.length(); j++) {
//                        if (s.charAt(i) == s.charAt(j)) {
//                        s = s.replace(s.charAt(i) + "","0");
//                        }  
//                   }
//                   if ((int)s.charAt(i)> 48) {
//                    temp += s.charAt(i); 
//            }
//        }
//        // for (int i=0; i<s.length(); i++) {
//        //     if ((int)s.charAt(i)> 48) {
//        //             answer += s.charAt(i); 
//        //     }
//        // }
//        String[] temp2 = temp.split("");
//       // System.out.print(Arrays.toString(temp));
//     //   answer = "";
//        Arrays.sort(temp2);
//        temp = Arrays.toString(temp2);
//        for (int i=0; i<temp2.length; i++) {
//           answer += temp2[i];
//        }
//        
//     //   answer =  Arrays.toSTring(temp);
//        return answer;
//        
//        
//    }
//}
//
////좋은풀이 .. 알파벳개수 26개의 배열을 만들어 각 알파벳 등장 개수를 배열을 통해
////확인하고 count가 1인것들을 뽑아 문자열로 만든다.
//// class Solution {
////     public String solution(String s) {
////         int[] count = new int[26];
////         for(int i=0; i<s.length(); i++){
////             ++count[s.charAt(i)-'a'];
////         }
////         String answer = "";
////         for(int i=0; i<count.length; i++){
////             if(count[i] == 1){
////                 answer += (char)('a'+i);
////             }
////         }
////         return answer;
////     }
//// }
////ctrl + z
//import java.util.*;
//class Solution {
//    public int solution(String s) {
//        Integer answer = 0;
//        String[] strary = s.split(" ");
//        for (int i=0; i<strary.length; i++ ) {
//            if (strary[i].equals("Z")) {
//                answer -= Integer.valueOf(strary[i-1]);
//            } else {
//                answer += Integer.valueOf(strary[i]);
//            }
//                
//        }
//        System.out.print(Arrays.toString(strary));
//        return answer;
//    }
//}
////7의개수
//import java.util.*;
//class Solution {
//    public int solution(int[] array) {
//        int answer = 0;
//        
//        StringBuilder stringBuilder = new StringBuilder();
//
//    for (int i = 0; i < array.length; i++) {
//    stringBuilder.append(array[i]);
//    }
//    String str = stringBuilder.toString();
//    for (int i=0; i<str.length(); i++) {
//        if (str.charAt(i) == '7') {
//            answer ++;
//        }
//    }
//        return answer;
//    }
//}
////이진수 더하기 <<<<<<<<<<<<<<<<<<< 하드코딩실패
//class Solution {
//    public String solution(String bin1, String bin2) {
//    String answer = "";
//        int num1 = Integer.parseInt(bin1, 2);
//        int num2 = Integer.parseInt(bin2, 2);
//        int res = num1+num2;
//        answer = Integer.toBinaryString(res);
//        return answer;
//    }
//}
//        // return Integer.toBinaryString(Integer.parseInt(bin1,2)+Integer.parseInt(bin2,2));
////       int dec1 =0;
////       int dec2 =0;
////         for (int i=0; i<bin1.length(); i++) {
////             dec1 = (dec1<<1) + bin1.charAt(i)-'0';
////         }
////         for (int i=0; i<bin2.length(); i++) {
////             dec2 = (dec2<<1) + bin2.charAt(i)-'0';
////         }
//        
//        
//        
//        
//        
//// //         int dec2 = 0;
//// //         int k2 = bin2.length() -1;
//// //         int multi2 = 1;
//
//// //         for (int i=0; i<bin2.length()-1; i++) {
//// //             if (bin2.charAt(i) == '1') {
//// //                 while(k2>0) {
//// //                     multi2 *= 2;
//// //                     k2--;
//// //                     }
//// //             dec2 += multi2;
//// //             multi2 =1;
//// //             k2 = bin2.length() -2 -i;
//// //             }
//// //         }
//// //         if (bin2.charAt(bin2.length()-1) == '1' ) {
//// //             dec2 ++;
//// //         }
//// //         System.out.println(dec2);
//                    
//        
//// //         int dec1 = 0;
//// //         int k1 = bin1.length() -1;
//// //         int multi1 = 1;
//// //         for (int i=0; i<bin1.length()-1; i++) {
//// //             if (bin1.charAt(i) == '1') {
//// //                 while(k1>0) {
//// //                     multi1 *= 2;
//// //                     k1--;
//// //                     }
//// //             dec1 += multi1;
//// //             multi1 =1;
//// //             k1 = bin2.length() -2 -i;
//// //             }
//// //         }
//// //         if (bin1.charAt(bin1.length()-1) == '1' ) {
//// //             dec1 ++;
//// //         }
//// //         System.out.println(dec1);
//        
////         int resultdec = dec1 + dec2;
//        
////         for(int i=resultdec; i>0; i/=2) {
//// 			answer = String.valueOf(i%2) + answer; //오른쪽 부터 집어넣는다.
//// 		}
//
////         return answer;
////     }
//// }
//소인수분해
//import java.util.*;
//class Solution {
//    public int[] solution(int n) {
//        ArrayList<Integer> answer = new ArrayList<>();
//        int count =0;
//        for (int i=2; i<=n; i++) {
//            if (n%i == 0) {
//                for (int j=1; j<=i; j++) {
//                    if (i%j ==0) {
//                        count ++;
//                    }
//                }
//           if (count ==2) {
//            answer.add(i);   
//            }
//                count =0;
//            }
//        }
//        
//         int[] answerArr = answer.stream()
//                .mapToInt(i -> i)
//                .toArray();
//        
//        return answerArr;
//    }
//}
////잘라서배열저장
//
//import java.util.*;
//
//class Solution {
//    public String[] solution(String my_str, int n) {
//        List<String> list = new ArrayList<>();
//        String cut = "";
//
//        for(int i =0; i<my_str.length(); i++){
//            cut += my_str.charAt(i);
//            if(cut.length() == n || i+1 == my_str.length()){
//                list.add(cut);
//                cut = "";
//            }
//        }
//        String[] answer = new String[list.size()];
//        for(int i=0; i<list.size(); i++){
//            answer[i] = list.get(i);
//        }
//        return answer;
//    }
//}
//공던지기
//class Solution {
//    public int solution(int[] numbers, int k) {
//        int answer = 0;
//        answer = numbers[2 * (k-1)  % numbers.length];
//        return answer;
//    }
//}
////문자열 계산하기
//import java.util.*;
//class Solution {
//    public int solution(String my_string) {
//        int answer = 0;
//       
//        String [] strarray = my_string.split(" ");
//        System.out.println(Arrays.toString(strarray));
//        answer = Integer.valueOf(strarray[0]);
//         for (int i=1; i<strarray.length-1; i++) {
//             if (strarray[i].equals("+")) {
//                 answer += Integer.valueOf(strarray[i+1]) ;
//             } else if (strarray[i].equals("-")) {
//                 answer -= Integer.valueOf(strarray[i+1]) ;
//             }
//        //     if (my_string.charAt(i))
//        // }
//         }
//        return answer;
//    }
//}
////영어가싫어요
//import java.util.*;
//
//class Solution {
//    public long solution(String numbers) {
//        long answer = 0;
//        String temp = "";
//        String[] strnum = new String[10];
//        String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
//        for (int i=0; i<str.length; i++) {
//          numbers=  numbers.replace(str[i],String.valueOf(i));
//        }
//        System.out.println(numbers);
//        answer = Long.parseLong(numbers);
//        
//        
//        
//        return answer;
//        
//    }
//}