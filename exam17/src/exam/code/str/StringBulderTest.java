package exam.code.str;

public class StringBulderTest {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("안녕하세요" + "\n");
		sb.append("만나서 반갑습니다.");
		
		System.out.println(sb);
		System.out.println("------------------------");
		
		//삭제
		
		// delete(int start, int end); start<= x < end
		
		sb.delete(0, 4);
		System.out.println(sb);
		System.out.println("------------------------");
		//상빙ㅂ
		sb.insert(4, "안녕하세요"); // 삽입 시작위치 삽입할땐 연속성이 있어야한다.
		System.out.println(sb);
		System.out.println("------------------------");
		
		System.out.println(sb.reverse()); //문자 반대로 출력
	}
	
	
}	
