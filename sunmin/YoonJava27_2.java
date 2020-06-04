package YoonJava;
import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;

public class YoonJava27_2 {
	public static <T> void show(Predicate<T> p, List<T> lst) {
		T n = null;
		for(T i : lst) {
			if(p.test(i))
				n =i;
			System.out.println(n);
		} //우선 책을 보고 썼지만 이게 아닌거 같음. 나오긴 나오나 중복되서 나옴
		
		
	}
	public static void main(String[] args) {
		List<Integer> lst1 = Arrays.asList(1,3,8,10,11);
		show(n->n%2 !=0, lst1); //홀수만 출력
		
		List<Double> lst2 = Arrays.asList(-1.2, 3.5, -2.4, 9.5);
		show(n->n>0.0, lst2); //0.0보다 큰 수 출력

	}

}
