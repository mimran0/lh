import org.junit.Assert;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator obj=new Calculator();
		int vOutput=obj.addition(5, 6);
		//System.out.println(vOutput);
		
		//unit test
		try{
			Assert.assertEquals(11, vOutput);
			System.out.println("Passed");
			
		}catch(AssertionError e){
			System.out.println("Failed becaue of "+e);
			
		}

	}

}
