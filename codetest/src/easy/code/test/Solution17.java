//아이스아메리카노 잔, 잔돈 배열생성
package easy.code.test;

import java.util.Scanner;

class Solution17 {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int cup = money/5500;
        int change = money - cup*5500;
        answer[0] = cup;
        answer[1] = change;
        // answer = {cup,change} ; 2개짜리 배열이라고 선언후에 이렇게 넣는건 안된다 ,...
        //int[] answer = {cup,change} ;  {}를활용해 기입하는건 처음 선언부 부터 해야 가능하다.
        return answer;
    }





	public static void main(String[] args){
	    
		int[] answer =new int[2];
		Solution17 sol = new Solution17();
	    Scanner scan = new Scanner(System.in);
	    System.out.println("가지고있는 돈 입력 :");
	    int money = scan.nextInt();
	    answer = sol.solution(money);
	    for (int i=0; i<answer.length; i++) {
	    	System.out.print(answer[i] + " ");
	    }
	}
}
