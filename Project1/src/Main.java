

import org.junit.Assert;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyMath obj=new MyMath();
		int vOutput=obj.addition(2, 3);  
	   
	   try{
		   Assert.assertEquals(7, vOutput);
	   }catch(AssertionError e){
		  
		   System.out.println(e);
		   
	   }

	}

}
