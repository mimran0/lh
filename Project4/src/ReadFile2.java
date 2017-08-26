import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=null;
		String line;
		
		try {
			br=new BufferedReader(new FileReader("C:\\Users\\imran\\workspace5\\love.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File not found"+e);
		}

		try {
			while((line=br.readLine())!=null){
				System.out.println(line);
			}
		} catch (IOException ex) {
			System.out.println("File could not read"+ex);
		}
		
		
	}

}
