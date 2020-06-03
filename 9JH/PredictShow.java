package LambdaEx1;
import java.util.*;
import java.util.function.Predicate;

public class PredictShow {
	public static <T> void show(Predicate<T> p, List<T> lst) {
		T t;
		for(T n : lst) {
			if(p.test(n))
				System.out.println(n);
		}
	}
	public static void main(String[] args) {
		List<Integer> lst1 = Arrays.asList(1, 3, 8, 10, 11);
		show(n -> n%2 !=0, lst1);
		
		List<Double> lst2 = Arrays.asList(-1.2, 3.5, -2.4, 9.5);
		show(n -> n>0.0, lst2);
	}

}
