//11866번 요새푸스

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.LinkedList;
// import java.util.Queue;

// public class Main {
// 	public static void main(String[] args) throws IOException {

// 		Queue<Integer> queue = new LinkedList<>();

// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		String input = br.readLine();
// 		String numArr[] = input.split(" ");
// 		int interval = 1;
// 		for (int i = 0; i < Integer.parseInt(numArr[0]); i++) {
// 			queue.add(i+1);
// 		}
// 		System.out.print("<");
// 		while (!queue.isEmpty()) {
// 			int var = queue.poll();
// 			if (interval % Integer.parseInt(numArr[1]) != 0) {
// 				queue.add(var);
				
// 			}	else if (queue.size()==0) {
// 					System.out.print(var);
// 				}
// 			else {
// 				System.out.print(var+", ");
// 			}
// 			interval++;
// 		}
// 		System.out.print(">");

// 	}
// }
