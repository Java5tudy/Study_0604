package S0603;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class S28_1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("robot");
		list.add("Lambda");
		list.add("box");
		
//		Collections.sort(list, (s1, s2) -> s1.compareToIgnoreCase(s2));
		Collections.sort(list, String :: compareToIgnoreCase);
		System.out.println(list);
		
		
	}
}

//Collections.sort메소드  : public static <T> void sort(List<T> list, Comparator<? super T> c)
//Comparator<? super T> c = (s1, s2) -> s1.compareToIgnoreCase(s2) -> int가 아니다 결국 아스키코드 비교 (알파벳순)
