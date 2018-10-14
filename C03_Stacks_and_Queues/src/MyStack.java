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
	private int noe;

	public void push(T value) {
		if (top == null) {
			top = new StackNode<T>(value);
			noe=1;
			return;
		}
		StackNode<T> n = new StackNode<T>(value);
		n.next = top;
		top = n;
		noe++;

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
		noe--;
		return value;
	}
	
	public boolean empty() {
		if(top==null) {
			return true;
		}
		return false;
	}
	
	public int count() {
		return noe;
	}

}
