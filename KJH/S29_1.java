package S0604;

import java.util.List;
import java.util.Arrays;

class Box<T> {
	private T ob;
	public Box(T o) {
		this.ob = o;
	}
	public T get() {return ob;}
}

public class S29_1 {
	public static void main(String[] args) {
		List<Box<String>> ls = Arrays.asList(new Box<>("Robot"), new Box<>("Simple"));
		//이 위치에서 스트림의 생성 및 맵핑 연산 진행하는 문장 구성
//		ls.stream().map(s -> s.get()).forEach(n->System.out.println(n)); //1번
		ls.stream().map(s->s.get().length()).forEach(n->System.out.println(n)); //2번
	}

}
