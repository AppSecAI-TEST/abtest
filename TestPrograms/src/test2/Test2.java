package test2;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class Test2 {
		public static void main(String[] args) {
			 Vector<Integer> v = new Vector<Integer>();
			  // Add few elements.
			 v.add(4);
			 v.add(2);
			 v.add(3);
			 
			 
			  Enumeration<Integer> e = v.elements();
			  while(e.hasMoreElements()){
			  	Integer val = e.nextElement();	
			  	//System.out.println(val);
			  }
			  
			  
			  ArrayList<Integer> al = new ArrayList<>();
			  	al.add(4);
				 al.add(2);
				 al.add(3);
				 
			  	/*Iterator<Integer> itr = al.iterator();
			  	while(itr.hasNext()){
			  		Integer i=itr.next();
			  		System.out.println(i);
			  		if(2!=i){
			  			itr.remove();
			  		}	  
			  	}*/
				
				// ArrayList al = new ArrayList();
				  	// Add few elements.
				  	ListIterator<Integer> listItr = al.listIterator();
				  	while(listItr.hasNext()){
				  		Integer val = listItr.next();
				  		System.out.println(val);
				           listItr.remove();
				           listItr.set(0);	
				           listItr.add(10);
				            
				  	}

				 
			  	System.out.println(al);


		}
}
