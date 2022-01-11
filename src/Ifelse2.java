
public class Ifelse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int testscore = 44;
		char grade;
		
		if (testscore >=90) {
		grade = 'A';
     System.out.println("Grade :"+grade);
	}else if (testscore>= 80){
		grade ='B';
		System.out.println("Grade:"+grade);
	}else if (testscore>=70) {
		grade = 'C';
		System.out.println("Grade:"+grade);
	
	}else if (testscore>=60) {
		grade = 'D';
		System.out.println("Grade:"+grade);
	}else   {
		grade = 'F';
		System.out.println("Grade:"+grade);
	}
}
}