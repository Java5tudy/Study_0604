package YoonJava;
import java.util.function.BiConsumer;

class Box<T> {
	private T ob;
	public void set(T o) { ob =o;}
	public T get() {return ob;}
}
public class YoonJava27_4 {
	public static void main(String[] args) {//����, ��� Ǯ��� �� �� �𸣰ڴ�. 
		ObjIntConsumer<Integer> ci = 
				(num, i) ->System.out.println(i+"."+num);
		ObjDoubleConsumer<Double> cd= 
				(num, i) ->System.out.println(i+"."+num);
	}

}
