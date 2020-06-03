package study0603_JJE;

import java.util.function.BiFunction;


class Box1<T, U>{
	private T id;
	private U con;
	public Box1(T i, U c) {
		id = i;
		con = c;
	}
	public void showIt() {
		System.out.println("ID: " + id + " , " +"Contents: " + con );
	}
}

public class Exercise2802 {

	public static void main(String[] args) {
		BiFunction<Integer, String, Box1<Integer, String>> bf = Box1::new;
		// 생성자 참조
		
		Box1<Integer, String>b1 = bf.apply(1, "Toy");
		Box1<Integer, String>b2 = bf.apply(2, "robot");
		
		b1.showIt();
		b2.showIt();
		
	}

}
