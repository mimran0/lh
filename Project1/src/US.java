import java.util.Scanner;

public class US {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("hello");
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter first number and hit 'enter' from keyboard");
		int value1=sc.nextInt();
		System.out.println("Please enter second number and hit 'enter' from keyboard");
		int value2=sc.nextInt();
		int result=value1-value2;
		
		System.out.println("The result is "+result);
		
		try{ //it only works with runtime errors. 
			if(sc!=null){
				sc.close();
			}
			
		}catch(Exception ex){
			System.out.println("Sc is still open and taking memory space. Please manually close it");
		}
		finally{
			sc.close();
		}

	}

}
