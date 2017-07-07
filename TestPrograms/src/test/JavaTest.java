package test;

import java.util.ArrayList;

public class JavaTest {
		public static void main(String[] args) {
			int array[] =new int[10]; //Type safe
			
			//array[0]="aaa";
			
			ArrayList<Integer> al= new ArrayList<Integer>();
			al.add(1);
			al.add(3);
			//al.add("string");
			int sum=al.get(0)+al.get(1);
			System.out.println("Sum="+ sum);
		}
}
