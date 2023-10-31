//배열 두배
package easy.code.test;

import java.util.Scanner;

class Solution18 {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for (int i=0; i<numbers.length; i++) {
            answer[i] = numbers[i] *2;
        }
        
        return answer;
    }



	public static void main(String[] args){
	    
		Solution18 sol = new Solution18();
	    Scanner scan = new Scanner(System.in);
	    System.out.println("입력할 배열의 수 :");
	    int count = scan.nextInt();
	    int[] array1 = new int[count];
	    System.out.println("숫자를 1개씩 입력하세요 :");
	    for (int i=0; i<count; i++) {
	    	array1[i] = scan.nextInt();
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
