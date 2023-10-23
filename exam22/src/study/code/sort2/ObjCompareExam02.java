package study.code.sort2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ObjCompareExam02 {

	public static void main(String[] args) {
		
		Student2 st01 = new Student2("김철수" ,260);
		Student2 st02 = new Student2("김영희" ,290);
		Student2 st03 = new Student2("김대리" ,280);
		
		List<Student2> list = new ArrayList<>();
		list.add(st01);
		list.add(st02);
		list.add(st03);
		
		
		System.out.println("정정렬 전 : " );
		for (Student2 st : list) {
			System.out.println(st);
		}
		//오름 차순
		//객체이기때문에 소트기능을 그냥 사용할수없다.
		//메서드를 통해서 제어햐아한다.
		Collections.sort(list, new StdAscCompare());
		
		//외부에서 만드는것의 장점은 필요하면 클래스와 컴페어 재활용가능
		//오름차순 내림차순 옵션을 2개만들어서 원할떄마다 끼울 수있다.
		//내부 장점은 필요한 부분만 고치면 되지만 동시 수행은 안된다는 단점.
		System.out.println("정렬 후 : ");
		for (Student2 st : list) {
			System.out.println(st);
		}
	}

}
