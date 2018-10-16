import java.util.LinkedList;

public class MyQueue<T> {

	class QueueNode<T> {
		QueueNode<T> next;
		T data;

		QueueNode(T d) {
			data = d;
			next = null;
		}
	}

	QueueNode<T> first;
	QueueNode<T> last;

	public void add(T value) {

		if (last == null) {
			last = new QueueNode<T>(value);
			first = last;
		}

		else {
			QueueNode<T> n = new QueueNode<T>(value);
			last.next = n;
			last = n;
		}
	}

	public T remove() throws Exception {

		if (first == null) {
			throw new Exception("Queue is empty");
		} else {
			T temp = first.data;
			first = first.next;
			return temp;
		}
	}

	public T element() {
		return first.data;
	}

	public boolean isEmpty() {
		return (first == null);
	}

}
