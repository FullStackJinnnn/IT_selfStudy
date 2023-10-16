package exam10.abs;

public class PastaRecipe extends Recipe{

	public PastaRecipe(String chef) {
		super(chef);
	}
	
	public void makeSource() {
		System.out.println("이소스는 파스타 소스입니다. 직접 만드세요 ");
	}
	
}
