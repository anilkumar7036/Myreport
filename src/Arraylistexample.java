import java.util.ArrayList;

public class Arraylistexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>  arylst = new ArrayList<String>();
		ArrayList<Integer> intlst = new ArrayList<Integer>();
		arylst.add("anilkumar");
		arylst.add("Shabana");
		arylst.add("sasi");
		arylst.add("Vamsi");
		arylst.add("Training");
		
		intlst.add(2);
		intlst.add(3);
		intlst.add(4);
		intlst.add(5);
		intlst.add(6);
		
		System.out.println(arylst.size());
		System.out.println("Printing all values in Arraylist");
		
		
		
		System.out.println(arylst.get(0));
		
		for (int i= 0 ;i<arylst.size();i++) {
			System.out.println(arylst.get(i));
			System.out.println(intlst.get(i));
		}

	}

}
