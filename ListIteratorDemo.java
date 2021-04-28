package com.collection.cursor;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		
		l.add("Ram");
		l.add("Sham");
		l.add("Geeta");
		l.add("Sita");
		
		System.out.println(l);            // [Ram, Sham, Geeta, Sita]
		ListIterator itr=l.listIterator();
		while(itr.hasNext()){
			String s=(String)itr.next();
			if(s.equals("Sham")){
				itr.remove();             //[Ramkrishna, Sham, Geeta, Sita]
			}
			else if(s.equals("Ram")){
				itr.set("Ramkrishna");    //[Ramkrishna, Geeta, Sita]
			}
			else if(s.equals("Sita")){
				itr.add("Sharad");        // [Ramkrishna, Geeta, Sita, Sharad]
			}
		}
		System.out.println(l);            // [Ramkrishna, Geeta, Sita, Sharad]
	}

}
