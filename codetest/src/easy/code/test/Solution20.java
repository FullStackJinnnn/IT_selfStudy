//점의 위치
package easy.code.test;

import java.util.Scanner;

class Solution20 {
    public int solution(int[] dot) {
        int answer = 0;
        if (dot[0] > 0 && dot[1] >0) {
            answer = 1;
        }
        else if (dot[0] < 0 && dot[1] >0) {
            answer = 2;
        }
        else if (dot[0] > 0 && dot[1] <0) {
            answer = 3;
        }
        else if (dot[0] > 0 && dot[1] >0) {
            answer = 4;
        }
        return answer;
    }





	public static void main(String[] args){
	    
		Solution20 sol = new Solution20();
	    Scanner scan = new Scanner(System.in);
	    int[] array1 = new int[2];
	    System.out.println("숫자를 1개씩 입력하세요 :");
	    for (int i=0; i<2; i++) {
	    	array1[i] = scan.nextInt();
	    }
	    int answer = sol.solution(array1);
	    System.out.println(answer);
	    
	    
	}
}
