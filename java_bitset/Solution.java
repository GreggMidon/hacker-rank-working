package java_bitset;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class Solution {

	public static class Operation {

		public static enum Action {AND, OR, XOR, FLIP, SET};
		
		private int firstSet;
		private int secondSet;
		private int index;
		private Action action;
		
		public Operation(Action action, int b1, int b2, int index) {
			this.action = action;
			this.firstSet = b1;
			this.secondSet = b2;
			this.index = index;
		}
		
		public void setFirstSet(int firstSet) {
			this.firstSet = firstSet;
		}
		
		public int getFirstSet() {
			return this.firstSet;
		}
		
		public void setSecondSet(int secondSet) {
			this.secondSet = secondSet;
		}
		
		public int getSecondSet() {
			return this.secondSet;
		}

		public void setIndex(int index) {
			this.index = index;
		}
		
		public int getIndex() {
			return this.index;
		}

		public void setAction(Action action) {
			this.action = action;
		}
		
		public Action getAction() {
			return this.action;
		}
		
	}
	
	public static void main(String[] args) {

		int n = 5;		// length of both bitsets
		int m = 4;		// number of operations to perform
		
		List<Operation> opers = new ArrayList<>();
		
		opers.add(new Operation(Operation.Action.AND, 1, 2, 0));
		opers.add(new Operation(Operation.Action.SET, 1, 0, 4));
		opers.add(new Operation(Operation.Action.FLIP, 2, 0, 2));
		opers.add(new Operation(Operation.Action.OR, 2, 1, 0));
		
		// create the two bitsets
		BitSet b1 = new BitSet(n);
		BitSet b2 = new BitSet(n);
		
		// seed both bitsets to false (0)
		for(int i = 0; i < n; i++) {
			b1.set(i, false);
			b2.set(i, false);
		}
		
		// add bitsets to an array for safe id'ing
		BitSet[] bs = new BitSet[2];
		bs[0] = b1;
		bs[1] = b2;
		
		for(Operation op: opers) {
			
			int _s1, _s2, ndx;
			BitSet _b1, _b2;
			
			switch(op.getAction()) {
			case AND:
				_s1 = op.getFirstSet() - 1;
				_s2 = op.getSecondSet() - 1;
				
				_b1 = bs[_s1];
				_b2 = bs[_s2];
				
				_b1.and(_b2);
				
				break;
			
			case SET:
				_s1 = op.getFirstSet() - 1;
				_b1 = bs[_s1];
				ndx = op.getIndex();
				
				_b1.set(ndx);

				break;

			case FLIP:
				_s1 = op.getFirstSet() - 1;
				_b1 = bs[_s1];
				ndx = op.getIndex();
			
				_b1.flip(ndx);
				
				break;
			
			case OR:	
				_s1 = op.getFirstSet() - 1;
				_s2 = op.getSecondSet() - 1;
				
				_b1 = bs[_s1];
				_b2 = bs[_s2];
				
				_b1.or(_b2);
				
				break;				
			}
			
			System.out.println(String.valueOf(b1.cardinality()) + " " + String.valueOf(b2.cardinality()));
		}
	}
}
