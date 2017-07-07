package com.array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

public class ArrayListStringDemo {
 
    public static void main(String[] args) {
 
        List<String> countries = new ArrayList<String>();
        
        countries.add("Australia");
        countries.add("Canada");
        countries.add("India");
        countries.add("USA");
 
        System.out.println("Using Iterator to display contents of countries list");
        //Using Iterator to display contents of countries list
        Iterator<String> iter1 = countries.iterator();
        while(iter1.hasNext()){
            String element = iter1.next();
            System.out.print(element + " ");
        }
        
        System.out.println("\n\nUsing ListIterator to modify contents of countries list and display in reverse order");
        
        //Using ListIterator to display contents of countries in reverse order
        ListIterator<String> iter2 = countries.listIterator();
        while(iter2.hasNext()){
            String element = iter2.next();
            iter2.set(element + "1");
        }
        
        //Using ListIterator to display contents of countries in reverse order
        while(iter2.hasPrevious()){
            String element = iter2.previous();
            System.out.print(element + " ");
        }
        
        System.out.println("\n\nUsing For-Each to display contents of countries list");
        for(String country:countries){
            System.out.print(country + " ");
        }
        
        System.out.println("\n\nUsing Spliteror tryAdvance() to loop through countries list");
        //Using Spliterator tryAdvance() to loop through countries list
        Spliterator<String> iter3 = countries.spliterator();
        while(iter3.tryAdvance(country -> System.out.print(country + " ")));
            
        System.out.println("\n\nUsing Spliteror forEachRemaining() to loop through countries list");
        //Using Spliterator forEachRemaining() to loop through countries list
        Spliterator<String> iter4 = countries.spliterator();
        iter4.forEachRemaining(country -> System.out.print(country + " "));
      
        iter4.forEachRemaining(System.out::println);
        
    }
 
}