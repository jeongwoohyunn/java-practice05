package prob5;

public class MyStack {
	private int top;
	private String[] buffer;
	
	@SuppressWarnings("unchecked")
	public MyStack(int capacity) {
		top =-1;
		
	}
	//capacity 배열을 만든다.
	public void push(String s) {
	}
	//비교를 하고 호출 resize()
	public String pop() throws MyStackException {
	}

	public boolean isEmpty() {
		return top == -1;
	}
}