
public class Arraymulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] k = new int [3][3];
		
		k[0][0] = 0;
		k[0][1] = 1;
		k[0][2] = 2;
		k[1][0] = 2;
		k[1][1] = 0;
		k[1][2]= 3;
		k[2][0]= 4;
		k[2][1]= 1;
		k[2][2]= 0;
		
		for (int j=0 ;j< k.length;j++){
			for (int i = 0; i<k.length;i++){
				System.out.print(k[j][i] + " ");
			}
			System.out.println("");
		}
		
				
	}

}
