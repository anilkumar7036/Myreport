import java.util.HashMap;
import java.util.Hashtable;

public class HashTableexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<String,String>  htable =new Hashtable <String,String>();
		
		htable.put("city", "guntur");
		htable.put("Firstname", "anilkumar");
		htable.put("Lastname", "gulla");
		htable.put("State","Andrapradesh");
		htable.put("Educaton","Graduate");
		
		System.out.println(htable.get("city"));
		System.out.println(htable.get("Firstname"));
		
		Hashtable<Integer,String> htable1 = new Hashtable<Integer,String>();
		
		htable1.put(0, "guntur");
		htable1.put(1,"anilkuamr");
		htable1.put(2,"Andhrapradesh");
		htable1.put (3,"graduate");
		for (int i =0;i<htable1.size(); i++) {
			
			System.out.println(htable1.get(i));
		}
		
        HashMap<String,String> hmap = new HashMap<String,String>();
        
        hmap.put("city","Hyderabad");
        System.out.println(hmap.get("city"));
        
	}

}
