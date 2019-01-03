package prob3;

public class Duck extends Bird{
	private String name;

	public void fly() {
		System.out.println("오리("+getName()+")는 날지 않습니다.");
	}

	public void sing() {
		System.out.println("오리("+getName()+")가 소리내어 웁니다.");
	}
	public String toString() {//toString형식 보충 참새참고
		System.out.print("오리의 이름은 "+getName()+" 입니다.");
		return "";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
