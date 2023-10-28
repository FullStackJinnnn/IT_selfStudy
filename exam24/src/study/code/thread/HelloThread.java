package study.code.thread;

public class HelloThread {
//프로그램은 파일이 존재하지만 아직 메모리에 올라가 있지 않은 상태, 즉 실행되지 않은 코드의
//집합을 말한다. 프로그램을 실행하는 순간 메모리에 올라가고 동작하게 되는데 이 상태의 프로그램을 프로세스라고 부른다.
	//프로세스는 쓰레드일수 있지만 쓰레드는 프로세스 일 수 없다. 프로세스가 스레드보다 큰 범위에 있다.
	//프로세스는 독립적으로 메모리에 등록된다.
	public static void main(String[] args) {
		
		String name = Thread.currentThread().getName();
		System.out.println("스레드 이름 :" + name);
	}
}

