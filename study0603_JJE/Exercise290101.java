package study0603_JJE;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Box4<T>{
	private T ob;
	public Box4(T o) {
		ob =o;
	}
	public T get() {
		return ob;
	}
}

public class Exercise290101 {
	public static void main(String[] args) {
		List<Box4<String>> ls = Arrays.asList(new Box4<>("robot"), new Box4<>("simple"));
		//스트림 생성, 맵핑 연산 
		ls.stream()
		.map(s -> s.get()) //문자 담기
		.forEach(n -> System.out.println(n +"\t"));
		System.out.println();	
	}
}
