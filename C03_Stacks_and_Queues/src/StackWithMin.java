
public class StackWithMin {
	MyStack<Integer> istack = new MyStack<Integer>();
	MyStack<Integer> minstack = new MyStack<Integer>();

	public void push(int value) {
		istack.push(value);
		if (minstack.empty() || minstack.peek() >= value) {
			minstack.push(value);
		}
	}

	public int peek() {
		int value = -1;
		try {
			value = istack.peek();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public int min() {
		return minstack.peek();
	}

	public int pop() {
		int value = istack.pop();
		if (minstack.peek() == value) {
			minstack.pop();
		}
		return value;
	}

	public boolean isEmpty() {
		return istack.empty();
	}

}
