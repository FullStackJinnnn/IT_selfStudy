package study.thread.state;

public class StorageMain {

	public static void main(String[] args) {
		//storage에서 addstack, popstack 메서드를 만든후,
		//AddStack,Popstack 클래스를 만들고 생성자를 통해 Storage st를 인자를 받는 생성자를 사용해
		//객체화 하여 AddStack,PopStack 클래스 안의 run 메서드에서 
		//Stroage 클래스에 있는 addstack,popstack 메서드를 사용할 수 있게 ( 접근할 수 있게 ) 한다.
		Storage s = new Storage();
		AddStack as = new AddStack(s);
		PopStack ps = new PopStack(s); //Storage st를 인자로 받는 생성자를 객체화 하김떄문에 
		
		
		as.start();
		ps.start();
		
	}
}
