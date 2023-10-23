package lottoExam2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ListLottoExam {

	public static void main(String[] args) {
		//45개 공을 담을 리스트
		List<Integer> balls = new ArrayList<>();
		//로또를 저장할 리스트
		List<Integer> lotto = new ArrayList<>();
		//보너스번호 저장
		int bonusNumber = 0;
		
		//45개의 공 생성
		for(int i=0; i<45; i++) {
			balls.add(i+1);
		}
		
		
		//컬렉션 프레임워크를 도와주는 클래스 Arrays와 동일 역할
		
		Collections.shuffle(balls); // 지원해주는 섞는기능
		
		//공을 추첨
		int count =0;
		while(count <7) {
			//리스트를 섞는다
			Collections.shuffle(balls); 
			
			if(count <6) {
				lotto.add(balls.get(0)); //앞에서부터 뽑는걸한다. get(0)은 
				//ball list의 0번째 인덱스 값을 뜻한다
				//중복제거를 위햐 공을 지욷다.
				balls.remove(0);
			}else {
				bonusNumber = balls.get(0);
			}
			count++ ; // 꺼냔공개수 증가 
			
		}
		System.out.println("로또 :" + lotto + "보너스 번호 ㅣ" + bonusNumber);
		
		//사용자 로또
		count = 0;
		Scanner scan = new Scanner(System.in);
		List<Integer> myLotto = new ArrayList<>();
		//사용자 로또 선택
		while(count < 6) {
			try {
			System.out.println((count+1) +"번째 로또 :");
			int ball = scan.nextInt(); //입력된게 버퍼에 남기때문에 무한루프를돌아 버퍼를 비워야한다
			//flush기능 
			//nextLine의 첫번째기능은 찌꺼기 제거기눙.
			//하지만 nextLine도 찌꺼기가 있으면 잘 작동하지 않기 때문에 중간에 한번 더 써줘야한다.
			//공의 범위 체크
			if (ball <1 || ball >45 ) {
//				System.out.println("입력범위는 1~45 입니다.");
//				continue; // 여기서 종료 후 다시시작
				throw new InputMismatchException("키입력 1~45");
			}
			//해당 값이 리스트에 존재하는지 확인
			if(myLotto.contains(ball)) {
				System.out.println(ball + "번호는 이미 선택하셨습니다.");
				continue;
		
				
			}
			
			myLotto.add(ball);
			count++;
			}catch (InputMismatchException e) {
				//키입력 버퍼에 찌꺼기 제거 - flush -> auto flush
				scan.nextLine(); //두가지기능으로 쓰인다 키입력 or 찌꺼기 제거 
				//next 와 nextline 차이 
				//next는 띄어쓰기가 안된다. 홍 길동 공백이 있으면 끝으로 봐서 길동은 찌꺼기가된다.
				//nextline은 한 라인 전부를 버퍼에 저장 찌꺼기가 남지않음 라인에대해서는
				System.out.println(e.getMessage() == null ? "키입력이 잘못돼었습니다." : e.getMessage());
			}
		}
		//사용다한 스캐너 종료
		scan.close();
		
		//비교를 위한 객체
		List<Integer> matchNumbers = new ArrayList<>();
		int matchCount =0;
		boolean isBonus = false;
		for(int myBall : myLotto) {
			//내가 선택한 번호가 로또 번호중에 있다면
			if(lotto.contains(myBall)) {
				//저장
				matchNumbers.add(myBall);
			}
			
			//보너스번호를 못찾을때만 비교
			if(!isBonus) {
				//내공번호와 보너스번호가 같다면
				if(myBall == bonusNumber) {
					isBonus = true;
				
//			for(int ball : lotto) {
//				if(myball == ball) {
//					matchNumbers.add(myBall);
				}
			}
		}
		
		matchCount = matchNumbers.size();
		
		System.out.print("당첨번호 : " + matchNumbers);
		System.out.println(matchCount==5 && isBonus ? ", 보너스번호 : " + bonusNumber : " ");
		
		if(matchCount ==6) {
			System.out.println("대박 로또 1등");
		}else if(matchCount == 5 && isBonus) {
			System.out.println("대박 로또 2등");
		}else if(matchCount == 5 ) {
			System.out.println("대박 로또 3등");
		}else if(matchCount == 4 ) {
			System.out.println("대박 로또 4등");
		}else if(matchCount == 3 ) {
			System.out.println("대박 로또 5등");
		}else {
			System.out.println("꽝");
		}
	}
}
