package sutdy.code.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExam02 {
	public static void main(String[] args) {
		
		String[] flowers ={"백합","장미", "안개꽃", "튤립", "장미", "백합", "튤립", "안개꽃"};
		
		//꽃별로 몇개씩 사왔는지 확인.
		Map<String, Integer> flMap = new HashMap<>();
		int count = 0;
		for(int i=0; i < flowers.length ; i++) {
			String flower = flowers[i];
			//꽃이름과 동일한 key를 가지고 있다면
			if(flMap.containsKey(flower)) {
				//현재 개수에 한개를 더한다
				count = flMap.get(flower) +1;
				//맵에 치환 - key중복 치환 이용
				flMap.put(flower,  count);
			}else {
				//중복이 없다면 맵에 등록
				flMap.put(flower, 1);
	
			}
		}
		//출력을 위해 keyset가져오기
		Set<String> KeySet = flMap.keySet();
		
		for(String key : KeySet) {
			System.out.println("꽃 :" + key + ", 개수 : " + flMap.get(key));
		}
	}
}
