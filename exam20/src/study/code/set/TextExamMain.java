package study.code.set;

import java.util.HashSet;
import java.util.Set;

public class TextExamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TextMessage msg1 = new TextMessage("1001", "좋은아침");
		TextMessage msg2 = new TextMessage("1001", "좋은아침");
		TextMessage msg3 = new TextMessage("1001", "좋은아침");
		TextMessage msg4 = new TextMessage("1002", "잘자요");
		
		Set<TextMessage> txSet = new HashSet<>(); //일반 헤쉬셋은 순서가없다.
		//앞에다 set을 두는 이유는 뒤에애들 목적에 따라서 쉽게 바꿀수 있기 때문이다.
		
		txSet.add(msg1);
		txSet.add(msg2);
		txSet.add(msg3);
		txSet.add(msg4);
		
		System.out.println("Set 사이즈" + txSet.size()
		);
		
		//향상된 for문
		for(TextMessage msg : txSet) {
			System.out.println("==========================");
			System.out.println("메세지 번호 : " + msg.getMsgNumber());
			System.out.println("메세지 내용 :");
			System.out.println(" " + msg.getMessage());
			System.out.println("==========================");
		}
		
		
	}

}
