package S0603;

import java.util.function.BiFunction;

class Box<T,U> {
	private T id;
	private U con;
	public Box(T i, U c) {
		id = i;
		con = c;
	}
	public void showIt() {
		System.out.println("ID : " + id + ", " + "Contents : " + con );
	}
 }

public class S28_2 {
	public static void main(String[] args) {
		//BiFunction<T,U,R> 인터페이스 기반 람다식
		//참조변수 bf선언
		BiFunction<Box> bf = Box::new;
		Box<Integer, String> b1 = bf.apply(1, "Toy");
		Box<Integer, String> b2 = bf.apply(2, "Robot");
		b1.showIt();
		b2.showIt();
	}
	

}
