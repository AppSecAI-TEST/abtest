package test2;

import java.io.Serializable;
import java.util.ArrayList;

class Test<T extends Number & Serializable> {
		T a;
		Test(T a){
			this.a=a;
		}
	public void method(){
		System.out.println(a);
		
	}
	
	public void  method1(ArrayList<?> x){
		System.out.println(a);
		
	}
	
	public static void main(String[] args) {
		Test<Float> t= new Test<Float>(1f);
		t.method();
		
		Test<Integer> i= new Test<Integer>(1);
		t.method();
	}
}
