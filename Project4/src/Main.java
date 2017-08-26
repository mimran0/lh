import java.util.Iterator;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> list=new LinkedList<String>();
		list.add("Queens");
		list.add("Manhattan");
		list.add("Long Island City");
		list.add("Boston");
		
		//for each loop to view "list"  each element's values.
		System.out.println("*******************using for each loop");
		for(String v:list){
			System.out.println(v);
		}
		
		//Iterator to view "list"'s each elements's value
		System.out.println("*******************using iterator");
		Iterator<String> li=list.iterator();
		while(li.hasNext()){
			System.out.println(li.next());
		}
		//Using for loop
		System.out.println("************Using for loop");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
		//using while loop
		System.out.println("*******************Using while loop");
		int j;
		j=0;
		while( j<list.size()){
			System.out.println(list.get(j));
			j++;
		}
		
		
		
		//using "do while loop" 
		System.out.println("********************using do while loop");
		int k;
		k=0;
		do{
			System.out.println(list.get(k));
			k++;
		}while(k<list.size());
		
		
	}

}
