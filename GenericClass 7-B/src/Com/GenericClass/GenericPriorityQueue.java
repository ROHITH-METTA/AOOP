package Com.GenericClass;
import java.util.PriorityQueue;
public class GenericPriorityQueue<T extends Comparable<T>> {
	private PriorityQueue<T> pq;
	public GenericPriorityQueue() {
        pq = new PriorityQueue<>();
    }

    public void insert(T element) {
        pq.offer(element);
    }

    public T remove() {
        return pq.poll();
    }

    public T peek() {
        return pq.peek();
    }

    public boolean isEmpty() {
        return pq.isEmpty();
    }

    public int size() {
        return pq.size();
    }
}
