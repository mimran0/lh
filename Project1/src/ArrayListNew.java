import java.util.ArrayList;
import java.util.Random;

public class ArrayListNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> ar=new ArrayList<Integer>();
		//adding 4 values into the first 4 elements/indexes.
		ar.add(10);
		ar.add(34);
		ar.add(29);
		ar.add(87);
		
		Random rm=new Random();
		//adding more values into the next 6 elements/indexes.
		for(int i=4;i<11;i++){
			int input=rm.nextInt(500);
			ar.add(input);
		}
		
		//displaying values of all the elements/indexes of the arraylist instance/object. 
		for(int v:ar){
			System.out.println(v);
		}

	}

}
