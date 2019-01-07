package prob3;

public abstract class Bird {
	private String name;

	public void fly() {
		System.out.println("날다");
	}

	public void sing() {
		System.out.println("울다");
	}
	//public abstract void fly();
	protected abstract void setName(String string);
}
