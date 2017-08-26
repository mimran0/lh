import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
	BufferedReader br;
	String line=null;
	FileReader fr=null;
	try {
		fr=new FileReader("C:\\Users\\imran\\workspace5\\Project5\\ReadTextFile.txt");
	} catch (FileNotFoundException e) {
		System.out.println("File is not found");
		System.exit(0);
	}
    br=new BufferedReader(fr);
    try {
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
	} catch (IOException e) {
		System.out.println("File not read");
		System.exit(0);
	}
	}

}
