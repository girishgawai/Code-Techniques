package stack_queue_problems;

import user.created.dynamic_queue.Dynamic_Queue;

public class ReverseTheQueue {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Dynamic_Queue dq = new Dynamic_Queue();
		
		dq.EnQueue(10);
		dq.EnQueue(20);
		dq.EnQueue(30);
		dq.EnQueue(40);
		dq.EnQueue(50);
		dq.EnQueue(60);
		dq.EnQueue(70);
		
		dq.display();
		
		reverse(dq);
		
		dq.display();
		
	}

	private static void reverse(Dynamic_Queue dq) throws Exception {
		// TODO Auto-generated method stub
		if(dq.isEmpty())
			return;
		
		int item = dq.DeQueue();
		reverse(dq);
		dq.EnQueue(item);
	}

}
