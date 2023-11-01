//홀수 짝수 개수 
package easy.code.test;

import java.util.Scanner;

import java.lang.Math;

class Solution25 {
	public Solution25 () {
		
	}
	
	public int[] solution (int[] num_list) {
		int[] answer = new int[2];
		for (int i=0; i<num_list.length; i++) {
			if (num_list[i] % 2 == 0) {
				answer[0] ++;
			} else
				answer[1] ++;
		}
		
		return answer;
		
	}


	public static void main(String[] args){
	    
		Solution25 sol = new Solution25();
	    Scanner scan = new Scanner(System.in);
	    System.out.println("배열개수 입력 :");
	    int count = scan.nextInt();
	    int[] array = new int[count];
	    
	    System.out.println("배열 입력  ");
	    for (int i=0; i<array.length; i++ ) {
	    	array[i] = scan.nextInt();
	    }
	
	    int[] answer = sol.solution(array);
	    System.out.print(answer[0] + " " + answer[1]);
	    
	     
	}
}
