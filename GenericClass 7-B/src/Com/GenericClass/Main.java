package Com.GenericClass;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericPriorityQueue<Integer> intPQ = new GenericPriorityQueue<>();
        intPQ.insert(5);
        intPQ.insert(1);
        intPQ.insert(3);
        System.out.println("Priority Queue with Integers:");
        while (!intPQ.isEmpty()) {
            System.out.println(intPQ.remove()); 
        }

        GenericPriorityQueue<Double> doublePQ = new GenericPriorityQueue<>();
        doublePQ.insert(2.2);
        doublePQ.insert(0.5);
        doublePQ.insert(1.8);
        System.out.println("\nPriority Queue with Doubles:");
        while (!doublePQ.isEmpty()) {
            System.out.println(doublePQ.remove()); 
        }

        GenericPriorityQueue<String> stringPQ = new GenericPriorityQueue<>();
        stringPQ.insert("Grapes");
        stringPQ.insert("Mango");
        stringPQ.insert("cherry");
        System.out.println("\nPriority Queue with Strings:");
        while (!stringPQ.isEmpty()) {
            System.out.println(stringPQ.remove()); 
        }
	}

}
