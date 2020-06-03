package LambdaEx1;

interface Calculate<T>{
	T cal(T a, T b);
}
class CalculatorDemo{
	public static <T> void calAndShow(Calculate<T> op, T n1, T n2) {
		T r = op.cal(n1, n2);
		System.out.println(r);
	}
	public static void main(String[]args) {
		//3+4
		Calculate<Integer> ci = (a, b) -> a+b;
		System.out.println(ci.cal(3, 4));
		//2.5+7.1
		Calculate<Double> cj = (a, b) -> a+b;
		System.out.println(cj.cal(2.5, 7.1));
		//4-2
		Calculate<Integer> ck = (a, b) -> a-b;
		System.out.println(ck.cal(4, 2));
		//4.9-3.2
		Calculate<Double> cl = (a, b) -> a-b;
		System.out.println(cl.cal(4.9, 3.2));
		
		
		// 인터페이스가 제네릭으로 정의되었으므로, 다음과 같이 참조변수의 형을 지정해서 구성하면 끝!
	}
}

