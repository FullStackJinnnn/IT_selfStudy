package easy.code.test;

import java.util.Scanner;

public class baekjoon {
	  public static void main(String[] args) {
	       Scanner scan = new Scanner(System.in);
	       String input = scan.nextLine();
	       String output = "";
	       
	       //가장 높은 점수를 저장할 변수
	       int max = 0;
	       
	       // 시험 응시자의 점수를 저장할 배열 선언 및 초기화
	       int[] scoreArray = new int[3];
	       scoreArray[0] = 0;
	       scoreArray[1] = 0;
	       scoreArray[2] = 0;
	       
	       //입력받은 문자열을 숫자를 제외한 문자를 기준으로 잘라서 배열에 대입
	       String[] numbers = input.split("[^0-9]+");
	       //System.out.println(Arrays.toString(numbers));
	 
	       //배열을 순회하며 정답이 맞으면 해당 번호를 찍은 응시자 점수 증가 
	       for (int i=1; i<numbers.length; i+=2) {
	    	 
	    		   if (Integer.parseInt(numbers[i])==1) {
	    			   scoreArray[0]+=Integer.parseInt(numbers[i+1]);
	    		   }
	    		   if (Integer.parseInt(numbers[i])==3) {
	    			   scoreArray[1]+=Integer.parseInt(numbers[i+1]);
	    		   }
	    		   if (Integer.parseInt(numbers[i])==5) {
	    			   scoreArray[2]+=Integer.parseInt(numbers[i+1]);
	    			   
	    		   }
	       }
	       //응시자의 점수중 최댓값을 max에 대입
 	       for (int i=0; i<scoreArray.length; i++) {
 	    	   if (scoreArray[i] > max) {
 	    	   max = scoreArray[i];
 	    	   }
 	       }
	       
 	       
 	       //가장 점수가 높은 응시자의 이름과 점수를 “이름 : 점수” 형태로
	       System.out.print(" > ");
	       if (scoreArray[0]!=0 && scoreArray[0]==max) {
	    	   output = "a:"+ scoreArray[0];
	       }
	       if (scoreArray[1]!=0&& scoreArray[1]==max) {
	    	   if (output.isBlank()) {
	    		   output="b:" + scoreArray[1];
	    	   } else {
	    		   output = output.concat(", b:"+ scoreArray[1]);
	    	   }
	    
	       }
	       if (scoreArray[2]!=0 && scoreArray[2]==max) {
	    	   if (output.isBlank()) {
	    		   output = "c"+ scoreArray[2];
	    	   } else {
	    		   output = output.concat(", c:"+ scoreArray[2]);
	    	   }
	       }
	       System.out.println(output);
	    		   
	    		   
	    	   
	  
	       
	    }
}