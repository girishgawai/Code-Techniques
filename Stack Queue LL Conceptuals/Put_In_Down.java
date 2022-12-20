package stack_queue_problems;

import java.util.Stack;

public class Put_In_Down {

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
		putInDown(st, 99);
		System.out.println(st);
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
