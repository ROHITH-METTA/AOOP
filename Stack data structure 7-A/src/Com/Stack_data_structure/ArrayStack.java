package Com.Stack_data_structure;
import java.util.Arrays;
public class ArrayStack<T> implements Stack<T>  {
	private static final int DEFAULT_CAPACITY = 10;
    private T[] array;
    private int top;
    @SuppressWarnings("unchecked")
	public ArrayStack() {
        array = (T[]) new Object[DEFAULT_CAPACITY];
        top = -1;  
    }
	@Override
	public void push(T element) {
		// TODO Auto-generated method stub
		if (top == array.length - 1) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[++top] = element;
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return array[top--]; 
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return array[top];   
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top == -1;
	}

}
