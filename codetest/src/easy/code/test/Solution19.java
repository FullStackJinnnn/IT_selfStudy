//배열원소 길이
package easy.code.test;

import java.util.Scanner;

class Solution19 {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for (int i=0; i<strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }




	public static void main(String[] args){
	    
		Solution19 sol = new Solution19();
	    Scanner scan = new Scanner(System.in);
	    System.out.println("입력할 배열의 수 :");
	    int count = scan.nextInt();
	    String[] array1 = new String[count];
	    System.out.println("숫자를 1개씩 입력하세요 :");
	    for (int i=0; i<count; i++) {
	    	array1[i] = scan.next();
	    }
	    
	    int[] array2 = sol.solution(array1);
	    System.out.println("입력한 배열 : ");
	    for (int i=0; i<array1.length; i++) {
	    	System.out.print(array1[i] + " ");
	    }
	    System.out.println("\n2배된 배열: ");
	    for (int i=0; i<array2.length; i++) {
	    	System.out.print(array2[i] + " ");
	    }
	}
}
