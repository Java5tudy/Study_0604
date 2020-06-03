package Reference;

import java.util.function.BiFunction;

class Box<T, U>{
	private T id;
	private U con;
	public Box(T i, U c) {
		id = i;
		con = c;
	}
	public void showIt() {
		System.out.println("ID: "+id+","+"Contents: "+con);
	}
	public apply() {
		
		return;
	}
}

public class BoxMaker {
	public static void main(String[]args) {
		Box<Integer, String> bf = 
				(i, c) -> {new Box<Integer, String>();};
		
		Box<Integer, String> b1 = bf.apply(1, "Toy");
		Box<Integer, String> b2 = bf.apply(2, "Robot");
		b1.showIt();
		b2.showIt();
	}
}




//package com.mkyong;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.function.BiFunction;
//
//public class Java8BiFunction1 {
//
//    public static void main(String[] args) {
//
//        // take two Integers and return a List<Integer>
//        BiFunction<Integer, Integer, List<Integer>> func3 = (x1, x2) -> Arrays.asList(x1 + x2);
//
//        List<Integer> result3 = func3.apply(2, 3);
//
//        System.out.println(result3);
//
//    }
//
//}
