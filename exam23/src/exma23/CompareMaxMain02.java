package exma23;

public class CompareMaxMain02 {

		public static void main(String[] args) {
			
			int num01 = 20;
			int num02 = 30;
			
			//익명클래스 를 사용해서 간단하게 만드는것이 람다식이다.
			CompareMax compareMax = (x, y) -> {return x > y ? 1 : x < y ? -1 : 0;};
			
			int result = compareMax.max(num01, num02);
			if(result ==1) {
			System.out.println(num01 + "이" +num02 + "보다 크다");
		}else if(result ==-1) {
			System.out.println(num01 + "이" +num02 + "보다 작다");
		}else {
			System.out.println(num01 + "과" +num02 + "는 같다.");
		}
	}	
}
