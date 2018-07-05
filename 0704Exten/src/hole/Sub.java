package hole;

//Suoer 클래스를 상속받는 Sub 클래스 // super 밑에 sub가 있는거임
public class Sub extends Super {
	
	
	// dong 메소드를 오버라이딩을 해본다.
	// 아래 어노테이션이 에러가 발생하지 않으면 제대로 오버라이딩 한 것입니다.
	@Override
	public void dong() { // 상위 클래스(super)에 있는 메소드를 하위클래스(sub)에서 다시만든것을 오버라이딩이라고 함
		System.out.println("how are you");
	}
	public void method() {
		System.out.println("하위클래스에서 만든 메소드");
	}
}
