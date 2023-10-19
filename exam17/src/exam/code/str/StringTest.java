package exam.code.str;

public class StringTest {

	public static void main(String[] args) {

		String str = "오늘은 비가 너무 많이 옵니다 비조심.";
		
		System.out.println("문장의 길이 " + str.length());
		
		System.out.println("문자추 추출 :" + str.charAt(11));// 해당 위치에 있는 캐릭터 하나 추출 
		
		System.out.println("해당 문자 위치 :" +str.indexOf("이"));
	
		System.out.println("해당 문자 마지막 :" +str.lastIndexOf("이")); //중복된 글자중 마지막 위치 출력
		
		String str2 = "11오늘은 비22가 너무 많이 옵니다 33비조심.";
		
		System.out.println(str2.replaceAll("[0-9]", " ")); // 숫자가 0~9인것들은 공백으로 처리 
		//그냥 replace를 쓰면 정규식으로 인정되지 않고 하나의 스트링으로 인식 
		//replaceall로해서 정규식이란 패터을 쓰면 편하다 .
		
		String	str3="오늘은 날씨가 험하니 집에 일찍 들어가세요";
		
		System.out.println(str3.substring(11));//11부터 출력 
		System.out.println(str3.substring(0,11));//0~10까지 출력 
		
		//배열의속성 -> 길이고정, 수정,변경 불가능 
		//String a ="산삼"
		//a + "계세요" 를하면 크기가 2였던 배열이 5로 늘어나면서 새로운 주소값을 갖는다 . (새로운 공간에 할당) 주소값이 달라짐
		//이러한 메모리적인 부담을 덜어주고자 나온게 Stringbuffer, Stringbuilder이다.
		//보통 StringBuilder를 더 많이쓴다 그이유는
		// String Buffer는 thread safty가있다 .
		//이것은 비동기 상황에서 data유지가능.
		//한번에 여러가지가 데이터에 접하지 못하도록 막는다.
		//데이터 접근 권한을 한개씩 줌으로써 질서 유지기능이 있다.
		//Builder는 다음과 같은 기능이 없다.
		//thread를 사용할때는 buffer가 좋지만 그외에 입란적인 상황에선 builder가 좋다 .
		//빌더나 버퍼는 내부적 배열을 만들때 좀더 넉넉하게 만든다. 어느정도 글자가 들어오는것은 커버할 수 있다.
		
		
		
	}	

}
