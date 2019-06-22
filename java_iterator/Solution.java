package java_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution {

	static Iterator func(ArrayList mylist) {

		Iterator it = mylist.iterator();
		List<String> stringList = new ArrayList<>();
		
		while(it.hasNext()) {
			Object element = it.next();
			if(element instanceof Integer || ((String) element).equals("###")) {
				continue;
			}
			else {
				stringList.add((String) element);
			}
		}
		return stringList.iterator();
	}
	
	@SuppressWarnings({ "unchecked" })
	public static void main(String []args){
		
		ArrayList mylist = new ArrayList();
		mylist.add(new Integer(42));
		mylist.add(new Integer(10));
		mylist.add("###");
		mylist.add("Hello");
		mylist.add("Java");
	      
		Iterator it=func(mylist);
	    while(it.hasNext()){
	    	Object element = it.next();
	        System.out.println((String)element);
	    }
	}		
}
