package exam19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listexam {
	
	public static void main(String[] args) {
		
		//ArrayList<Integer>list01 = new ArrayList<>();
		//리스트는 이렇게 선언하지 않는다 모든 리스트는 인터페이스 리스트를 상속하고 구현하는 구현체이기때문에
		//선언할때는 다형성을 이용해 형변환을 이용. 부모타입으로 형변환.
		List<Integer> list = new ArrayList<>();
		//부모타입으로 선언하면 뒤가 바뀌어도 무넺가 안되고 부모 기능을 다 쓸 수 있다. 관리가 편하다.
		//자료형 int 가 아닌 클래스타입 integer로 스는 이유는 object라는 기본 데이터 타입을 쓰기 때문에 이 object를 변형하려면
		//object 하위인 클래스타입이 되어야한다.
		//그래서 제너릭에선 일반형으로 쓰지못하고 클래스타입 쓴다
	
		//추가
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
	
		
		//중간삽입
		list.add(5,10);
		list.add(1,20);
		//중간에 삽입하면 한칸 씩 밀린다. 
		
		//치환  
		list.set(0, 5);
		list.set(4, 13);
		
		//삭제 -공간도 지워진다.. 하나씨 당겨짐.
		list.remove(4);
		list.remove(3);
		System.out.println(list);
		
		
		//출력
		for(int i =0; i< list.size(); i++ ) {
			System.out.print(list.get(i) + "\t");
		}
		
		System.out.println("\n----------------");
		
		for(int val : list) {
			System.out.print(val + "\t");
		}
		
		System.out.println("\n----------------");
		
		//배열같은곳에 내부를 순환하는 커서가 있다 이커서가 값드을 찔러서 val에 하나하나 던져주는 것이 있다.
		//그 커서를 iterator라고 부른다.
		
		
		//iterator 를 이용한 출력
		//리스트를 순회하는 인트형 이터레이터 -> 꺼내야하는 숫자 정수형
		Iterator<Integer> iter = list.iterator();
		//커서가 다음게 있다고 True를 주면 itor는 다음데이터를 찔러서 값을 주고 다음걸 봐서 true면 또 찌르고 false면 멈춤
		//이터레이터는 있는지 체크후 있으면 값을 반환 
		while(iter.hasNext()) {
			System.out.print(iter.next()+"\t");
		}
		 
	}
}

//총 정리~~~~~~~~
//컬렉션 프레임워크 :컬렉션 프레임워크는 데이터를 다룰 때 사용되는주요 자류구조를 말한다. 컬렉션은 기존의List, Map, Set등의 자료 구조를 뜻하고 프레임우커는 클래스와 인터페이스를 묶어놓은 개념.

//리스트 컬렉션 :배열과 비슷하게 index로 객체를 관리. 다만 배열과는 다르게 크기의 제한이 없으며 삽입,삭제,변경의 기능이 자유롭다.
//List에는 대표적으로 ArrayList와 LinkedList가 있다.
//ArrayList : 데이ㅓ를 순차적으로 저장. 데이터가 삽입 될때마다 크기가 증가하고 배열을 삭제하면 공간이 줄어듭니다.
//Index를 기준으로 값을 삽입하거나 추출한다.
//LinkedList : Node 객체를 기반으로 데이터를 저장합니다. Node 객체는 데이터와 자신 다음에 올 데이터의 주소를 값으로 가집니다.
//ArrayList는 데이터를 출력하거나 검색할 경우에, Linked List는 데이터의 삽입과 삭제가 빈번할 경우에 사용하면 더 좋은 성능을 보여준다!
