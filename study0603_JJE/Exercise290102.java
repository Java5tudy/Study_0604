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
		//��Ʈ�� ����, ���� ���� 
		ls.stream()
		.map(s -> s.get().length()) // ���ڿ��� ���̸� �������� ����
		.forEach(n -> System.out.println(n +"\t"));
		System.out.println();	
	}

}
