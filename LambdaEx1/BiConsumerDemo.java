package LambdaEx1;
import java.util.function.*;

//class Box<T>{
//	private T ob;
//	public void set(T o) { ob = o; }
//	public T get() { return ob; }
//}
// 이건뭐

public class BiConsumerDemo {
	public static void main(String[]args) {
		BiConsumer<Integer, Double> put = (t, u) -> System.out.println(t+","+u);
		
		put.accept(4, 4.5);
		put.accept(3, 3.847281);
	}
}
