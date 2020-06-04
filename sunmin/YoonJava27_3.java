package YoonJava;
import java.util.function.BiPredicate;



public class YoonJava27_3 {

	public static void main(String[] args) {
		BiPredicate<String, Integer> conv= (str, num) -> str.equals(Integer.toString(num));
		//test호출 결과 문자열 "Robot"의 길이가 3을 넘으면 true반환	 // 무슨 메서드를 써야 할지 모르겠다.
		//길이를 비교해야 하는뎅//
				if(conv.test("Robot",3))
					System.out.println("문자열 길이 3 초과");
				else
					System.out.println("문자열 길이 3 이하");
		//test호출 결과 문자열 "Box"의 길이가 5를 넘으면 true반환
		if(conv.test("Box",5))
			System.out.println("문자열 길이 5 초과");
		else
			System.out.println("문자열 길이 5 이하");
	}

}
