import java.util.LinkedList;

public class Linkedlistexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> linkedlist = new LinkedList<String>();
		
		linkedlist.add("A");
		linkedlist.add("B");
		linkedlist.addFirst("C");
		linkedlist.addLast("D");
		linkedlist.add(2, "E");

		System.out.println(linkedlist);
		linkedlist.remove(2);
		linkedlist.removeFirst();
		
		for (int i=0 ;i<linkedlist.size();i++) {
			System.out.print(linkedlist.get(i) + " ");
		}
	}

}
