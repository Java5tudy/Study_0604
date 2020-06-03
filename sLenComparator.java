package YoonJava;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class sLenComp implements Comparator<String> {
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
	}
}
public class sLenComparator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Robot");
		list.add("Lambda");
		list.add("Box");
		
		Collections.sort(list, new sLenComp());
		
		for(String s : list)
			System.out.println(s);

	}

}
