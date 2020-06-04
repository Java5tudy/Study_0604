//미완

package S0604;

import java.util.*;

interface SLenComp <T> {
	T compare (T a);
}

//class SLenComp implements Comparator<String> {
//	@Override
//	public int compare (String s1, String s2) {
//		return s1.length() - s2.length();
//	}
//}

public class S27_1_2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Robot");
		list.add("Lambda");
		list.add("Box");
		
		
		
		
		for(String s : list)
			System.out.println(s);
	}
}
