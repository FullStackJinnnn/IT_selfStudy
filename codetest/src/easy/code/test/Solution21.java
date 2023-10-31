//배열 2개 곱해서 최대값 만들기
package easy.code.test;

import java.util.Scanner;

class Solution21 {
    public int solution(int[] numbers) {
        int answer = 0;
        int temp1 = numbers[0];
        int temp1index = 0;
        int temp2 = 0;
        for (int i=0; i<numbers.length; i++) {
            if(temp1 < numbers[i]) {
                temp1 = numbers[i];
                temp1index = i;
            }
        }
        numbers[temp1index] = 0;
    
        for (int i=0; i<numbers.length; i++) {
            if(temp2 < numbers[i]) {
                temp2 = numbers[i];
            }
        }   
        answer = temp1 * temp2;
        return answer;
    }





	public static void main(String[] args){
	    
		Solution21 sol = new Solution21();
	    Scanner scan = new Scanner(System.in);
	    System.out.println("입력할 배열의 수 :");
	    int count = scan.nextInt();
	    int[] array1 = new int[count];
	    System.out.println("숫자를 1개씩 입력하세요 :");
	    for (int i=0; i<count; i++) {
	    	array1[i] = scan.nextInt();
	    }
	    
	    int answer = sol.solution(array1);
	    System.out.println("입력한 배열 : ");
	    for (int i=0; i<array1.length; i++) {
	    	System.out.print(array1[i] + " ");
	    }
	    System.out.println("최대값 : " + answer);
	    
	}
}
