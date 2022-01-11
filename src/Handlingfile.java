import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Handlingfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f =new File("C:\\Users\\HP\\OneDrive\\Documents\\New folder\\.Ourclass1.txt");
		
		f.createNewFile();
		
		FileWriter fw = new FileWriter("C:\\Users\\HP\\OneDrive\\Documents\\New folder\\.Ourclass1.txt");
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("hi this is Selnium traning");
		bw.newLine();
		bw.write("Hi this new line");
		bw.flush();
		
		FileReader fr = new FileReader("C:\\Users\\HP\\OneDrive\\Documents\\New folder\\.Ourclass1.txt");
		
		BufferedReader br = new BufferedReader(fr);
		while (br.ready()) {
			System.out.println(br.readLine());
		}

	}

}
