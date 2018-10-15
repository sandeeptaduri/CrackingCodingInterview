
public class QueueStacks {
	MyStack<Integer> stack1 = new MyStack<Integer>();
	MyStack<Integer> stack2 = new MyStack<Integer>();
	int temp;

	public void add(int d) {
		if (stack1.empty()) {
			stack1.push(d);
			return;
		} else {
			while(!stack1.empty()) {
			stack2.push(stack1.pop());
			}
			stack1.push(d);
			while(!stack2.empty()) {
			stack1.push(stack2.pop());
			}
		}
	}
	
	public int element() {
		return stack1.peek();
	}
	
	public int remove() {
		return stack1.pop();
	}
	
	public boolean isEmpty() {
		return stack1.empty();
	}
}
