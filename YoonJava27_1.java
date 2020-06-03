package YoonJava;

interface Calculate2<T> {
	T cal(T a, T b);
}

public class YoonJava27_1 {
	public static <T> void calAndShow(Calculate2<T> op, T n1, T n2) {
		T r = op.cal(n1, n2);
		System.out.println(r);
	}
	public static void main(String[] args) {
		Calculate2<Integer> add = (a,b) -> a+b;
		calAndShow(op, n1, n2); // 오류
		
		Calculate2<Integer> sub = (a,b) -> a+b;
		calAndShow(op, n1, n2); //오류
		

	}

}
