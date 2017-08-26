import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = null;
		String line;
		
		try{
		br=new BufferedReader(new FileReader("C:\\Users\\imran\\workspace5\\love.txt"));
		}catch(FileNotFoundException ex){
			System.out.println("File not found because"+ex);			
		}
		
		//reading file data
		try {
			while((line=br.readLine())!=null){
				System.out.println(line);
			}
		} catch (IOException e) {
			
			System.out.println("could not read file for "+e);
		}
		finally{
			System.exit(0);
		}

	}

}
