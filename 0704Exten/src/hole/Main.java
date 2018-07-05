package hole;

public class Main {

	public static void main(String[] args) {
//		//Super 클래스의 인스턴스를 생성
//		Super base = new Super();
//		//Sub 클래스의 인스턴스를 생성
//		Sub drive = new Sub();
//		
//		
//		//상위 클래스타입의 변수에 하위 클래스 타입의 인스턴스 주소를 대입할수 있습니다.
//		Super ob = new Sub();
//		
//		// 하위 클래스 타입의 변수에 상위 클래스 타입의 인스턴스 주소를 대입하는 것은 강제 형변환을 통해서만 가능합니다.
//		// 문제가 발생할 수 있습니다. - 예회가 발생합니다.
//		// Sub ob1 = new Super(); // 이것은 안된다.
//		Sub ob2 = (Sub)(new Super());
		
		//상위 클래스 타입의 변수에 하위 클래스 타입의 주소를 대입할 수 있습니다.
		//obj는 기본적으로 Super 것만 호출할 수 있습니다.
		
		//오버라이딩 된 메소드는 변수를 선언할 때 사용한 자료형이 아니라
		//인스턴스를 만들어서 대입할 때 사용한 자료형의 것을 호출합니다.
		
		Super obj = new Super(); // super에 있는 메소드를 부른다
		obj.dong();
		
		obj = new Sub(); //sub에 있는 메소드를 부른다.
		obj.dong();
		
		
	}
}
