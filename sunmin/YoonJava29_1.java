package YoonJava;
import java.util.List;
import java.util.Arrays;

class Box1<T> {
	private T ob;
	public Box1(T o) {ob=o;}
	public T get() {return ob;}
}
public class YoonJava29_1 {
	public static void main(String[] args) {
		List<Box1<String>> ls = Arrays.asList(new Box1<>("Robot"), new Box1<>("simple"));
		ls.stream()
			.map(t -> t.get().length())
			.forEach(n-> System.out.print(n+"\t"));
		System.out.println();

	}

}//�̰� �´��� �𸣰ڴ�. ���ڿ��� ����  5, 6���´�. ������ ����.
