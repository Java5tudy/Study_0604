package Reference;

import java.util.*;

public class StrIgnoreCaseComp {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("robot");
		list.add("Lambda");
		list.add("box");
		
		Comparator<String> s = String::compareToIgnoreCase;
		//Collections.sort(list, (s1, s2) -> s1.compareToIgnoreCase(s2));
		System.out.println(list);
	}
}
