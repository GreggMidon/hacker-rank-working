package demo.stack;

import java.util.EmptyStackException;

class StackDemo {

	public static void main(String[] args) {
    
		Stack<Integer> intStack = new Stack<Integer>();
    
		try {
			intStack.pop();
		}
		catch(EmptyStackException e) {
			System.out.println("We cannot pop off an empty stack.");
		}
    
		for(int i = 0; i < 4; i++) {
			intStack.push(i);
			System.out.println("New Top: " + intStack.peek());
		}
    
		for(int i = 0; i < 4; i++) {
			System.out.println("Popped: " + intStack.pop());
		}
    
		try {
			intStack.peek();
		}
		catch(EmptyStackException e) {
			System.out.println("We cannot peek at an empty stack.");
		}
	}	
}
