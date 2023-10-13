import java.util.Scanner;

public class MathMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("반지름 입력해라 :");
		int ban = scan.nextInt();
		
		double Area = ban*ban * MathCal.pi;
		
		MathCal.print(Area);
		
	}

}
