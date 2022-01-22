import java.util.TreeMap;

public class Treemapexample {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> treemap = new TreeMap<Integer,String>();
		treemap.put(3, "A");
		treemap.put(2, "B");
		treemap.put(1, "C");
		System.out.println(treemap);
		
		TreeMap<String,String> treemap1 = new TreeMap<String,String>();
		treemap1.put("Name", "Anilkumar");
		treemap1.put("City", "Guntur");
		treemap1.put("education", "Graduation");
		System.out.println(treemap1);
		
		
		
	}	
}
