//삼각형 그리기
package easy.code.test;

import java.util.Scanner;

import java.lang.Math;

class Solution26 {
    public int solution(int[] sides) {
        int answer = 0;
        int max = sides[0];
        int temp = 0;
        //가장 큰수 제일 우측으로 옮기기
        for (int i=1; i<sides.length; i++ ) {
            if (max < sides[i]) {
                max = sides[i];
            } else {
                temp = sides[i];
                sides[i] = max;
                sides[i-1] = temp;
            }
        }
        if (sides[0]+sides[1]  > sides[2]) {
            answer = 1;
        } else
            answer = 2;
        return answer;
    }

    


	public static void main(String[] args){
	    
		Solution26 sol = new Solution26();
	    Scanner scan = new Scanner(System.in);
	    System.out.println("배열개수 입력 :");
	    int count = scan.nextInt();
	    int[] array = new int[count];
	    
	    System.out.println("배열 입력  ");
	    for (int i=0; i<array.length; i++ ) {
	    	array[i] = scan.nextInt();
	    }
	
	    int answer = sol.solution(array);
	    System.out.print(answer);
	    
	     
	}
}
