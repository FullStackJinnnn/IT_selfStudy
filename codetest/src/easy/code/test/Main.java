package easy.code.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

	
		int[][] arr = new int[15][15];
		long n1 = 0;
		long n2 = 0;
		long fiboFloor = 0;
		int total = 0;
		for (int i = 0; i < 15; i++) {
			arr[0][i] = i + 1;
		}
		for (int i = 1; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				if (j == 0) {
					arr[i][j] = 1;
				} else {
					arr[i][j] = arr[i][j - 1] + arr[i - 1][j];
				}
			}
		}
		for (int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			int k = Integer.parseInt(br.readLine());

				System.out.println(arr[n][k-1]);
			}
		}
	}