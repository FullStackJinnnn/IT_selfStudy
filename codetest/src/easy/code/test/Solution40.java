//배열에서 배수 뺴기 
package easy.code.test;

import java.util.Scanner;

import java.util.ArrayList;
class Solution40 {
    public ArrayList solution(int n, int[] numlist) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i=0; i<numlist.length; i++) {
            if (numlist[i]%n ==0) {
                answer.add(numlist[i]);
            }
            
        }
        return answer;
    }

    
	
	
	public static void main(String[] args) {
		Solution40 sol = new Solution40() ;
		Scanner scan = new Scanner(System.in);
		int[] array = {1,2,3,4,5};
		ArrayList answer = sol.solution(3,array);
		
		
		System.out.print(answer);
		}



	
	
	
	
}