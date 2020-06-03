package LambdaEx1;

import java.util.*;

@FunctionalInterface
interface SLenComp {
	int len(String s1, String s2);
}

public class SLenComparator {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Robot");
		list.add("Lambda");
		list.add("Box");
		
		SLenComp l = (s1,s2) -> s1.length() - s2.length();
		
		Collection.sort(list, //여기대체뭐가들어가야해);
		
		for(String s : list)
			System.out.println(s);
	}
}


