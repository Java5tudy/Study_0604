package S0604;

interface Calculate<T> {
	T cal (T a, T b);
}

public class S27_1_1 {
	public static <T> void calAndShow(Calculate<T> op, T n1, T n2) {
		T r = op.cal(n1, n2);
		System.out.println(r);
		}
	public static void main(String[] args) {
		Calculate<Integer> ip = (a, b) -> a + b;
		calAndShow(ip,3,4);
		Calculate<Double> dp = (a, b) -> a + b;
		calAndShow(dp,2.5,7.1);
		Calculate<Integer> is = (a, b) -> a - b;
		calAndShow(is,4,2);
		Calculate<Double> ds = (a, b) -> a - b;
		calAndShow(ds,4.9,3.2);
	}
}
