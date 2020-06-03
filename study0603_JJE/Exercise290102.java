package study0603_JJE;

import java.util.Arrays;
import java.util.List;

class Box5<T>{
	private T ob;
	public Box5(T o) {
		ob =o;
	}
	public T get() {
		return ob;
	}
}
public class Exercise290102 {
	public static void main(String[] args) {
		List<Box5<String>> ls = Arrays.asList(new Box5<>("robot"), new Box5<>("simple"));
		//스트림 생성, 맵핑 연산 
		ls.stream()
		.map(s -> s.get().length()) // 문자열의 길이를 가져오는 맵핑
		.forEach(n -> System.out.println(n +"\t"));
		System.out.println();	
	}

}
