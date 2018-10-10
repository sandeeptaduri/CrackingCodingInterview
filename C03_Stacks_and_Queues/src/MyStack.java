import java.util.EmptyStackException;

public class MyStack<T> {

	public class StackNode<T> {
		private StackNode<T> next;
		private T data;

		private StackNode(T d) {
			this.data = d;
		}

	}

	StackNode<T> top;

	public void push(T value) {
		if (top == null) {
			top = new StackNode<T>(value);
			return;
		}
		StackNode<T> n = new StackNode<T>(value);
		n.next = top;
		top = n;

	}

	public T peek() throws EmptyStackException {
		if (top == null) {
			throw new EmptyStackException();
		}
		return top.data;
	}

	public T pop() throws EmptyStackException {
		if (top == null) {
			throw new EmptyStackException();
		}
		T value = top.data;
		top=top.next;

		return value;
	}
	
	public boolean empty() {
		if(top==null) {
			return true;
		}
		return false;
	}

}
