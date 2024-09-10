package Com.Stack_data_structure;
import java.util.LinkedList;
import java.util.List;
class LinkedListStack<T> implements Stack<T>{
	private LinkedList<T> list = new LinkedList<>();
	public void push(T element) {
		// TODO Auto-generated method stub
        list.addFirst(element);   

	}

	public T pop() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.removeFirst();
	}

	public T peek() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.getFirst();
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return list.isEmpty();
	}

}
