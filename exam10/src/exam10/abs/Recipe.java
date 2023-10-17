package exam10.abs;
//abstract가 붙으면 추상화 클래스

//추상 메서드란!
//다양성을 위해 메서드의 선언은 동일해야 하지만 실제로 구현하는 내용은 자식 클래스마다
//달라야 할 떄  부모 클래스의메서드를 비워 오버라이딩을 이용해 구현해낼 수 있다.
//자바는 이것을 abstract 를 사용하여 공식지원. 
//메서드의 내용을 비워놔야하며 추상화 클래스는 객체화 할 수 없다.
//자식 클래스의 생성자에서 super(); 를 통해 추상 클래스의 생성자를 호출하여 부모 객체를 생성한 후 자식 객체를 생성한다.
public abstract class Recipe {

	
		private String chef;
		
		public Recipe(String chef) {
			this.chef = chef;
		}
		
		public void info() {
			System.out.println("이 레시피는 :" + this.chef +"의 것입니다");
		}
}
