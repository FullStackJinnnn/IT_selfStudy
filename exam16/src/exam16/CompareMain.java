package exam16;

public class CompareMain {

	public static void main(String[] args) {
		
		Data val01 = new Data(10);
		Data val02 = new Data(20);
		
		System.out.println("val01 = = value02 : " + (val01==val02));
		System.out.println("val01 = = value02 : " + (val01.equals(val02)));
		
	}

}
