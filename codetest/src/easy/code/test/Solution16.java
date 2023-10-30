//배열비교 후 같은원소 확인
package easy.code.test;

import java.util.Scanner;

class Solution16 {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
    
        for (int i=0; i<=s1.length-1; i++) {
            for (int j=0 ; j<=s2.length-1; j++) {
                if (s1[i].equals(s2[j])) { // ==으로 비교하면 주소비교이기 떄문에 내용비교로 확인해야한다...........
                    answer ++;
                }
            }
        }
        return answer;
    }




	public static void main(String[] args){
	    
		int answer = 0;
		Solution16 sol = new Solution16();
	    Scanner scan = new Scanner(System.in);
	    System.out.println("첫번째 배열 입력받을 배열의 수 :");
	    int count = scan.nextInt();
	    System.out.println("두번째 배열 입력받을 배열의 수 :");
	    int count2 = scan.nextInt();
	    String[] array1 = new String[count];
	    String[] array2= new String[count2];
	
	    System.out.println(count + "개의 문자를 입력하시오");
	    for (int i=0; i<count; i++) {
	    	array1[i] = scan.next();
	    }
	    
	    System.out.println(count2 + "개의 문자를 입력하시오");
	    for (int i=0; i<count2; i++) {
	    	array2[i] = scan.next();
	    }

	    
	    System.out.println("입력한 배열1 :");
	    for (int i=0; i<count; i++) {
	    	System.out.print(array1[i] + " ");
	    }
	    
	    System.out.println("\n입력한 배열2 :");
	    for (int i=0; i<count2; i++) {
	    	System.out.print(array2[i] + " ");
	    }
	    
	    answer = sol.solution(array1, array2);
	    System.out.println("중복되는숫자는 " + answer + "개입니다.");
 	   
	    
	}
}
