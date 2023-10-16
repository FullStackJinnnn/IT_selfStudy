package exam10.abs;

public class Restraunt {
	public static void main(String[] args) {
		
		PastaRecipe ps = new PastaRecipe("최현석");
		ps.info();
		
		//추상화 클래스는 생성자를 통한 선언이 안된다.
		//Recipe res = new Recipe("개구리")
	}
}
