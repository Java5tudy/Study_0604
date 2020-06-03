package study0603_JJE;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercise2801 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("robot");
		list.add("Lambda");
		list.add("box");	
	
		Collections.sort(list, String::compareToIgnoreCase);// 메소드 참조 괄호 쓰지 않거. 
	
		System.out.println(list);
	}

}
/*메소드 참조 예시
메소드 참조를 동일한 람다로 변환하기 위한 충분한 정보를 제공함
Convert 메소드를 호출할 때 람다를 인자로 넘겨줄 수 있다.
convert(100, (number) -> String.valueOf(number));

valueOf() 메소드가 Integer 를 받고 String 을 반환하는 조건에 일치한다
따라서 메소드 참조로 대체할 수 있음
convert(100, String::valueOf);
*/