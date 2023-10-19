package exam16;

public class StringCompareExam {
	public static void main(String[] args) {
	
		String apple1 ="사과";
		String apple2 ="사과";
		String apple3 = new String("사과");
		
		//비교
		System.out.println("apple1 == apple2" + (apple1 == apple2));
		System.out.println("apple3 == apple2" + (apple3 == apple2));
		System.out.println(apple3);
		
		//객체의 위치값 출력 
		//== 비교는 가지고있는 값 비교가 아니라 가지고 있는 위치 비교 
		System.out.println("apple1 : " + System.identityHashCode(apple1));
		System.out.println("apple1 : " + System.identityHashCode(apple2));
		System.out.println("apple1 : " + System.identityHashCode(apple3));
		
		
		//equals로 비교하면 주소가 아닌 값주소로 비교가능
		System.out.println("apple1 == apple2" + (apple1.equals(apple2)));
		System.out.println("apple3 == apple2" + (apple3.equals(apple2)));
		
	
	}		
}
