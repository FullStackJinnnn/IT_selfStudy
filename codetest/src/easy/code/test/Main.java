package easy.code.test;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

// 사용자 입력

		int input = scan.nextInt();

		Main main = new Main();

		main.solution(input);

	}

	public int solution(int input) {

		// 소수를 모두 합한 변수 초기화

		// input은 최소 4부터 주어지기에 소수 2,3을 더한값으로 초기화

		int primeNumTotal = 5;

		// 4부터 input값까지 순회하며 반복

		for (int i = 4; i <= input; i++) {

		// 소수인지 확인을 위한 변수 초기회

		int divideCnt = 0;

		// 1과 자기자신은 무조건 나눴을때 나머지가 0이기에 제외

		for (int j = 2; j < i; j++) {

		// 나눴을때 나머지가 0이되는 숫자가 있는지 확인

		if (i % j == 0) {

		divideCnt++;

		}

		}

		// 나눠지는 숫자가 없었다면 i는 소수이기에 총합에 더하기

		if (divideCnt == 0) {

		primeNumTotal += i;

		}

		}

		System.out.print("> " + primeNumTotal);

		// 모든 소수의 합 리턴

		return primeNumTotal;

		}

}