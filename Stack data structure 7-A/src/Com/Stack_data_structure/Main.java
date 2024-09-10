package Com.Stack_data_structure;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> linkedListStack = new LinkedListStack<>();
        System.out.println("Testing LinkedListStack with Integers:");
        linkedListStack.push(10);
        linkedListStack.push(20);
        linkedListStack.push(30);
        System.out.println("Top element (peek): " + linkedListStack.peek()); 
        System.out.println("Popped element: " + linkedListStack.pop());      
        System.out.println("Popped element: " + linkedListStack.pop());      
        System.out.println("Is stack empty? " + linkedListStack.isEmpty()); 
        System.out.println("Popped element: " + linkedListStack.pop());      
        System.out.println("Is stack empty? " + linkedListStack.isEmpty());  

        Stack<String> arrayStack = new ArrayStack<>();
        System.out.println("\nTesting ArrayStack with Strings:");
        arrayStack.push("apple");
        arrayStack.push("banana");
        arrayStack.push("cherry");
        System.out.println("Top element (peek): " + arrayStack.peek());  
        System.out.println("Popped element: " + arrayStack.pop());       
        System.out.println("Popped element: " + arrayStack.pop());       
        System.out.println("Is stack empty? " + arrayStack.isEmpty());   
        System.out.println("Popped element: " + arrayStack.pop());       
        System.out.println("Is stack empty? " + arrayStack.isEmpty());   
    
	}

}
