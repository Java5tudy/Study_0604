package YoonJava;

import java.util.List;
import java.util.Arrays;

class Box2<T> {
	private T ob;
	public Box2(T o) {ob=o;}
	public T get() {return ob;}
}
public class YoonJava29_1_2 {
	public static void main(String[] args) {
		List<Box2<String>> ls = Arrays.asList(new Box2<>("Robot"), new Box2<>("simple"));
		ls.stream()
				.mapToInt(t -> t.get().length())
				.forEach(n-> System.out.print(n+"\t"));
		System.out.println();
		
	}

}
//마찬가지로 이게 맞는지 모르겠다. 문자열의 길이  5, 6나온다. 굴러는 간다.