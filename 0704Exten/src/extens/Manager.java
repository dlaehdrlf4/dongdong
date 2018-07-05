package extens;

//Employee 클래스를 상속받은 Manager 클래스
public class Manager extends Employee {
	//이렇게 생성자를 직접 만들어서 상위 클래스의 생성자를 부는 경우는 
	//안드로이드에서 많이 발생합니다.
	public Manager() {
		super(10);
	}
	
	//직책을 저장할 변수
	private String tesk;
	public String getTesk() {
		return tesk;
	}// 메소드 원형 : setTesk(String)
	public void setTesk(String tesk) {
		this.tesk = tesk;
	}
	@Override
	public String toString() {
		//super.toString()은 상위 클래스 안 Employee의 toString을 호출합니다.
		return super.toString() +"Manager [tesk=" + tesk + "]";
	}
	
}
