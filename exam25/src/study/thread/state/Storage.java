package study.thread.state;

public class Storage {
	private int stackCount = 10; //물건 10개 가진다.
	
	public synchronized void addStack(int stackCount) {
		this.stackCount += stackCount;
	
		if(this.stackCount >= 10) {
			System.out.println("나르세요!");
			//스레드 깨우기
			notify();
		}
	}
	
	public synchronized void popStack(int leaveCount) {
		if(leaveCount > this.stackCount) {
			this.stackCount = 0;
		}else {
			this.stackCount -= leaveCount;
		}	
		System.out.println("현재 짐 개수 " + this.getStackCount());
			try {
				if(this.stackCount ==0) {
					System.out.println("집이 없음 대기");
					wait();
				}
				
				}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		public int getStackCount() {
			return this.stackCount;
	 	}
	}

