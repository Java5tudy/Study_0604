package study0603_JJE;

import java.util.function.BiPredicate;

public class Exercise2703 {
	public static void main(String[] args) {
		
		BiPredicate<String, Integer> conv = (str, num) -> {
			return str.length() > num? true : false; // 문자열 길이가 받은 인수보다 크면 true, 작으면 false를 반환하는 if문
		};

		
		if(conv.test("Robot",3)) {
			System.out.println("문자열 길이 3 초과");
		}else {
			System.out.println("문자열 길이 3이하");
		}
		
		if(conv.test("Box",5)) {
			System.out.println("문자열 길이 5 초과");
		}else {
			System.out.println("문자열 길이 5 이하");
		}	
	}
}
