package prob3;

public class Sparrow extends Bird{
	private String name;

	public void fly() {
		System.out.println("참새("+getName()+")가 날아다닙니다.");
	}

	public void sing() {
		System.out.println("참새("+getName()+")가 소리내어 웁니다.");
	}
	public String toString() {//toString형식 보충 - void ->String ->return값주기
		System.out.println("참새의 이름은 "+getName()+" 입니다.");
		return "";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
