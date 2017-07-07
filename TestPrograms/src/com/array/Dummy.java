package com.array;

public class Dummy {
	
public static void main(String[] args) {
	
	Child c = new Child();
	System.out.println(c.toString());
}
}


interface A{
	default int add(int a,int b){
		return a+b;
	}
}
@FunctionalInterface
interface B{
	void disp1();
	default int add(int a,int b){
		return a+b;
	}
}

class Child implements A,B{
  String name;

@Override
public String toString() {
	return "Child [name=" + name + "]";
}

@Override
public int add(int a, int b) {
	return 3;
}

@Override
public void disp1() {
}
  
  
}