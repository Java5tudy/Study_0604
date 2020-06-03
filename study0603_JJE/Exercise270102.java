package study0603_JJE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

interface SLenComp{
	int compare(String s);
}

public class Exercise270102 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Robot");
		list.add("lambda");
		list.add("box");

		Collections.sort(list, (s1, s2)-> s1.length() -s2.length());
		//안에서 람다식 만들기 
		
		for(String s :list)
			System.out.println(s);
		
	}

}
