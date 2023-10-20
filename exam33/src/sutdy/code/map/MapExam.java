package sutdy.code.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExam {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		//입력
		map.put("one", 1);
		map.put("two", 2);
		map.put("two", 22);
		map.put("three", 3);
		map.put("four", 4);
		map.put("five", 5);
		//맵은 키중복이 일어나면 값을 치환한다.
		//지금 two 에는 22가 들어가있음
		System.out.println("map 의 사이즈:" + map.size());
	
		map.remove("five");
		System.out.println("map 의 사이즈:" + map.size());
		
		System.out.println("map has that key name is one : " + map.containsKey("six"));
		System.out.println("map has that key name is one : " + map.containsValue(22));
		
		//출력형태
		// key를 이용한 출력
		Set<String> keySet = map.keySet();
		
		for(String key : keySet) {
			System.out.println("key : " + key +", value : " + map.get(key));
		}
		
		System.out.println("============================");
		//Entry 를 이용한 출력
		//Entry 가 더 복잡하당......
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		
		for(Map.Entry<String, Integer> en : entrySet) {
			System.out.println("key : " + en.getKey() +", value : " + en.getValue());
		//map은 다른거에비해 삽입삭제가느린대신 검색이 훨씬 빠르다 key를 이용해서 ..
			//아니면 분류할때
		}
	}
}
