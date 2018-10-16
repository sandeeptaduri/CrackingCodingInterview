import java.util.ArrayList;

public class StackSet {
	ArrayList<MyStack<Integer>> ss = new ArrayList<MyStack<Integer>>();
	MyStack<Integer> temp = new MyStack<Integer>();
	int stackSize;
	int index = -1;

	public StackSet(int stackSize) {
		this.stackSize = stackSize;
	}

	public void push(int d) {
		if (ss.isEmpty()) {
			temp.push(d);
			ss.add(temp);
			index = 0;
		} else {
			if (ss.get(index).count() < stackSize) {
				ss.get(index).push(d);
			} else {
				temp = new MyStack<Integer>();
				temp.push(d);
				ss.add(temp);
				index++;
			}
		}
	}

	public int pop() {
		int value;
		if (ss.get(index).count() > 1) {
			value = ss.get(index).pop();
		} else {
			value = ss.get(index).pop();
			ss.remove(index);
			index--;
		}
		return value;
	}

	public int peek() {
		return ss.get(index).peek();
	}

	public boolean isEmpty() {
		return index == -1;
	}

	public int getIndex() {
		return index;
	}

	// follow up
	public int popAt(int i) throws Exception {
		int value;

		if (i > index) {
			throw new Exception("Sub Stack doesn't exist at the given Index!");
		}

		else {

			if (ss.get(i).count() > 1) {
				value = ss.get(i).pop();
			}

			else {
				value = ss.get(i).pop();
				ss.remove(i);
				index--;
			}
			return value;
		}

	}
}
