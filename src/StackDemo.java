import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		
		Stack<String> Stacks = new Stack<String>();
		
		Stacks.push("America");
		Stacks.push("Jermany");
		Stacks.push("India");
		System.out.println(Stacks);
		
		String poppedelement = Stacks.pop();
		System.out.println("Poppedelement: "+poppedelement);
		
		System.out.println("Stacks element be like :"+Stacks);
		String peekedelement = Stacks.peek();
		System.out.println("Peekedelement: "+peekedelement);
		System.out.println(Stacks);
	
	}

}
