import java.util.PriorityQueue;
import java.util.Queue;

public class Queuedemo {
	
	public static void main(String[] args) {
		
		Queue<String> queue = new PriorityQueue<String>();
		
		queue.add("India");
		queue.add("Germany");
		queue.add("America");
		System.out.println(queue);
		queue.remove();
		System.out.println("queue after removing head of the element:"+queue);
		String head =queue.peek();
		System.out.println("Head of the Queue: "+head);
		head = queue.poll();
		System.out.println("removed head:"+head);
		System.out.println("finally in queue elements be like:"+queue);
	}

}
