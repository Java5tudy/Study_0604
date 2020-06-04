package S0604;

import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;

public class S27_2 {
	public static <T> void show(Predicate<T> p, List<T> lst) { //p가 해당 조건
		for(T n : lst) {
			if(p.test(n)) {  //list원소들이 조건에 만족하면 True 아니면 False
				System.out.println(n);
			}
		}
	}
	
	public static void main(String[] args) {
		List<Integer> lst1 = Arrays.asList(1,3,8,10,11);
		show(n -> n%2 != 0, lst1);
		System.out.println();
		
		List<Double> lst2 = Arrays.asList(-1.2,3.5,-2.4,9.5);
		show(n -> n>0.0, lst2);
	}
}
