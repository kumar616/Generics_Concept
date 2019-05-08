package jlc.collection.Generics;

import java.util.ArrayList;


class C {
	
	@Override
	public String toString() {
		return "C- tostring";
	}
}
class D extends C {

	@Override
	public String toString() {
		return "D- tostring";
	}
	
	
	
	
}
public class Test {

	public static void main(String[] args) {
		
		//Number and its sub classes
		ArrayList<Number> list4=new ArrayList<>();
		list4.add(23);
		list4.add(23.00F);
		list4.add(23322323L);
		list4.add(23.34);
		
		System.out.println(list4);
		
		System.out.println("-------------------");
		
		ArrayList<C> list=new ArrayList<>();
		list.add(new C());
		list.add(new D());
		
		show(list);
		
		System.out.println("---------------------");
		show1(list);
		ArrayList<D> list1=new ArrayList<>();
		//list1.add(new C());
		list1.add(new D());
		show(list1);
		System.out.println("---------------------");
		show1(list1);
	}
	
	public static void show(ArrayList<? extends C> list) {
		for(Object o:list) {
			System.out.println("show");
			System.out.println(o);
		}
	}
	
	public static void show1(ArrayList<? super D> list) {
		for(Object o:list) {
			System.out.println("show1");
			System.out.println(o);
		}
	}

}
