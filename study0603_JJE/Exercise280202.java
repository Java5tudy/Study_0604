package study0603_JJE;

import java.util.function.BiFunction;

class Box2<T, U>{
	private T id;
	private U con;
	public Box2(T i, U c) {
		id = i;
		con = c;
	}
	public void showIt() {
		System.out.println("ID: " + id + " , " +"Contents: " + con );
	}
}

public class Exercise280202 {
	public static void main(String[] args) {
		// 메소드 참조를 못하겠습니다,,, 
		
		Box2<Integer, String> bf = Box2:: new;
		
		Box2<Integer, String> b1 = bf.apply(1, "Toy");
		Box2<Integer, String> b2 = bf.apply(2, "robot");
		
		b1.showIt();
		b2.showIt();
		
		
	}


}
