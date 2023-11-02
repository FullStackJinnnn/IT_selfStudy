//오름차순일때 중앙값
package easy.code.test;

import java.util.Scanner;

class Solution30 {
    public int solution(int[] array) {
        int answer = 0;
        int temp = 0;
        
        for (int i=0; i<array.length-1 ;i ++) { //버블정렬 앞뒤값 비교해서 큰것 계속 뒤로보내기 
            for (int j=0; j<array.length-i-1; j++) {
                if (array[j] > array[j+1]) {
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        answer = array[array.length/2];
        return answer;
    }

	
	
	public static void main(String[] args) {
		Solution30 sol = new Solution30() ;
		Scanner scan = new Scanner(System.in);
		int[] array = {-1,8,8,9,0};
		int answer = sol.solution(array);
		
		System.out.println(answer);
	}
	
	
	
}