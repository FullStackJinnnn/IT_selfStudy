//아이스아메리카노 잔, 잔돈 배열생성
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
}





	public static void main(String[] args){
	    
		int[] answer =new int[2];
		Solution18 sol = new Solution18();
	    Scanner scan = new Scanner(System.in);
	    System.out.println("가지고있는 돈 입력 :");
	    int money = scan.nextInt();
	    answer = sol.solution(money);
	    for (int i=0; i<answer.length; i++) {
	    	System.out.print(answer[i] + " ");
	    }
	}
}
