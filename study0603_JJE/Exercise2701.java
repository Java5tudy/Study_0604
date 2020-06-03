package study0603_JJE;

interface Calculate<T>{
	T cal(T a, T b);
}

public class Exercise2701 {
	public static void main(String[] args) {
		//람다식 만들기 
		Calculate<Integer> c1 = (a, b) -> a + b;
		System.out.println(c1.cal(4, 3));
		
		Calculate<Double> c2 = (a, b) -> a + b;
		System.out.println(c2.cal(2.5, 4.1));
		
		Calculate<Integer> c3 = (a, b) -> a - b;
		System.out.println(c3.cal(4, 2));
		
		Calculate<Double> c4 = (a, b) -> a - b;
		System.out.println(c4.cal(4.9, 3.2));
		
		
	}

}
