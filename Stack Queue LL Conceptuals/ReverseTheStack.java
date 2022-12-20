package stack_queue_problems;

import java.util.Stack;

public class ReverseTheStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		
		st.push(22);
		st.push(33);
		st.push(44);
		st.push(55);
		st.push(66);
		st.push(77);
		st.push(88);
		
		System.out.println(st);
		reverse(st);
		System.out.println(st);
		
	}

	private static void reverse(Stack<Integer> st) {
		// TODO Auto-generated method stub
		if(st.isEmpty())
			return;
		
		int item = st.pop();
		reverse(st);
		putInDown(st,item);
	}
	
	private static void putInDown(Stack<Integer> st, int i) {
		// TODO Auto-generated method stub
		if(st.isEmpty())
		{
			st.push(i);
			return;
		}

		int item = st.pop();
		putInDown(st, i);
		st.push(item);
	}

}
