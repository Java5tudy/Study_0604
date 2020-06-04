package S0604;

import java.util.function.BiPredicate;

public class S27_3 {
	public static void main(String[] args) {
		//test호출 결과 문자열 "ROBOT"의 길이가 3을 넘으면 true 반환
		BiPredicate<String, Integer> conv = (a,b) -> a.length() - b > 0;
				
		if(conv.test("Robot", 3))
			System.out.println("문자열 길이 3 초과");
		else
			System.out.println("문자열 길이 3 이하");
		
		if(conv.test("Box", 5))
			System.out.println("문자열 길이 5 초과");
		else
			System.out.println("문자열 길이 5 이하");
	}

}
