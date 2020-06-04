package YoonJava;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
//메소드 참조방식으로 수정??
public class YoonJava28_1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("robot");
		list.add("Lambda");
		list.add("box");
		Collections.sort(list, (s1, s2)-> s1.compareToIgnoreCase(s2));
		Collections.sort(list, (s1, s2)-> s1.compareToIgnoreCase(s2));
		System.out.println(list);

	}

}
