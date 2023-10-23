package study.code.set;

public class TextMessage {

	
	private String msgNumber;
	private String message;
	
	public TextMessage(String msgNumber, String message) {
		//private 변수는 내부에서도 get/setter 이용 추천
		this.setMsgNumber(msgNumber);;
		
		this.setMessage(message);
	}
	public String getMsgNumber() {
		return msgNumber;
	}
	public void setMsgNumber(String msgNumber) {
		this.msgNumber = msgNumber;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	//데이터중복처리를위한 
	//hashCode 메서드 재정의
	@Override
	public int hashCode() { //hashCode는 int 타입 
		System.out.println("검색1");
		return this.getMsgNumber().hashCode(); // 식별데이터 MsgNumber
		//msgNumber가 string 이면 getMsgNumber()가 가지고있는 hashCode를 출력
	}
	//값이 같아야 하니까 
	//equals 메서드 재정의
	@Override
	public boolean equals(Object obj) {
		System.out.println("검색2");
		if(obj instanceof TextMessage) { // obj가 textmessage객체 타입이면
			TextMessage compare = (TextMessage)obj;
			
			if(this.getMessage().equals(compare.getMessage())) {
				return true;//빠른반환
			}
		}
		return false;
	}
	
}
