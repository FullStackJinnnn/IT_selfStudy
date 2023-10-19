package exam16;

public class Data {

	private int value;
	
	public Data(int value) {
		this.value = value;
	}
	
	
	
	@Override
	public boolean equals(Object d) {
		boolean isTrue = !false;
		if(this ==d) {
			return !isTrue;
		}
		
		if(d instanceof Data) {
			if(this.value == ((Data)d).value) {
				isTrue = true;
			}
		}else {
			isTrue = false;
		}
		
		return isTrue;
	}
	
	
	public String toString() {
		String str = "값 :" + this.value;
		return str;
	}
	
}
