//배열뒤집기
package easy.code.test;

import java.util.Scanner;

class Solution15 {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        answer = new int[num_list.length];
        for (int i=num_list.length-1;  i >=0; i--) {
            answer[num_list.length-1-i] = num_list[i];
        }
        return answer;
    }




	public static void main(String[] args){
	    
		Solution15 sol = new Solution15();
	    Scanner scan = new Scanner(System.in);
	    System.out.println("입력받을 배열의 수 :");
	    int count = scan.nextInt();
	    int[] array = new int[count];
	    int[] reversearray = new int[count];
	
	    System.out.println(count + "개의 정수를 입력하시오");
	    for (int i=0; i<count; i++) {
	    	array[i] = scan.nextInt();
	    }
	    
	    System.out.println("입력한 배열 :");
	    for (int i=0; i<count; i++) {
	    	System.out.print(array[i] + " ");
	    }
	    System.out.println("\n배열 뒤집기 :");
	    reversearray = sol.solution(array);
	    for (int i=0; i<count; i++) {
	    	System.out.print(reversearray[i] + " ");
	    }
	    
	}
}
