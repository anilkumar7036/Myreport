import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Set<String> str = new HashSet<String>();
      
      str.add("vamsi");
      str.add("vamsi");
      str.add("vamsi");
      str.add("vamsi");
      str.add("Training");
      str.add("Krishna");
      str.add("Jani");
      
      Iterator<String> itr = str. iterator();
      
      while (itr.hasNext()) {
    	 System.out.println(itr.next());
    	// for (int i=0 ; i< str.size();i++) {
    	//	 System.out.println(itr.get(i));
    	 }
      
      
      
	
	
	}

}
