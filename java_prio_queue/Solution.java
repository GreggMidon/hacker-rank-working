package java_prio_queue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {

	private final static Priorities priorities = new Priorities();
	
	public static void main(String[] args) {

/*		
		int totalEvents = 12;    
		List<String> events = new ArrayList<>();
		events.add("ENTER John 3.75 50");
		events.add("ENTER Mark 3.8 24");
		events.add("ENTER Shafaet 3.7 35");
		events.add("SERVED");
		events.add("SERVED");
		events.add("ENTER Samiha 3.85 36");
		events.add("SERVED");
		events.add("ENTER Ashley 3.9 42");
		events.add("ENTER Maria 3.6 46");
		events.add("ENTER Anik 3.95 49");
		events.add("ENTER Dan 3.95 50");
		events.add("SERVED");
*/
		int totalEvents = 3;    
		List<String> events = new ArrayList<>();
		events.add("ENTER Mark 3.8 50");
		events.add("ENTER Mark 3.8 24");
		events.add("SERVED");

		
		List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } 
        else {
            for(Student st: students) {
                System.out.println(st.getName());
            }
        }		
	}
}

class StudentComparator implements Comparator<Student> {
	
	@Override
	public int compare(Student s1, Student s2) {
/*
 		PRIORITY CRITERIA
		The student having the highest Cumulative Grade Point Average (CGPA) is served first.
    	Any students having the same CGPA will be served by name in ascending case-sensitive alphabetical order.
    	Any students having the same CGPA and name will be served in ascending order of the id.
*/
		// highest CGPA, highest priority
		if(s1.getCGPA() > s2.getCGPA()) { 
			return -1;
		}
		else if(s1.getCGPA() < s2.getCGPA()) {
			return 1;
		}

		// CGPA equal, name equal, eval ID
		if(s1.getName().equals(s2.getName())) {
			
			if(s1.getID() > s2.getID()) {
				return 1;
			}
			else if(s1.getID() < s2.getID()) {
				return -1;
			}
			else {
				return 0;
			}
		}

		// eval by name
		if(s1.getName().compareTo(s2.getName()) > 1) {
			return 1;
		}
		else {
			return -1;
		}
	}
}


class Priorities {
	
	private final void print(String s) {
		System.out.println(s);
	}
	
	List<Student> getStudents(List<String> events) {
		
		Queue<Student> queue = new PriorityQueue<>(new StudentComparator());
		
		for(String e: events) {
			
			//print("  event string to process: " + e);
			String[] sa = e.split(" ");
			String recType = sa[0];
			//print("  record type: " + recType);
			
			if(recType.equals("ENTER")) {
				//print("         CGPA: " + sa[2]);
				//print("         name: " + sa[1]);
				print("-> Added " + sa[1] + "," + sa[2] + "," + sa[3]);
				//print("           ID: " + sa[3]);
				
				// add new student to the list (int id, String name, double cgpa)
				Student student = new Student(Integer.valueOf(sa[3]), sa[1], Double.valueOf(sa[2]));
				queue.add(student);
				
			}
			else if(recType.equals("SERVED")) {
				// return sorted list
				Student s = queue.poll();
				print("<- Removed " + s.getName() + "," + s.getCGPA() + "," + s.getID());

			}
		}
		
		// transfer sorted priority queue data to List
		int n = queue.size();
		List<Student> returnList = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			returnList.add(queue.poll());
		}
		
		return returnList;

	}
}

class Student {
	
	int ID;
	String name;
	double CGPA;
	
	public Student(int id, String name, double cgpa) {
		this.ID = id;
		this.name = name;
		this.CGPA = cgpa;
	}

	public int getID() {
		return ID;
	}

	public void setID(int id) {
		this.ID = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCGPA() {
		return CGPA;
	}

	public void setCGPA(double cgpa) {
		this.CGPA = cgpa;
	}
}
 
