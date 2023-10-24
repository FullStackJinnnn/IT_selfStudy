package exma23;

public class CompareMaxMain01 {

		public static void main(String[] args) {
			
			int num01 = 20;
			int num02 = 30;
			
			//익명클래스 만들기
			CompareMax compareMax = new CompareMax() {
				@Override
				public int max(int x, int y) {
					return x > y ? 1 : x < y ? -1 : 0; 
					//x가 y보다 크면 1
					//x가 y보다 작으면 -1
					//둘아 아니라면 0
				}
			};
			
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
