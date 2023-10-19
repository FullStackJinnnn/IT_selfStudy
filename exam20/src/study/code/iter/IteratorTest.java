package study.code.iter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorTest {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4)
				); //바로 값줄때 aslist사용
		Set<Integer> set = new HashSet<>(list);
		
		//list 를 iterator 이용하여 출력
		Iterator<Integer> intIter = list.iterator();
		//Iterator 자동임포트할떄 2개나오는데 우리가 사용하는것은 util쪽에 있다
		
		while(intIter.hasNext()) {
			System.out.println(intIter.next());
	
		}
		
		//set을 iterator를 이용해서 출력
		Iterator<Integer> setIter = set.iterator();
		
		while(setIter.hasNext()) {
			System.out.println(setIter.next());
		}
	}
}
