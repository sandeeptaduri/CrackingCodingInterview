import java.util.EmptyStackException;

public class MultiStack {
	int numOfStacks = 3;
	int stackSize;
	int[] stackArray;
	int[] stackNOE;

	public MultiStack(int size) {
		this.stackSize = size;
		stackArray = new int[stackSize * numOfStacks];
		stackNOE = new int[numOfStacks];
	}

	public boolean isEmpty(int stackNo) {
		return stackNOE[stackNo] == 0;
	}

	public void push(int stackNo, int value) throws Exception {
		if (stackNOE[stackNo] == stackSize) {
			throw new Exception("stack " + stackNo + " is full!");
		}
		stackArray[(stackNo * stackSize) + stackNOE[stackNo]] = value;
		stackNOE[stackNo]++;
	}

	public int peek(int stackNo) throws Exception {
		if (stackNOE[stackNo] == 0) {
			throw new Exception("stack " + stackNo + " is empty!");
		}
		return stackArray[(stackNo * stackSize) + stackNOE[stackNo] - 1];
	}

	public int pop(int stackNo) throws EmptyStackException {
		if (stackNOE[stackNo] == 0) {
			throw new EmptyStackException();
		}
		int value = stackArray[(stackNo * stackSize) + stackNOE[stackNo] - 1];
		stackArray[(stackNo * stackSize) + stackNOE[stackNo] - 1] = 0;
		stackNOE[stackNo]--;

		return value;
	}

}
