package demo.stack;

import java.util.*;

class Stack<E> {
    
    @SuppressWarnings("hiding")
	private class Element<E> {
    	
        // data value of the element
        private E data;
        
        // next element in the stack
        private Element<E> next;
        
        Element(E data) {
            this.data = data;
            this.next = null;
        }
    }
    
    // element at the top of the stack
    private Element<E> top;
    
    // create an empty stack
    public Stack() {
        this.top = null;
    }
    
    // return true if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }
    
    // pushes a value onto the top of the stack. 
    public void push(E value) {

        Element<E> newTop = new Element<E>(value);
        
        if(!isEmpty()) {
            newTop.next = top;
        }

        this.top = newTop;
    }

    // remove element at the top of stack
    public E pop() {

    	if(isEmpty()) {
            throw new EmptyStackException();
        }
        
        Element<E> oldTop = top;
        this.top = top.next;
        
        return oldTop.data;
    }
    
    // 'view' the element at the top of the stack.
    public E peek() {
    	
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        
        return top.data;
    }
}

