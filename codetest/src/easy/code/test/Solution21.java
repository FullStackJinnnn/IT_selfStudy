//배열 2개 곱해서 최대값 만들기
package easy.code.test;

import java.util.Scanner;

class Solution21 {
    public int solution(int[] numbers) {
        int answer = 0;
        int max = numbers[0];
        int prevmax = 0;
        for (int i=1; i<numbers.length; i++) {
            if(max < numbers[i]) {
                prevmax = max ;
                max = numbers[i];
            }
            else if (prevmax < numbers[i]) {
            	prevmax = numbers[i];
            }
        }


        answer = max * prevmax;
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
	    System.out.println("\n최대값 : " + answer);
	    
	}
}
