package study.thread.state;

public class StorageMain {

	public static void main(String[] args) {
		
		Storage s = new Storage();
		AddStack as = new AddStack(s);
		PopStack ps = new PopStack(s);
		
		
		as.start();
		ps.start();
		
	}
}
