package study0603_JJE;

import java.util.function.BiConsumer;

class Box<T>{
	private T ob; 
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}

public class Exercise2704 {
	public static void main(String[] args) {
		BiConsumer<Box<Integer>, Integer> c1 = (num1, num2) -> num1.set(num2);
		BiConsumer<Box<Double>, Double> c2 = (Dou1, Dou2) -> Dou1.set(Dou2);
		//biconsumer , 박스 인티져, 박스 더블을 저장하는 람다식
		
		
		Box<Integer> b1 = new Box<>();
		Box<Double> b2 = new Box<>();
		
		c1.accept(b1, 1);
		c2.accept(b2, 1.3);
		
		System.out.println(b1.get());
		System.out.println(b2.get());
	}

}
