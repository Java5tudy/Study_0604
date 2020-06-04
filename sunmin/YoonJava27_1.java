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
		System.out.println(add.cal(3,4));
		//Double 변환은 어떻게 하지? 이게 맞을까? 굴러는 간다
		
		Calculate2<Double> add1 = (a,b) -> a+b;
		System.out.println(add1.cal(2.5,7.1));
		Calculate2<Integer> sub = (a,b) -> a+b;
		System.out.println(sub.cal(4,-2));
		Calculate2<Double> sub1 = (a,b) -> a+b;
		System.out.println(sub1.cal(4.9,-3.2));
		

	}

}
