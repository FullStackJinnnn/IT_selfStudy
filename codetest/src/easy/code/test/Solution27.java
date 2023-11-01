//배열추출
package easy.code.test;

import java.util.Scanner;

import java.lang.Math;


class Solution27 {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];
        for(int i = num1; i <= num2; i++) {
            for(int j = 0; j <= num2-num1; j++) {
                    answer[j]=numbers[i++];
            }
        }
        return answer;
    }




    


	public static void main(String[] args){
	    
		Solution27 sol = new Solution27();
	    Scanner scan = new Scanner(System.in);
	    System.out.println("배열개수 입력 :");
	    int count = scan.nextInt();
	    int[] array = new int[count];
	    
	    System.out.println("배열 입력  ");
	    for (int i=0; i<array.length; i++ ) {
	    	array[i] = scan.nextInt();
	    }
	    System.out.println("숫자1 입력 :");
	    int num1 = scan.nextInt();
	    System.out.println("숫자2 입력 :");
	    int num2 = scan.nextInt();
	    
	
	    int[] answer = sol.solution(array,num1,num2);
	    for (int i=0; i<answer.length; i++) {
	    	System.out.print(answer[i]);
	    }
	    
	     
	}
}
